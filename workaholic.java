/**
 * 
 */
package Question1;

public class workaholic extends worker { // CLASS
	
	// VARIABLES
	int hours = 2000;
	private int overtime = 500;
	// end VARIABLES
	
	// CONSTRUCTOR
	public workaholic(String name, float hourlyIncome, int age) {
		super(name, hourlyIncome, age);
	} // end CONSTRUCTOR

	public void work() { // WORK()
		// adds overtime before passing to super.work
		hours += overtime;
		super.work(hours);
	} // end WORK()

	

} // end CLASS
