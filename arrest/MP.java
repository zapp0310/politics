package arrest;

public class MP {

	private String firstName;
	private String lastName;
	private String constituency;
	private String carDriver;
	private double moneySpend;
	private double moneyLimit = 100000.00d;
	/**
	 * @param firstName
	 * @param lastName
	 * @param constituency
	 * @param driver
	 * @param moneySpend
	 */
	public MP(String firstName, String lastName, String constituency, String driver) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.constituency = constituency;
		this.carDriver = driver;
		this.moneySpend = 0.00d;
	}
	
	public String getName() {
		return (firstName + " " + lastName);
	}
		public String getConstituency() {
		return constituency;
	}
	public String getDriver() {
		return carDriver;
	}
	public double getMoneySpend() {
		return moneySpend;
	}
	public void addMoneySpend(double moneySpend) {
		this.moneySpend+=moneySpend;
		Commisioner.canArrest(this);
	}
	public double getMoneyLimit() {
		return moneyLimit;
	}
}
