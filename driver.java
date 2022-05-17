/**
 * 
 */
package Question1;

/**
 * I would have added a manager class to add variables, constructor method 
 * where coWorker != null, but this would have been against assignment instructions
 */
public class driver { // CLASS

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creates objects
		worker jane = new worker("Jane", 20, 25);
		worker john = new worker("John", 20, 45, (worker) jane);
		workaholic bill = new workaholic("Bill", 20, 25);
		
		jane.work();
		john.work();
		bill.work();
		
		jane.info();
		john.info();
		bill.info();
		} // end MAIN 

} // end CLASS
