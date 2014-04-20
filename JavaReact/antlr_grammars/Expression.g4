grammar Expression;
import Common;

start: expression;

expression:     numExpr | stringExpr | boolExpr ;
              


numExpr:    numExpr op=(MUL|DIV) numExpr                # MulDiv
    |       numExpr op=(ADD|SUB) numExpr                # AddSub
    |       numExpr op=(MIN|MAX|MINEQ|MAXEQ) numExpr    # MinMaxMineqMaxeq 
    |       DIGIT                                       # Int
    |       DOUBLE                                      # Double
    |       identifier                                  # Id        
    |       '(' numExpr ')'                             # Parens   
    ;

stringExpr:     stringExpr ADD stringExpr   # Concat
    |           identifier                  # Id  
    |           '(' stringExpr ')'          # Parens
    ;

boolExpr:   NOT boolExpr                    # Not
    |       boolExpr op=(AND|OR) boolExpr   # AndOr
    |       boolExpr EQUAL boolExpr         # Equal
    |       BOOL                            # Bool
    |       identifier                      # Id        
    |       '(' boolExpr ')'                # Parens
    |       numExpr DOT EQUAL '(' numExpr ')'           # EqualNum
    |       stringExpr DOT EQUAL '(' stringExpr ')'     # EqualString
    ;

