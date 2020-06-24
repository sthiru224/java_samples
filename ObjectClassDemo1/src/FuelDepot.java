import java.util.List;

public class FuelDepot
{
 
/** The robot used to move the filling mechanism */
 private FuelRobot filler;
 
 /** The list of fuel tanks */
 private List<FuelTank> tanks;
 
 /** Determines and returns the index of the next tank to be filled.
 * @param threshold fuel tanks with a fuel level £ threshold may be filled
 * @return index of the location of the next tank to be filled
 * Postcondition: the state of the robot has not changed
 */
 public int nextTankToFill(int threshold){ 
	 /* to be implemented in part (a) */ 
	 int tankWithLeast = 0;

	  for (int i = 0; i < tanks.size(); i++)
	   if (tanks.get(i).getFuelLevel() < tanks.get(tankWithLeast).getFuelLevel())
	    tankWithLeast = i;

	  if (tanks.get(tankWithLeast).getFuelLevel() <= threshold)
		  return tankWithLeast;
	  else
		  return filler.getCurrentIndex();
 }
 /** Moves the robot to location locIndex.
 * @param locIndex the index of the location of the tank to move to
 * Precondition: 0 £ locIndex < tanks.size()
 * Postcondition: the current location of the robot is locIndex
 */
 public void moveToLocation(int locIndex){ 
	 /* to be implemented in part (b) */ 
	   if (locIndex == filler.getCurrentIndex())   
		   return;  // Yes, already at the locIndex so no action needed just return to the caller
	   
	   if ((locIndex < filler.getCurrentIndex() && filler.isFacingRight()) || (locIndex > filler.getCurrentIndex() && !filler.isFacingRight()))
		   filler.changeDirection();  // if the required location is less than (left of the) the current location and 
	   
 	   filler.moveForward(Math.abs(locIndex - filler.getCurrentIndex())); // move to the location by distance away from the current index. 
		  
 }
 	
} 