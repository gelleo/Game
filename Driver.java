public class Driver {
	 
	public static void main(String [ ] args) {
		PlayableChar cherez = new PlayableChar("Cherez", 15);
		System.out.println(cherez.toString());
		
		cherez.talk();
	}
}