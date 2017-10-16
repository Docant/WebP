package MainPackage;

import java.util.Scanner;

public class ArraySorts extends ArrayActions{
	
	static Scanner in = new Scanner(System.in);
		
	static int[] ChoiseArraySort(int[] SomeArray) {
		System.out.println("Select a sorting method: \r1.'Bubble. [Oo]'\r2.'Inserts. [->|<-]'\r3.'Some method.[~]'\r4. Sort the string array. ");
		int bob = in.nextInt();
		switch(bob) {
			case 1:
				return Puzirok(SomeArray);
			case 2:
				return Vstavka(SomeArray);
			case 3:
				return MySort(SomeArray);
			default:
				return SomeArray;
		}
	}
	
	static int[] Puzirok(int[] SomeArray) {
		int t;
		
		for(int i = 0; i< SomeArray.length; i++) {
			for(int j = SomeArray.length-1; j>i; j--) {
				if(SomeArray[j-1] > SomeArray[j]) {
					t = SomeArray[j-1];
					SomeArray[j-1] = SomeArray[j];
					SomeArray[j]=t;
				}
			}
		}
		System.out.println("Array has been sorted by 'Bubble'. [Oo]");
		return SomeArray;
	}
	
	static int[] Vstavka(int[] SomeArray) {
		int bob = SomeArray.length;
		for(int k = 0; k < bob; k++) {
			bob--;
			for(int i = 1; i < SomeArray.length ; i++) {
				for(int j = 1; j > 0 && SomeArray[i-1] > SomeArray[i]; j--) {
					int sas = SomeArray[i-1];
					SomeArray [i-1] =  SomeArray[i];
					SomeArray[i] = sas;
				}
			}
		}
		System.out.println("Array has been sorted by 'Inserts'. [->|<-]");
		return SomeArray;
	}
	
	static int[] MySort(int[] SomeArray) {
		for(int l = 0; l < SomeArray.length; l++) {
			int b = (-999999999);
			for(int i = 0; i < SomeArray.length; i++) {
				if(SomeArray[i] > b)
					b = SomeArray[i];
				else {
					SomeArray[i-1] = SomeArray[i];
					SomeArray[i] = b;
				}
			}
		}
		
		System.out.println("Array has been sorted by 'Some method'. [~]");
		return SomeArray;
	}
	
	static String[] StringArraySort(String[] SomeArray) {
        for (int i = 0; i < SomeArray.length - 1; i++) {
            for (int j = 0; j < SomeArray.length - i - 1; j++) {
                if (SomeArray[j].compareTo(SomeArray[j+1]) > 0) {
                    String Pstr = SomeArray[j];
                    SomeArray[j] = SomeArray[j+1];
                    SomeArray[j+1] = Pstr;
                }
            }
        }
		System.out.println("String array has been sorted!");
        return SomeArray;
    }
	
}
