grammar Expression;
import Common;

start: expression;

expression: 	stringExpr						# StringExpression
	|			numExpr 						# NumExpression
	|			boolExpr						# BoolExpression
	|			listExpr						# ListExpression
	;     

stringExpr:     stringExpr ADD stringExpr   # Concat
    |			STRING						# BaseStr 
    |           identifier        	# IdString     
    |           '(' stringExpr ')'          # ParensString
    ;

numExpr:    numExpr op=(MUL|DIV) numExpr                # MulDiv
    |       numExpr op=(ADD|SUB) numExpr                # AddSub
    |       DIGIT                                       # Int
    |       DOUBLE                                      # Double
    |       identifier                               # IdNum      
    |       '(' numExpr ')'                             # ParensNum   	 
    ;
    
boolExpr:   NOT boolExpr                    # Not
    |       boolExpr op=(AND|OR) boolExpr   # AndOr
    |       BOOL                            # Bool
    |       identifier                  # IdBool        
    |       '(' boolExpr ')'                # ParensBool
    |       numExpr op=(MIN|MAX) numExpr    			# MinMax     
    |       boolExpr EQUAL boolExpr         			# EqualBool
    |       numExpr EQUAL numExpr           			# EqualNum
    |       stringExpr EQUAL stringExpr     			# EqualString
    |       listExpr EQUAL listExpr        				# EqualList  
   	;
   	
listExpr:  	listDigitExpr  			# ListDigitExpression
	|		listDoubleExpr			# ListDoubleExpression
	|		listStringExpr 			# ListStringExpression
	|		listBoolExpr 			# ListBoolExpression
	;

listDigit: '[' seqInt ']';
listDouble: '[' seqDouble ']';
listString: '[' seqString ']';
listBool: '[' seqBool ']';

seqInt: DIGIT				# SeqIntDigit
	|	identifier	# SeqIntIdentifierListInt
	| 	seqInt ',' DIGIT	# SeqIntSeqInt
	| 	seqInt ',' identifier	# SeqIntSeqIntIdListInt	
	;
	
seqDouble: DOUBLE				# SeqDoubleDouble
	|	identifier	# SeqDoubleIdentifierListDouble
	| 	seqDouble ',' DOUBLE	# SeqDoubleSeqDouble
	| 	seqDouble ',' identifier	# SeqDoubleSeqDoubleIdListDouble	
	;
	   
seqString: STRING				# SeqStringString
	|	identifier	# SeqStringIdentifierListString
	| 	seqString ',' STRING	# SeqStringSeqString
	| 	seqString ',' identifier	# SeqStringSeqStringIdListString	
	;
	
seqBool: BOOL				# SeqBoolBool
	|	identifier	# SeqBoolIdentifierListBool
	| 	seqBool ',' BOOL	# SeqBoolSeqBool
	| 	seqBool ',' identifier	# SeqBoolSeqBoolIdListBool	
	;

listDigitExpr:  listDigit                                                       # ListDigit_Label
    |           identifier                                               # IdListInt      
    ;
    
listDoubleExpr:  listDouble                                                      # ListDouble_Label
    |           identifier                                               # IdListDouble      
    ;

listStringExpr: listString                                                       # ListString_Label
    |           identifier                                             # IdListString       
    ;

listBoolExpr: listBool                                                       # ListBool_Label
    |           identifier                                             # IdListBool       
    ;   	