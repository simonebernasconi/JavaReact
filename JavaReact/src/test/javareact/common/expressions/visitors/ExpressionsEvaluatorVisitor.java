package test.javareact.common.expressions.visitors;

import java.util.Map;

import test.javareact.common.Consts;
import test.javareact.common.expressions.antlr_grammars.ExpressionBaseVisitor;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser;
import test.javareact.common.packets.content.Value;


public class ExpressionsEvaluatorVisitor extends ExpressionBaseVisitor<Value> {
  private final Map<String, Value> values;

  public ExpressionsEvaluatorVisitor(Map<String, Value> values) {
    super();
    this.values = values;
  }

  @Override
  public Value visitIdentifier(ExpressionParser.IdentifierContext ctx) {
    String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
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
  public Value visitInt(ExpressionParser.IntContext ctx) {
    return new Value(Integer.parseInt(ctx.getText()));
  }
  
  @Override
  public Value visitDouble(ExpressionParser.DoubleContext ctx) {
    return new Value(Double.parseDouble(ctx.getText()));
  }
//  ??????????????????????  
//  @Override
//  public Value visitExpression(ExpressionParser.ExpressionContext ctx) {
//    return new Value(Double.parseDouble(ctx.getText()));
//  }

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
  public Value visitMinMaxMineqMaxeq(ExpressionParser.MinMaxMineqMaxeqContext ctx) {
    double left = visit(ctx.numExpr(0)).doubleVal();
    double right = visit(ctx.numExpr(1)).doubleVal();
    if (ctx.op.getType() == ExpressionParser.MIN) {
      if (left < right) { return new Value(true);}
      else return new Value(false);
    } else if (ctx.op.getType() == ExpressionParser.MAX) {
        if (left > right) { return new Value(true);}
        else  return new Value(false);
    }  else if (ctx.op.getType() == ExpressionParser.MINEQ) {
        if (left <= right) { return new Value(true);}
        else return new Value(false);
    }  else{
        if (left >= right) { return new Value(true);}
        else return new Value(false);
    }
	
  }
  
  @Override
  public Value visitEqualNum(ExpressionParser.EqualNumContext ctx) {
    double left = visit(ctx.numExpr(0)).doubleVal();
    double right = visit(ctx.numExpr(1)).doubleVal();
    if (left == right) { return new Value(true);}
    else return new Value(false);
  }
  
  @Override
  public Value visitEqualString(ExpressionParser.EqualStringContext ctx) {
    String left = visit(ctx.stringExpr(0)).stringVal();
    String right = visit(ctx.stringExpr(1)).stringVal();
    if (left.equals(right)) { return new Value(true);}
    else return new Value(false);
  }


}
