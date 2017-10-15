package MainPackage;

import java.util.Scanner;

public class MainClass extends Outputer{

	public static void main(String[] arg) {

		boolean prog = false;
		while(!prog) {
			System.out.println("Welcome to program, make your choise: \r1. Start Up! \r0. Exit.");
			prog = OutputMainMenu(prog);
		}
	}

	static boolean OutputMainMenu(boolean prgrm) {

		Scanner on = new Scanner(System.in);
		int choise = on.nextInt();
		
			switch(choise) {
				case 1: MainOutput();
					break;
				case 0: 
				return true;
			}
			return true;
		}
	}
	
	

