
public class HouseThatJackBuilt {

	public static void main(String[] args) {
        //=====Written Poem's methods========//
		
		ThisIs(); JackHouse();
		ThisIs(); TheMalt();
		ThisIs(); TheRat();
		ThisIs(); TheCat();
		ThisIs(); TheDog();
		ThisIs(); TheCow();
		ThisIs(); TheMaiden();
		//==================================//
        
		}
	public static void ThisIs() {
		System.out.print("This is ");
	}
	
	public static void JackHouse() {
		System.out.println("the house that Jack built.");
        System.out.println();	
	}
	
	public static void TheMalt() {
		System.out.println("the malt");
		System.out.print("That lay in "); JackHouse();
	}
	
	public static void TheRat() {
		System.out.println("the rat");
		System.out.print("That ate "); TheMalt();
	}
	public static void TheCat() {
		System.out.println("the cat");
		System.out.print("That killed "); TheRat();
	}
	public static void TheDog() {
		System.out.println("the dog");
		System.out.print("That worried "); TheCat();
	}
	public static void TheCow() {
		System.out.println("the cow with the crumpled horn");
		System.out.print("That tossed "); TheDog();
	}
	public static void TheMaiden() {
		System.out.println("the maiden all forlorn");
		System.out.print("That milked "); TheCow();
	}
}
