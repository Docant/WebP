package MainPackage;

public class ArrayActions {
	
	static int FindMinMaxValueOnArray(int[] SomeArray, boolean minMax) {
		int result = SomeArray[0], index = 0;
		for(int i = 0; i < SomeArray.length; i++) {
			if(minMax) {
				if(SomeArray[i] < result) {
					result = SomeArray[i];
					index = i;
				}
			}else
				if(SomeArray[i] > result) {
					result = SomeArray[i];
					index = i;
				}
		}
		if(minMax)
			System.out.println("Min value of array: " + result + ", its index: " + index + ". <-");
		else
			System.out.println("Max value of array: " + result + ", its index: " + index + ". ->");
		return result;
	}

	static void ShowCurrentValue(int[] SomeArray, int val) {
		boolean find = false;
			for(int i = 0; i < SomeArray.length; i++) {
				if(SomeArray[i] == val) {
					System.out.println("\r\r\r\rValue: " + SomeArray[i] + " finded, its index: " + i + ".\r\r\r");
					find = !find;
					break;
				}
			}
			if(!find)
				System.out.println("\r\r\r\rCan't find this value. Retry.\r\r\r\r");
	}
	
	static void BinaryValueFinder(int[] SomeArray, int val) {
		int res = 0;
		boolean finded = false;
			int stt = 0, end = SomeArray.length, mid;
			while (stt < end) {
				mid = (stt + end)/2; 
				if (val == SomeArray[mid]) {
					res = mid;
					finded = !finded;
					break;
				} else {
					if (val < SomeArray[mid]) 
						end = mid;
					else 
						stt = mid + 1;
				}
			}
			if(finded)
				System.out.println("\r\r\r\rValue: " + SomeArray[res] + " finded, its index: " + res + ".\r\r\r");
			else
				System.out.println("\r\rI can't find this value /(☼_☼)\\ \r\r");
	}
}
