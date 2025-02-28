import java.util.Scanner; // Import Scanner library for user input purposes like user names and personality choices

public class MyFirstProgram { // My first program for my OOP (Object Oriented Programming) Class
    public static void main(String[] args) throws Exception {

        // -- Variable defining area :O -- //

        /*
         * Fun Fact Credits :
         * https://www.linkedin.com/pulse/interesting-facts-java-pery-kr- 
         * https://medium.com/@aysha.faisal10/10-fun-facts-about-java-unraveling-the-languages-secrets-6cf3589bc007
         * https://www.reddit.com/r/java/comments/s6rymt/what_are_some_very_less_known_facts_about_java/?rdt=63149
         */

        // The holy array of fun facts...
        String[] Fun_facts = {"Minecraft was written in Java?", 
        "Java was first named as 'Oak'? It was changed because a company already registered with that name.", 
        "Java was made by an accident from 'cleaning up' C++?", 
        "Java class format starts with 0xCAFEBABE?", 
        "In one year Java gets downloaded one billion times?", 
        "Java's name was inspired by a real life island in Indonesia?", 
        "Java uses the WORA (Write Once, Run Anywhere) principle, where it can run on any Java Virtual Machine?", 
        "Java's official mascot is Duke, an endearing coffee cup character with arms and legs?",
        "Java's open source? It means that it's free to access and modify?",
        "Java is used by 95% of the enterprises as their primary language."};

        // This will used later for the fun facts to be colored without copy pasting ANSI codes repeatedly
        String Fun_Facts_Colored;

        // Bunch of Booleans to check if a personality has greeted you before or not
        boolean BullySeen = false;
        boolean ShySeen = false;
        boolean FischlSeen = false;
        boolean ShelteredSeen = false;
        boolean NormalSeen = false;

        // Boolean to keep program running, sets to false when user exits
        boolean Running = true;                                                             

        // Variables for the name input and which personality to choose
        int Personality;           
        String Name = "Placeholder";                                                         

        // Used later for selecting a random fun fact using array index
        int index_fact = 0;                                                                  
        
        // Variables for getting Java Version (This is an extra challenge added by my lecturer)
        String Java_Version = System.getProperty("java.version");         
        String Java_Version_Colored  = "\u001b[33m" + Java_Version + "\u001b[0m";         

        // -- Main Program Area -- //
        System.out.print("\033[H\033[2J");                                               
        Scanner scanner = new Scanner(System.in);
        System.out.print("\u001b[0mGreetings, mortal!\nPlease write thy identity : ");
        Name = scanner.nextLine();
        String Name_Colored = "\u001b[37;1m" + Name + "\u001b[0m";                        
        
        while (Running == true) {

            // Main Menu
            System.out.print("\n\u001b[33m\rPlease choose a personality to greet you!\nType 0 to exit!\n\u001b[31m1. Bully (Vulgar)\n\u001b[34m2. Shy\n\u001b[35m3. Fischl\n\u001b[36m4. Sheltered\n\u001b[37m5. Normal\n\u001b[33mEnter : ");
            
            // Detects if the input is an integer or not (Thank you ChatGPT)
            if (scanner.hasNextInt()) {
                Personality = scanner.nextInt();                                          
                index_fact = (int) (Math.random() * Fun_facts.length);                    
                Fun_Facts_Colored = "\u001b[36;1m" + Fun_facts[index_fact] + "\u001b[0m"; 

            } else {
                System.out.print("\033[H\033[2J");
                System.out.println("\u001b[31mInvalid input! Please enter a number from 0 to 5.\u001b[0m");
                scanner.next();                                                           
                continue; 
            }

            // Clears the console
            System.out.print("\033[H\033[2J");

            // Responses depending on personality input 
            switch(Personality) { 
                case 0:
                    System.out.println("See you in the flipside!\u001b[0m");
                    scanner.close();
                    Running = false;
                    break;

                case 1:
                    // Sorry for the vulgarity lol. Can't make a bully personality without some sort of swearing, ya know?
                    if (BullySeen == false) {
                        System.out.println("\u001b[31mHuh? Who the hell are you?! " + Name_Colored + "\u001b[31m? Dumb f**k name. I ain't sayin some \"Hello World!\" bulls**t to you! Screw off!");
                        System.out.println("\nWhat?! I have to!? Oh my g- Fine! Hello World! There! Happy now, freak!?");  
                        System.out.println("\nYou want a fun fact about Java? The f**k's a Java?! Ugh, fine! Just leave me alone after this! Let me grab my phone...");
                        System.out.println("\nDid you know that... uhh... " + Fun_Facts_Colored + "\u001b[31m\n\nThere's your damn fact, f**k off now!");
                        System.out.println("\nHuh? I have to tell you that your Java Version?! Do I look like a f**kin bartender to you!? Fine!? It's " + Java_Version_Colored + "\u001b[31m!");
                        System.out.println("\nIs that all!? Leave me alone now!\u001b[0m");
                        BullySeen = true;

                    } else {
                        System.out.println("\u001b[31mYou again, " + Name_Colored + "!?\u001b[31m You a f**kin stalker or something?! Ugh... You're paying for my cellular data bills after this!");
                        System.out.println("\nGosh darn data... so slow... Come on you stupid phone! LOAD ALREADY!");
                        System.out.println("\nFinally! Did you know that " + Fun_Facts_Colored + "\u001b[31m\n\nThere's your damn fact. Leave me alone now!");
                    }
                    break;

                case 2:
                    // I kinda cringed writing this one. Kinda funny though.
                    if(ShySeen == false) {
                        System.out.println("\u001b[34mH-hello " + Name_Colored + "\u001b[34m. D-did... you really pick me out of e-everyone...? You... probably typed me by accident...");
                        System.out.println("\nYou didn't...? O-oh... alright... I'll do my best to... to help you I guess... You need a fun fact about... Java, right? H-hold on...");
                        System.out.println("\nD-did you know that " + Fun_Facts_Colored + "\u001b[34m\n\nI-I hope that was... helpful... I-I'm sorry if it wasn't...");
                        System.out.println("\nO-oh! I forgot to tell you your Java version...! I-I'm sorry... I'm a failure...");
                        System.out.println("\nUmm... Your Java version is " + Java_Version_Colored + "\u001b[34m... Sorry, I'll leave now!!!");
                        ShySeen = true;

                    } else {
                        System.out.println("\u001b[34m" + Name_Colored + "\u001b[34m...? You're back...? You... must've been drunk to accidenally type me again...");
                        System.out.println("\nIt's okay... let me give you a fun fact...");
                        System.out.println("\nD-did you know that " + Fun_Facts_Colored + "\u001b[34m\n\nI-I hope that was... helpful... I-I'm sorry if it wasn't...");
                        System.out.println("\nAh! I almost forgot your Java version again...! It's " + Java_Version_Colored + "\u001b[34m... G-goodbye! I'm sorry!");
                    }
                    break;

                case 3:
                    // I, Fischl, the Prinzessin der Verurteilung, have thus arrived to bestow upon you, [Name], my knowledge of Java!
                    if (FischlSeen == false) {
                        System.out.println("\u001b[35mGreetings, mortal! I, Fischl, the Prinzessin der Verurteilung, have thus arrived to bestow upon you, " + Name_Colored + "\u001b[35m, my knowledge of Java!");
                        System.out.println("\nDoes thee knew the information that " + Fun_Facts_Colored + "\u001b[35m.");
                        System.out.println("\nMy dear Ozzie, would you mind telling this traveler of their respective Java version?");
                        System.out.println("\nSure, mein Fräulein. They are using Java version " + Java_Version_Colored + "\u001b[35m.");
                        System.out.println("\nThat should be all, traveler. I shall now make my exit!");
                        FischlSeen = true;

                    } else {
                        System.out.println("\u001b[35mAh, " + Name_Colored + "\u001b[35m! Fate has brough us together once more! You seek more knowledge of Java?");
                        System.out.println("\nFear not, for I, Fischl, the Prinzessin der Verurteilung, shall bestow upon you my knowledge once again!");
                        System.out.println("\nDoes thee knew the information that " + Fun_Facts_Colored + "\u001b[35m.");
                        System.out.println("\nMy dear Ozzie, would you mind telling this traveler of their respective Java version once more?");
                        System.out.println("\nSure, mein Fräulein. They are using Java version " + Java_Version_Colored + "\u001b[35m.");
                        System.out.println("\nThat should be all, traveler. I shall now make my exit!");
                    }
                    break;
                
                case 4:
                    // Sorry, got no comment on this
                    if (ShelteredSeen == false) {
                        System.out.println("\u001b[36mHello " + Name_Colored + "\u001b[36m. Welcome to Java House. Please take a seat and order.");
                        System.out.println("\nWe're not in a house? Is this what people call a \"Kid napping\"? But I am not a kid and I'm not asleep. What did you do to me?");
                        System.out.println("\nYou just wanted to know some fun facts about Java and what version you're using? You could've said that from the beginning, bro.");
                        System.out.println("\nApologies. I am not very good at communicating. Here is a 50% discount for your next purchase as an apology.");
                        System.out.println("\nHere is your fun fact. Did you know that " + Fun_Facts_Colored + "\u001b[36m \n\nFor the Java Version you're using, it is " + Java_Version_Colored + "\u001b[36m");
                        System.out.println("\nThat'll be $1. Thank you for ordering in Java House. Please give us a good rating on Yelp.\u001b[0m");
                        ShelteredSeen = true;
                    
                    } else {
                        System.out.println("\u001b[36mOh, it's you " + Name_Colored + "\u001b[36m. Welcome back to Java House, bro");
                        System.out.println("\nI am very sorry. I will work on my communicating skills better. Here is another 50% discount for your next purchase.");
                        System.out.println("\nHere is your fun fact. Did you know that " + Fun_Facts_Colored + "\u001b[36m \n\nFor the Java Version you're using, it is " + Java_Version_Colored + "\u001b[36m");
                        System.out.println("\nThat'll be 5 cents. Thank you for ordering in Java House. Please give us a good rating on Yelp.\u001b[0m");
                    }
                    break;

                case 5:
                    // I don't know what normal means in communication standards... so I wrote these below
                    if (NormalSeen == false) {
                        System.out.println("\u001b[37mHello " + Name_Colored + "\u001b[37m. Welcome to my first program! I'll tell you all the fun facts I know!");
                        System.out.println("\nDid you know that " + Fun_Facts_Colored + "\u001b[37m");
                        System.out.println("\nAnddd... lastly, Your Java version is " + Java_Version_Colored + "\u001b[37m. Thank you for visiting me!");
                        System.out.println("\nSorry if I had barely anything to say. I have to act normal after all~");
                        NormalSeen = true;

                    } else {
                        System.out.println("\u001b[37mHello again, " + Name_Colored + "\u001b[37m. Why did you come back to me? I'm not interesting at all.");
                        System.out.println("\nWell... if you insist... Did you know that " + Fun_Facts_Colored + "\u001b[37m");
                        System.out.println("\nAnddd... lastly, Your Java version is " + Java_Version_Colored + "\u001b[37m. Thank you for visiting me!");
                        System.out.println("\nSorry if I had barely anything to say again. I have to act normal after all~");
                    }
                    break;
                    
                default:
                    System.out.println("Please write from 0-5!");
                    break;

            }
        } 
    }
}