package test.javareact.common.expressions.visitors;

import java.util.ArrayList;
import java.util.Collection;

import test.javareact.common.Consts;
import test.javareact.common.expressions.antlr_grammars.ExpressionBaseVisitor;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdentifierBoolContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdentifierNumContext;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser.IdentifierStringContext;


public class ExpressionsIdentifiersExtractorVisitor extends ExpressionBaseVisitor<Void> {
  private final Collection<String> identifiers = new ArrayList<String>();

  @Override
	public Void visitIdentifierString(IdentifierStringContext ctx) {
	    String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
	    String observableId = ctx.observableId().getText();
	    String method = ctx.method().getText();
	    String id = hostId + "." + observableId + "." + method;
		identifiers.add(id);
	    return null; 
	}



	@Override
	public Void visitIdentifierNum(IdentifierNumContext ctx) {
		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
	    String observableId = ctx.observableId().getText();
	    String method = ctx.method().getText();
	    String id = hostId + "." + observableId + "." + method;
		identifiers.add(id);
	    return null;
	}
	
	@Override
	public Void visitIdentifierBool(IdentifierBoolContext ctx) {
		String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
	    String observableId = ctx.observableId().getText();
	    String method = ctx.method().getText();
	    String id = hostId + "." + observableId + "." + method;
		identifiers.add(id);
	    return null;
	}
  
//  @Override
//  public Void visitIdentifier(ExpressionParser.IdentifierContext ctx) {
//    String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
//    String observableId = ctx.observableId().getText();
//    String method = ctx.method().getText();
//    String id = hostId + "." + observableId + "." + method;
//    identifiers.add(id);
//    return null;
//  }

  public Collection<String> getIdentifiers() {
    return identifiers;
  }

}
