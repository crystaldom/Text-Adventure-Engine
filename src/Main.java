import java.util.Scanner;
public class Main { //any public variables like gamecontroller and stuff should be up here
	public static Room map[][] = new Room[3][3];
	public static Player player = new Player(0,0);
	public static void main(String[] args) { // this is where the map area should be defined and also
		
		map[0][0] = new LimitedRoom("","",0,0,null,true,true,true,true);
		
	}

}

class GameController //runs things like room loading and string parsing
{
	Scanner input = new Scanner(System.in);
	GameController(){}
	boolean gameRun;
	public void loadroom()
	{
		Room currentTile = Main.map[Main.player.x][Main.player.y];
		System.out.println(currentTile.name);
		System.out.println(currentTile.description);
	}
	public String getInput()
	{
		System.out.println("> ");
		String passInput = input.next().toLowerCase();
		return passInput;
	}
}