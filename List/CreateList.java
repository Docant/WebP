package List;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateList extends OutputList {

	static Scanner in = new Scanner(System.in);
	public static int CreateList() {
		int LSize = 0;
		System.out.println("Enter the List size: ");
		try {
			LSize = in.nextInt();	
		}catch(Exception e) {
			System.out.println("This is not number!");
		}//return > filled list( List, list size)
		return LSize;
	}
	
	public static List FillList(List SomeList, int size) {
		System.out.println("\nEnter the " + size + " lines: " );
		for(int i = 0; i < size+1; i++) {
			SomeList.add(in.nextLine());
		}
		SomeList.remove(0);
		return SomeList;
	}
	
}
