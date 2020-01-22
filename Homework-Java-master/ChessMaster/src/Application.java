import com.chess.config.PieacesColor;
import com.game.pieaces.Bishop;
import com.game.pieaces.Pawn;
import com.game.pieaces.Rook;
import com.game.pieaces.Knight;
import com.game.test.BishopTest;
import com.game.test.KingTest;
import com.game.test.KnightTest;
import com.game.test.PawnTest;
import com.game.test.QueenTest;
import com.game.test.RookTest;

public class Application {

	public static void main(String[]	args){
		
		//how to restrict the input  parameter
		//i need only two specific color strings
		//Pawn p1 = new Pawn(PieacesColor.BLACK, 1, 0);
		//Rook r1 =	new Rook(PieacesColor.Black, 0, 0);
		
		PawnTest.run();
		RookTest.run();
		BishopTest.run();
		KnightTest.run();
		QueenTest.run();
		KingTest.run();
		
	}
}
