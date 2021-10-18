import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.FileInputStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import java.io.*; 

public class cal
{
	public static void main (String[] args) throws Exception
	{
		String inputFile = null;

		if (args.length > 0)
			inputFile = args [0];

	    InputStream is = System.in;
	   	if (inputFile!=null) 
	   		is = new FileInputStream(inputFile);

	    calLexer lexer = new calLexer (CharStreams.fromStream(is));
		CommonTokenStream tokens = new CommonTokenStream (lexer);
		calParser parser = new calParser (tokens);

		parser.setErrorHandler(new DefaultErrorStrategy(){

			@Override
			public void recover(Parser recognizer, RecognitionException e) {
				for (ParserRuleContext context = recognizer.getContext(); context != null; context = context.getParent()) {
					context.exception = e;
				}

				throw new ParseCancellationException(e);
				
			}

			@Override
			public Token recoverInline(Parser recognizer)
			{
				InputMismatchException e = new InputMismatchException(recognizer);
				for (ParserRuleContext context = recognizer.getContext(); context != null; context = context.getParent()) {
					context.exception = e;
				}

				throw new ParseCancellationException(e);
			}
		});

		try {
			ParseTree tree = parser.prog();
			System.out.println(args[0] + " parsed successfully");
		}

		catch(ParseCancellationException e){
			System.out.println(args[0] + " has not parsed");
		}


	}

}