/**
 * 
 */
package hillbillies.model;

/**
 * @author Wout
 *
 */
public class NbCompare {
	private static final double epsilon = 0.00001;
	
	public boolean equals(double nb1, double nb2){
		return Math.abs(nb2-nb1)<epsilon;
	}
	
	public boolean equals(float nb1, float nb2){
		return Math.abs(nb2-nb1)<epsilon;
	}
	
	public boolean isBiggerOrEquals(double nb1, double nb2){
		if (this.equals(nb1, nb2)){
			return true;
		} else if (nb1>nb2){
			return true;
		}
		return false;
	}
	
	public boolean isBiggerOrEquals(float nb1, float nb2){
		if (this.equals(nb1, nb2)){
			return true;
		} else if (nb1>nb2){
			return true;
		}
		return false;
	}
	
	public boolean isSmallerOrEquals(double nb1, double nb2){
		if (this.equals(nb1, nb2)){
			return true;
		} else if (nb1<nb2){
			return true;
		}
		return false;
	}
	
	public boolean isSmallerOrEquals(float nb1, float nb2){
		if (this.equals(nb1, nb2)){
			return true;
		} else if (nb1<nb2){
			return true;
		}
		return false;
	}
	
	public boolean isSmaller(double nb1, double nb2){
		if (this.equals(nb1, nb2)){
			return false;
		} else if (nb1<nb2){
			return true;
		}
		return false;
	}
	
	public boolean isSmaller(float nb1, float nb2){
		if (this.equals(nb1, nb2)){
			return false;
		} else if (nb1<nb2){
			return true;
		}
		return false;
	}
	
	public boolean isBigger(double nb1, double nb2){
		if (this.equals(nb1, nb2)){
			return false;
		} else if (nb1>nb2){
			return true;
		}
		return false;
	}
	
	public boolean isBigger(float nb1, float nb2){
		if (this.equals(nb1, nb2)){
			return false;
		} else if (nb1>nb2){
			return true;
		}
		return false;
	}
	
}
