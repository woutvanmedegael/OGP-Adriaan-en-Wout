package hillbillies.model;
/**
 * 
 */

import ogp.framework.util.ModelException;

/**
 * @author Wout
 *
 */
public class IllegalNameException extends UnitException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final String value;
	public IllegalNameException(String value){
		this.value = value;
	}
}
