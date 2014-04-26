grammar Expression;
import Common;

start: expression;

expression:     numExpr | stringExpr | boolExpr | listExpr ;
              


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
    |       listDigitExpr DOT CONTAINS '(' DIGIT ')'    # ContainsInt
    |       listDoubleExpr DOT CONTAINS '(' DOUBLE ')'  # ContainsDouble
    |       listStringExpr DOT CONTAINS '(' STRING ')'  # ContainsString
    |       listBoolExpr DOT CONTAINS '(' BOOL ')'      # ContainsBool
    |       listBoolExpr DOT op=(ALLTRUE|ALLFALSE)      # AllTrueFalse
    ;

listExpr:  listDigitExpr | listDoubleExpr | listStringExpr | listBoolExpr ;
    
listDigitExpr:  listDigitExpr DOT op=(ORDERASC|ORDERDEAS)                       # OrderListInt   
    |           listDigitExpr DOT FILTER '(' op=(MIN|MAX|MINEQ|MAXEQ) DIGIT ')' # FilterListInt
    |           LISTDIGIT                                                       # ListDigit
    |           identifier                                                      # IdListInt      
    ;

listDoubleExpr: listDoubleExpr DOT op=(ORDERASC|ORDERDEAS)                       # OrderListDouble   
    |           listDoubleExpr DOT FILTER '(' op=(MIN|MAX|MINEQ|MAXEQ) DOUBLE ')' # FilterListDouble
    |           LISTDOUBLE                                                       # ListDouble
    |           identifier                                                       # IdListDouble        
    ;

listStringExpr: listStringExpr DOT op=(ORDERASC|ORDERDEAS)                       # OrderListString
    |           LISTSTRING                                                       # ListString
    |           identifier                                                       # IdListString       
    ;

listBoolExpr:   LISTBOOL                                                         # ListBool
    |           identifier                                                       # IdListBool     
    ;