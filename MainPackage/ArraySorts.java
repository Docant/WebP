package MainPackage;

import java.util.Scanner;

public class ArraySorts extends ArrayActions{
	
	static Scanner in = new Scanner(System.in);
		
	static int[] ChoiseArraySort(int[] SomeArray) {
		System.out.println("Выберите способ сортировки: \r1.'Пузырьком. [Oo]'\r2.'Вставками. [->|<-]'\r3.'Ещё-один.[~]'\r4.Остортировать массив строк. ");
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
		System.out.println("Массив отсортирован 'Пузырьком'. [Oo]");
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
		System.out.println("Массив отсортирован 'Вставкой'. [->|<-]");
		return SomeArray;
	}
	
	static int[] MySort(int[] SomeArray) {
		for(int l = 0; l < SomeArray.length; l++) {
			int b = 0;
			for(int i = 0; i < SomeArray.length; i++) {
				if(SomeArray[i] > b)
					b = SomeArray[i];
				else {
					SomeArray[i-1] = SomeArray[i];
					SomeArray[i] = b;
				}
			}
		}
		
		System.out.println("Массив отсортирован 'Каким-то странным и не эффективным ручным методом...'. [~]");
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
		System.out.println("Строковый массив отсортирован!");
        return SomeArray;
    }
	
}
