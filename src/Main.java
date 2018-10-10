import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Room map[][] = new Room[3][3];
		Player player = new Player(0,0);
		map[0][0] = new LimitedRoom("","",0,0,null,true,true,true,true);
		
	}

}

class Player
{
	int x;
	int y;
	Scanner input = new Scanner(System.in);
	Player(int startingX, int startingY) //player constructor
	{
		this.x = startingX;
		this.y = startingY;
	}
	public void moveNorth()
	{
		this.y += 1;
	}
	public void moveSouth()
	{
		this.y -= 1;
	}
	public void moveEast()
	{
		this.x += 1;
	}
	public void moveWest()
	{
		this.x -= 1;
	}
}

class Room
{
	String name;
	String description;
	int x;
	int y;
	Thing contents[]; //if the room is empty, just set to null
	Room(String name, String description, int x, int y, Thing contents[])
	{
		this.contents = contents;
		this.name = name;
		this.description = description;
		this.x = x;
		this.y = y;
	}
	public boolean isEmpty() //a little function that returns true if the room is empty (or rather if it started off empty)
	{
		if (this.contents == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Thing
{
	String name;
	String description;
	int value;
	Thing(String name, String description, int value)
	{
		this.name = name;
		this.description = description;
		this.value = value;
	}
}
class GameController
{
	GameController(){}
}