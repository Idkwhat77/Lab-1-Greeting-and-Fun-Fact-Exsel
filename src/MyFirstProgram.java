import java.util.Scanner; // Import Scanner library for user input purposes like user names and personality choices

public class MyFirstProgram { // My first program for my OOP (Object Oriented Programming) Class
    public static void main(String[] args) throws Exception {

        // Object defining area (Line 7-12)
        int Personality;           
        String Name;               
        int index_fact = 0; // Used for selecting a fun fact in the array
        String[] Fun_facts = {"Minecraft was written in Java?", "idk man?"};
        String Java_Version = System.getProperty("java.version"); // Get version of Java if it's installed on your device
        String Java_Version_Colored  = "\u001b[33m" + Java_Version + "\u001b[0m"; // All references to Java_Version will be properly colored without copy pasting ANSI codes every time.

        // Choosing personality and getting a random fact (Line 15-21)
        System.out.print("\033[H\033[2J"); // Clears the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Greetings, mortal!\nPlease enter thy name : ");
        Name = scanner.nextLine();
        String Name_Colored = "\u001b[37;1m" + Name + "\u001b[0m";
        System.out.print("\u001b[33m\rPlease choose a personality!\n\u001b[31m1. Bully\n\u001b[34m2. Shy\n\u001b[35m3. Fischl\n\u001b[32m4. Otaku\n\u001b[36m5. Sheltered\n\u001b[37m6. Normal\n\u001b[33mEnter : ");
        Personality = scanner.nextInt();
        System.out.print("\033[H\033[2J"); // Clears the console
        index_fact = (int) (Math.random() * Fun_facts.length); // Chooses a random index depending on how many fun facts there are
        String Fun_Facts_Colored = "\u001b[36;1m" + Fun_facts[index_fact] + "\u001b[0m"; // Define Fun_Facts_Color var as String Type
        scanner.close();

        // Responses depending on personality input 
        switch(Personality) { 
            case 1:
                System.out.println("\u001b[31mHuh? Who the hell are you?! " + Name_Colored + "\u001b[31m? Dumb fuck name. I ain't sayin some \"Hello World!\" bullshit to you! Screw off!");
                System.out.println("\nWhat?! I have to!? Oh my g- Fine! Hello World! There! Happy now, freak!?");  
                System.out.println("\nYou want a fun fact about Java? The fuck's a Java?! Ugh, fine! Just leave me alone after this! Let me grab my phone...");
                System.out.println("\nDid you know that... uhh... " + Fun_Facts_Colored + "\u001b[31m There's your damn fact, fuck off now!");
                System.out.println("\nNever goddamn mind, I have to tell you that you use Java version " + Java_Version_Colored + "\u001b[31m for some dumb ass reason!");
                System.out.println("\nIs that all? Leave me alone now!\u001b[0m");
                // Sorry for the vulgarity :(
                break;

            case 2:
                System.out.println("TEEEE");

            case 3:
                System.out.println("TEEEE");

            case 4:
                System.out.println("Yooreek");

            case 5:
                System.out.println("\u001b[36mHello " + Name_Colored + "\u001b[36m. Welcome to Java Cafe. Please take a seat and order.");
                System.out.println("\nWe're not in a Cafe? Is this what people call a \"Kid napping\"? But I am not a kid and I'm not asleep. What did you do to me?");
                System.out.println("\nYou just wanted to know some fun facts about Java and what version you're using? You could've said that from the beginning, bro.");
                System.out.println("\nApologies. I am not very good at communicating. Here is a 50% discount for your next purchase as an apology.");
                System.out.println("\nHere is your fun fact. Did you know that " + Fun_Facts_Colored + "\u001b[36m ");
                break;

            default:
                System.out.println("Wrong Input! Restarting...");
                main(args);
        }

    }
}
