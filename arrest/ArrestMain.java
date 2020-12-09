package arrest;

import java.util.Scanner;

public class ArrestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Commisioner commisioner = new Commisioner("XYZ", "ABC");
		PM pm = new PM("Narendra", "Modi", "Varanasi", "PM_driver", "PM_pilot");
		Ministers hm = new Ministers("Amit", "Shah", "Ahmedabad", "HM_driver", "Home Minstry");
		Ministers fm = new Ministers("Arun", "Jaitley", "Lucknow", "FM_driver", "Finance Minstry");
		Ministers eam = new Ministers("Sushma", "Swaraj", "Jaipur", "EAM_driver", "External Affairs Minstry");
		Ministers dm = new Ministers("Manohar", "Parikar", "Goa", "DM_driver", "Defence Minstry");
		MP mp1 = new MP("Arvind", "Kejriwal", "New Delhi", "MP1_driver");
		MP mp2 = new MP("Rahul", "Gandhi", "Wayand", "MP2_driver");
		MP mp3 = new MP("Smriti", "Irani", "Amethi", "MP3_driver");
		MP mp4 = new MP("Sachin", "Pilot", "Kota", "MP4_driver");
		MP mp5 = new MP("Tejaswi", "Surya", "Banglore", "MP5_driver");
		boolean check=true;
		int choice;
		while (check) {
			System.out.println("Enter 1 to 10 to select the MP for adding money spend\n");
			choice =sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the amount spend");
				pm.addMoneySpend(sc.nextDouble());break;
			case 2:
				System.out.println("Enter the amount spend");
				hm.addMoneySpend(sc.nextDouble());break;
			case 3:
				System.out.println("Enter the amount spend");
				fm.addMoneySpend(sc.nextDouble());break;
			case 4:
				System.out.println("Enter the amount spend");
				eam.addMoneySpend(sc.nextDouble());break;
			case 5:
				System.out.println("Enter the amount spend");
				dm.addMoneySpend(sc.nextDouble());break;
			case 6:
				System.out.println("Enter the amount spend");
				mp1.addMoneySpend(sc.nextDouble());break;
			case 7:
				System.out.println("Enter the amount spend");
				mp2.addMoneySpend(sc.nextDouble());break;
			case 8:
				System.out.println("Enter the amount spend");
				mp3.addMoneySpend(sc.nextDouble());break;
			case 9:
				System.out.println("Enter the amount spend");
				mp4.addMoneySpend(sc.nextDouble());break;
			case 10:
				System.out.println("Enter the amount spend");
				mp5.addMoneySpend(sc.nextDouble());break;
			default: System.out.println("wrong choice");
			}
//			System.out.println("Press true/false to exit\n");
//				check=sc.nextBoolean();
		}
	
	}
}
