package hillbillies.model;
import be.kuleuven.cs.som.annotate.Basic;
import be.kuleuven.cs.som.annotate.Raw;

/**
 * 
 */

/**
 * @author Adriaan
 *
 */
public class Position {
	
	private double ypos;
	private double xpos;
	private double zpos;
	private static final NbCompare nbComp = new NbCompare();
	
	public Position(double xpos, double ypos, double zpos) throws UnitException{
		if (!isValidPos(xpos)){
			throw new UnitException();
			
		}
		if (!isValidPos(ypos)){
			throw new UnitException();
			
		}
		if (!isValidPos(zpos)){
			throw new UnitException();
			
		}
		this.xpos = xpos;
		this.ypos = ypos;
		this.zpos = zpos;
	}

/**
 * Return the xpos of this Unit.
 */
@Basic @Raw
public double getxpos() {
	return this.xpos;
}
/**
 * Set the xpos of this Unit to the given xpos.
 * 
 * @param  xpos
 *         The new xpos for this Unit.
 * @post   The xpos of this new Unit is equal to
 *         the given xpos.
 *       | new.getxpos() == xpos
 * @throws UnitException
 *         The given xpos is not a valid xpos for any
 *         Unit.
 *       | ! isValidpos(getxpos())
 */
@Raw
public void setxpos(double xpos) 
		throws UnitException {
	if (! isValidPos(xpos))
		throw new UnitException();
	this.xpos = xpos;
}

/**
 * Return the ypos of this Unit.
 */
@Basic @Raw
public double getypos() {
	return this.ypos;
}
/**
 * Set the ypos of this Unit to the given ypos.
 * 
 * @param  ypos
 *         The new ypos for this Unit.
 * @post   The ypos of this new Unit is equal to
 *         the given ypos.
 *       | new.getypos() == ypos
 * @throws UnitException
 *         The given ypos is not a valid ypos for any
 *         Unit.
 *       | ! isValidpos(getypos())
 */
@Raw
public void setypos(double ypos) 
		throws UnitException {
	if (! isValidPos(ypos))
		throw new UnitException();
	this.ypos = ypos;
}

/**
 * Return the zpos of this Unit.
 */
@Basic @Raw
public double getzpos() {
	return this.zpos;
}
/**
 * Set the zpos of this Unit to the given zpos.
 * 
 * @param  zpos
 *         The new zpos for this Unit.
 * @post   The zpos of this new Unit is equal to
 *         the given zpos.
 *       | new.getzpos() == zpos
 * @throws UnitException
 *         The given zpos is not a valid zpos for any
 *         Unit.
 *       | ! isValidpos(getzpos())
 */
@Raw
public void setzpos(double zpos) 
		throws UnitException {
	if (! isValidPos(zpos))
		throw new UnitException();
	this.zpos = zpos;
}

/**
* Check whether the given pos is a valid pos for
 * any unit.
 *  
 * @param  pos
 *         The pos to check.
 * @return 
 *       | result == (0<=pos && pos<50)
*/
public static boolean isValidPos(double pos) {
	return (0<=pos && pos<50);
}

public double calculateDistance(Position pos){
	return Math.sqrt(Math.pow(this.getxpos()-pos.getxpos(), 2)+Math.pow(this.getypos()-pos.getypos(),2)+Math.pow(this.getzpos()-pos.getzpos(),2));
}

public boolean Equals(Position pos){
	if (!nbComp.equals(this.getxpos(), pos.getxpos())){
		return false;
	} else if (!nbComp.equals(this.getypos(), pos.getypos())){
		return false;
	} else if (!nbComp.equals(this.getzpos(), pos.getzpos())){
		return false;
	} else
		return true;
	
}

}
