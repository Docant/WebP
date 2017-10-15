package MainPackage;

public class Outputer extends ArrayEditor{

	public static void MainOutput() {
		boolean program = false;
		int[] Array = new int[0];
		while(!program) {
			System.out.println("Выберите действие: \r1.Задать массив.\r2.Отсортировать массив.\r3.Перемешать массив.\r4.Показать минимальное значение массива.\r5.Показать максимальное значение массива.\r6.Вывести определенное число.\r7.Очистить массив.\r8.Сгенерировать массив.\r9.Показать содержимое массива.\r0.Закончить.\r\r\r:3\r\r");
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
					System.out.println("Выберите способ поиска:\r1.Стандартный.\r2.Бинарный поиск.");
					int mFind = in.nextInt();
					System.out.println("Введите число которое желаете найти:");
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
				case 0: System.out.println("Пока)"); program = !program; //Exit while
					break;
			}
			else System.out.println("Сначала задайте массив! >_< \r");
		}
	}
	
	static void OutputInfo(int[] SomeArray) {
		System.out.println("\rСодержимое массива: ");
		for(int i = 0; i< SomeArray.length; i++) {
			System.out.println(SomeArray[i]);
		}
	}
	
	
}
