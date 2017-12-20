package List;

import java.util.ArrayList;
import java.util.List;

public class Task3 extends CreateList {

	static List<Integer> SomeLine1 = new ArrayList<Integer>();
	static List<Integer> SomeLine2 = new ArrayList<Integer>();
	
	static List<User> UsersList = new ArrayList<User>();
	
	public static void main(String[] args) {
		
		System.out.println("Task 1:\nSomeLine1 equals SomeLine2? ->" + RandomFillList((int)(Math.random()*10)) + "\n\n");
		
		System.out.println("Task 2:");
		UsersList = FillUsersList(UsersList, CreateList());
		OutputList(UsersList);
		UserFounder();
		OutputList(UsersList);
		UserRemover();
		OutputList(UsersList);
	}
	
	public static void UserFounder(){
		String inp;
		while(true) {
			System.out.println("\nWitch User u want to find? Enter his Name/Surname/Age:\n");
			inp = in.next();	
			if(FindUser(UsersList, inp)) {
				System.out.println("\nUser '" + inp + "' was found!\n\n");
				break;
			}
			else
				System.out.println("\nUser '" + inp + "' wasn't found!\n\n");
			OutputList(UsersList);
		}
	}
	
	public static void UserRemover(){
		String inp;
		while(true) {
			System.out.println("\nWitch User u want to delete? Enter his Name/Surname/Age:\n");
			inp = in.next();	
			if(RemoveUser(UsersList, inp)) {
				System.out.println("\nUser '" + inp + "' was deleted!\n\n");
				break;
			}
			else
				System.out.println("\nUser '" + inp + "' wasn't deleted!\n\n");
		}
	}
	
	public static boolean RandomFillList(int size) {
        for(int i = 0; i < size; i++) {
        	int val = (int)(Math.random() * 10);
        	SomeLine1.add(val);
        	SomeLine2.add(val);
        }
        return SomeLine1.equals(SomeLine2); //compare of two elements
	}
	
	public static List FillUsersList(List SomeList, int LSize){
		for(int i = 0; i < LSize; i++) {
			System.out.println("Fill " + (i+1) + " user:");
			SomeList.add(new User());
		}
		return SomeList;
	}

	public static boolean FindUser(List SomeList, String tag) {
		String[] bob;
		for(int i = 0; i< SomeList.size(); i++) {
			bob = UsersList.get(i).toString().split(" ");
			if(bob[0].contains(tag))
				return true;
			else if(bob[1].contains(tag))
				return true;
			else if(bob[2].contains(tag))
				return true;
		}
		return false;
	}

	public static boolean RemoveUser(List SomeList, String tag) {
		String[] bob;
		for(int i = 0; i< SomeList.size(); i++) {
			bob = UsersList.get(i).toString().split(" ");
			if(bob[0].equals(tag)) {
				SomeList.remove(i);
				return true;
			}
			else if(bob[1].equals(tag)) {
				SomeList.remove(i);
				return true;
			}
			else if(bob[2].equals(tag)) {
				SomeList.remove(i);
				return true;
			}
		}
		return false;
	}
	
}
