﻿package MainPackage;

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
			System.out.println("Минимальное значение массива: " + result + ", его индекс: " + index + ". <-");
		else
			System.out.println("Максимальное значение массива: " + result + ", его индекс: " + index + ". ->");
		return result;
	}

	static void ShowCurrentValue(int[] SomeArray, int val) {
		boolean find = false;
			for(int i = 0; i < SomeArray.length; i++) {
				if(SomeArray[i] == val) {
					System.out.println("\r\r\r\rЧисло: " + SomeArray[i] + " найдено, его индекс в массиве: " + i + ".\r\r\r");
					find = !find;
					break;
				}
			}
			if(!find)
				System.out.println("\r\r\r\rТакого числа в массиве нет. Повторите попытку.\r\r\r\r");
	}
	
	static void BinaryValueFinder(int[] SomeArray, int val) {
		int res = 0;
			int stt = 0, end = SomeArray.length, mid;
			while (stt < end) {
				mid = (stt + end)/2; 
				if (val == SomeArray[mid]) {
					res = mid;
					break;
				} else {
					if (val < SomeArray[mid]) 
						end = mid;
					else 
						stt = mid + 1;
				}
			}
			System.out.println("\r\r\r\rЧисло: " + SomeArray[res] + " найдено, его индекс в массиве: " + res + ".\r\r\r");
	}
}
