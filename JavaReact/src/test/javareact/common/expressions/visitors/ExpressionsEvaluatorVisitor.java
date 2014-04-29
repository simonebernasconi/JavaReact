package test.javareact.common.expressions.visitors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import test.javareact.common.Consts;
import test.javareact.common.expressions.antlr_grammars.ExpressionBaseVisitor;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.AllTrueFalseContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.AvgSumListIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ConcatContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ContainsBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ContainsIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ContainsStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.EqualBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.EqualListContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ExpressionContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.FilterListIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdListBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdListIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdListStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IsAscIsDescIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListDigitContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListExprContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.OrderListIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.OrderListStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SizeListContext;
import test.javareact.common.packets.content.Value;

public class ExpressionsEvaluatorVisitor extends ExpressionBaseVisitor<Value> {
	private final Map<String, Value> values;

	public ExpressionsEvaluatorVisitor(Map<String, Value> values) {
		super();
		this.values = values;
	}

	@Override
	public Value visitIdentifier(ExpressionParser.IdentifierContext ctx) {
		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId()
				.getText();
		String observableId = ctx.observableId().getText();
		String method = ctx.method().getText();
		String id = hostId + "." + observableId + "." + method;
		return values.get(id);
	}

	@Override
	public Value visitParensBool(ExpressionParser.ParensBoolContext ctx) {
		return visit(ctx.boolExpr());
	}

	@Override
	public Value visitParensNum(ExpressionParser.ParensNumContext ctx) {
		return visit(ctx.numExpr());
	}

	@Override
	public Value visitParensString(ExpressionParser.ParensStringContext ctx) {
		return visit(ctx.stringExpr());
	}

	@Override
	public Value visitNot(ExpressionParser.NotContext ctx) {
		boolean val = !visit(ctx.boolExpr()).boolVal();
		return new Value(val);
	}

	@Override
	public Value visitIdBool(ExpressionParser.IdBoolContext ctx) {
		return visit(ctx.identifier());
	}

	@Override
	public Value visitIdNum(ExpressionParser.IdNumContext ctx) {
		return visit(ctx.identifier());
	}

	@Override
	public Value visitIdString(ExpressionParser.IdStringContext ctx) {
		return visit(ctx.identifier());
	}

	@Override
	public Value visitBool(ExpressionParser.BoolContext ctx) {
		return new Value(Boolean.parseBoolean(ctx.getText()));
	}

	@Override
	public Value visitListDigit(ListDigitContext ctx) {
		// TODO Auto-generated method stub
		return super.visitListDigit(ctx);
	}

	@Override
	public Value visitExpression(ExpressionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExpression(ctx);
	}
	
	

	@Override
	public Value visitSeqInt(SeqIntContext ctx) {
		if (ctx.getChildCount() == 1){
			return new Value(Integer.parseInt(ctx.getText()));
		}
		else {
			int left = (Integer.parseInt(ctx.DIGIT().getText()));
			List<Integer> right = visit(ctx.seqInt()).listVal();
			return new Value(right.add(left));
		}
	}

	@Override
	public Value visitSeqBool(SeqBoolContext ctx) {
		if (ctx.getChildCount() == 1){
			return new Value(Boolean.parseBoolean(ctx.getText()));
		}
		else {
			Boolean left = (Boolean.parseBoolean(ctx.BOOL().getText()));
			List<Boolean> right = visit(ctx.seqBool()).listVal();
			return new Value(right.add(left));
		}
	}

	@Override
	public Value visitSeqString(SeqStringContext ctx) {
		if (ctx.getChildCount() == 1){
			return new Value(ctx.getText());
		}
		else {
			String left = (ctx.STRING().getText());
			List<String> right = visit(ctx.seqString()).listVal();
			return new Value(right.add(left));
		}
	}


//	@Override
//	public Value visitSeqDouble(SeqDoubleContext ctx) {
//		if (ctx.getChildCount() == 1){
//			return new Value(Integer.parseInt(ctx.getText()));
//		}
//		else {
//			double left = (Double.parseDouble(ctx.DOUBLE().getText()));
//			List<Double> right = visit(ctx.seqDouble()).listVal();
//			return new Value(right.add(left));
//		}
//	}
	
	

	@Override
	public Value visitAllTrueFalse(AllTrueFalseContext ctx) {
		List<Boolean> list = visit(ctx.listBoolExpr()).listVal();
		if (ctx.op.getType() == ExpressionParser.ALLTRUE) {
			boolean check = true;
			for (boolean bool : list) {
				if (bool == false) {
					check = false;
				}
			}
			return new Value(check);
		} else {
			boolean check = true;
			for (boolean bool : list) {
				if (bool == true) {
					check = false;
				}
			}
			return new Value(check);

		}
	}

	@Override
	public Value visitAvgSumListInt(AvgSumListIntContext ctx) {
		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
		if (ctx.op.getType() == ExpressionParser.AVG) {
			double sum = 0;
			if (!list.isEmpty()) {
				for (int n : list) {
					sum += n;
				}
			}
			double avg = sum/list.size();
			return new Value(avg);
		} else {
			int sum = 0;
			if (!list.isEmpty()) {
				for (int n : list) {
					sum += n;
				}
			}
			return new Value(sum);
		}
	}

	@Override
	public Value visitIdListString(IdListStringContext ctx) {
		return visit(ctx.identifier());
	}

	@Override
	public Value visitConcat(ConcatContext ctx) {
		String string1 = visit(ctx.stringExpr(0)).stringVal();
		String string2 = visit(ctx.stringExpr(1)).stringVal();
		return new Value(string1.concat(string2));

	}

	@Override
	public Value visitContainsBool(ContainsBoolContext ctx) {
		List<Boolean> list = visit(ctx.listBoolExpr()).listVal();
		boolean bool = visit(ctx.boolExpr()).boolVal();
		return new Value(list.contains(bool));
	}

	@Override
	public Value visitIdListBool(IdListBoolContext ctx) {
		return visit(ctx.identifier());
	}

	@Override
	public Value visitOrderListString(OrderListStringContext ctx) {
		List<String> list = visit(ctx.listStringExpr()).listVal();
		Collections.sort(list);
		return new Value(list);
	}

//	@Override
//	public Value visitContainsDouble(ContainsDoubleContext ctx) {
//		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
//		double n = visit(ctx.numExpr()).doubleVal();
//		return new Value(list.contains(n));
//	}

	@Override
	public Value visitEqualBool(EqualBoolContext ctx) {
		boolean left = visit(ctx.boolExpr(0)).boolVal();
		boolean right = visit(ctx.boolExpr(1)).boolVal();
		return new Value(left == right);
	}

//	@Override
//	public Value visitFilterListDouble(FilterListDoubleContext ctx) {
//		System.out.println("siamo nel double");
//		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
//		double n = visit(ctx.numExpr()).doubleVal();
//		List<Double> listNew = new ArrayList<Double>();
//		if (ctx.op.getType() == ExpressionParser.MIN) {
//			for (int i=0; i<list.size(); i++) {
//				if (list.get(i) < n){
//					listNew.add(list.get(i));
//				}
//			}
//			return new Value(listNew);
//		} else if (ctx.op.getType() == ExpressionParser.MAX) {
//			for (int i=0; i<list.size(); i++) {
//				if (list.get(i) > n){
//					listNew.add(list.get(i));
//				}
//			}
//			return new Value(listNew);
//		} else if (ctx.op.getType() == ExpressionParser.MINEQ) {
//			for (int i=0; i<list.size(); i++) {
//				if (list.get(i) <= n){
//					listNew.add(list.get(i));
//				}
//			}
//			return new Value(listNew);
//		} else {
//			for (int i=0; i<list.size(); i++) {
//				if (list.get(i) >= n){
//					listNew.add(list.get(i));
//				}
//			}
//			return new Value(listNew);
//		}
//	}

	@Override
	public Value visitFilterListInt(FilterListIntContext ctx) {
		System.out.println("siamo nel int");
		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
		double n = visit(ctx.numExpr()).doubleVal();
		List<Integer> listNew = new ArrayList<Integer>();
		if (ctx.op.getType() == ExpressionParser.MIN) {
			for (int i=0; i<list.size(); i++) {
				if (list.get(i) < n){
					listNew.add(list.get(i));
				}
			}
			return new Value(listNew);
		} else if (ctx.op.getType() == ExpressionParser.MAX) {
			for (int i=0; i<list.size(); i++) {
				if (list.get(i) > n){
					listNew.add(list.get(i));
				}
			}
			return new Value(listNew);
		} else if (ctx.op.getType() == ExpressionParser.MINEQ) {
			for (int i=0; i<list.size(); i++) {
				if (list.get(i) <= n){
					listNew.add(list.get(i));
				}
			}
			return new Value(listNew);
		} else {
			for (int i=0; i<list.size(); i++) {
				if (list.get(i) >= n){
					listNew.add(list.get(i));
				}
			}
			return new Value(listNew);
		}
	}

	@Override
	public Value visitListBool(ListBoolContext ctx) {
		// TODO Auto-generated method stub
		return super.visitListBool(ctx);
	}

//	@Override
//	public Value visitAvgSumListDouble(AvgSumListDoubleContext ctx) {
//		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
//		if (ctx.op.getType() == ExpressionParser.AVG) {
//			Double sum = 0.0;
//			if (!list.isEmpty()) {
//				for (Double n : list) {
//					sum += n;
//				}
//			}
//			return new Value(sum / list.size());
//		} else {
//			Double sum = 0.0;
//			if (!list.isEmpty()) {
//				for (Double n : list) {
//					sum += n;
//				}
//			}
//			return new Value(sum);
//		}
//	}
	
	@Override
	public Value visitIsAscIsDescInt(IsAscIsDescIntContext ctx) {
		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
		if (ctx.op.getType() == ExpressionParser.ASC) {
			boolean sorted = true;
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i - 1) < list.get(i)) {
					sorted = false;
				}
			}
			return new Value(sorted);
		} else {
			boolean sorted = true;
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i - 1) > list.get(i)) {
					sorted = false;
				}
			}
			return new Value(sorted);
		}

	}

//	@Override
//	public Value visitIsAscIsDescDouble(IsAscIsDescDoubleContext ctx) {
//		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
//		if (ctx.op.getType() == ExpressionParser.ASC) {
//			boolean sorted = true;
//			for (int i = 1; i < list.size(); i++) {
//				if (list.get(i - 1) < list.get(i)) {
//					sorted = false;
//				}
//			}
//			return new Value(sorted);
//		} else {
//			boolean sorted = true;
//			for (int i = 1; i < list.size(); i++) {
//				if (list.get(i - 1) > list.get(i)) {
//					sorted = false;
//				}
//			}
//			return new Value(sorted);
//		}
//	}
//

	@Override
	public Value visitListExpr(ListExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitListExpr(ctx);
	}

	@Override
	public Value visitContainsInt(ContainsIntContext ctx) {
		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
		int n = visit(ctx.numExpr()).intVal();
		return new Value(n);
	}

	@Override
	public Value visitContainsString(ContainsStringContext ctx) {
		List<String> list = visit(ctx.listStringExpr()).listVal();
		String string = visit(ctx.stringExpr()).stringVal();
		return new Value(list.contains(string));
	}

	@Override
	public Value visitOrderListInt(OrderListIntContext ctx) {
		System.out.println("siamo nel int");
		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
		Collections.sort(list);
		return new Value(list);
	}

//	@Override
//	public Value visitOrderListDouble(OrderListDoubleContext ctx) {
//		System.out.println("siamo nel double");
//		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
//		Collections.sort(list);
//		return new Value(list);	
//	}

	@Override
	public Value visitEqualList(EqualListContext ctx) {
		List<?> left = visit(ctx.listExpr(0)).listVal();
		List<?> right = visit(ctx.listExpr(1)).listVal();
		return new Value(left.equals(right));
	}

	
//	@Override
//	public Value visitListDouble(ListDoubleContext ctx) {
//		// TODO Auto-generated method stub
//		return super.visitListDouble(ctx);
//	}

	@Override
	public Value visitIdListInt(IdListIntContext ctx) {
		return visit(ctx.identifier());
	}

	@Override
	public Value visitListString(ListStringContext ctx) {
		// TODO Auto-generated method stub
		return super.visitListString(ctx);
	}

	@Override
	public Value visitSizeList(SizeListContext ctx) {
		List list = visit(ctx.listExpr()).listVal();
		return new Value(list.size());
	}

	@Override
	public Value visitInt(ExpressionParser.IntContext ctx) {
		return new Value(Integer.parseInt(ctx.getText()));
	}

	@Override
	public Value visitDouble(ExpressionParser.DoubleContext ctx) {
		return new Value(Double.parseDouble(ctx.getText()));
	}

	@Override
	public Value visitAndOr(ExpressionParser.AndOrContext ctx) {
		boolean left = visit(ctx.boolExpr(0)).boolVal();
		boolean right = visit(ctx.boolExpr(1)).boolVal();
		if (ctx.op.getType() == ExpressionParser.AND) {
			return new Value(left && right);
		} else {
			return new Value(left || right);
		}
	}

	@Override
	public Value visitAddSub(ExpressionParser.AddSubContext ctx) {
		double left = visit(ctx.numExpr(0)).doubleVal();
		double right = visit(ctx.numExpr(1)).doubleVal();
		if (ctx.op.getType() == ExpressionParser.ADD) {
			return new Value(left + right);
		} else {
			return new Value(left - right);
		}
	}

	@Override
	public Value visitMulDiv(ExpressionParser.MulDivContext ctx) {
		double left = visit(ctx.numExpr(0)).doubleVal();
		double right = visit(ctx.numExpr(1)).doubleVal();
		if (ctx.op.getType() == ExpressionParser.MUL) {
			return new Value(left * right);
		} else {
			return new Value(left / right);
		}
	}

	@Override
	public Value visitMinMaxMineqMaxeq(
			ExpressionParser.MinMaxMineqMaxeqContext ctx) {
		double left = visit(ctx.numExpr(0)).doubleVal();
		double right = visit(ctx.numExpr(1)).doubleVal();
		if (ctx.op.getType() == ExpressionParser.MIN) {
			if (left < right) {
				return new Value(true);
			} else
				return new Value(false);
		} else if (ctx.op.getType() == ExpressionParser.MAX) {
			if (left > right) {
				return new Value(true);
			} else
				return new Value(false);
		} else if (ctx.op.getType() == ExpressionParser.MINEQ) {
			if (left <= right) {
				return new Value(true);
			} else
				return new Value(false);
		} else {
			if (left >= right) {
				return new Value(true);
			} else
				return new Value(false);
		}

	}

	@Override
	public Value visitEqualNum(ExpressionParser.EqualNumContext ctx) {
		double left = visit(ctx.numExpr(0)).doubleVal();
		double right = visit(ctx.numExpr(1)).doubleVal();
		return new Value(left == right);
	}

	@Override
	public Value visitEqualString(ExpressionParser.EqualStringContext ctx) {
		String left = visit(ctx.stringExpr(0)).stringVal();
		String right = visit(ctx.stringExpr(1)).stringVal();
		if (left.equals(right)) {
			return new Value(true);
		} else
			return new Value(false);
	}

}
