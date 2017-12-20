package List;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

public class OutputList {
	
	public static List OutputStringList(List<String> SomeLine) {
		for(String line:SomeLine) 
			System.out.println("List element: " + line);
		return SomeLine;
	}
	
	public static void OutputList(List SomeLine) {
		for(int i=0; i < SomeLine.size(); i++) {
			System.out.println("List element #" + (i+1) + ": \n" + SomeLine.get(i));
		}
	}
	
	public static void OutputTime(String tm1, String tm2) {
		System.out.println("ArrayList time: " + tm1 + " ns");
		System.out.println("LinkedList time: " + tm2 + " ns");
	}

}
