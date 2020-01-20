package forfun;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PickingRandom {
	
	public String randomSelection(ArrayList<String> selection) {
		Random r = new Random();
		int pos = r.nextInt(selection.size());
		return selection.get(pos);
	}
	
	public static void main(String[] args) {
		System.out.println("Type in the names that you want drawn from the hat! "
				+ " \n(Press enter after each name) \n(When finished, press enter again)");
		ArrayList<String> inputs = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		boolean status = true;
		while (status) {
			String option = scan.nextLine();
			if (option.equals("")) {
				status = false;
			}
			else {
				inputs.add(option);
			}
		}
		scan.close();
		
		System.out.println("The chosen one is ... ");
		System.out.println(		"    _________"
					   + "\n" + "    |       |"
					   + "\n" + "    |       |"
					   + "\n" + "    |       |"
					   + "\n" + "    |_______|"
					   + "\n" + " ___|_______|____"
					   + "\n" + "|_______________|"
					   + "\n" + " *	 #   *   *" 
					   + "\n" + "    *    *   # " 
					   + "\n" + " #	 *       *" 
					   + "\n");
		
		PickingRandom choose = new PickingRandom();
		System.out.print(" ... " + choose.randomSelection(inputs) + "!");
		
	}
	
}
