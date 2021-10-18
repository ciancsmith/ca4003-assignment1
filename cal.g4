grammar cal;

prog:                   decl_list function_list main;

decl_list:              decl SemiColon decl_list
                        |;

decl:                   var_decl
                        | const_decl;

var_decl:               Variable ID Colon type;

const_decl:             Const ID Colon type ASSIGNMENT expression;

function_list:          function function_list
                        |;

function:               type ID Lb param_list Rb
                        L_brace
                        decl_list
                        statement_block
                        Return Lb ( expression | ) Rb SemiColon
                        R_brace;

type:                   Integer | Boolean | Void;

param_list:             nemp_parameter_list 
                        |;

nemp_parameter_list:    ID Colon type
                        | ID Colon type Comma nemp_parameter_list;

main:                   Main L_brace decl_list statement_block R_brace;

statement_block:        statement statement_block | empty_statement;

statement:              ID ASSIGNMENT expression SemiColon
                        | ID Lb arg_list Rb SemiColon
                        | L_brace statement_block R_brace
                        | If condition L_brace statement_block R_brace Else L_brace statement_block R_brace
                        | While condition L_brace statement_block R_brace
                        | Skip;

expression:             frag binary_arith_op frag
                        | Lb expression Rb
                        | ID Lb arg_list Rb
                        | frag
                        ;

binary_arith_op:        PLUS | <assoc=right> MINUS;

comp_op:                EQUAL
                        | NOTEQUAL
                        | LT
                        | LTE
                        | GT
                        | GTE
                        ;

frag:                   ID
                        | MINUS ID
                        | NUMBER
                        | True
                        | False
                        ;

condition:              NOT condition
                        | Lb condition Rb
                        | expression comp_op expression
                        | condition (OR | AND) condition
                        ;

arg_list:               nemp_arg_list
                        | empty_arg_list
                        ;

nemp_arg_list:          ID
                        | ID Comma nemp_arg_list
                        ;

empty_statement:         ;

empty_arg_list:         ;

Variable:               V A R I A B L E;
Const:                  C O N S T ;
Return:                 R E T U R N;
Integer:                I N T E G E R;
Boolean:                B O O L E A N;
Void:                   V O I D;
Main:                   M A I N;
If:                     I F;
Else:                   E L S E;
True:                   T R U E;
False:                  F A L S E;
While:                  W H I L E;
Skip:                   S K I P;

SemiColon:              ';';
Colon:                  ':';
Comma:                  ',';

ID:                     Letter (Letter | Digit | UnderScore)*;
NUMBER:                 MINUS? ( Digit |  NonZero Digit+ );
BOOLEAN:                'true' | 'false';

/* Syntax Tokens*/

L_brace:                '{';
R_brace:                '}';
L_sq_bracket:           '[';
R_sq_bracket:           ']';
Lb:                     '(';
Rb:                     ')';

/* Aritmetic Opperators */

MINUS:                  '-';
PLUS:                   '+';

/* Logical Operators */

ASSIGNMENT:             '=';
NOT:                    '~';
OR:                     '||';
AND:                    '&';
EQUAL:                  '==';
NOTEQUAL:               '!=';
LT:                     '<';
LTE:                    '<=';
GT:                     '>';
GTE:                    '>=';

/* fragments */

fragment A:             'a'  |  'A';
fragment B:             'b'  |  'B';
fragment C:             'c'  |  'C';
fragment D:             'd'  |  'D';
fragment E:             'e'  |  'E';
fragment F:             'f'  |  'F';
fragment G:             'g'  |  'G';
fragment H:             'h'  |  'H';
fragment I:             'i'  |  'I';
fragment K:             'k'  |  'K';
fragment L:             'l'  |  'L';
fragment M:             'm'  |  'M';
fragment N:             'n'  |  'N';
fragment O:             'o'  |  'O';
fragment P:             'p'  |  'P';
fragment R:             'r'  |  'R';
fragment S:             's'  |  'S';
fragment T:             't'  |  'T';
fragment U:             'u'  |  'U';
fragment V:             'v'  |  'V';
fragment W:             'w'  |  'W';

fragment Letter:        [a-zA-Z];
fragment Digit:         [0-9];
fragment NonZero:       [1-9];
fragment UnderScore:    '_';
fragment Dot:           '.';

/* Skips */
COMMENT_ML:             '/*' (COMMENT_ML|.)*? '*/' -> skip;
COMMENT_SL:             '//' .*? '\n' -> skip;
WS:                     [ \t\n\r]+ -> skip;