package cs2s03;

public enum Mode { INTEGER, FLOAT }

abstract class Value {
	public Mode m;
}



class IntVal extends Value {
	public int val;
	IntVal(int val){
		  this.val=val;
	  }
	public String toString() {
		return Integer.toString(val);
	}
}	
class DblVal extends Value {
	public double val;
	DblVal(double val){
		  this.val=val;
	  }
	public String toString() {
		return Double.toString(val);
	}
}