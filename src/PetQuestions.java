import java.util.Scanner;

public class PetQuestions {

    public static void main( String[] args ) {

        Scanner keyboard = new Scanner(System.in);

        String name;
        String breed;
        int age;
        double cost;

        System.out.print("Greetings. What is your pet's name? " );
        name = keyboard.nextLine();

        System.out.print( "What kind of animal is " + name + "? " );
        breed = keyboard.next();

        System.out.print( "How old is " + name + "? ");
        age = keyboard.nextInt();

        System.out.print( "How much is " + name + "? ");
        cost = keyboard.nextDouble();

        System.out.println( name + " is your " + breed + " and it is " + age );
        System.out.println("This pet cost: " + cost);

        keyboard.close();
    }
}
