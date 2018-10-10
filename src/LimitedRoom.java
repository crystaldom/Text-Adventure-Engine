
public class LimitedRoom extends Room {
	Boolean northPossible;
	Boolean eastPossible;
	Boolean southPossible;
	Boolean westPossible;
	LimitedRoom(String name, String description, int x, int y, Thing contents[], Boolean northPossible, Boolean eastPossible, Boolean southPossible, Boolean westPossible)
	{
		super (name, description, x, y, contents);
		this.northPossible = northPossible;
		this.eastPossible = eastPossible;
		this.southPossible = southPossible;
		this.westPossible = westPossible;
	}
}
