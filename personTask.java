import java.util.Scanner;
import java.util.Random;

class person{
    String firstName;
    String lastName;
    String gender;
    String ethnicity;
    String religion;

    int age;
    int weight;
    int height;

}
public class personTask {
    static Scanner userinput = new Scanner(System.in);

    static String greeting(){
        Random rand = new Random();
        String greet = "";

        int randomGreetNum = rand.nextInt(1,4);

        if (randomGreetNum == 1){
            greet = "Hello";
        }
        if (randomGreetNum == 2){
            greet = "Hi";
        }

        if (randomGreetNum ==3){
            greet = "Good Morning";
        }

        if(randomGreetNum ==4){
            greet = "Good afternoon";
        }

        return greet;

    }

    static String pray(){
        String prayer = "prayer";
        return prayer;
    }

    static String nap(){
        String napping = "ZZzzz";
        return napping;
    }

    static String food(){
        String eating = "that was some good food";
        return eating;
    }

    static String namePrint(String name){
        String personName = name;
        return personName;
    }

    static String religionChange(){
        String newReligion;

        System.out.println("What is the person's new religion?");
        newReligion = userinput.nextLine();

        return newReligion;
    }

    public static void main(String[] args) {
        int userdata;

        personData person1 = new personData();

        System.out.println("What is your person's first name?");
        person1.firstName = userinput.nextLine();

        System.out.println("What is your person's last name?");
        person1.lastName = userinput.nextLine();

        System.out.println("What is your person's gender?");
        person1.gender = userinput.nextLine();

        System.out.println("What is your person's ethnicity?");
        person1.ethnicity = userinput.nextLine();

        System.out.println("What is your person's religion?");
        person1.religion = userinput.nextLine();

        System.out.println("What is your person's age?");
        person1.age = userinput.nextInt();

        System.out.println("What is your person's weight?");
        person1.weight = userinput.nextInt();

        System.out.println("What is your person's height?");
        person1.height = userinput.nextInt();

        System.out.println("Type 1 to say a greeting. Type 2 to say a prayer. Type 3 to take a nap" +
                "Type 4 to eat food. Type 5 to see the name. Type 6 to change religion");
        userdata = userinput.nextInt();
        if(userdata == 1){
            System.out.println(greeting());
        }
        if(userdata == 2){
            System.out.println(pray());
        }
        if(userdata == 3){
            System.out.println(nap());
        }
        if(userdata == 4){
            System.out.println(food());
        }
        if(userdata == 5){
            System.out.println(namePrint(person1.firstName));
        }
        if(userdata == 6){
            System.out.println(religionChange());
        }
    }
}

