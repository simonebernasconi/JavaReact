grammar Expression;
import Common;

start: expression;

expression:     numExpr | stringExpr | boolExpr | listExpr ;
           
seqInt: DIGIT | DIGIT ',' seqInt;   
listDigit: '[' seqInt ']';

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
    |       listDigitExpr DOT CONTAINS '(' numExpr ')'    # ContainsInt
    |       listStringExpr DOT CONTAINS '(' stringExpr ')'  # ContainsString
    |       listBoolExpr DOT CONTAINS '(' boolExpr ')'      # ContainsBool
    |       listBoolExpr DOT op=(ALLTRUE|ALLFALSE)      # AllTrueFalse
    ;

listExpr:  listDigitExpr | listStringExpr | listBoolExpr ;
    
listDigitExpr:  listDigitExpr DOT op=(ORDERASC|ORDERDESC)                       # OrderListInt   
    |           listDigitExpr DOT FILTER '(' op=(MIN|MAX|MINEQ|MAXEQ) numExpr ')' # FilterListInt
    |           listDigit                                                       # ListDigit_Label
    |           identifier                                                      # IdListInt      
    ;

listStringExpr: listStringExpr DOT op=(ORDERASC|ORDERDESC)                       # OrderListString
    |           listString                                                       # ListString_Label
    |           identifier                                                       # IdListString       
    ;

listBoolExpr:   listBool                                                         # ListBool_Label
    |           identifier                                                       # IdListBool     
    ;