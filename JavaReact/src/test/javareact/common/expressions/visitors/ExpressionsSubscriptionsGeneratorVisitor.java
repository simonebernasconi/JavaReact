package test.javareact.common.expressions.visitors;

import java.util.HashSet;
import java.util.Set;

import test.javareact.common.Consts;
import test.javareact.common.expressions.antlr_grammars.ExpressionBaseVisitor;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdentifierBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdentifierNumContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdentifierStringContext;
import test.javareact.common.packets.content.Constraint;
import test.javareact.common.packets.content.Subscription;


public class ExpressionsSubscriptionsGeneratorVisitor extends ExpressionBaseVisitor<Void> {
  private final Set<Subscription> subscriptions = new HashSet<Subscription>();

  @Override
	public Void visitIdentifierString(IdentifierStringContext ctx) {
	  String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
	    String observableId = ctx.observableId().getText();
	    String method = ctx.method().getText();
	    Subscription sub = new Subscription(observableId, hostId, new Constraint(method));
	    subscriptions.add(sub);
	    return null;
	}



	@Override
	public Void visitIdentifierNum(IdentifierNumContext ctx) {
		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
	    String observableId = ctx.observableId().getText();
	    String method = ctx.method().getText();
	    Subscription sub = new Subscription(observableId, hostId, new Constraint(method));
	    subscriptions.add(sub);
	    return null;
	}
	
	@Override
	public Void visitIdentifierBool(IdentifierBoolContext ctx) {
		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
	    String observableId = ctx.observableId().getText();
	    String method = ctx.method().getText();
	    Subscription sub = new Subscription(observableId, hostId, new Constraint(method));
	    subscriptions.add(sub);
	    return null;
	}
  
//  @Override
//  public Void visitIdentifier(ExpressionParser.IdentifierContext ctx) {
//    String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
//    String observableId = ctx.observableId().getText();
//    String method = ctx.method().getText();
//    Subscription sub = new Subscription(observableId, hostId, new Constraint(method));
//    subscriptions.add(sub);
//    return null;
//  }

  public Set<Subscription> getSubscriptions() {
    return subscriptions;
  }

}
