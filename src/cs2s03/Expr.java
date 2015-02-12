package cs2s03;

abstract class Expr {
    
  abstract public String toString();
  abstract public boolean isGround();

  static void print(Expr e) { System.out.println(e.toString()); }

  static String betweenParens(final Expr e) {
    return (e.isGround()) ? e.toString()
                          : "( " + e.toString() + " )"; }
  
  abstract public int evalToInt() throws NotAnInteger;
  public abstract double evalToFloat() throws NotAnInteger;

}





