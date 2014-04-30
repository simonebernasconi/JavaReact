grammar Expression;
import Common;

start: expression;

expression:     stringExpr | numExpr | boolExpr;
           


stringExpr:     stringExpr ADD stringExpr   # Concat
    |           identifier                  # IdString
    |			STRING						# String  
    |           '(' stringExpr ')'          # ParensString
    ;

numExpr:    numExpr op=(MUL|DIV) numExpr                # MulDiv
    |       numExpr op=(ADD|SUB) numExpr                # AddSub
    |       numExpr op=(MIN|MAX|MINEQ|MAXEQ) numExpr    # MinMaxMineqMaxeq 
    |       DIGIT                                       # Int
    |       DOUBLE                                      # Double
    |       identifier                                  # IdNum      
    |       '(' numExpr ')'                             # ParensNum 	 
    ;
    
boolExpr:   NOT boolExpr                    # Not
    |       boolExpr op=(AND|OR) boolExpr   # AndOr
    |       BOOL                            # Bool
    |       identifier                      # IdBool        
    |       '(' boolExpr ')'                # ParensBool
    |       boolExpr EQUAL boolExpr         			# EqualBool
    |       numExpr EQUAL numExpr           			# EqualNum
    |       stringExpr EQUAL stringExpr     			# EqualString
    ;

