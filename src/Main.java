import java.util.Scanner;
public class Main {

	public static void main(String[] args) { // this is where the map area should be defined and also
		Room map[][] = new Room[3][3];
		Player player = new Player(0,0);
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
		
	}
}