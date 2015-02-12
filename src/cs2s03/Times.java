package cs2s03;

class Times extends BinaryOp {
  Times(Expr x, Expr y) { left = x; right = y; }
  public String toString() { 
    // we are the context
    return super.toString(this, " * "); }
  public boolean isSame(Expr e) { return e instanceof Times; }

  @Override
public int evalToInt() throws NotAnInteger {
	return left.evalToInt()*right.evalToInt();
}

  @Override
public double evalToFloat() throws NotAnInteger {
	return left.evalToFloat()*right.evalToFloat();
}
}
