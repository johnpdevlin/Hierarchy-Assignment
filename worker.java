package Question1;

public class worker { // CLASS
	
	// VARIABLES
	public final int retirementAge = 65;
	
	private String name = null;
	private int age = 0;
	private int hours = 1600;
	private float earned = 0.0f;
	private float hourlyIncome = 0; 
	private worker coWorker = null;
	// end VARIABLES
	
	// CONSTRUCTORS //
	public worker(String name, float hourlyIncome, int age) { // CONSTRUCTOR
		this.name = name;
		this.hourlyIncome = hourlyIncome;
		this.age = age;
	} // end CONSTRUCTOR

	public worker(String name, float hourlyIncome, int age, worker coWorker) { // CONSTRUCTOR
		this.name = name;
		this.hourlyIncome = hourlyIncome; 
		this.age = age;
		this.coWorker = coWorker;
	} // end CONSTRUCTOR
	// END CONSTRUCTORS //
	
	// SETTERS //	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param hourlyIncome the hourlyIncome to set
	 */
	public void setHourlyIncome(float hourlyIncome) {
		this.hourlyIncome = hourlyIncome;
	}
	// END SETTERS //
	
	
	// GETTERS //
	/**
	 * @return the hourlyIncome
	 */
	public float getHourlyIncome() {
		return hourlyIncome;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the hours
	 */
	public int getHours() { 
		return hours;
	}
	
	/**
	 * @return the hours
	 */
	public int getDelegated() { 
		/* Calculates hours to be delegated as per description 
		 * Calculation makes allowance of future possible changes. 
		 * I.E. if hours worked is no longer divisible by 5 */
		int delegated = (hours - hours%5)/5;
		return delegated;
	}
	
	/**
	 * @return the years
	 */
	
	public int getYears() { 
		// calculates years working
		int years = retirementAge - this.age;
		return years;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	// end GETTERS //
	
	// METHODS //
	public void work() { // WORK()
		if (coWorker != null) {
			coWorker.work(getDelegated());
			hours -= getDelegated(); // Recalculates hours to be worked
		}
			work(hours);
	} // end WORK()

	
	public void work(int hours) { // WORK(hours, years)
		earned += getYears() * (hours * hourlyIncome);
	} // end WORK

	
	public void info() { // INFO()
		System.out.println(name +" earned " + earned);
		
	} // end INFO() 
	// END METHODS //
	
} // end CLASS //