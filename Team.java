import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Scanner;


public class Team {
	public String sport;
	public String team_name;
	public int members;
	public ArrayList<String> member_names;
	
	public Team(){
		this.sport = "";
		this.team_name = "";
		this.members = 0;
		this.member_names = new ArrayList<>();
	}
	
	public void registerTeam() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter sport: ");
		sport = br.readLine();
		System.out.print("Enter team name: ");
		team_name = br.readLine();
		System.out.print("Enter number of members: ");
		members = Integer.parseInt(br.readLine());
		System.out.println("Enter the names of the members: ");
		for(int i=0;i<members;++i){
			member_names.add(br.readLine());
		}
		
	}
	
	public void display(){

		System.out.println("\nTeam name: "+team_name);
		System.out.println("Sport: "+sport);
		System.out.println("Number of members: "+members);
		System.out.println("Names of members: ");
		for(int i=0;i<members;++i){
			System.out.println((i+1)+". "+member_names.get(i));
		}
	}
}
