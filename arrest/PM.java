package arrest;

import java.util.Scanner;

public class PM extends MP{

	private double moneyLimit = 10000000.00d;
	private String aircraftDriver;
	/**
	 * @param firstName
	 * @param lastName
	 * @param constituency
	 * @param driver
	 * @param moneyLimit
	 * @param aircraftDriver
	 */
	public PM(String firstName, String lastName, String constituency, String driver, String aircraftDriver) {
		super(firstName, lastName, constituency, driver);
		this.aircraftDriver = aircraftDriver;
	}
	public static void permissionForArrest(MP mp) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println(mp.getName() + " has exceeded his limit of money spend. Commisioner needs to arrest the minister. Kindly allow\n");
		boolean ch= sc.nextBoolean();
		if(ch) System.out.println("Permission granted. Arrest the minister.");
		else  System.out.println("Permission denied. Cannot arrest the minister.");
		sc.close();
	}
	public double getMoneyLimit() {
		return moneyLimit;
	}
	public String getAircraftDriver() {
		return aircraftDriver;
	}
}
