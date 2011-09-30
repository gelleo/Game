

public class PlayableChar extends Character {
	private int level;
	
	public PlayableChar() {
		super();
		level = 1;
	}
	
	public PlayableChar(String name, int level) {
		super(name);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public void talk() {
		System.out.print("Waiting for the enter key");
	       while(!scanner.nextLine().equals(""));
	       
	}
	
	public String toString() {
		return super.toString() + "Level: " + level + "\n";
	}
}