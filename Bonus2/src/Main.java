import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
			AutoTunePanel gm = new AutoTunePanel();

			JFrame windowFrame = new JFrame();
			windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			windowFrame.setSize(1000, 1000);
			windowFrame.setVisible(true);
			windowFrame.add(gm);
			
	}

}
