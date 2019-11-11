package sprog;
import java.util.Scanner;
public class Sprog {
	
	public static Scanner input = new Scanner(System.in);
	public static SprogI sprog = new Dansk();
	
	public static void main(String[] args) {
		
		
		//sprogDK = new Dansk();
		//sprogUK = new Engelsk();
		int choice = 0;
		
		while(choice != 9) {
			sprog.printMenu();
			choice = input.nextInt();
			switch(choice) {
				case 1:
					changeLanguage();
					break;
				case 2:
					showMovie();
					break;
				case 9:
					System.out.println("Exit");
					choice=9;
					break;
			}
		}
	}
	public static void showMovie() {
		System.out.println("Lord of the Rings");
	}
	private static void changeLanguage() {
		// TODO: sproguafh skiftsprog menu
		int choice = input.nextInt();
		switch (choice){
			//case 1: sprogDK.printMenu();break;
			case 1: sprog = new Dansk();break;
			//case 2: sprogUK.printMenu();break;
			case 2: sprog = new Engelsk();break;
		}
		System.out.println("sprog skiftet");
	}
}