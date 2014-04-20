grammar Expression;
import Common;

start: expression;

expression:     numExpr | stringExpr | boolExpr ;
              


numExpr:    numExpr op=(MUL|DIV) numExpr                # MulDiv
    |       numExpr op=(ADD|SUB) numExpr                # AddSub
    |       numExpr op=(MIN|MAX|MINEQ|MAXEQ) numExpr    # MinMaxMineqMaxeq 
    |       DIGIT                                       # Int
    |       DOUBLE                                      # Double
    |       identifier                                  # IdNum      
    |       '(' numExpr ')'                             # ParensNum   
    ;

stringExpr:     stringExpr ADD stringExpr   # Concat
    |           identifier                  # IdString  
    |           '(' stringExpr ')'          # ParensString
    ;

boolExpr:   NOT boolExpr                    # Not
    |       boolExpr op=(AND|OR) boolExpr   # AndOr
    |       boolExpr EQUAL boolExpr         # Equal
    |       BOOL                            # Bool
    |       identifier                      # IdBool        
    |       '(' boolExpr ')'                # ParensBool
    |       numExpr DOT EQUAL '(' numExpr ')'           # EqualNum
    |       stringExpr DOT EQUAL '(' stringExpr ')'     # EqualString
    ;

