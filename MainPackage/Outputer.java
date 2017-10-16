package MainPackage;

public class Outputer extends ArrayEditor{

	public static void MainOutput() {
		boolean program = false;
		int[] Array = new int[0];
		String[] ArrayS = new String[0];
		while(!program) {
			System.out.println("Make choise: \r1.Make array.\r2.Sort array.\r3.Mix array.\r4.Show min value of array.\r5.Show max value of array.\r6.Find current value.\r7.Clear array.\r8.Generate array.\r9.Show array.\r10.Create string array.\r11.Sort string array\r0.Exit.\r\r\r:3\r\r");
			int choise = in.nextInt();
			System.out.println(choise);
			if((Array.length > 1 || ArrayS.length > 1) || (choise == 1 || choise == 0 || choise == 8 || choise == 10))
			switch(choise) {
				case 1: Array = FillArray(CreateArray());  /*Create Array & Fill Array */
					break;
				case 2: Array = ChoiseArraySort(Array);  //Sort Array
					break;
				case 3: MixArray(Array); //Mix Array
					break;
				case 4: FindMinMaxValueOnArray(Array, true); //true - min value
					break;
				case 5: FindMinMaxValueOnArray(Array, false); //false - max value
					break;
				case 6: 
					System.out.println("Select sort method:\r1.Linear.\r2.Binary.");
					int mFind = in.nextInt();
					System.out.println("Enter the value that you want find:");
					int CurValue = in.nextInt();
					switch(mFind) {
						case 1:
							ShowCurrentValue(Array, CurValue); //Show selected value
							break;
						case 2:
							BinaryValueFinder(Puzirok(Array), CurValue); //Show selected value
							break;
					}
					break;
				case 7: Array = ClearArray(Array); //Clear Array
					break;
				case 8: Array = GenerateArray(CreateArray());
					break;
				case 9: System.out.println("What's array u wanna see: \r1.Int Array\r2.String Array"); 
						int ChVal = in.nextInt();
						switch(ChVal) {
							case 1:
								if(Array.length > 1)OutputInfo(Array); //Show Array
								break;
							case 2:
								if(ArrayS.length > 1)OutputInfo(ArrayS); //Show Array
								break;
							}
				break;
				case 10: ArrayS = FillArray(CreateSArray());
					break;
				case 11: ArrayS = StringArraySort(ArrayS);
					break;
				case 0: System.out.println("Пока)"); program = !program; //Exit while
					break;
			}
			else System.out.println("Create array at first! >_< \r");
		}
	}
	
	static void OutputInfo(int[] SomeArray) {
		System.out.println("\rArray: ");
		for(int i = 0; i< SomeArray.length; i++) {
			System.out.println(SomeArray[i]);
		}
	}
	
	static void OutputInfo(String[] SomeArray) {
		System.out.println("\rString Array: ");
		for(int i = 0; i< SomeArray.length; i++) {
			System.out.println(SomeArray[i]);
		}
	}
	
	
}
