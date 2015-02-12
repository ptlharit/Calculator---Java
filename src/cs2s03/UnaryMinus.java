package cs2s03;

class UnaryMinus extends Expr {
  Expr e;

  UnaryMinus(Expr x) { this.e = x; }
  public String toString() { return "-" + e.toString(); }
  public boolean isGround() { return false; }
@Override
public int evalToInt() throws NotAnInteger {
	return -1*e.evalToInt();
}
@Override
public double evalToFloat() throws NotAnInteger {
	// TODO Auto-generated method stub
	return -1.0*e.evalToFloat();
}
}
