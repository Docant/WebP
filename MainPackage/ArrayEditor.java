package MainPackage;

public class ArrayEditor extends ArraySorts{

	//Int Array----------------------------------------------------------------------------
	static int[] CreateArray() {
		System.out.println("Введите размерность массива:");
		int arrCount = in.nextInt();
		int[] SomeArray = new int[arrCount];	
		return SomeArray;
	}
	
	static int[] FillArray(int[] SomeArray) {
		System.out.println("Введите числа в колличестве [" + SomeArray.length + "]:");
		
		for(int i = 0; i< SomeArray.length; i++) {
			SomeArray[i] = in.nextInt();
		}	
		System.out.println("Массив создан! <3");	
		return SomeArray;
	}
	
	//String Array--------------------------------------------------------------------------
	static String[] CreateSArray() {
		System.out.println("Введите размерность массива:");
		int arrCount = in.nextInt();
		String[] SomeArray = new String[arrCount+1];	
		return SomeArray;
	}
	
	static String[] FillArray(String[] SomeArray) {
		System.out.println("Введите " + (SomeArray.length-1) + " строк:");
		
		for(int i = 0; i< SomeArray.length; i++) {
			SomeArray[i] = in.nextLine();
		}	
		System.out.println("Массив создан! <3");	
		return SomeArray;
	}
	//--------------------------------------------------------------------------
	static int[] ClearArray(int[] SomeArray) {
		for(int i = 0; i< SomeArray.length; i++)
			SomeArray[i] = 0;
		return SomeArray;
	}
	
	static int[] MixArray(int[] SomeArray) {
		for(int i = 0; i < SomeArray.length; i++) {
			int randTmp = (int)Math.random() * SomeArray.length; 
			int tmp = SomeArray[i];
			SomeArray[i] = SomeArray[randTmp];
			SomeArray[randTmp] = tmp;
		}
		System.out.println("Массив перемешан! ლ(ಠ_ಠ ლ)");
		return SomeArray;
	}
	
	static int[] GenerateArray(int[] SomeArray) {
		int[] arrRange = new int[2];
		System.out.println("Введите диапазон значений массива:\r(Через пробел.)");
		
		for(int i = 0; i< arrRange.length; i++)
			arrRange[i] = in.nextInt();
		
		for(int i = 0; i < SomeArray.length; i++) 
			SomeArray[i] = (int) (Math.random() * (arrRange[1] - arrRange[0] + 1)) + arrRange[0];
		
		System.out.println("Массив сгенерирован! ლ(^_^ლ)\r\r\r\r\r\r");
		return SomeArray;
	}
	
}
