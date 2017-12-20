package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2 extends CreateList{

	static List<Integer> SomeLine1 = new ArrayList<Integer>();
	static List<Integer> SomeLine2 = new LinkedList<Integer>();
	
	final static int CoMult = 100;
	
	public static void main(String[] args) {
		OutputTime(ArrListTest(SomeLine1), LinListTest(SomeLine2));
		
	}
	
	private static String ArrListTest(List SomeList) {
		long st, en;
        st = System.nanoTime();
        
        for(int i = 0; i<10000; i++) 
        	SomeList.add((int)(Math.random() * CoMult));

        int o = 0;
        for(int i = 0; i<SomeList.size()-1; i++) {
        	o = (int)SomeList.get(i);
        }
        
        for(int i = 0; i<SomeList.size()-1; i++) 
        	SomeList.set(i, (int)(Math.random() * CoMult));
        
		SomeList.remove(0);
        
        en = System.nanoTime();
        return String.format("%,12d", (en - st));
	}
	
	  private static String LinListTest(List SomeList) {
			long st, en;
	        st = System.nanoTime();

	        for(int i = 0; i<10000; i++) 
	        	SomeList.add((int)(Math.random() * CoMult));
	        
	        int o = 0;
	        for(int i = 0; i<SomeList.size()-1; i++) {
	        	o = (int)SomeList.get(i);
	        }
	        
	        for(int i = 0; i<SomeList.size()-1; i++) 
	        	SomeList.set(i, (int)(Math.random() * CoMult));
	        
			SomeList.remove(0);
	        
	        en = System.nanoTime();
	        return String.format("%,12d", (en - st));
	}
	  
}
