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

class LimitedRoom extends Room { //creates a new type of room where you can limit which directions the player can travel
	Boolean northPossible;
	Boolean eastPossible;
	Boolean southPossible;
	Boolean westPossible;
	LimitedRoom(String name, String description, int x, int y, Thing contents[], Boolean northPossible, Boolean eastPossible, Boolean southPossible, Boolean westPossible)
	{
		super (name, description, x, y, contents); //passes values up to Room class
		this.northPossible = northPossible;
		this.eastPossible = eastPossible;
		this.southPossible = southPossible;
		this.westPossible = westPossible;
	}
}
