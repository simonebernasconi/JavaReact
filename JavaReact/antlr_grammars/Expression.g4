grammar Expression;
import Common;

start: expression;

expression:     numExpr | stringExpr | boolExpr | listExpr ;
              


numExpr:    numExpr op=(MUL|DIV) numExpr                # MulDiv
    |       numExpr op=(ADD|SUB) numExpr                # AddSub
    |       numExpr op=(MIN|MAX|MINEQ|MAXEQ) numExpr    # MinMaxMineqMaxeq 
    |       DIGIT                                       # Int
    |       DOUBLE                                      # Double
    |       identifier                                  # Id        
    |       '(' numExpr ')'                             # Parens
    |       listDoubleExpr DOT op=(AVG|SUM)             # AvgSum
    |       listStringExpr DOT SIZE                     # SizeString  
    |       listDigitExpr DOT SIZE                      # SizeDigit  
    |       listDoubleExpr DOT SIZE                     # SizeDouble  
    |       listBoolExpr DOT SIZE                       # SizeBool    
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
    |       listExpr DOT EQUAL '(' listExpr ')'         # EqualList
    |       listExpr DOT op=(ASC|DESC)                  # IsascIsdesc
    |       listDigitExpr DOT contains '(' DIGIT ')'    # ContainsDigit
    |       listDoubleExpr DOT contains '(' DOUBLE ')'  # ContainsDouble
    |       listStringExpr DOT contains '(' STRING ')'  # ContainsString
    |       listBoolExpr DOT contains '(' BOOL ')'      # ContainsBool
    |       listStringExpr DOT op=(ALLTRUE|ALLFALSE)    # AllTrueFalse
    ;

