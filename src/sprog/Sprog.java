package sprog;
import java.util.Scanner;
public class Sprog {
	
	public static Scanner input = new Scanner(System.in);
	static Dansk sprogDK = new Dansk();
	static Engelsk sprogUK = new Engelsk();
	public static void main(String[] args) {
		
		
		//sprogDK = new Dansk();
		//sprogUK = new Engelsk();
		int choice = 0;
		sprogDK.printMenu();
		
		while(choice != 9) {
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
			case 1: sprogDK.printMenu();break;
			case 2: sprogUK.printMenu();break;
		}
	}
}