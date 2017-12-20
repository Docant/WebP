package List;

import java.util.Scanner;

public class User {

	private String name = "";
	private String nickname = "";
	private int age = 0;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static Scanner in = new Scanner(System.in);
	
	@Override
	public String toString() {
		return name + " " + nickname + " " + age;
	}

	User(){
		System.out.println("Enter Name:");
		name = in.next();
		System.out.println("Enter Nickname:");
		nickname = in.next();
		System.out.println("Enter Age:");
		age = in.nextInt();
	}

}
