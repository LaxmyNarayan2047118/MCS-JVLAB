import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Scanner;


public class SportsEventManagement {
	private ArrayList<Team> teams;
	
	public SportsEventManagement(){
		teams = new ArrayList<>();
	}
	
	public void registerTeam() throws IOException{
		Team newTeam = new Team();
		newTeam.registerTeam();
		teams.add(newTeam);
	}
	
	public void withdrawTeam() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter team name: ");
		String delname = br.readLine();
		for(int i=0;i<teams.size();++i){
			Team del = teams.get(i);
			if((del.team_name).equalsIgnoreCase(delname)){
				teams.remove(i);
			}
		}
	}
	
	public void displayTeams(){
		for(int i=0;i<teams.size();++i){
			(teams.get(i)).display();
		}
	}

}
