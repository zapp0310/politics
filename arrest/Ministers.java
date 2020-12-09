package arrest;

public class Ministers extends MP{
	
	private String Portfolio;
	private double moneyLimit = 1000000.00d;
	/**
	 * @param firstName
	 * @param lastName
	 * @param constituency
	 * @param driver
	 * @param portfolio
	 */
	public Ministers(String firstName, String lastName, String constituency, String driver, String portfolio) {
		super(firstName, lastName, constituency, driver);
		Portfolio = portfolio;
	}
	public String getPortfolio() {
		return Portfolio;
	}
	public double getMoneyLimit() {
		return moneyLimit;
	}
	
	

}
