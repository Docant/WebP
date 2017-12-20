package List;

import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.TreeSet;

public class Task4 {
	public static void main(String[] args) {
        String[] studs = {"Andreev", "Vinogradova", "Gamilov", "Grinenko", "Dovgal", "Drevalskiy", "Ololoev","Klimova", "Kozlov", 
        		"Kornienko", "Labunskiy", "Logvinov", "Lisichenko", "Marchukov", "Momot", "Parkhomov", "Aronov"};
        
        HashSet<String> HashStudents = new HashSet<>();
        TreeSet<String> TreeSetStudents = new TreeSet<>();
        
        System.out.println("\n\nHashSet:\n");
        HashStudents = StudentFiller(HashStudents, studs);
        Outputer(HashStudents);
        HashStudents = RemoveStudents(HashStudents);

        System.out.println("\n\nTreeSet:\n");
        TreeSetStudents = StudentFiller(TreeSetStudents, studs);
        Outputer(TreeSetStudents);
        TreeSetStudents = RemoveStudents(TreeSetStudents);
    }
	
	public static void Outputer(HashSet<String> Studs) {
        System.out.println("All students: " + Studs.size());
        for (String i: Studs) 
	        System.out.println(i + "");

        System.out.println("\n\n");
	}
	
	public static void Outputer(TreeSet<String> Studs) {
        System.out.println("All students: " + Studs.size());
        for (String i: Studs) 
	        System.out.println(i + ";");

        System.out.println("\n\n");
	}
	
	public static HashSet StudentFiller(HashSet<String> HStuds, String[] studentsList) {
		for(String i: studentsList) {
			HStuds.add(i);
		}
		return HStuds;
	}
	
	public static TreeSet StudentFiller(TreeSet<String> TStuds, String[] studentsList) {
		for(String i: studentsList) {
			TStuds.add(i);
		}
		return TStuds;
	}
	
	public static HashSet RemoveStudents(HashSet<String> HStuds) {
		for (int i = 0; i < HStuds.size(); i++) {
            try {
                for (String a : HStuds) {
                    if (a.startsWith("A") || a.startsWith("E") || a.startsWith("I") || a.startsWith("O") || a.startsWith("U") || a.startsWith("Y")) {
                    	HStuds.remove(a);
                    }
                }
            } catch (ConcurrentModificationException e) {
            }
        }

        System.out.println("All Students: " + HStuds.size());
        System.out.println(HStuds);
		return HStuds;
	}

	public static TreeSet RemoveStudents(TreeSet<String> TStuds) {
		 for (int i = 0; i < 5; i++) {

	            try {
	                for (String a : TStuds) {
	                	TStuds.remove(a);
	                }
	            } catch (ConcurrentModificationException e) { }

	        }

        System.out.println("All Students: " + TStuds.size());
        System.out.println(TStuds);
		return TStuds;
	}
	
}

