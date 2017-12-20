package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 extends CreateList{

	static List<String> SomeLine1 = new ArrayList<String>();
	
	public static void main(String[] args) {
		//Output > mixed list(List, N-times) > createed from 'List'
		
		SomeLine1 = MixList(FillList(SomeLine1, CreateList()), 15);
		OutputStringList(SomeLine1);
		SomeLine1 = ReplaceElements(SomeLine1, 5);
		OutputStringList(SomeLine1);
	}
	
	public static List MixList(List SomeList, int repCount) {
		String f = ""; //backup bariable
		for(int j = 0; j < repCount; j++) { //how many times it must be do
			f = (String)SomeList.get(SomeList.size()-1);	//clone last value to backup variable
			for(int i = 1; i < SomeList.size(); i++) //Move all elements forward
				SomeList.set(SomeList.size()-i, SomeList.get(SomeList.size()-(i+1)));
			SomeList.set(0, f);	//put last element on the first place
		}
		return SomeList;
	}
	
	public static List ReplaceElements(List SomeList, int elems) {
		System.out.println("\nEnter the " + elems + " lines: " );
		for(int i = (SomeList.size())-elems; i < SomeList.size(); i++) 
			SomeList.set(i, in.nextLine());
		return SomeList;
	}
	
}
