package cs2s03;

public class Evaluate {
	private Expr e;
	private Mode m;
	
	public Evaluate(String s, Mode m) throws ParseError{
		this.m = m;
		Parser ParserObject = new Parser(s);
		try {
			this.e = ParserObject.parse();
		} catch (ParseError e) {
			throw new ParseError("Parse Error Induced");
		}
	}
	public Value eval() throws NotAnInteger {
		
		if (m == Mode.INTEGER) {
			IntVal integer = new IntVal(e.evalToInt());
			return integer;		
		}
		else{
			DblVal floatingPoint = new DblVal(e.evalToFloat());
			return floatingPoint;	
		}
	}
	
	public static void main(String [] args){
		
		CalculatorFrame Obj = new CalculatorFrame();
		Obj.setVisible(true);
	}
}
