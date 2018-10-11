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