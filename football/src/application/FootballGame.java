package application;

import pojo.Player;
import pojo.Team;

public class FootballGame {

	public static void main(String[] args) {
		Player goalkeeper = new Player();
		Player Striker = new Player("Mark",20,"FW",80);
		Team Teamname = new Team("Man City");
		System.out.println("Striker:"+ "Name:" + " "+Striker.getName() + " " +  ", Age:" + Striker.getAge()+ " " + ", Position:" +Striker.getPosition()+ " " +", Height:" +Striker.getHeight());
		goalkeeper.setAge(50);
		//System.out.println("Goalkeeper age:"+ " " +goalkeeper.getAge());
		System.out.println("Team Name:"+ ""+ Teamname.getName());

	}

}
