
public class limitedroom extends room {
	Boolean northPossible;
	Boolean eastPossible;
	Boolean southPossible;
	Boolean westPossible;
	limitedroom(String name, String description, int x, int y, thing contents[], Boolean northPossible, Boolean eastPossible, Boolean southPossible, Boolean westPossible)
	{
		super (name, description, x, y, contents);
		this.northPossible = northPossible;
		this.eastPossible = eastPossible;
		this.southPossible = southPossible;
		this.westPossible = westPossible;
	}
}
