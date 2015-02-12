package cs2s03;

class Minus extends Expr { // NOT BinaryOp!
  Expr left;
  Expr right;
  Minus(Expr x, Expr y) { this.left = x; this.right = y; }
  public String toString() { 
    return betweenParens(left) + " - " + betweenParens(right); }
  public boolean isGround() { return false; }

  @Override
  	public int evalToInt() throws NotAnInteger {	  
	return left.evalToInt()-right.evalToInt();
}
  @Override
	public double evalToFloat() throws NotAnInteger {
	return left.evalToFloat()-right.evalToFloat();
  }
}
