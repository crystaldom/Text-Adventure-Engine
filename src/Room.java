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
