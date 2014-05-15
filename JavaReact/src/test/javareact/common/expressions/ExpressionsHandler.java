package test.javareact.common.expressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import test.javareact.common.expressions.antlr_grammars.ExpressionLexer;
import test.javareact.common.expressions.antlr_grammars.ExpressionParser;
import test.javareact.common.expressions.visitors.ExpressionsEvaluatorVisitor;
import test.javareact.common.expressions.visitors.ExpressionsIdentifiersExtractorVisitor;
import test.javareact.common.expressions.visitors.ExpressionsSubscriptionsGeneratorVisitor;
import test.javareact.common.packets.content.Subscription;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

public class ExpressionsHandler {
  private final ParseTree parseTree;

  public ExpressionsHandler(String expression) {
    ANTLRInputStream input = new ANTLRInputStream(expression);
    ExpressionLexer lexer = new ExpressionLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ExpressionParser parser = new ExpressionParser(tokens);
    parseTree = parser.start();	
//    switch (type) {
//    case INT:
//      ExpressionParser integersParser = new ExpressionParser(tokens);
//      parseTree = integersParser.start();
//      break;
//    case DOUBLE:
//      ExpressionParser doublesParser = new ExpressionParser(tokens);
//      parseTree = doublesParser.start();
//      break;
//    case BOOL:
//      ExpressionParser boolParser = new ExpressionParser(tokens);
//      parseTree = boolParser.start();
//      break;
//    case STRING:
//      ExpressionParser stringParser = new ExpressionParser(tokens);
//      parseTree = stringParser.start();
//      break;
//    case LIST:
//        ExpressionParser listParser = new ExpressionParser(tokens);
//        parseTree = listParser.start();
//        break;
//    default:
//      assert false : type;
//      parseTree = null;
//    }
  }

  public final Set<Subscription> buildSubscriptions() {
	  ExpressionsSubscriptionsGeneratorVisitor visitor = new ExpressionsSubscriptionsGeneratorVisitor();
	  visitor.visit(parseTree);
	  return visitor.getSubscriptions();
//    switch (type) {
//    case INT:
//      ExpressionsSubscriptionsGeneratorVisitor intVisitor = new ExpressionsSubscriptionsGeneratorVisitor();
//      intVisitor.visit(parseTree);
//      return intVisitor.getSubscriptions();
//    case DOUBLE:
//      ExpressionsSubscriptionsGeneratorVisitor doubleVisitor = new ExpressionsSubscriptionsGeneratorVisitor();
//      doubleVisitor.visit(parseTree);
//      return doubleVisitor.getSubscriptions();
//    case BOOL:
//      ExpressionsSubscriptionsGeneratorVisitor boolVisitor = new ExpressionsSubscriptionsGeneratorVisitor();
//      boolVisitor.visit(parseTree);
//      return boolVisitor.getSubscriptions();
//    case STRING:
//      ExpressionsSubscriptionsGeneratorVisitor stringVisitor = new ExpressionsSubscriptionsGeneratorVisitor();
//      stringVisitor.visit(parseTree);
//      return stringVisitor.getSubscriptions();
//    default:
//      assert false : type;
//      return new HashSet<Subscription>();
//    }
  }

  public final Collection<String> extractVariableNames() {
	  ExpressionsIdentifiersExtractorVisitor visitor = new ExpressionsIdentifiersExtractorVisitor();
	  visitor.visit(parseTree);
	  return visitor.getIdentifiers();	
//    switch (type) {
//    case INT:
//      ExpressionsIdentifiersExtractorVisitor intVisitor = new ExpressionsIdentifiersExtractorVisitor();
//      intVisitor.visit(parseTree);
//      return intVisitor.getIdentifiers();
//    case DOUBLE:
//      ExpressionsIdentifiersExtractorVisitor doubleVisitor = new ExpressionsIdentifiersExtractorVisitor();
//      doubleVisitor.visit(parseTree);
//      return doubleVisitor.getIdentifiers();
//    case BOOL:
//      ExpressionsIdentifiersExtractorVisitor boolVisitor = new ExpressionsIdentifiersExtractorVisitor();
//      boolVisitor.visit(parseTree);
//      return boolVisitor.getIdentifiers();
//    case STRING:
//      ExpressionsIdentifiersExtractorVisitor stringVisitor = new ExpressionsIdentifiersExtractorVisitor();
//      stringVisitor.visit(parseTree);
//      return stringVisitor.getIdentifiers();
//    default:
//      assert false : type;
//      return new ArrayList<String>();
//    }
  }

  public final Value evaluateExpression(Map<String, Value> values) {
	  ExpressionsEvaluatorVisitor visitor = new ExpressionsEvaluatorVisitor(values);
      return visitor.visit(parseTree);
//	  switch (type) {
//    case INT:
//      ExpressionsEvaluatorVisitor intVisitor = new ExpressionsEvaluatorVisitor(values);
//      return intVisitor.visit(parseTree);
//    case DOUBLE:
//      ExpressionsEvaluatorVisitor doubleVisitor = new ExpressionsEvaluatorVisitor(values);
//      return doubleVisitor.visit(parseTree);
//    case BOOL:
//      ExpressionsEvaluatorVisitor boolVisitor = new ExpressionsEvaluatorVisitor(values);
//      return boolVisitor.visit(parseTree);
//    case STRING:
//      ExpressionsEvaluatorVisitor strVisitor = new ExpressionsEvaluatorVisitor(values);
//      return strVisitor.visit(parseTree);
//    default:
//      assert false : type;
//      return null;
//    }
  }

}
