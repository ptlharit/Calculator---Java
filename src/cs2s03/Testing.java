package cs2s03;

public class Testing{
	public static void main(String[] args) throws NotAnInteger, ParseError{
	     
		CalculatorFrame Obj = new CalculatorFrame();
		Obj.setVisible(true);

		//Here the Expr class is being tested. Below, the Evaluate class is being tested.
		
		Expr test1 = new Plus(new Integer2(1), new Integer2(2));    // Plus test with positive variables
	       	System.out.println(test1.evalToInt());
			System.out.println(test1.evalToFloat());		

	    Expr test2 = new Plus(new Integer2(-1), new Integer2(-2));  // Plus test with negative values
	       	System.out.println(test2.evalToInt());
			System.out.println(test2.evalToFloat());		
		
		Expr test4 = new Minus(new Integer2(4), new Integer2(2));  // Minus test with positive values
			System.out.println(test4.evalToInt());
			System.out.println(test4.evalToInt());
		
		Expr test5 = new Minus(new Integer2(-4), new Integer2(-2)); // Minus teat with negative values
			System.out.println(test5.evalToInt());
			System.out.println(test5.evalToInt());
			
		Expr test6 = new Minus(new Integer2(-4), new Integer2(-2));
			System.out.println(test6.evalToInt());
			System.out.println(test6.evalToInt());
		
		Expr test7 = new Times(new Integer2(4), new Integer2(2));  // Multiply test with positive values
			System.out.println(test7.evalToInt());
			System.out.println(test7.evalToInt());
		
		Expr test8 = new Times(new Integer2(-4), new Integer2(-2));  // Multiply test with negative values
			System.out.println(test8.evalToInt());
			System.out.println(test8.evalToInt());
		
		Expr test9 = new Times(new Integer2(-4), new Integer2(2));  // Multiply test with both positive and negative valaues
			System.out.println(test9.evalToInt());
			System.out.println(test9.evalToInt());
		
		Expr test11 = new Divide(new Integer2(8), new Integer2(4)); // Divide test with both values positive
			System.out.println(test11.evalToInt());
			System.out.println(test11.evalToInt());
			
		Expr test13 = new Divide(new Integer2(-9), new Integer2(-3)); // Divide test with both negative values 
			System.out.println(test13.evalToInt());
			System.out.println(test13.evalToInt());
			
		Expr test14 = new Divide(new Integer2(-9), new Integer2(3)); // Divide test with one negative & one positive whole number values
			System.out.println(test14.evalToInt());
			System.out.println(test14.evalToInt());
			
		Expr test15 = new Divide(new Integer2(-4), new Integer2(-2)); // Dividing by zero
			System.out.println(test15.evalToInt());
			System.out.println(test15.evalToInt());
			
		Expr test16 = new Divide(new Integer2(9), new Integer2(0)); // Dividing by zero
			try{
				System.out.println(test16.evalToInt());
				System.out.println(test16.evalToInt());}
			catch(ArithmeticException e){
				System.out.println("Dividing by zero, not possible");
				}
			
		//Here we test the Evaluate class
			
			// modes
			Mode modeInt = Mode.INTEGER;
			Mode modeDbl = Mode.FLOAT;
			
			// Strings to be parsed:
			String EvalTest1 = "2+7-8";  //basic test for addition and subtraction
			String EvalTest2 = "2*6*4/8";  // basic test for multiplication and division
			String EvalTest3 = "7/3+6";  // test for decimal/float/fractions answers
			String EvalTest4 = "6/3 - 9"; // test to see if parser handles spaces as well as fractions
			String EvalTest5 = "3/0"; // test to see if parser handles division by zero
			String EvalTest6 = "3*(8*2+4)"; //basic test for parentheses
			String EvalTest7 = "1+("; // test for parse error
			
			//Parsing above strings through eval() method and printing results for both int/float mode
			Evaluate testE1 = new Evaluate(EvalTest1, modeInt);  //testing int mode
			System.out.println(testE1.eval());
			Evaluate testE1_F = new Evaluate(EvalTest1, modeDbl); // testing float mode
			System.out.println(testE1_F.eval());
			
			Evaluate testE2 = new Evaluate(EvalTest2, modeInt);
			System.out.println(testE2.eval());
			Evaluate testE2_F = new Evaluate(EvalTest2, modeDbl);
			System.out.println(testE2_F.eval());
			
			try{
			Evaluate testE3 = new Evaluate(EvalTest3, modeInt);
			System.out.println(testE3.eval());
			}catch(NotAnInteger exp1){
				System.out.println("NotAnInteger Error Induced");
			}
			Evaluate testE3_F = new Evaluate(EvalTest3, modeDbl);
			System.out.println(testE3_F.eval());
			
			Evaluate testE4 = new Evaluate(EvalTest4, modeInt);
			System.out.println(testE4.eval());
			Evaluate testE4_F = new Evaluate(EvalTest4, modeDbl);
			System.out.println(testE4_F.eval());

			try{
				Evaluate testE5 = new Evaluate(EvalTest5, modeInt);
				System.out.println(testE5.eval());
				Evaluate testE5_F = new Evaluate(EvalTest5, modeDbl);
				System.out.println(testE5_F.eval());
			}catch(ArithmeticException exp2){
				System.out.println("Dividing by zero, not possible");
			}			
			
			Evaluate testE6 = new Evaluate(EvalTest6, modeInt);
			System.out.println(testE6.eval());
			Evaluate testE6_F = new Evaluate(EvalTest6, modeDbl);
			System.out.println(testE6_F.eval());
			
			
			try{
				Evaluate testE7 = new Evaluate(EvalTest7, modeInt);
				System.out.println(testE7.eval());
				Evaluate testE7_F = new Evaluate(EvalTest6, modeDbl);
				System.out.println(testE7_F.eval());
			}catch(ParseError exp3){
				System.out.println("Parse Error induced, wrong Syntax");
			}
			
			int[] a = {2,3,4};
			int[] b = {2,3,4};
			System.out.println(a==b);
	  }
	}