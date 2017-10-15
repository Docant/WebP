package MainPackage;

public class Outputer extends ArrayEditor{

	public static void MainOutput() {
		boolean program = false;
		int[] Array = new int[0];
		while(!program) {
			System.out.println("�������� ��������: \r1.������ ������.\r2.������������� ������.\r3.���������� ������.\r4.�������� ����������� �������� �������.\r5.�������� ������������ �������� �������.\r6.������� ������������ �����.\r7.�������� ������.\r8.������������� ������.\r9.�������� ���������� �������.\r0.���������.\r\r\r:3\r\r");
			int choise = in.nextInt();
			System.out.println(choise);
			if(Array.length > 1 || (choise == 1 || choise == 0 || choise == 8))
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
					System.out.println("�������� ������ ������:");
					int mFind = in.nextInt();
					System.out.println("������� ����� ������� ������� �����:\r1.�����������.\r1.�������� �����.");
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
				case 9: OutputInfo(Array); //Show Array
					break;
				case 0: System.out.println("����)"); program = !program; //Exit while
					break;
			}
			else System.out.println("������� ������� ������! >_< \r");
		}
	}
	
	static void OutputInfo(int[] SomeArray) {
		System.out.println("\r���������� �������: ");
		for(int i = 0; i< SomeArray.length; i++) {
			System.out.println(SomeArray[i]);
		}
	}
	
	
}
