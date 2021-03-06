package models;

import java.awt.Color;

public class robot {
	private boolean[] players;
	private String name;
	private String team;
	private Color color;
	private int direction;
	private int maxHp;
	private int currentHp;
	private int range;
	//private String type;
	private int movePoints;
	private int moved;
	private boolean alive;
	private boolean attacked;
	private int damageCaused;
	private int tilesMoved;
	private int kills;
	private int attack;
	private coord location;
	private String forthCode;

	public class coord{
		int xcoord;
		int ycoord;
	}
	
	

	
	public enum robotClass{
		SCOUT, SNIPER, TANK
	}
	
	public robot(String newName, String newTeam, Color newColor, robotClass type){
		if(type == robotClass.SCOUT){
			range=2;
			movePoints=3;
			maxHp=1;
			attack=1;
			

		}
		if(type == robotClass.SNIPER){
			range=3;
			movePoints=2;
			maxHp=2;
			attack=2;

		}
		if(type == robotClass.TANK){
			range=1;
			movePoints=1;
			maxHp=3;
			attack=3;

		}
		currentHp=maxHp;
		alive = true;
		moved=0;
		tilesMoved=0;
		kills=0;
		direction=0;
		this.name=newName;
		this.team=newTeam;
		this.color=newColor;
		
	}
	
	public String getName(){
		return name; 
	}
	
	public String getTeam(){
		return team;
	}
	
	public Color getColor(){
		return color;
	}
	
	public int getDirection(){
		return direction;
	}
	
	public int getMaxHp(){
		return maxHp;
	}
	
	public int getCurrentHp(){
		return currentHp;
	}
	
	public int getRange(){
		return range;
	}
	
	public int getMovePoints(){
		return movePoints;
	}
	
	public int getMoved(){
		return moved;
	}
	
	public boolean alive(){
		return alive;
	}
	public boolean attacked(){
		return attacked;
	}
	
	public int getDamageCaused(){
		return damageCaused;
	}
	
	public int getTilesMoved(){
		return tilesMoved;
	}
	
	public int getKills(){
		return kills;
	}
	
	
	public void setName(String newName){
		name = newName; 
	}
	
	public void setTeam(String newTeam){
		team = newTeam;
	}
	
	public void setColor(Color newColor){
		color=newColor;
	}
	
	public void setDirection(int newDirection){
		direction = newDirection;
	}
	
	public void setMaxHp(int newMaxHp){
		maxHp = newMaxHp;
	}
	
	public void setCurrentHp(int newCurrentHp){
		currentHp = newCurrentHp;
	}
	
	public void setRange(int newRange){
		range = newRange;
	}
	
	public void setMovePoints(int newMovePoints){
		movePoints=newMovePoints;
	}
	
	public void setMoved(int newMoved){
		moved= newMoved;
	}
	
	public void setAlive(boolean newStatus){
		alive = newStatus;
	}
	public void setAttacked(boolean newStatus){
		attacked = newStatus;
	}
	
	public void setDamageCaused(int newDamageCaused){
		damageCaused = newDamageCaused;
	}
	
	public void setTilesMoved(int newTilesMoved){
		tilesMoved = newTilesMoved;
	}
	
	public void setKills(int newKills){
		 kills = newKills;
	}
	public String getforthCode(){
		return forthCode;
	}
	
	public void setCode(String newForthCode){
		forthCode = newForthCode;
	}

	public coord getLocation(){
		return location;
	}

	//public void setLocation(int x, int y){
	//	location.xcoord = x;
	//	location.ycoord = y;
	//}

	public void setLocation (coord newLocation){
		this.location = newLocation;
	}

	
	
}