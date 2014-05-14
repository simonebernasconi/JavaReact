package test.javareact.common.expressions.visitors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import test.javareact.common.Consts;
import test.javareact.common.expressions.antlr_grammars.ExpressionBaseVisitor;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.AddSubContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.AllTrueFalseContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.AndOrContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.AvgSumListDoubleContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.AvgSumListIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.BaseStrContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.BoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.BoolExpressionContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ConcatContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ConstantListDigitContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ConstantListDoubleContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ContainsBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ContainsDoubleContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ContainsIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ContainsStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.DoubleContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.EqualBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.EqualListContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.EqualNumContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.EqualStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdListBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdListDoubleContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdListIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdListStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdNumContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdentifierBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdentifierListBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdentifierListDoubleContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdentifierListIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdentifierListStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdentifierNumContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdentifierStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IsAscIsDescDoubleContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IsAscIsDescIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.LastListBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.LastListDoubleContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.LastListIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.LastListStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListBoolExpressionContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListBool_LabelContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListDigitContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListDigitExpressionContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListDigit_LabelContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListDoubleContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListDoubleExpressionContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListDouble_LabelContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListExpressionContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListStringExpressionContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ListString_LabelContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.MinMaxContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.MulDivContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.NotContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.NumExpressionContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ParensBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ParensNumContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.ParensStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqBoolBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqBoolIdentifierListBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqBoolSeqBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqBoolSeqBoolIdListBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqDoubleDoubleContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqDoubleIdentifierListDoubleContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqDoubleSeqDoubleContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqDoubleSeqDoubleIdListDoubleContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqIntDigitContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqIntIdentifierListIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqIntSeqIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqIntSeqIntIdListIntContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqStringIdentifierListStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqStringSeqStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqStringSeqStringIdListStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SeqStringStringContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.SizeListContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.StringExpressionContext;
import test.javareact.common.packets.content.Value;
import test.javareact.common.packets.content.ValueType;

public class ExpressionsEvaluatorVisitor extends ExpressionBaseVisitor<Value> {
	private final Map<String, Value> values;

	public ExpressionsEvaluatorVisitor(Map<String, Value> values) {
		super();
		this.values = values;
	}

	
	@Override
	public Value visitNumExpression(NumExpressionContext ctx) {
		System.out.println("visit NumExpr");
		System.out.println("visit" + ctx.getText());
		return visit(ctx.numExpr());
	}

	@Override
	public Value visitStringExpression(StringExpressionContext ctx) {
		System.out.println("visit StringExpr");
		return visit(ctx.stringExpr());
	}

	@Override
	public Value visitDouble(DoubleContext ctx) {
		System.out.println("visit double");
		System.out.println("visit" + ctx.getText());
		String str = ctx.getText();
		double i = Double.parseDouble(str);
		return new Value(i);
	}
	
	@Override
	public Value visitAddSub(AddSubContext ctx) {
		System.out.println("visit addSub");
		System.out.println("visit" + ctx.getText());
		Value leftVal = visit(ctx.numExpr(0));
		Value rightVal = visit(ctx.numExpr(1));
		if (ctx.op.getType() == ExpressionParser.ADD) {
			if (leftVal.getType() == ValueType.INT
					&& rightVal.getType() == ValueType.INT) {
				int left = visit(ctx.numExpr(0)).intVal();
				int right = visit(ctx.numExpr(1)).intVal();
				return new Value(left + right);
			} else if (leftVal.getType()  == ValueType.DOUBLE
					&& rightVal.getType()  == ValueType.DOUBLE) {
				double left = visit(ctx.numExpr(0)).doubleVal();
				double right = visit(ctx.numExpr(1)).doubleVal();
				return new Value(left + right);
			} else if (leftVal.getType() == ValueType.INT
					&& rightVal.getType() == ValueType.DOUBLE) {
				double left = (double) visit(ctx.numExpr(0)).intVal();
				double right = visit(ctx.numExpr(1)).doubleVal();
				return new Value(left + right);
			} else {
				double left = visit(ctx.numExpr(0)).doubleVal();
				double right = (double) visit(ctx.numExpr(1)).intVal();
				return new Value(left + right);
			}
		} else {
			if (leftVal.getType() == ValueType.INT
					&& rightVal.getType() == ValueType.INT) {
				int left = visit(ctx.numExpr(0)).intVal();
				int right = visit(ctx.numExpr(1)).intVal();
				return new Value(left - right);
			} else if (leftVal.getType()  == ValueType.DOUBLE
					&& rightVal.getType()  == ValueType.DOUBLE) {
				double left = visit(ctx.numExpr(0)).doubleVal();
				double right = visit(ctx.numExpr(1)).doubleVal();
				return new Value(left - right);
			} else if (leftVal.getType() == ValueType.INT
					&& rightVal.getType()  == ValueType.DOUBLE) {
				double left = (double) visit(ctx.numExpr(0)).intVal();
				double right = visit(ctx.numExpr(1)).doubleVal();
				return new Value(left - right);
			} else {
				double left = visit(ctx.numExpr(0)).doubleVal();
				double right = (double) visit(ctx.numExpr(1)).intVal();
				return new Value(left - right);
			}
		}
	}

	

	@Override
	public Value visitMulDiv(MulDivContext ctx) {
		System.out.println("visit MulDiv");
		System.out.println("visit" + ctx.getText());
		Value leftVal = visit(ctx.numExpr(0));
		Value rightVal = visit(ctx.numExpr(1));
		if (ctx.op.getType() == ExpressionParser.MUL) {
			if (leftVal.getType() == ValueType.INT
					&& rightVal.getType() == ValueType.INT) {
				int left = visit(ctx.numExpr(0)).intVal();
				int right = visit(ctx.numExpr(1)).intVal();
				return new Value(left * right);
			} else if (leftVal.getType()  == ValueType.DOUBLE
					&& rightVal.getType()  == ValueType.DOUBLE) {
				double left = visit(ctx.numExpr(0)).doubleVal();
				double right = visit(ctx.numExpr(1)).doubleVal();
				return new Value(left * right);
			} else if (leftVal.getType() == ValueType.INT
					&& rightVal.getType()  == ValueType.DOUBLE) {
				double left = (double) visit(ctx.numExpr(0)).intVal();
				double right = visit(ctx.numExpr(1)).doubleVal();
				return new Value(left * right);
			} else {
				double left = visit(ctx.numExpr(0)).doubleVal();
				double right = (double) visit(ctx.numExpr(1)).intVal();
				return new Value(left * right);
			}
		} else {
			if (leftVal.getType() == ValueType.INT
					&& rightVal.getType() == ValueType.INT) {
				int left = visit(ctx.numExpr(0)).intVal();
				int right = visit(ctx.numExpr(1)).intVal();
				return new Value(left / right);
			} else if (leftVal.getType()  == ValueType.DOUBLE
					&& rightVal.getType()  == ValueType.DOUBLE) {
				double left = visit(ctx.numExpr(0)).doubleVal();
				double right = visit(ctx.numExpr(1)).doubleVal();
				return new Value(left / right);
			} else if (leftVal.getType() == ValueType.INT
					&& rightVal.getType() == ValueType.DOUBLE) {
				double left = (double) visit(ctx.numExpr(0)).intVal();
				double right = visit(ctx.numExpr(1)).doubleVal();
				return new Value(left / right);
			} else {
				double left = visit(ctx.numExpr(0)).doubleVal();
				double right = (double) visit(ctx.numExpr(1)).intVal();
				return new Value(left / right);
			}
		}
	}

	
	@Override
	public Value visitIdentifierString(IdentifierStringContext ctx) {
		System.out.println("visit idString");
		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
		String observableId = ctx.observableId().getText();
		String method = ctx.method().getText();
		String id = hostId + "." + observableId + "." + method;
		System.out.println("get is " + values.get(id));
		return new Value(values.get(id).stringVal()); 
	}


	@Override
	public Value visitConcat(ConcatContext ctx) {
		System.out.println("visit Concat");
		String string1 = visit(ctx.stringExpr(0)).stringVal();
		String string2 = visit(ctx.stringExpr(1)).stringVal();
		return new Value(string1.concat(string2));
	}

	@Override
	public Value visitIdentifierNum(IdentifierNumContext ctx) {
		System.out.println("visit identifierNum");
		System.out.println("visit " + ctx.getText());
		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
		String observableId = ctx.observableId().getText();
		String method = ctx.method().getText();
		String id = hostId + "." + observableId + "." + method;
		String i = values.get(id).toString();
		if (i.contains(".")){
			double value = Double.parseDouble(i);
			return new Value(value);
		}
		else {
			int value = Integer.parseInt(i);
			return new Value(value);
		}
	}


	@Override
	public Value visitIdString(IdStringContext ctx) {
		return visit(ctx.identifierString());
	}

	@Override
	public Value visitIdNum(IdNumContext ctx) {
		System.out.println("visit idNum");
		System.out.println("visit " + ctx.getText());
		return visit(ctx.identifierNum());
}

	@Override
	public Value visitParensString(ParensStringContext ctx) {
		System.out.println("visit parensString");
		return visit(ctx.stringExpr());
	}

	@Override
	public Value visitBaseStr(BaseStrContext ctx) {
		System.out.println("visit baseString");
		String str = ctx.getText();
		str = str.substring(1, str.length()-1);
		return new Value(str);
	}

	@Override
	public Value visitParensNum(ParensNumContext ctx) {
		System.out.println("visit parensNum");
		return visit(ctx.numExpr());
	}

	@Override
	public Value visitInt(IntContext ctx) {
		System.out.println("visit Int");
		System.out.println("visit " + ctx.getText());
		String str = ctx.getText();
		Integer i = Integer.parseInt(str);
		return new Value(i);
	}

	@Override
	public Value visitBool(BoolContext ctx) {
		System.out.println("visit Bool");
		System.out.println("visit " + ctx.getText());
		String str = ctx.getText();
		boolean bool = Boolean.parseBoolean(str); 
		return new Value(bool);
	}

	@Override
	public Value visitParensBool(ParensBoolContext ctx) {
		System.out.println("visit parensBool");
		return visit(ctx.boolExpr());
	}

	@Override
	public Value visitEqualNum(EqualNumContext ctx) {
		System.out.println("visit EqualNum");
		System.out.println("visit" + ctx.getText());
		Value leftVal = visit(ctx.numExpr(0));
		Value rightVal = visit(ctx.numExpr(1));
		if (leftVal.getType().toString() == "INT"
				&& rightVal.getType().toString() == "INT") {
			int left = visit(ctx.numExpr(0)).intVal();
			int right = visit(ctx.numExpr(1)).intVal();
			return new Value(left == right);
		} else if (leftVal.getType().toString() == "DOUBLE"
				&& rightVal.getType().toString() == "DOUBLE") {
			double left = visit(ctx.numExpr(0)).doubleVal();
			double right = visit(ctx.numExpr(1)).doubleVal();
			return new Value(left == right);
		} else if (leftVal.getType().toString() == "INT"
				&& rightVal.getType().toString() == "DOUBLE") {
			double left = (double) visit(ctx.numExpr(0)).intVal();
			double right = visit(ctx.numExpr(1)).doubleVal();
			return new Value(left == right);
		} else {
			double left = visit(ctx.numExpr(0)).doubleVal();
			double right = (double) visit(ctx.numExpr(1)).intVal();
			return new Value(left == right);
		}
	}

	@Override
	public Value visitEqualString(EqualStringContext ctx) {
		System.out.println("visit EqualString");
		System.out.println("visit" + ctx.getText());
		String left = visit(ctx.stringExpr(0)).stringVal();
		String right = visit(ctx.stringExpr(1)).stringVal();
		if (left.equals(right)){
			return new Value(true);
		}
		else {
			return new Value(false);
		}
	}

	@Override
	public Value visitAndOr(AndOrContext ctx) {
		System.out.println("visit AndOr");
		System.out.println("visit " + ctx.getText());
		boolean left = visit(ctx.boolExpr(0)).boolVal();
		boolean right = visit(ctx.boolExpr(1)).boolVal();
		if (ctx.op.getType() == ExpressionParser.AND) {
			return new Value(left && right);
		} else {
			return new Value(left || right);
		}
	}

	@Override
	public Value visitEqualBool(EqualBoolContext ctx) {
		System.out.println("visit EqualBool");
		System.out.println("visit" + ctx.getText());
		boolean left = visit(ctx.boolExpr(0)).boolVal();
		boolean right = visit(ctx.boolExpr(1)).boolVal();
		return new Value(left == right);
	}

	@Override
	public Value visitNot(NotContext ctx) {
		boolean val = !visit(ctx.boolExpr()).boolVal();
		return new Value(val);
	}

	@Override
	public Value visitBoolExpression(BoolExpressionContext ctx) {
		System.out.println("visit BoolExpr");
		System.out.println("visit" + ctx.getText());
		return visit(ctx.boolExpr());
	}

	@Override
	public Value visitIdentifierBool(IdentifierBoolContext ctx) {
		System.out.println("visit idBool");
		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
		String observableId = ctx.observableId().getText();
		String method = ctx.method().getText();
		String id = hostId + "." + observableId + "." + method;
		System.out.println("get is " + values.get(id));
		return new Value(values.get(id).boolVal());
	}



	@Override
	public Value visitIdBool(IdBoolContext ctx) {
		System.out.println("visit idBool");
		System.out.println("visit " + ctx.getText());
		return visit(ctx.identifierBool());
	}


	@Override
	public Value visitIdentifierListInt(IdentifierListIntContext ctx) {
		System.out.println("visit idListInt");
		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
		String observableId = ctx.observableId().getText();
		String method = ctx.method().getText();
		String id = hostId + "." + observableId + "." + method;
		System.out.println("get is " + values.get(id));
		return new Value(values.get(id).listVal());
	}
	
	@Override
	public Value visitIdentifierListDouble(IdentifierListDoubleContext ctx) {
		System.out.println("visit idListDouble");
		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
		String observableId = ctx.observableId().getText();
		String method = ctx.method().getText();
		String id = hostId + "." + observableId + "." + method;
		System.out.println("get is " + values.get(id));
		return new Value(values.get(id).listVal());
	}
	
	@Override
	public Value visitIdentifierListString(IdentifierListStringContext ctx) {
		System.out.println("visit idListString");
		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
		String observableId = ctx.observableId().getText();
		String method = ctx.method().getText();
		String id = hostId + "." + observableId + "." + method;
		System.out.println("get is " + values.get(id));
		return new Value(values.get(id).listVal());
	}
	
	@Override
	public Value visitIdentifierListBool(IdentifierListBoolContext ctx) {
		System.out.println("visit idListBool");
		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
		String observableId = ctx.observableId().getText();
		String method = ctx.method().getText();
		String id = hostId + "." + observableId + "." + method;
		System.out.println("get is " + values.get(id));
		return new Value(values.get(id).listVal());
	}

	@Override
	public Value visitIdListInt(IdListIntContext ctx) {
		return visit(ctx.identifierListInt());
	}

	@Override
	public Value visitIdListDouble(IdListDoubleContext ctx) {
		return visit(ctx.identifierListDouble());
	}
	
	@Override
	public Value visitIdListString(IdListStringContext ctx) {
		return visit(ctx.identifierListString());
	}
	
	@Override
	public Value visitIdListBool(IdListBoolContext ctx) {
		return visit(ctx.identifierListBool());
	}

	@Override
	public Value visitListExpression(ListExpressionContext ctx) {
		System.out.println("visit ListExpr");
		System.out.println("visit" + ctx.getText());
		return visit(ctx.listExpr());
	}

	@Override
	public Value visitListDigitExpression(ListDigitExpressionContext ctx) {
		System.out.println("visit ListDigitExpr");
		System.out.println("visit" + ctx.getText());
		return visit(ctx.listDigitExpr());
	}
	
	@Override
	public Value visitListDoubleExpression(ListDoubleExpressionContext ctx) {
		System.out.println("visit ListDoubleExpr");
		System.out.println("visit" + ctx.getText());
		return visit(ctx.listDoubleExpr());
	}

	@Override
	public Value visitListBoolExpression(ListBoolExpressionContext ctx) {
		System.out.println("visit ListBoolExpr");
		System.out.println("visit" + ctx.getText());
		return visit(ctx.listBoolExpr());
	}

	@Override
	public Value visitListStringExpression(ListStringExpressionContext ctx) {
		System.out.println("visit ListStringExpr");
		System.out.println("visit" + ctx.getText());
		return visit(ctx.listStringExpr());
	}

	@Override
	public Value visitListDigit_Label(ListDigit_LabelContext ctx) {
		System.out.println("visit ListDigitLabel");
		System.out.println("visit " + ctx.getText());
		return visit(ctx.listDigit());
	}
	
	@Override
	public Value visitListDouble_Label(ListDouble_LabelContext ctx) {
		System.out.println("visit ListDoubleLabel");
		System.out.println("visit " + ctx.getText());
		return visit(ctx.listDouble());
	}
	
	@Override
	public Value visitListString_Label(ListString_LabelContext ctx) {
		System.out.println("visit ListStringLabel");
		System.out.println("visit " + ctx.getText());
		return visit(ctx.listString());
	}

	@Override
	public Value visitListBool_Label(ListBool_LabelContext ctx) {
		System.out.println("visit ListBoolLabel");
		System.out.println("visit " + ctx.getText());
		return visit(ctx.listBool());
	}

	@Override
	public Value visitListDigit(ListDigitContext ctx) {
		System.out.println("visit ListDigit");
		System.out.println("visit " + ctx.getText());
		return visit(ctx.seqInt());
	}
	
	@Override
	public Value visitListDouble(ListDoubleContext ctx) {
		System.out.println("visit ListDouble");
		System.out.println("visit " + ctx.getText());
		return visit(ctx.seqDouble());
	}

	@Override
	public Value visitListString(ListStringContext ctx) {
		System.out.println("visit ListString");
		System.out.println("visit " + ctx.getText());
		return visit(ctx.seqString());
	}
	
	@Override
	public Value visitListBool(ListBoolContext ctx) {
		System.out.println("visit ListBool");
		System.out.println("visit " + ctx.getText());
		return visit(ctx.seqBool());
	}

	@Override
	public Value visitSeqIntDigit(SeqIntDigitContext ctx) {
		System.out.println("visit SeqIntDigit");
		System.out.println("visit " + ctx.getText());
		List<Integer> list = new ArrayList<Integer>();
		String str = ctx.DIGIT().toString();
		int val = Integer.parseInt(str);
		list.add(val);
		return new Value(list);
	}

	@Override
	public Value visitSeqIntSeqInt(SeqIntSeqIntContext ctx) {
		System.out.println("visit SeqIntSeqInt");
		System.out.println("visit " + ctx.getText());
		String str = ctx.DIGIT().toString();
		int val = Integer.parseInt(str);
		System.out.println("Primo valore e' " + val);
		List<Integer> list = visit(ctx.seqInt()).listVal();
		System.out.println(list);
		list.add(val);
		return new Value(list);
	}

	@Override
	public Value visitSeqIntSeqIntIdListInt(SeqIntSeqIntIdListIntContext ctx) {
		System.out.println("visit SeqIntIdSeqIntIdListInt");
		System.out.println("visit " + ctx.getText());
		int val = visit(ctx.identifierNum()).intVal();
		System.out.println("Primo valore e' " + val);
		List<Integer> list = visit(ctx.seqInt()).listVal();
		System.out.println(list);
		list.add(val);
		return new Value(list);
	}

	@Override
	public Value visitSeqIntIdentifierListInt(SeqIntIdentifierListIntContext ctx) {
		System.out.println("visit SeqIntIdListInt");
		System.out.println("visit " + ctx.getText());
		List<Integer> list = new ArrayList<Integer>();
		int val = visit(ctx.identifierNum()).intVal();
		list.add(val);
		return new Value(list);
	}
	
	@Override
	public Value visitSeqDoubleDouble(SeqDoubleDoubleContext ctx) {
		System.out.println("visit SeqDoubleDouble");
		System.out.println("visit " + ctx.getText());
		List<Double> list = new ArrayList<Double>();
		String str = ctx.DOUBLE().toString();
		double val = Double.parseDouble(str);
		list.add(val);
		return new Value(list);
	}

	@Override
	public Value visitSeqDoubleSeqDouble(SeqDoubleSeqDoubleContext ctx) {
		System.out.println("visit SeqDoubleSeqDouble");
		System.out.println("visit " + ctx.getText());
		String str = ctx.DOUBLE().toString();
		double val = Double.parseDouble(str);
		System.out.println("Primo valore e' " + val);
		List<Double> list = visit(ctx.seqDouble()).listVal();
		System.out.println(list);
		list.add(val);
		return new Value(list);
	}

	@Override
	public Value visitSeqDoubleSeqDoubleIdListDouble(SeqDoubleSeqDoubleIdListDoubleContext ctx) {
		System.out.println("visit SeqDoubleIdSeqDoubleIdListDouble");
		System.out.println("visit " + ctx.getText());
		double val = visit(ctx.identifierNum()).doubleVal();
		System.out.println("Primo valore e' " + val);
		List<Double> list = visit(ctx.seqDouble()).listVal();
		System.out.println(list);
		list.add(val);
		return new Value(list);
	}

	@Override
	public Value visitSeqDoubleIdentifierListDouble(SeqDoubleIdentifierListDoubleContext ctx) {
		System.out.println("visit SeqDoubleIdListDouble");
		System.out.println("visit " + ctx.getText());
		List<Double> list = new ArrayList<Double>();
		double val = visit(ctx.identifierNum()).doubleVal();
		list.add(val);
		return new Value(list);
	}
	
	@Override
	public Value visitSeqStringString(SeqStringStringContext ctx) {
		System.out.println("visit SeqStringString");
		System.out.println("visit " + ctx.getText());
		List<String> list = new ArrayList<String>();
		String str = ctx.STRING().toString();
		list.add(str);
		return new Value(list);
	}

	@Override
	public Value visitSeqStringSeqString(SeqStringSeqStringContext ctx) {
		System.out.println("visit SeqStringSeqString");
		System.out.println("visit " + ctx.getText());
		String str = ctx.STRING().toString();
		System.out.println("Primo valore e' " + str);
		List<String> list = visit(ctx.seqString()).listVal();
		System.out.println(list);
		list.add(str);
		return new Value(list);
	}

	@Override
	public Value visitSeqStringSeqStringIdListString(SeqStringSeqStringIdListStringContext ctx) {
		System.out.println("visit SeqStringSeqStringIdListString");
		System.out.println("visit " + ctx.getText());
		String val = visit(ctx.identifierString()).stringVal();
		System.out.println("Primo valore e' " + val);
		List<String> list = visit(ctx.seqString()).listVal();
		System.out.println(list);
		list.add(val);
		return new Value(list);
	}

	@Override
	public Value visitSeqStringIdentifierListString(SeqStringIdentifierListStringContext ctx) {
		System.out.println("visit SeqStringIdentifierListString");
		System.out.println("visit " + ctx.getText());
		List<String> list = new ArrayList<String>();
		String val = visit(ctx.identifierString()).stringVal();
		list.add(val);
		return new Value(list);
	}
	
	@Override
	public Value visitSeqBoolBool(SeqBoolBoolContext ctx) {
		System.out.println("visit SeqBoolBool");
		System.out.println("visit " + ctx.getText());
		List<Boolean> list = new ArrayList<Boolean>();
		String str = ctx.BOOL().toString();
		Boolean bool = Boolean.parseBoolean(str);
		list.add(bool);
		return new Value(list);
	}

	@Override
	public Value visitSeqBoolSeqBool(SeqBoolSeqBoolContext ctx) {
		System.out.println("visit SeqBoolSeqBool");
		System.out.println("visit " + ctx.getText());
		String str = ctx.BOOL().toString();
		Boolean bool = Boolean.parseBoolean(str);
		System.out.println("Primo valore e' " + bool);
		List<Boolean> list = visit(ctx.seqBool()).listVal();
		System.out.println(list);
		list.add(bool);
		return new Value(list);
	}

	@Override
	public Value visitSeqBoolSeqBoolIdListBool(SeqBoolSeqBoolIdListBoolContext ctx) {
		System.out.println("visit SeqBoolSeqBoolIdListBool");
		System.out.println("visit " + ctx.getText());
		Boolean val = visit(ctx.identifierBool()).boolVal();
		System.out.println("Primo valore e' " + val);
		List<Boolean> list = visit(ctx.seqBool()).listVal();
		System.out.println(list);
		list.add(val);
		return new Value(list);
	}

	@Override
	public Value visitSeqBoolIdentifierListBool(SeqBoolIdentifierListBoolContext ctx) {
		System.out.println("visit SeqBoolIdentifierListBool");
		System.out.println("visit " + ctx.getText());
		List<Boolean> list = new ArrayList<Boolean>();
		Boolean val = visit(ctx.identifierBool()).boolVal();
		list.add(val);
		return new Value(list);
	}
	

	@Override
	public Value visitSizeList(SizeListContext ctx) {
		List<?> list = visit(ctx.listExpr()).listVal();
		return new Value(list.size());
	}

	@Override
	public Value visitAvgSumListDouble(AvgSumListDoubleContext ctx) {
		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
		if (ctx.op.getType() == ExpressionParser.AVG) {
			double sum = 0.0;
			if (!list.isEmpty()) {
				for (Double n : list) {
					sum += n;
				}
			}
			return new Value(sum / list.size());
		} else {
			double sum = 0.0;
			if (!list.isEmpty()) {
				for (Double n : list) {
					sum += n;
				}
			}
			if (sum % 1 == 0){
				int sumInt = (int) sum;
				return new Value(sumInt);
			}
			else {
				return new Value(sum);
			}
		}
	}

	@Override
	public Value visitAvgSumListInt(AvgSumListIntContext ctx) {
		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
		if (ctx.op.getType() == ExpressionParser.AVG) {
			int sum = 0;
			if (!list.isEmpty()) {
				for (int n : list) {
					sum += n;
				}
			}
			return new Value(sum/list.size());
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
	public Value visitContainsInt(ContainsIntContext ctx) {
		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
		int n = visit(ctx.numExpr()).intVal();
		return new Value(list.contains(n));
	}

	@Override
	public Value visitContainsString(ContainsStringContext ctx) {
		List<String> list = visit(ctx.listStringExpr()).listVal();
		String str = visit(ctx.stringExpr()).stringVal();
		return new Value(list.contains(str));
	}

	@Override
	public Value visitEqualList(EqualListContext ctx) {
		List<?> left = visit(ctx.listExpr(0)).listVal();
		List<?> right = visit(ctx.listExpr(1)).listVal();
		return new Value(left.equals(right));
	}

	@Override
	public Value visitIsAscIsDescDouble(IsAscIsDescDoubleContext ctx) {
		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
		if (ctx.op.getType() == ExpressionParser.ASC) {
			boolean sorted = true;
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i - 1) >= list.get(i)) {
					sorted = false;
				}
			}
			return new Value(sorted);
		} else {
			boolean sorted = true;
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i - 1) <= list.get(i)) {
					sorted = false;
				}
			}
			return new Value(sorted);
		}
	}

	@Override
	public Value visitContainsDouble(ContainsDoubleContext ctx) {
		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
		double n = visit(ctx.numExpr()).doubleVal();
		return new Value(list.contains(n));
	}

	@Override
	public Value visitIsAscIsDescInt(IsAscIsDescIntContext ctx) {
		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
		System.out.println(list);
		if (ctx.op.getType() == ExpressionParser.ASC) {
			boolean sorted = true;
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i - 1) >= list.get(i)) {
					sorted = false;
				}
			}
			return new Value(sorted);
		} else {
			boolean sorted = true;
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i - 1) <= list.get(i)) {
					sorted = false;
				}
			}
			return new Value(sorted);
		}
	}

	@Override
	public Value visitContainsBool(ContainsBoolContext ctx) {
		List<Boolean> list = visit(ctx.listBoolExpr()).listVal();
		Boolean bool = visit(ctx.boolExpr()).boolVal();
		return new Value(list.contains(bool));
	}

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
	public Value visitLastListDouble(LastListDoubleContext ctx) {
		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
		Double value = list.get(list.size() - 1);
		return new Value(value);
	}


	@Override
	public Value visitLastListInt(LastListIntContext ctx) {
		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
		Integer value = list.get(list.size() - 1);
		return new Value(value);
	}


	@Override
	public Value visitLastListString(LastListStringContext ctx) {
		List<String> list = visit(ctx.listStringExpr()).listVal();
		String value = list.get(list.size() - 1);
		return new Value(value);
	}


	@Override
	public Value visitLastListBool(LastListBoolContext ctx) {
		List<Boolean> list = visit(ctx.listBoolExpr()).listVal();
		Boolean value = list.get(list.size() - 1);
		return new Value(value);
	}


	@Override
	public Value visitConstantListDouble(ConstantListDoubleContext ctx) {
		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
		double right = visit(ctx.numExpr()).doubleVal();
		double sum = 0;
		if (!list.isEmpty()) {
			for (double n : list) {
				sum += n;
			}
		}
		double avg = sum/list.size();
		boolean b = true;
		for (double n : list) {
			if(Math.abs(avg - n) > right){
				b = false;
			}
		}
		return new Value(b);
	}


	@Override
	public Value visitConstantListDigit(ConstantListDigitContext ctx) {
		// TODO Auto-generated method stub
		return super.visitConstantListDigit(ctx);
	}
	
	
	

//	@Override
//	public Value visitIdentifierString(IdentifierStringContext ctx) {
//		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId()
//				.getText();
//		String observableId = ctx.observableId().getText();
//		String method = ctx.method().getText();
//		String id = hostId + "." + observableId + "." + method;
//		System.out.println("get is " + values.get(id));
//		return new Value(values.get(id).stringVal()); 
//	}
//
//	@Override
//	public Value visitIdentifierInt(IdentifierIntContext ctx) {
//		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId()
//				.getText();
//		String observableId = ctx.observableId().getText();
//		String method = ctx.method().getText();
//		String id = hostId + "." + observableId + "." + method;
//		System.out.println("get is " + values.get(id));
//		return new Value(values.get(id).intVal()); 
//	}
//
//
//
////	@Override
////	public Value visitIdentifier(ExpressionParser.IdentifierContext ctx) {
////		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId()
////				.getText();
////		String observableId = ctx.observableId().getText();
////		String method = ctx.method().getText();
////		String type = ctx.type().getText();
////		String id = hostId + "." + observableId + "." + method;
////		System.out.println("get is " + values.get(id));
////		if (type.compareTo("Int")==0){
////			System.out.println("get num is " + values.get(id).doubleVal());
////			return new Value(values.get(id).doubleVal()); 
////		}
////		else {
////			System.out.println("get string is " + values.get(id).stringVal());
////			return new Value(values.get(id).stringVal()); 
////		}
////	}
//
////	@Override
////	public Value visitParensBool(ExpressionParser.ParensBoolContext ctx) {
////		return visit(ctx.boolExpr());
////	}
//
//	@Override
//	public Value visitParensNum(ExpressionParser.ParensNumContext ctx) {
//		System.out.println("Method visitParensNum");
//	    System.out.println("Visiting " + ctx.getText());
//		return visit(ctx.numExpr());
//	}
//
//	@Override
//	public Value visitParensString(ExpressionParser.ParensStringContext ctx) {
//		System.out.println("Method visitParensString");
//	    System.out.println("Visiting " + ctx.getText());
//		return visit(ctx.stringExpr());
//	}
//
////	@Override
////	public Value visitNot(ExpressionParser.NotContext ctx) {
////		boolean val = !visit(ctx.boolExpr()).boolVal();
////		return new Value(val);
////	}
////
////	@Override
////	public Value visitIdBool(ExpressionParser.IdBoolContext ctx) {
////		return visit(ctx.identifier());
////	}
//
//	@Override
//	public Value visitIdNum(ExpressionParser.IdNumContext ctx) {
//		return visit(ctx.identifierInt());
//	}
//
//	@Override
//	public Value visitIdString(ExpressionParser.IdStringContext ctx) {
//		return visit(ctx.identifierString());
//	}
//
////	@Override
////	public Value visitBool(ExpressionParser.BoolContext ctx) {
////		return new Value(Boolean.parseBoolean(ctx.getText()));
////	}
//
////	@Override
////	public Value visitListDigit(ListDigitContext ctx) {
////		// TODO Auto-generated method stub
////		return super.visitListDigit(ctx);
//////		System.out.println("prova int");
//////		List<Integer> list = visit(ctx.seqInt()).listVal();
//////		return new Value(list);
////	}
//
//	@Override
//	public Value visitExpression(ExpressionContext ctx) {
//		System.out.println("Method visitExpression");
//	    System.out.println("Visiting " + ctx.getText());
//	    return visitChildren(ctx);
//	}
//
//	
//
////	@Override
////	public Value visitSeqInt(SeqIntContext ctx) {
////		if (ctx.getChildCount() == 1){
////			return new Value(Integer.parseInt(ctx.getText()));
////		}
////		else {
////			int left = (Integer.parseInt(ctx.DIGIT().getText()));
////			List<Integer> right = visit(ctx.seqInt()).listVal();
////			return new Value(right.add(left));
////		}
////	}
//
////	@Override
////	public Value visitSeqBool(SeqBoolContext ctx) {
////		System.out.println("prova add");
////		if (ctx.getChildCount() == 1){
////			return new Value(Boolean.parseBoolean(ctx.getText()));
////		}
////		else {
////			Boolean left = (Boolean.parseBoolean(ctx.BOOL().getText()));
////			List<Boolean> right = visit(ctx.seqBool()).listVal();
////			return new Value(right.add(left));
////		}
////	}
//
////	@Override
////	public Value visitSeqString(SeqStringContext ctx) {
////		if (ctx.getChildCount() == 1){
////			return new Value(ctx.getText());
////		}
////		else {
////			String left = (ctx.STRING().getText());
////			List<String> right = visit(ctx.seqString()).listVal();
////			return new Value(right.add(left));
////		}
////	}
//
//
////	@Override
////	public Value visitSeqDouble(SeqDoubleContext ctx) {
////		if (ctx.getChildCount() == 1){
////			return new Value(Integer.parseInt(ctx.getText()));
////		}
////		else {
////			double left = (Double.parseDouble(ctx.DOUBLE().getText()));
////			List<Double> right = visit(ctx.seqDouble()).listVal();
////			return new Value(right.add(left));
////		}
////	}
//	
//	
//
////	@Override
////	public Value visitAllTrueFalse(AllTrueFalseContext ctx) {
////		List<Boolean> list = visit(ctx.listBoolExpr()).listVal();
////		if (ctx.op.getType() == ExpressionParser.ALLTRUE) {
////			boolean check = true;
////			for (boolean bool : list) {
////				if (bool == false) {
////					check = false;
////				}
////			}
////			return new Value(check);
////		} else {
////			boolean check = true;
////			for (boolean bool : list) {
////				if (bool == true) {
////					check = false;
////				}
////			}
////			return new Value(check);
////
////		}
////	}
//
////	@Override
////	public Value visitAvgSumListInt(AvgSumListIntContext ctx) {
////		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
////		if (ctx.op.getType() == ExpressionParser.AVG) {
////			double sum = 0;
////			if (!list.isEmpty()) {
////				for (int n : list) {
////					sum += n;
////				}
////			}
////			double avg = sum/list.size();
////			return new Value(avg);
////		} else {
////			int sum = 0;
////			if (!list.isEmpty()) {
////				for (int n : list) {
////					sum += n;
////				}
////			}
////			return new Value(sum);
////		}
////	}
//
////	@Override
////	public Value visitIdListString(IdListStringContext ctx) {
////		return visit(ctx.identifier());
////	}
//
//	@Override
//	public Value visitConcat(ConcatContext ctx) {
//		System.out.println("Method visitConcat");
//	    System.out.println("Visiting " + ctx.getText());
//		String string1 = visit(ctx.stringExpr(0)).stringVal();
//		String string2 = visit(ctx.stringExpr(1)).stringVal();
//		return new Value(string1.concat(string2));
//
//	}
//
////	@Override
////	public Value visitContainsBool(ContainsBoolContext ctx) {
////		List<Boolean> list = visit(ctx.listBoolExpr()).listVal();
////		boolean bool = visit(ctx.boolExpr()).boolVal();
////		return new Value(list.contains(bool));
////	}
////
////	@Override
////	public Value visitIdListBool(IdListBoolContext ctx) {
////		return visit(ctx.identifier());
////	}
////
////	@Override
////	public Value visitOrderListBool(OrderListBoolContext ctx) {
////		System.out.println("sono in bool");
////		List<Boolean> list = visit(ctx.listBoolExpr()).listVal();
////		return new Value(list);
////	}
////
////	@Override
////	public Value visitOrderListString(OrderListStringContext ctx) {
////		System.out.println("sono in string");
////		List<String> list = visit(ctx.listStringExpr()).listVal();
////		Collections.sort(list);
////		return new Value(list);
////	}
//
////	@Override
////	public Value visitContainsDouble(ContainsDoubleContext ctx) {
////		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
////		double n = visit(ctx.numExpr()).doubleVal();
////		return new Value(list.contains(n));
////	}
//
////	@Override
////	public Value visitNumExpression(NumExpressionContext ctx) {
////		// TODO Auto-generated method stub
////		return super.visitNumExpression(ctx);
////	}
////
////	@Override
////	public Value visitBoolExpression(BoolExpressionContext ctx) {
////		// TODO Auto-generated method stub
////		return super.visitBoolExpression(ctx);
////	}
//
//	@Override
//	public Value visitString(StringContext ctx) {
//		System.out.println("Method visitString");
//	    System.out.println("Visiting " + ctx.getText());
//		return new Value(ctx.getText());
//	}
//
////	@Override
////	public Value visitStringExpression(StringExpressionContext ctx) {
////		// TODO Auto-generated method stub
////		return super.visitStringExpression(ctx);
////	}
////
////	@Override
////	public Value visitEqualBool(EqualBoolContext ctx) {
////		boolean left = visit(ctx.boolExpr(0)).boolVal();
////		boolean right = visit(ctx.boolExpr(1)).boolVal();
////		return new Value(left == right);
////	}
//
////	@Override
////	public Value visitFilterListDouble(FilterListDoubleContext ctx) {
////		System.out.println("siamo nel double");
////		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
////		double n = visit(ctx.numExpr()).doubleVal();
////		List<Double> listNew = new ArrayList<Double>();
////		if (ctx.op.getType() == ExpressionParser.MIN) {
////			for (int i=0; i<list.size(); i++) {
////				if (list.get(i) < n){
////					listNew.add(list.get(i));
////				}
////			}
////			return new Value(listNew);
////		} else if (ctx.op.getType() == ExpressionParser.MAX) {
////			for (int i=0; i<list.size(); i++) {
////				if (list.get(i) > n){
////					listNew.add(list.get(i));
////				}
////			}
////			return new Value(listNew);
////		} else if (ctx.op.getType() == ExpressionParser.MINEQ) {
////			for (int i=0; i<list.size(); i++) {
////				if (list.get(i) <= n){
////					listNew.add(list.get(i));
////				}
////			}
////			return new Value(listNew);
////		} else {
////			for (int i=0; i<list.size(); i++) {
////				if (list.get(i) >= n){
////					listNew.add(list.get(i));
////				}
////			}
////			return new Value(listNew);
////		}
////	}
//
////	@Override
////	public Value visitFilterListInt(FilterListIntContext ctx) {
////		System.out.println("siamo nel int");
////		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
////		double n = visit(ctx.numExpr()).doubleVal();
////		List<Integer> listNew = new ArrayList<Integer>();
////		if (ctx.op.getType() == ExpressionParser.MIN) {
////			for (int i=0; i<list.size(); i++) {
////				if (list.get(i) < n){
////					listNew.add(list.get(i));
////				}
////			}
////			return new Value(listNew);
////		} else if (ctx.op.getType() == ExpressionParser.MAX) {
////			for (int i=0; i<list.size(); i++) {
////				if (list.get(i) > n){
////					listNew.add(list.get(i));
////				}
////			}
////			return new Value(listNew);
////		} else if (ctx.op.getType() == ExpressionParser.MINEQ) {
////			for (int i=0; i<list.size(); i++) {
////				if (list.get(i) <= n){
////					listNew.add(list.get(i));
////				}
////			}
////			return new Value(listNew);
////		} else {
////			for (int i=0; i<list.size(); i++) {
////				if (list.get(i) >= n){
////					listNew.add(list.get(i));
////				}
////			}
////			return new Value(listNew);
////		}
////	}
//
////	@Override
////	public Value visitListBool(ListBoolContext ctx) {
////		// TODO Auto-generated method stub
//////		return super.visitListBool(ctx);
////		System.out.println("prova bool");
////	List<Boolean> list = visit(ctx.seqBool()).listVal();
////	return new Value(list);
////	}
//
////	@Override
////	public Value visitAvgSumListDouble(AvgSumListDoubleContext ctx) {
////		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
////		if (ctx.op.getType() == ExpressionParser.AVG) {
////			Double sum = 0.0;
////			if (!list.isEmpty()) {
////				for (Double n : list) {
////					sum += n;
////				}
////			}
////			return new Value(sum / list.size());
////		} else {
////			Double sum = 0.0;
////			if (!list.isEmpty()) {
////				for (Double n : list) {
////					sum += n;
////				}
////			}
////			return new Value(sum);
////		}
////	}
//	
////	@Override
////	public Value visitIsAscIsDescInt(IsAscIsDescIntContext ctx) {
////		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
////		if (ctx.op.getType() == ExpressionParser.ASC) {
////			boolean sorted = true;
////			for (int i = 1; i < list.size(); i++) {
////				if (list.get(i - 1) < list.get(i)) {
////					sorted = false;
////				}
////			}
////			return new Value(sorted);
////		} else {
////			boolean sorted = true;
////			for (int i = 1; i < list.size(); i++) {
////				if (list.get(i - 1) > list.get(i)) {
////					sorted = false;
////				}
////			}
////			return new Value(sorted);
////		}
////
////	}
//
////	@Override
////	public Value visitIsAscIsDescDouble(IsAscIsDescDoubleContext ctx) {
////		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
////		if (ctx.op.getType() == ExpressionParser.ASC) {
////			boolean sorted = true;
////			for (int i = 1; i < list.size(); i++) {
////				if (list.get(i - 1) < list.get(i)) {
////					sorted = false;
////				}
////			}
////			return new Value(sorted);
////		} else {
////			boolean sorted = true;
////			for (int i = 1; i < list.size(); i++) {
////				if (list.get(i - 1) > list.get(i)) {
////					sorted = false;
////				}
////			}
////			return new Value(sorted);
////		}
////	}
////
//
////	@Override
////	public Value visitListExpr(ListExprContext ctx) {
////		System.out.println("prova list");
////
////		// TODO Auto-generated method stub
////		//return super.visitListExpr(ctx);
////		List<String> list1 = visit(ctx.listStringExpr()).listVal();
////		List<Boolean> list2 = visit(ctx.listBoolExpr()).listVal();
////		return new Value(list1);
////	}
//
////	@Override
////	public Value visitContainsInt(ContainsIntContext ctx) {
////		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
////		int n = visit(ctx.numExpr()).intVal();
////		return new Value(n);
////	}
//
////	@Override
////	public Value visitContainsString(ContainsStringContext ctx) {
////		List<String> list = visit(ctx.listStringExpr()).listVal();
////		String string = visit(ctx.stringExpr()).stringVal();
////		return new Value(list.contains(string));
////	}
//
////	@Override
////	public Value visitOrderListInt(OrderListIntContext ctx) {
////		System.out.println("siamo nel int");
////		List<Integer> list = visit(ctx.listDigitExpr()).listVal();
////		Collections.sort(list);
////		return new Value(list);
////	}
//
////	@Override
////	public Value visitOrderListDouble(OrderListDoubleContext ctx) {
////		System.out.println("siamo nel double");
////		List<Double> list = visit(ctx.listDoubleExpr()).listVal();
////		Collections.sort(list);
////		return new Value(list);	
////	}
//
////	@Override
////	public Value visitEqualList(EqualListContext ctx) {
////		List<?> left = visit(ctx.listExpr(0)).listVal();
////		List<?> right = visit(ctx.listExpr(1)).listVal();
////		return new Value(left.equals(right));
////	}
//
//	
////	@Override
////	public Value visitListDouble(ListDoubleContext ctx) {
////		// TODO Auto-generated method stub
////		return super.visitListDouble(ctx);
////	}
//
////	@Override
////	public Value visitIdListInt(IdListIntContext ctx) {
////		return visit(ctx.identifier());
////	}
//
//	
//	
////	@Override
////	public Value visitListString(ListStringContext ctx) {
////		// TODO Auto-generated method stub
////		//return super.visitListString(ctx);
////		System.out.println("prova string");
////		List<String> list = visit(ctx.seqString()).listVal();
////		return new Value(list);
////	}
//
////	@Override
////	public Value visitString(StringContext ctx) {
////		return new Value(ctx.getText());
////	}
////
////	@Override
////	public Value visitSizeList(SizeListContext ctx) {
////		List list = visit(ctx.listExpr()).listVal();
////		return new Value(list.size());
////	}
//
//	@Override
//	public Value visitInt(ExpressionParser.IntContext ctx) {
//		System.out.println("Method visitInt");
//	    System.out.println("Visiting " + ctx.getText());
//		return new Value(Integer.parseInt(ctx.getText()));
//	}
//
//	@Override
//	public Value visitDouble(ExpressionParser.DoubleContext ctx) {
//		System.out.println("Method visitDouble");
//	    System.out.println("Visiting " + ctx.getText());
//		return new Value(Double.parseDouble(ctx.getText()));
//	}
//
////	@Override
////	public Value visitAndOr(ExpressionParser.AndOrContext ctx) {
////		boolean left = visit(ctx.boolExpr(0)).boolVal();
////		boolean right = visit(ctx.boolExpr(1)).boolVal();
////		if (ctx.op.getType() == ExpressionParser.AND) {
////			return new Value(left && right);
////		} else {
////			return new Value(left || right);
////		}
////	}
//
//	@Override
//	public Value visitAddSub(ExpressionParser.AddSubContext ctx) {
//		System.out.println("Method visitAddSub");
//	    System.out.println("Visiting " + ctx.getText());
//		double left = visit(ctx.numExpr(0)).doubleVal();
//		double right = visit(ctx.numExpr(1)).doubleVal();
//		if (ctx.op.getType() == ExpressionParser.ADD) {
//			double sum = left + right;
//			if (sum % 1 == 0){
//				int sumInt = (int) sum;
//				return new Value(sumInt);
//			}
//			else {
//				return new Value(sum);
//			}
//		} else {
//			double sub = left - right;
//			if (sub % 1 == 0){
//				int subInt = (int) sub;
//				return new Value(subInt);
//			}
//			else {
//				return new Value(sub);
//			}
//		}
//	}
//
//	@Override
//	public Value visitMulDiv(ExpressionParser.MulDivContext ctx) {
//		System.out.println("Method visitMultDiv");
//	    System.out.println("Visiting " + ctx.getText());
//		double left = visit(ctx.numExpr(0)).doubleVal();
//		double right = visit(ctx.numExpr(1)).doubleVal();
//		if (ctx.op.getType() == ExpressionParser.MUL) {
//			double mul = left * right;
//			ifvisit (mul % 1 == 0){
//				int mulInt = (int) mul;
//				return new Value(mulInt);
//			}
//			else {
//				return new Value(mul);
//			}
//		} else {
//			double div = left / right;
//			if (div % 1 == 0){
//				int divInt = (int) div;
//				return new Value(divInt);
//			}
//			else {
//				return new Value(div);
//			}
//		}
//	}
//
//	@Override
//	public Value visitMinMaxMineqMaxeq(ExpressionParser.MinMaxMineqMaxeqContext ctx) {
//		System.out.println("Method visitMinMaxMineqMaxeq");
//	    System.out.println("Visiting " + ctx.getText());
//		double left = visit(ctx.numExpr(0)).doubleVal();
//		double right = visit(ctx.numExpr(1)).doubleVal();
//		if (ctx.op.getType() == ExpressionParser.MIN) {
//			if (left < right) {
//				return new Value(true);
//			} else
//				return new Value(false);
//		} else if (ctx.op.getType() == ExpressionParser.MAX) {
//			if (left > right) {
//				return new Value(true);
//			} else
//				return new Value(false);
//		} else if (ctx.op.getType() == ExpressionParser.MINEQ) {
//			if (left <= right) {
//				return new Value(true);
//			} else
//				return new Value(false);
//		} else {
//			if (left >= right) {
//				return new Value(true);
//			} else
//				return new Value(false);
//		}
//
//	}
//
////	@Override
////	public Value visitEqualNum(ExpressionParser.EqualNumContext ctx) {
////		double left = visit(ctx.numExpr(0)).doubleVal();
////		double right = visit(ctx.numExpr(1)).doubleVal();
////		return new Value(left == right);
////	}
////
////	@Override
////	public Value visitEqualString(ExpressionParser.EqualStringContext ctx) {
////		String left = visit(ctx.stringExpr(0)).stringVal();
////		String right = visit(ctx.stringExpr(1)).stringVal();
////		if (left.equals(right)) {
////			return new Value(true);
////		} else
////			return new Value(false);
////	}

}
