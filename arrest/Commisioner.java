package arrest;

public class Commisioner {

	private String firstName;
	private String lastName;
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Commisioner(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getName() {
		return (firstName + " " + lastName);
	}
	
	public static void canArrest(MP mp) {
		boolean limitExceeded=mp.getMoneySpend()>mp.getMoneyLimit()?true:false;
		System.out.println();
		if(!(mp instanceof PM) && !(mp instanceof Ministers) && limitExceeded) {
			System.out.println("Arrest MP with name "+ mp.getName());}
		else if(mp instanceof Ministers && !(mp instanceof PM) && limitExceeded) {
			System.out.println("MP is a minister, asking PM for permission");
			PM.permissionForArrest(mp);
		}
		else if(mp instanceof PM && limitExceeded) {
			System.out.println("Cannot arrest PM");
		}
	}
}
