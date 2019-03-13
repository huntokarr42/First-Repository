import java.util.Scanner;

public class MadLib {
	public static void main(String args[]) {
		System.out.println("Welcome to Mad Libs!");
		System.out.println("I will be asking you to provide various words and phrases to fill a story.");
		System.out.println("First, give me someone's name:");
		Scanner scanner = new Scanner(System.in);
		String name1 = scanner.nextLine();
		System.out.println("Next, give me a verb ending in -ing");
		String verb1 = scanner.nextLine();
		System.out.println("Next, give me a public place");
		String place1 = scanner.nextLine();
		System.out.println("Next, give me a body part");
		String bodypart1 = scanner.nextLine();
		System.out.println("Next, give me an adjective");
		String adj1 = scanner.nextLine();
		System.out.println("Next, give me another adjective");
		String adj2 = scanner.nextLine();
		System.out.println("Next, give me another body part");
		String bodypart2 = scanner.nextLine();
		System.out.println("Next, give me a colour");
		String colour1 = scanner.nextLine();
		System.out.println("Next, give me another verb");
		String verb2 = scanner.nextLine();
		System.out.println("Next, give me a season");
		String season1 = scanner.nextLine();
		System.out.println("Next, give me another adjective");
		String adj3 = scanner.nextLine();
		System.out.println("Next, give me a drink name");
		String drink1 = scanner.nextLine();
		System.out.println("Next, give me a food dish name");
		String food1 = scanner.nextLine();
		System.out.println("Next, give me another verb");
		String verb3 = scanner.nextLine();
		System.out.println("Next, give me another adjective");
		String adj4 = scanner.nextLine();
		System.out.println("Next, give me another adjective");
		String adj5 = scanner.nextLine();
		System.out.println("Next, give me an article of clothing");
		String clothing = scanner.nextLine();
		System.out.println("Next, give me another verb");
		String verb4 = scanner.nextLine();
		System.out.println("Next, give me a day of the week");
		String day = scanner.nextLine();
		System.out.println("Next, give me a noun");
		String noun1 = scanner.nextLine();
		System.out.println("Finally, give me your name");
		String name2 = scanner.nextLine();
		System.out.println("Here is your complete Mad Lib: ");
		System.out.println("My Darling " + name1);
		System.out.println("Last night I had a dream. You and I were " + verb1 + " together in the " + place1 + " with our " + bodypart1 + " touching. It was so romantic!");
		System.out.println("You are so " + adj1 + " and " + adj2 + " that everytime I think of you my " + bodypart2 + " turns " + colour1 + " and I " + verb2);
		System.out.println("I still remember that wonderful day we spent together last " + season1 + " . We went to a very " + adj3 + " restaurant and we drank so much " + drink1 + " and ate so much " + food1 + " that we " + verb3 + " . After dinner you gave me that " + adj4 + ", " + adj5 + " " + clothing + ". Sometimes when I miss you I put it on and I " + verb4 + ".");
		System.out.println("I'll see you next " + day + ", sweetheart!");
		System.out.println("All my love,");
		System.out.println("Your " + noun1 + ",");
		System.out.println(name2);
		
	}
}
