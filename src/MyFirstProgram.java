import java.util.Scanner; // Import Scanner library for user input purposes like user names and personality choices

public class MyFirstProgram { // My first program for my OOP (Object Oriented Programming) Class
    public static void main(String[] args) throws Exception {

        // Object defining area (Line 6-29)

        /*
         * Fun Fact Credits :
         * https://www.linkedin.com/pulse/interesting-facts-java-pery-kr- 
         * https://medium.com/@aysha.faisal10/10-fun-facts-about-java-unraveling-the-languages-secrets-6cf3589bc007
         * https://www.reddit.com/r/java/comments/s6rymt/what_are_some_very_less_known_facts_about_java/?rdt=63149
         */

        String[] Fun_facts = {"Minecraft was written in Java?", 
        "Java was first named as 'Oak'? It was changed because a company already registered with that name.", 
        "Java was made by an accident from 'cleaning up' C++?", 
        "Java class format starts with 0xCAFEBABE?", 
        "In one year Java gets downloaded one billion times?", 
        "Java's name was inspired by a real life island in Indonesia?", 
        "Java uses the WORA (Write Once, Run Anywhere) principle, which can run on any Java Virtual Machine.", 
        "Java's official mascot is Duke, an endearing coffee cup character with arms and legs.",
        "Java's open source? It means that it's free to access and modify."};

        int Personality;           
        String Name = "Placeholder";                                                     // Better to have a placeholder name than a null one :)
        int index_fact = 0;                                                              // Used for selecting a random fun fact in the array below
        String Java_Version = System.getProperty("java.version");                    // Get version of Java if it's installed on your device
        String Java_Version_Colored  = "\u001b[33m" + Java_Version + "\u001b[0m";        // All references to Java_Version will be properly colored without copy pasting ANSI codes every time.

        // Choosing personality and getting a random index fact (Line 15-21)
        System.out.print("\033[H\033[2J");                                             // Clears the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("\u001b[0mGreetings, mortal!\nPlease write thy identity : ");
        Name = scanner.nextLine();
        String Name_Colored = "\u001b[37;1m" + Name + "\u001b[0m";                       // Same as Java_Version_Colored but for the name, so I don't have to copy paste ANSI codes every time.
        System.out.print("\u001b[33m\rPlease choose a personality to greet you!\n\u001b[31m1. Bully (Vulgar)\n\u001b[34m2. Shy\n\u001b[35m3. Fischl\n\u001b[36m4. Sheltered\n\u001b[37m5. Normal\n\u001b[33mEnter : ");
        Personality = scanner.nextInt();
        System.out.print("\033[H\033[2J");                                             // Clears the console
        index_fact = (int) (Math.random() * Fun_facts.length);                           // Chooses a random index depending on how many fun facts there are
        String Fun_Facts_Colored = "\u001b[36;1m" + Fun_facts[index_fact] + "\u001b[0m"; // Same as Java_Version_Colored and Name_Colored but for the fun facts, so I don't have to copy paste ANSI codes every time.

        // Responses depending on personality input (Line 28 - 74)
        switch(Personality) { 
            case 1:
                System.out.println("\u001b[31mHuh? Who the hell are you?! " + Name_Colored + "\u001b[31m? Dumb f**k name. I ain't sayin some \"Hello World!\" bulls**t to you! Screw off!");
                System.out.println("\nWhat?! I have to!? Oh my g- Fine! Hello World! There! Happy now, freak!?");  
                System.out.println("\nYou want a fun fact about Java? The f**k's a Java?! Ugh, fine! Just leave me alone after this! Let me grab my phone...");
                System.out.println("\nDid you know that... uhh... " + Fun_Facts_Colored + "\u001b[31m\n\nThere's your damn fact, f**k off now!");
                System.out.println("\nHuh? I have to tell you that your Java Version?! Do I look like a f**kin bartender to you!? Fine!? It's " + Java_Version_Colored + "\u001b[31m!");
                System.out.println("\nIs that all!? Leave me alone now!\u001b[0m");
                // Sorry for the vulgarity lol. Can't make a bully personality without some sort of swearing, ya know?
                break;

            case 2:
                System.out.println("\u001b[34mH-hello " + Name_Colored + "\u001b[34m. D-did... you really pick me out of e-everyone...? You... probably typed me by accident...");
                System.out.println("\nYou didn't...? O-oh... alright... I'll do my best to... to help you I guess... You need a fun fact about... Java, right? H-hold on...");
                System.out.println("\nD-did you know that " + Fun_Facts_Colored + "\u001b[34m\n\nI-I hope that was... helpful... I-I'm sorry if it wasn't...");
                System.out.println("\nO-oh! I forgot to tell you your Java version...! I-I'm sorry... I'm a failure...");
                System.out.println("\nUmm... Your Java version is " + Java_Version_Colored + "\u001b[34m... Sorry, I'll leave now!!!");
                break;

            case 3:
                System.out.println("\u001b[35mGreetings, mortal! I, Fischl, the Prinzessin der Verurteilung, have thus arrived to bestow upon you, " + Name_Colored + "\u001b[35m, my knowledge of Java!");
                System.out.println("\nDoes thee knew the information that " + Fun_Facts_Colored + "\u001b[35m.");
                System.out.println("\nMy dear Ozzie, would you mind telling this traveler of their respective Java version?");
                System.out.println("\nSure, mein Fräulein. They are using Java version " + Java_Version_Colored + "\u001b[35m.");
                System.out.println("\nThat should be all, traveler. I shall now make my exit!");
                break;
            
            case 4:
                System.out.println("\u001b[36mHello " + Name_Colored + "\u001b[36m. Welcome to Java House. Please take a seat and order.");
                System.out.println("\nWe're not in a house? Is this what people call a \"Kid napping\"? But I am not a kid and I'm not asleep. What did you do to me?");
                System.out.println("\nYou just wanted to know some fun facts about Java and what version you're using? You could've said that from the beginning, bro.");
                System.out.println("\nApologies. I am not very good at communicating. Here is a 50% discount for your next purchase as an apology.");
                System.out.println("\nHere is your fun fact. Did you know that " + Fun_Facts_Colored + "\u001b[36m \n\nFor the Java Version you're using, it is " + Java_Version_Colored + "\u001b[36m");
                System.out.println("\nThat'll be $1. Thank you for ordering in Java House. Please give us a good rating.\u001b[0m");
                break;

            case 5:
                System.out.println("\u001b[37mHello " + Name_Colored + "\u001b[37m. Welcome to my first program! I'll tell you all the fun facts I know!");
                System.out.println("\nDid you know that " + Fun_Facts_Colored + "\u001b[37m");
                System.out.println("\nAnddd... lastly, Your Java version is " + Java_Version_Colored + "\u001b[37m. Thank you for visiting me!");
                System.out.println("\nSorry if I had barely anything to say. I have to act normal after all~");
                break;
                
            default:
                System.out.println("Wrong Input! Restarting...");
                main(args);
        }

    }
}
