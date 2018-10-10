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
class GameController //runs things like room loading and string parsing
{
	Scanner input = new Scanner(System.in);
	GameController(){}
	boolean gameRun;
	public void loadroom()
	{
		
	}
}