import java.util.Scanner;

public abstract class Character {
	private String name;
	public Scanner scanner;
	
	public Character() {
		name = null;
		scanner = new Scanner(System.in);
	}
	
	public Character(String name) {
		this.name = name;
		scanner = new Scanner(System.in);
	}
	
	public abstract void talk();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name: " + name + "\n";
	}
}