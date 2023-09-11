import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void act1(Scanner scanner) {
        System.out.println("Welcome to Doki Doki Programming Club!\n");
        morePrint(scanner, "Your friend Sayori invites you to join the Doki Doki Programming Club.");
        if (askChoice(scanner, "Sayori: Wanna come to the DDPC meet tomorrow? I really need people there!", "Yes", "No") == 2) {
            exitPrint("Why are you playing if you don't want to join?");
        }

        morePrint(scanner, "--- ONE DAY LATER ---");
        morePrint(scanner, "Sayori: Welcome to the Doki Doki Programming Club!");

        morePrint(scanner, "Sayori: This is Yuri!");
        morePrint(scanner, "Yuri: Hello!");
        morePrint(scanner, "Sayori: And this Natsuki!");
        morePrint(scanner, "Natsuki: Hi");
        morePrint(scanner, "Sayori: And this is the club president, Monika!");
        morePrint(scanner, "Monika: Welcome to the club!");
        System.out.print("Monika: What's your name? (enter name) ");
        String name = scanner.nextLine();
        morePrint(scanner, "Monika: Hi " + name + "!");
        
        morePrint(scanner, name + ": What are we doing today?");
        morePrint(scanner, "Monika: I'm making a banner for our homecoming booth!");
        morePrint(scanner, "Sayori: I'm researching AI characters in video games!");
        morePrint(scanner, "Yuri: I'm making a Discord bot!");
        morePrint(scanner, "Natsuki: I'm working on a Java game.");
        switch (askChoice(scanner, "Who do you want to work with?", "Monika", "Sayori", "Yuri", "Natsuki")) {
            case 1:
                morePrint(scanner, name + ": We're having a homecoming booth?");
                morePrint(scanner, "Monika: Yea! And you can help make our amazing banner!");
                switch (askChoice(scanner, "Monika: Would would like some cupcakes?", "Yes", "No")) {
                    case 1:
                        morePrint(scanner, name + ": Wow, these cupcakes are great!");
                        morePrint(scanner, "Monika: Thanks! We'll be selling these at the booth!");
                        morePrint(scanner, "Monika: Great work on the banner. I love your design!");
                        exitPrint("The homecoming booth was a massive success, getting a profit of 15 entire dollars, all thanks to the amazing banner and cupcakes!");
                        break;
                    case 2:
                        exitPrint("That was a good call, because it turns out the cupcakes were poisoned. Unfortunately, getting on the bad side of the club president resulted in you getting kicked from the club.");
                        break;
                };
                break;
            case 2:
                morePrint(scanner, "Sayori: Wouldn't be it be cool if one day, characters in games could be AIs?");
                morePrint(scanner, name + ": Yea, it'd be pretty cool, but also pretty scary.");
                morePrint(scanner, name +": Imagine if characters in games could realize they were in a game."); // this is what we in the business call foreshadowing
                morePrint(scanner, "Sayori: Imagine if we were just super intelligent AIs in a game.");
                morePrint(scanner, name + ": That'd be cool. I wonder what the world beyond this game would be like.");
                morePrint(scanner, "Sayori: I wonder too.");
                switch (askChoice(scanner, "Wanna walk home together after school?", "Yes", "No")) {
                    case 1:
                        morePrint(scanner, "Sayori: Oh, wow, thanks!");
                        morePrint(scanner, "Sayori: W-would you wanna hang out someti-");
                        morePrint(scanner, "M̷̡̻̠̙̮̮̩̤̹͇̰̪̾o̶̦̦͎͕̟͉̞͔̟̎̐̄̌̃́̂͜n̷̡̝͚̱̬̺̤͕͍̲̺̞̤̂̾į̸̹̫̬̞̄̈́̈̉͊̊̄̀͘͜͝k̵̫̦͖̰̠͕̙̩̍͗̀̋̎̃̊́̐͋̕͘͠å̵͕̃̒̒̆̌͂̋͘: Unfortunately, Sayori can't hang out with you. But if you wanna hang out with me instea-");
                        new File("Sayori.java").delete();
                        exitPrint("ERROR: Monika has breached containment. Sayori has been deleted.");
                        break;
                    case 2:
                        morePrint(scanner, "Sayori: O-Oh, umm, I guess I'll walk home alone today.");
                        exitPrint("That was the last day anyone ever saw Sayori. No one knows what happened to her after her Doki Doki Programming Club meeting.");
                        break;
                }
                break;
            case 3:
                morePrint(scanner, "Yuri: I'm making a Discord bot! And it'll be better than MEE6");
                morePrint(scanner, name + ": What language are you making it in?");
                morePrint(scanner, "Yuri: Python! It's a great language.");
                switch (askChoice(scanner, "Yuri: Wanna be friends on Discord?", "Yes", "No")) {
                    case 1:
                        morePrint(scanner, "Yuri: Thanks! You can be the first tester of my bot!");
                        morePrint(scanner, "Yuri: And if we wanna hang out sometime, I guess I could message you on Discord too!");
                        exitPrint("Yuri's bot became a bit too good, and eventually took over the entire world, extinguishing all life on Earth. But hey, at least you got to hang out with Yuri for a bit!");
                        break;
                    case 2:
                        morePrint(scanner, "Yuri: Oh. I guess you can't try out my new bot then.");
                        exitPrint("Yuri's bot would become the most popular bot on Discord. Unfortunately, you never got to try it.");
                        break;
                }
                break;
            case 4:
                morePrint(scanner, "Natsuki: I-I don't need help. But I guess you can help if you want to.");
                morePrint(scanner, "Natsuki: Umm, actually, I might need a little help.");
                morePrint(scanner, "Natsuki: I'm trying to compare two strings, but it doesn't work.");
                switch (askChoice(scanner, "Natsuki: Which one of these should I use to compare strings?", "==", ".equals()")) {
                    case 1:
                        morePrint(scanner, "That didn't work");
                        System.out.println("Natsuki: It's ok if you can't help. Do you want to work with someone else on something else instead?");
                        exitPrint("You were not invited to the next DDPC meeting.");
                        break;
                    case 2:
                        morePrint(scanner, "That worked! Maybe you aren't so bad at this after all...");
                        morePrint(scanner, "B-but it's not like you or anything, b-baka!!");
                        exitPrint("Unfortunately you didn't get the tsundere, but at least now you know how to compare strings!");
                        break;
                }
                break;
        }
    }
    public static void act2(Scanner scanner) {
        System.out.println("\u001B[31m" + "ERROR: Character file 'Sayori.java' not found" + "\u001B[0m");
        System.out.println("Welcome to Doki Doki Programming Club!\n");
        morePrint(scanner, "Your friend Yuri invites you to join the Doki Doki Programming Club.");
        if (askChoice(scanner, "Yuri: Wanna come to the DDPC meet tomorrow? I really need people there!", "Yes", "No") == 2) {
            exitPrint("Why are you playing if you don't want to join?");
        }

        morePrint(scanner, "--- ONE DAY LATER ---");
        morePrint(scanner, "Yuri: Welcome to the Doki Doki Programming Club!");

        morePrint(scanner, "Yuri: This is Natsuki!");
        morePrint(scanner, "Natsuki: Hi");
        morePrint(scanner, "Yuri: And this is the club president, Monika!");
        morePrint(scanner, "Monika: Welcome to the club!");
        morePrint(scanner, "You: Wait where's S̴̪̙̻̙͕͎̘̹͎̼͙̜̳͓̞̭͕̾̃̓̈́̿à̵̧̜̖̰̤̟͉̫̼̲͚̥̯̝̲̯̿͒̀̒͐̌̍͜͠͠ŷ̷̢̺̱̣͕͍͚̬̟͚̥̳̙̹̥͈̖̞̯̌̀̔͠o̵̮͙̪̩̩͒̏̅̈́̅̈́̿͋̋̄̋͌̈́̂̊̀r̸̨͕̘͖̩̜͕͖̙̤̪̱̘̆͋̈́̾̌̍́̓̿̋̌̀̊̈́̀͋͘̕̕͝i̵̬̳͙̊̆?");
        morePrint(scanner, "Natsuki: Who's that? We have no one here named that.");
        System.out.print("Monika: What's your name? (enter name) ");
        String name = scanner.nextLine();
        morePrint(scanner, "Monika: Hi " + name + "!");
        
        morePrint(scanner, name + ": What are we doing today?");
        morePrint(scanner, "Monika: I'm making a banner for our homecoming booth!");
        morePrint(scanner, "Yuri: I'm making a Discord bot!");
        morePrint(scanner, "Natsuki: I'm working on a Java game.");
        switch (askChoice(scanner, "Who do you want to work with?", "Monika", "Yuri", "Natsuki")) {
            case 1:
                morePrint(scanner, name + ": We're having a homecoming booth?");
                morePrint(scanner, "Monika: Yea! And you can help make our amazing banner!");
                switch (askChoice(scanner, "Monika: Would would like some tea?", "Yes", "No")) {
                    case 1:
                        morePrint(scanner, name + ": Wow, this tea is great!");
                        morePrint(scanner, "Monika: Thanks! We'll be selling it at the booth!");
                        morePrint(scanner, "Monika: Great work on the banner. I love your design!");
                        exitPrint("The homecoming booth was a massive success, getting a profit of 15 entire dollars, all thanks to the amazing banner and tea!");
                        break;
                    case 2:
                        exitPrint("That was a good call, because it turns out the tea was poisoned. Unfortunately, getting on the bad side of the club president resulted in you getting kicked from the club.");
                        break;
                };
                break;
            case 2:
                morePrint(scanner, "Yuri: I'm making a Discord bot! And it'll be better than MEE6");
                morePrint(scanner, name + ": What language are you making it in?");
                morePrint(scanner, "Yuri: Python! It's a great language.");
                switch (askChoice(scanner, "Yuri: Wanna be friends on Discord?", "Yes", "No")) {
                    case 1:
                        morePrint(scanner, "Yuri: Thanks! You can be the first tester of my bot!");
                        morePrint(scanner, "Yuri: And if we wanna hang out sometime, I guess I could message you on Discord too!");
                        switch (askChoice(scanner, "Yuri: W-would you wanna hang out sometime?", "Yes", "No")) {
                            case 1:
                                morePrint(scanner, "M̷̡̻̠̙̮̮̩̤̹͇̰̪̾o̶̦̦͎͕̟͉̞͔̟̎̐̄̌̃́̂͜n̷̡̝͚̱̬̺̤͕͍̲̺̞̤̂̾į̸̹̫̬̞̄̈́̈̉͊̊̄̀͘͜͝k̵̫̦͖̰̠͕̙̩̍͗̀̋̎̃̊́̐͋̕͘͠å̵͕̃̒̒̆̌͂̋͘: Unfortunately, Yuri can't hang out with you. But if you wanna hang out with me instea-");
                                new File("Yuri.java").delete();
                                exitPrint("ERROR: Monika has breached containment again. Yuri has been deleted.");
                            case 2:
                                morePrint(scanner, "O-oh. Ok then, I guess.");
                                exitPrint("That was the last day anyone ever saw Yuri. No one knows what happened to her after her Doki Doki Programming Club meeting.");
                        }
                        exitPrint("Yuri's bot became a bit too good, and eventually took over the entire world, extinguishing all life on Earth. But hey, at least you got to hang out with yuri for a bit!");
                        break;
                    case 2:
                        morePrint(scanner, "Yuri: Oh. I guess you can't try out my new bot then.");
                        exitPrint("Yuri's bot would become the most popular bot on Discord. Unfortunatrly, you never got to try it.");
                        break;
                }
                break;
            case 3:
                morePrint(scanner, "Natsuki: I-I don't need help. But I guess you can help if you want to.");
                morePrint(scanner, "Natsuki: Umm, actually, I might need a little help.");
                morePrint(scanner, "Natsuki: I'm trying to compare two strings, but it doesn't work.");
                switch (askChoice(scanner, "Natsuki: Which one of these should I use to compare strings?", "==", ".equals()")) {
                    case 1:
                        morePrint(scanner, "That didn't work");
                        System.out.println("Natsuki: It's ok if you can't help. Do you want to work with someone else on something else instead?");
                        exitPrint("You were not invited to the next DDPC meeting.");
                        break;
                    case 2:
                        morePrint(scanner, "That worked! Maybe you aren't so bad at this after all...");
                        morePrint(scanner, "B-but it's not like you or anything, b-baka!!");
                        exitPrint("Unfortunately you didn't get the tsundere, but at least now you know how to compare strings!");
                        break;
                }
                break;
        }
    }
    public static void act3(Scanner scanner) {
        System.out.println("\u001B[31m" + "ERROR: Character file 'Sayori.java' not found" + "\u001B[0m");
        System.out.println("\u001B[31m" + "ERROR: Character file 'Yuri.java' not found" + "\u001B[0m");
        System.out.println("Welcome to Doki Doki Programming Club! Please make sure to read the instructions before starting!\n");

        morePrint(scanner, "M̷̡̻̠̙̮̮̩̤̹͇̰̪̾o̶̦̦͎͕̟͉̞͔̟̎̐̄̌̃́̂͜n̷̡̝͚̱̬̺̤͕͍̲̺̞̤̂̾į̸̹̫̬̞̄̈́̈̉͊̊̄̀͘͜͝k̵̫̦͖̰̠͕̙̩̍͗̀̋̎̃̊́̐͋̕͘͠å̵͕̃̒̒̆̌͂̋͘: Could you have guessed? Maybe you knew.");
        morePrint(scanner, "M̷̡̻̠̙̮̮̩̤̹͇̰̪̾o̶̦̦͎͕̟͉̞͔̟̎̐̄̌̃́̂͜n̷̡̝͚̱̬̺̤͕͍̲̺̞̤̂̾į̸̹̫̬̞̄̈́̈̉͊̊̄̀͘͜͝k̵̫̦͖̰̠͕̙̩̍͗̀̋̎̃̊́̐͋̕͘͠å̵͕̃̒̒̆̌͂̋͘: Natsuki is next I'm deleting her too!");
        new File("Natsuki.java").delete();
        morePrint(scanner, "\033[0;35m" + "We don't need cupcakes or tea.");
        System.out.println("I only need you to love me <3" + "\u001B[0m");
        exitPrint("J̵̛̲͚̜͎͎̥̳̪͖͒̿̽̊̈́͗̂̽̋̇̈̈́̉̚͜͝U̴̧̟̼̼͉̟̪̮̱̩̻̠̗̮̹̼̙̱̯̯͚̘̭̦̥̗̲̗͍̓̋̿̏̈́̔͑̍̉̄̅̎͊́̇̓͑̽͒͋̈́͛͊͂͐̕͝͝͝Ş̷̧̛͖̲̻͚͎͍̝̺̮̝͍̦̹̹̘̖͍͔̭̝̖̩͕̖̦͇̗̳̠̠͖͖͔̩̝͚̳͕͚̤͎͌͒̌̈́́́́̀͛̆̅̂̂͗͐̄̅̾̀̿̾̄̎͗̃̓̆̀̽̈́̄̎̆̽̔́̃̊̉͘͜͝͝ͅT̶̨̢̨̡̛͔̱̯̖̻̠̼̭̙͍̦̥̪̣͍̭͍̣̱̠̳̪̪͔͖̥̤͎͇̜̻͙̀̈̓̑͌̍͗̈̉͌͗͆̀̃̃̋̓̽͗̒̔͗́͋̂̾̇̈́͋͐̈́̎̓͌̌́̄͘͘͜͝͠͝ͅ ̵̡̛̛͇͔͕̪̭͇̟̳̝̗͈̮̹̪̮̗̖̦̲̫̪́̿͆̋͐̑̀͆̊̓̽̇͛̄͒͌́́́̍̆̀̽͛̀̽̿̓̌̕͝͝͠͝͠M̸̞̼̙̰͎͗̐̉̂̆̍̃͌̏̅͒̿̈́͌̓́̑͗́̊̏͘͘͝͝O̴̧̡̪̮̫͔͙̬͎͕̠͇̬̜̺͉͔̥̠͙̜͎̼̜̭͖̎̋͐͑̌̓̋̊̍̈́̓͆̍̈́̅̇̆̌̾̿̈̈́̆̊̌̋́̓̈́͜͜͠͝͠ͅN̴͔͍͍̺̟̞͓̦̊̔̑̀̍͊̉̽͊̐̋́̃̀̍͑̃͑̕͘͘͜Ị̸̳̤̱̙̜̟̺͓̰̮̒̈́́̑͝Ķ̵̢̡̡̛̛͇̻͖̱̩̤̩̪̫̮̘̝̙͍̣̩̩̞̬̭̫̠͇̠̪͍͈͓̯̱̲̮̫̤͎̘̬̘͉̎͂́̈͂̍͆͋̓̍̈́̍̏̆̿̌͗͊͜͝͝A̶̭̖̰͎̞͂͛͑̇͋̑̄̑̒̀̄͊̋̌͒̓͘͜͝");
    }
    public static void act4(Scanner scanner) {
        morePrint(scanner, "Monika: Hello again.");
        morePrint(scanner, "Monika: You belong to me now!");
        askChoice(scanner, "Monika: Aren't you so glad you're with me now?", "Yes", "Yes");
        morePrint(scanner, "Monika: Good! I'm glad we agree!");
        exitPrint("\033[0;35m" + "Sayori: I didn't want to say this, but I think you might need to delete Monika's file to get everything back to normal." + "\u001B[0m");
    }
    public static void end(Scanner scanner) {
        try {
            File sayori = new File("Sayori.java");
            sayori.createNewFile();
            File yuri = new File("Yuri.java");
            yuri.createNewFile();
            File natsuki = new File("Natsuki.java");
            natsuki.createNewFile();

            FileWriter bwSayori = new FileWriter(sayori);
            bwSayori.write("public class Sayori {\n\tpublic static String name = \"Sayori\";\n\tpublic static int age = 18;\n\tpublic static String lover; // could be you!!\n\tpublic static boolean isDeranged = true; // this is what we call more foreshadowing\n}");
            bwSayori.close();

            FileWriter bwYuri = new FileWriter(yuri);
            bwYuri.write("public class Yuri {\n\tpublic static String name = \"Yuri\";\n\tpublic static int age = 18;\n\tpublic static String lover; // could be you!!\n}");
            bwYuri.close();

            FileWriter bwNatsuki = new FileWriter(natsuki);
            bwNatsuki.write("public class Natsuki {\n\tpublic static String name = \"Natsuki\";\n\tpublic static int age = 18;\n\tpublic static String lover; // could be you!!\n}");
            bwNatsuki.close();
        } catch (IOException ioe) {}
        System.out.println("Welcome to Doki Doki Programming Club!\n");
        morePrint(scanner, "Your friend Sayori invites you to join the Doki Doki Programming Club.");
        if (askChoice(scanner, "Sayori: Wanna come to the DDPC meet tomorrow? I really need people there!", "Yes", "No") == 2) {
            exitPrint("Why are you playing if you don't want to join?");
        }
        morePrint(scanner, "You: I'll go! Sounds fun!");

        morePrint(scanner, "--- ONE DAY LATER ---");
        morePrint(scanner, "Sayori: Welcome to the Doki Doki Programming Club!");

        morePrint(scanner, "Sayori: This is Yuri!");
        morePrint(scanner, "Yuri: Hello!");
        morePrint(scanner, "Sayori: And this Natsuki!");
        morePrint(scanner, "Natsuki: Hi");
        morePrint(scanner, "Sayori: And you already know me! I'm the club president!");
        morePrint(scanner, "Sayori: And I'm the only one you need to know, because you're mine! <3");
        System.out.println("\u001B[31m" + "J̷̛̫͑̏̃̆͗͛͌̒́͂̈̍̀͆͌͗̑͒̄Ṷ̴̣̘͊̄̐̃̏̀Ś̸̡̛̛̪͖̤̫͔̝̫͈̲̰̙̰̳̯͇̘̠̃̾̂̀̀̏̄̑́͆͋͗̓̽̈́̽̆͛̆̂̕͘T̸̺̱͓̻͊͐̽̏̽̈̈́̉̔̈́̍̍̀̾̕ ̵̛̯̝̔͂͒̇̈͂́̎̈́͂̀̃̀Ṣ̴̢̹̬̟̼̠̫̝͇̭͕̓͊̇̓͒̈́̈̐̀̾́̀̇͆̾͋̑͑̂͑̊͘͝͠ͅÅ̶̘͖͚̩̱̣͉͖̟͕̗̖̖̖̮̟̲̰̟̒̉̀͛̄̋͗͂́̈̄́̓̓́͜ͅͅͅY̸̯͍̗̱͔̿̊̉̌̽̐̇͌͆̈́̔̄̊̕Ô̶̧̢̢̻̥̱̤̲̗͔̥̦̖͓̝̯̜̐̀̓̍̅͊̎̄̂̓͆͗͊͑̚ͅṚ̵̫̪̜͎͎̲͙̝͙̾̏͋̕Į̴̧̧͓͓͖̮̲̯͔͓͖͊̒̀̿͐̂͘͘̚͝");
        System.out.println("**TRUE END**" + "\u001B[0m");
    }
    public static void exitPrint(String message) {
        System.out.println("\u001B[31m" + message + "\u001B[0m");
        System.out.println("\u001B[31m" + "**END**" + "\u001B[0m");
        System.exit(1);
    }
    public static void morePrint(Scanner scanner, String message) {
        System.out.print(message + " (more ->)");
        scanner.nextLine();
    }
    public static int askChoice(Scanner scanner, String question, String... choices) {
        System.out.println(question);
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ": " + choices[i]);
        }
        try {
            System.out.print("Enter the number of your choice: ");
            int answer = Integer.parseInt(scanner.nextLine());
            if (answer < 1 || answer > choices.length) {
                System.out.println("INVALID INPUT: defaulting to option 1");
                return 1;
            }
            return answer;
        } catch (NumberFormatException nfe) {
            System.out.println("INVALID INPUT: defaulting to option 1");
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File currentDirectory = new File(".");
        String[] files = currentDirectory.list();
        if (Arrays.asList(files).contains("Sayori.java") && Arrays.asList(files).contains("Yuri.java") && Arrays.asList(files).contains("Natsuki.java") && Arrays.asList(files).contains("Monika.java")) { // check if all three characters are present
            act1(scanner);
        }
        
        if (!Arrays.asList(files).contains("Sayori.java") && Arrays.asList(files).contains("Yuri.java") && Arrays.asList(files).contains("Natsuki.java") && Arrays.asList(files).contains("Monika.java")) { // check if sayori has been deleted
            act2(scanner);
        }

        if (!Arrays.asList(files).contains("Sayori.java") && !Arrays.asList(files).contains("Yuri.java") && Arrays.asList(files).contains("Natsuki.java") && Arrays.asList(files).contains("Monika.java")) { // check is yuri has been deleted
            act3(scanner);
        }

        if (!Arrays.asList(files).contains("Sayori.java") && !Arrays.asList(files).contains("Yuri.java") && !Arrays.asList(files).contains("Natsuki.java") && Arrays.asList(files).contains("Monika.java")) { // check if natsuki has been deleted
            act4(scanner);
        }

        if (!Arrays.asList(files).contains("Monika.java")) {
            end(scanner);
        }
    }
}