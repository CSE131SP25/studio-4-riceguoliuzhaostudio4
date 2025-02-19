package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int R = in.nextInt();
		int G = in.nextInt();
		int B = in.nextInt();
		Boolean yesno = in.nextBoolean();
		Double x = in.nextDouble();
		Double y =in.nextDouble();
		Double halfWidth = in.nextDouble();
		Double halfHeight = in.nextDouble();
		
		
		
		StdDraw.setPenColor(R, G, B);
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
		
		
	}
}
