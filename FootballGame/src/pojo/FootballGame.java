package pojo;

import java.util.*;
import java.util.Map.Entry;

import pojo.Goalkeeper;
import pojo.Player;
import pojo.Team;

public class FootballGame {

	public static void main(String[] args) throws CloneNotSupportedException {
		/*Player goalkeeper = new Player();
		Player Striker = new Player("Mark ",20,"FW",80);
		Team Teamname = new Team("Man City ");
		System.out.println("Striker:"+ "Name:" + " "+Striker.getName() + " " +  ", Age:" + Striker.getAge()+ " " + ", Position:" +Striker.getPosition()+ " " +", Height:" +Striker.getHeight());
		goalkeeper.setAge(50);
		//System.out.println("Goalkeeper age:"+ " " +goalkeeper.getAge());
		System.out.println("Team Name:"+ ""+ Teamname.getName());
		//Goalkeeper goal=new Goalkeeper();
		Player p=new Player();
		Player g=new Goalkeeper();
		System.out.println(" ");
		System.out.println("Overriding Example......... ");
		g.kick();  //kick function from Goalkeeper
		p.kick();  //kick function from player*/
		
		/*Player Striker = new Player("Mark ",20,"FW",80);
		Player p1=new Player();
		Team Teamname = new Team("Man City ");
		System.out.println("Striker:"+ "Name:" + " "+Striker.getName() + " " +  ", Age:" + Striker.getAge()+ " " + ", Position:" +Striker.getPosition()+ " " +", Height:" +Striker.getHeight());
		System.out.print("Type:" );
		p1.Contractbase(5);*/
		Team Team1 =new Team("Man City");
		
		Team Team2;
		try {
			
			Team2=(Team)Team1.clone();
		}catch (Exception e) {
			Team2=new Team("");
			System.out.println("Unable to clone Team");
		}
		Team2=new Team("Man U");
		System.out.println("Name:" +Team1.getName());
		System.out.println("Name:" +Team2.getName());
		
	
		
		System.out.println("----------------- Map--------------------------");
		
		Map<Integer,Player> Playersmap=new HashMap<>();
		Playersmap.put(1,new Player("Mark",10));
		Playersmap.put(2,new Player("LLoyd",12));
		
		Iterator<Entry<Integer,Player>> newPlayer;
		newPlayer=Playersmap.entrySet().iterator();
		
		while(newPlayer.hasNext()) {
			Map.Entry<Integer, Player> temp=newPlayer.next();
			System.out.println(temp.getKey()+ " -> " + temp.getValue().getName()+" , "+temp.getValue().getJerseynumber());
		}
		
		System.out.println("--------------------ENDS-----------------------");
	}

}