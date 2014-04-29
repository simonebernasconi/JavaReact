grammar Expression;
import Common;

start: expression;

expression:     numExpr | stringExpr | boolExpr | listExpr ;
           
seqInt: DIGIT | DIGIT ',' seqInt;   
listDigit: '[' seqInt ']';

seqDouble: DOUBLE | DOUBLE ',' seqDouble;
listDouble: '[' seqDouble ']';

seqString: STRING | STRING ',' seqString;
listString: '[' seqString ']';

seqBool: BOOL | BOOL ',' seqBool;
listBool: '[' seqBool ']';

numExpr:    numExpr op=(MUL|DIV) numExpr                # MulDiv
    |       numExpr op=(ADD|SUB) numExpr                # AddSub
    |       numExpr op=(MIN|MAX|MINEQ|MAXEQ) numExpr    # MinMaxMineqMaxeq 
    |       DIGIT                                       # Int
    |       DOUBLE                                      # Double
    |       identifier                                  # IdNum      
    |       '(' numExpr ')'                             # ParensNum 
    |		listDigitExpr DOT op=(AVG|SUM)              # AvgSumListInt  
    |		listDoubleExpr DOT op=(AVG|SUM)             # AvgSumListDouble
    |       listExpr DOT SIZE                     		# SizeList	 
    ;

stringExpr:     stringExpr ADD stringExpr   # Concat
    |           identifier                  # IdString  
    |           '(' stringExpr ')'          # ParensString
    ;

boolExpr:   NOT boolExpr                    # Not
    |       boolExpr op=(AND|OR) boolExpr   # AndOr
    |       BOOL                            # Bool
    |       identifier                      # IdBool        
    |       '(' boolExpr ')'                # ParensBool
    |       boolExpr EQUAL boolExpr         			# EqualBool
    |       numExpr EQUAL numExpr           			# EqualNum
    |       stringExpr EQUAL stringExpr     			# EqualString
    |       listExpr EQUAL listExpr        				# EqualList
    |       listDigitExpr DOT op=(ASC|DESC)             # IsAscIsDescInt
    |       listDoubleExpr DOT op=(ASC|DESC)            # IsAscIsDescDouble
    |       listDigitExpr DOT CONTAINS '(' numExpr ')'    # ContainsInt
    |       listDoubleExpr DOT CONTAINS '(' numExpr ')'  # ContainsDouble
    |       listStringExpr DOT CONTAINS '(' stringExpr ')'  # ContainsString
    |       listBoolExpr DOT CONTAINS '(' boolExpr ')'      # ContainsBool
    |       listBoolExpr DOT op=(ALLTRUE|ALLFALSE)      # AllTrueFalse
    ;

listExpr:  listDigitExpr | listDoubleExpr | listStringExpr | listBoolExpr ;
    
listDigitExpr:  listDigitExpr DOT op=(ORDERASC|ORDERDESC)                       # OrderListInt   
    |           listDigitExpr DOT FILTER '(' op=(MIN|MAX|MINEQ|MAXEQ) numExpr ')' # FilterListInt
    |           listDigit                                                       # ListDigit_Label
    |           identifier                                                      # IdListInt      
    ;

listDoubleExpr: listDoubleExpr DOT op=(ORDERASC|ORDERDESC)                       # OrderListDouble   
    |           listDoubleExpr DOT FILTER '(' op=(MIN|MAX|MINEQ|MAXEQ) numExpr ')' # FilterListDouble
    |           listDouble                                                       # ListDouble_Label
    |           identifier                                                       # IdListDouble        
    ;

listStringExpr: listStringExpr DOT op=(ORDERASC|ORDERDESC)                       # OrderListString
    |           listString                                                       # ListString_Label
    |           identifier                                                       # IdListString       
    ;

listBoolExpr:   listBool                                                         # ListBool_Label
    |           identifier                                                       # IdListBool     
    ;