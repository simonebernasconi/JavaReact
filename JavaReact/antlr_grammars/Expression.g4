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
    |           identifierString        	# IdString     
    |           '(' stringExpr ')'          # ParensString
    |			listStringExpr DOT 'Last'             		# LastListString  	     
    ;

numExpr:    numExpr op=(MUL|DIV) numExpr                # MulDiv
    |       numExpr op=(ADD|SUB) numExpr                # AddSub
    |       DIGIT                                       # Int
    |       DOUBLE                                      # Double
    |       identifierNum                               # IdNum      
    |       '(' numExpr ')'                             # ParensNum 
	|		listExpr DOT 'Size'    						# SizeList
    |		listDigitExpr DOT op=(AVG|SUM)              # AvgSumListInt  
    |		listDoubleExpr DOT op=(AVG|SUM)             # AvgSumListDouble
    |		listDigitExpr DOT 'Last'             		# LastListInt  
    |		listDoubleExpr DOT 'Last'             		# LastListDouble  	 
    ;
    
boolExpr:   NOT boolExpr                    # Not
    |       boolExpr op=(AND|OR) boolExpr   # AndOr
    |       BOOL                            # Bool
    |       identifierBool                  # IdBool        
    |       '(' boolExpr ')'                # ParensBool
    |       numExpr op=(MIN|MAX) numExpr    			# MinMax     
    |       boolExpr EQUAL boolExpr         			# EqualBool
    |       numExpr EQUAL numExpr           			# EqualNum
    |       stringExpr EQUAL stringExpr     			# EqualString
    |       listExpr EQUAL listExpr        				# EqualList
    |       listDigitExpr DOT op=(ASC|DESC)             # IsAscIsDescInt
    |       listDoubleExpr DOT op=(ASC|DESC)            # IsAscIsDescDouble
    |       listDigitExpr DOT 'contains' '(' numExpr ')'    # ContainsInt
    |       listDoubleExpr DOT 'contains' '(' numExpr ')'  # ContainsDouble
    |       listStringExpr DOT 'contains' '(' stringExpr ')'  # ContainsString
    |       listBoolExpr DOT 'contains' '(' boolExpr ')'      # ContainsBool
    |       listBoolExpr DOT op=(ALLTRUE|ALLFALSE)      # AllTrueFalse
    |		listBoolExpr DOT 'Last'             		# LastListBool  
    |		listDigitExpr DOT 'Constant(' numExpr ')'   # ConstantListDigit	
    |		listDoubleExpr DOT 'Constant(' numExpr ')'	# ConstantListDouble	  
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
	|	identifierNum	# SeqIntIdentifierListInt
	| 	seqInt ',' DIGIT	# SeqIntSeqInt
	| 	seqInt ',' identifierNum	# SeqIntSeqIntIdListInt	
	;
	
seqDouble: DOUBLE				# SeqDoubleDouble
	|	identifierNum	# SeqDoubleIdentifierListDouble
	| 	seqDouble ',' DOUBLE	# SeqDoubleSeqDouble
	| 	seqDouble ',' identifierNum	# SeqDoubleSeqDoubleIdListDouble	
	;
	   
seqString: STRING				# SeqStringString
	|	identifierString	# SeqStringIdentifierListString
	| 	seqString ',' STRING	# SeqStringSeqString
	| 	seqString ',' identifierString	# SeqStringSeqStringIdListString	
	;
	
seqBool: BOOL				# SeqBoolBool
	|	identifierBool	# SeqBoolIdentifierListBool
	| 	seqBool ',' BOOL	# SeqBoolSeqBool
	| 	seqBool ',' identifierBool	# SeqBoolSeqBoolIdListBool	
	;

listDigitExpr:  listDigit                                                       # ListDigit_Label
    |           identifierListInt                                               # IdListInt      
    ;
    
listDoubleExpr:  listDouble                                                      # ListDouble_Label
    |           identifierListDouble                                               # IdListDouble      
    ;

listStringExpr: listString                                                       # ListString_Label
    |           identifierListString                                             # IdListString       
    ;

listBoolExpr: listBool                                                       # ListBool_Label
    |           identifierListBool                                             # IdListBool       
    ;   	