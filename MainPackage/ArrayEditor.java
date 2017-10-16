package MainPackage;

public class ArrayEditor extends ArraySorts{

	//Int Array----------------------------------------------------------------------------
	static int[] CreateArray() {
		System.out.println("Input the array size:");
		int arrCount = in.nextInt();
		int[] SomeArray = new int[arrCount];	
		return SomeArray;
	}
	
	static int[] FillArray(int[] SomeArray) {
		System.out.println("Enter the [" + SomeArray.length + "] values:");
		
		for(int i = 0; i< SomeArray.length; i++) {
			SomeArray[i] = in.nextInt();
		}	
		System.out.println("Массив создан! <3");	
		return SomeArray;
	}
	
	//String Array--------------------------------------------------------------------------
	static String[] CreateSArray() {
		System.out.println("Input the array size:");
		int arrCount = in.nextInt();
		String[] SomeArray = new String[arrCount+1];	
		return SomeArray;
	}
	
	static String[] FillArray(String[] SomeArray) {
		System.out.println("Enter " + (SomeArray.length-1) + " lines:");
		
		for(int i = 0; i< SomeArray.length; i++) {
			SomeArray[i] = in.nextLine();
		}	
		System.out.println("Array has been created! <3");	
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
		System.out.println("Array has been mixed! ლ(ಠ_ಠ ლ)");
		return SomeArray;
	}
	
	static int[] GenerateArray(int[] SomeArray) {
		int[] arrRange = new int[2];
		System.out.println("Enter the value range of the array:\r(Через пробел.)");
		
		for(int i = 0; i< arrRange.length; i++)
			arrRange[i] = in.nextInt();
		
		for(int i = 0; i < SomeArray.length; i++) 
			SomeArray[i] = (int) (Math.random() * (arrRange[1] - arrRange[0] + 1)) + arrRange[0];
		
		System.out.println("Array has been generated! ლ(^_^ლ)\r\r\r\r\r\r");
		return SomeArray;
	}
	
}
