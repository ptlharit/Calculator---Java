package cs2s03;

import java.math.BigDecimal;

class Divide extends Expr { // NOT BinaryOp!
  Expr left;
  Expr right;
  Divide(Expr x, Expr y) { left = x; right = y; }
  public String toString() { 
    return betweenParens(left) + " / " + betweenParens(right); }
  public boolean isGround() { return false; }

  @Override
public int evalToInt() throws NotAnInteger{
	if(left.evalToInt() % right.evalToInt()!=0){
		throw new NotAnInteger();
	}
	else{
	return left.evalToInt()/right.evalToInt();}
}
@Override
public double evalToFloat() throws NotAnInteger {
	double dou;
	BigDecimal decimal = new BigDecimal(left.evalToFloat()/right.evalToFloat());
	return dou = decimal.doubleValue();
	
}
}
