import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SportsEventDriver{

	public static void main(String[] args) throws IOException {
		SportsEventManagement event1 = new SportsEventManagement();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		do{
			System.out.print("\n1. Register Team\n2. Withdraw team\n3. Display teams\n4. Exit\nEnter choice:");
			choice = Integer.parseInt(br.readLine());
			switch(choice){
				case 1:	event1.registerTeam();
						break;
				case 2: event1.withdrawTeam();
						break;
				case 3: event1.displayTeams();
						break;
				case 4: System.out.println("Thank you.");
						System.exit(0);
						break;
				default: System.out.println("Wrong choice enetered. Please try again.");
			}
		}while(true);
	}

}
