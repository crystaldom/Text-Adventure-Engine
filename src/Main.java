import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		room map[][] = new room[3][3];
		player player = new player(0,0);
		
	}

}

class player
{
	int x;
	int y;
	Scanner input = new Scanner(System.in);
	player(int startingX, int startingY) //player constructor
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

class room
{
	String name;
	String description;
	int x;
	int y;
	thing contents[];
	room(String name, String description, int x, int y, thing contents[])
	{
		this.contents = contents;
		this.name = name;
		this.description = description;
		this.x = x;
		this.y = y;
	}
	public boolean isEmpty()
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

class thing
{
	String name;
	String description;
	int value;
	thing(String name, String description, int value)
	{
		this.name = name;
		this.description = description;
		this.value = value;
	}
}