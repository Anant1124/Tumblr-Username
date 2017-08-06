import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/**
 * A program that projects question
 *
 * @author Anant Verma
 * @version v1.0
 */
public class UsernameTester extends UsernameCreator
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("\f");
        
        System.out.println("These are the list of usernames to choose from:");
        System.out.println("1. <Proper Noun> 'the' <Noun> (i.e. britian-the-conqueror)");
        System.out.println("2. 'the' <adjective> <noun> (i.e. the-blue-tomato)");
        System.out.println("3. <adjective> <adjective> <noun> (i.e. blue-american-potato)");
        System.out.println("4. 'the' <verb ending in -ing> <noun> (i.e. the-running-llama)");
        System.out.println("5. <verb ending in -ing> <adjective> <noun> (i.e. hopping-green-walnut)");
        System.out.println("6. <adjective> <verb ending in -ing> <noun> (i.e. burnt-eating-palace)");
        System.out.println("7. <adjective> <noun> <noun> (i.e. magical-post-nacho)");
        System.out.println("8. Random choice from the list above");
        
        int realChoice = 0;
        boolean going = true;
        System.out.println("What type of Username do you want?");
        int choice = s.nextInt();
        if (choice == 8) {
            realChoice = r.nextInt(6) + 1;
            going = false;
        }
        else if (choice <= 7) {
            realChoice = choice;
            going = false;
        }
        else {
            System.out.println("That's not a choice!");
        }
        
        
        makeUsernameQuestions(realChoice);
        
        System.out.println("\f");
        System.out.println("Be sure to put no spaces, capital letters, or any symbols EXCEPT for dashes!");
        s.nextLine();
        String firstQ = "the";
        if (getCat(1).equals("the")) {}
        else {
            System.out.println(getCat(1));
            firstQ = s.nextLine();
        }
        
        System.out.println("\f");
        System.out.println("Be sure to put no spaces, capital letters, or any symbols EXCEPT for dashes!");
        String secondQ = "the";
        if (getCat(2).equals("the")) {}
        else {
            System.out.println(getCat(2));
            secondQ = s.nextLine();
        }
        
        System.out.println("\f");
        System.out.println("Be sure to put no spaces, capital letters, or any symbols EXCEPT for dashes!");
        String thirdQ = "the";
        if (getCat(3).equals("the")) {}
        else {
            System.out.println(getCat(3));
            thirdQ = s.nextLine();
        }
        
        boolean dashGoing = true;
        boolean foundDash = false;
        while (dashGoing) {
            int i = 0;
            
            while (!foundDash || i < firstQ.length()) {
                if (i == firstQ.length() - 1) {
                    if ((firstQ.substring(i)).equals("-")) {
                        
                    }
                }
                i++;
            }
            while (!foundDash || i < secondQ.length()) {
                if (i - 1 != secondQ.length()) {
                    if (secondQ.substring(i, i + 1) == "-") {
                        foundDash = true;
                    }
                }
                else {
                    if (secondQ.substring(i) == "-") {
                        foundDash = true;
                    }
                }
                i++;
            }
            while (!foundDash || i < thirdQ.length()) {
                if (i - 1 != thirdQ.length()) {
                    if (thirdQ.substring(i, i + 1) == "-") {
                        foundDash = true;
                    }
                }
                else {
                    if (thirdQ.substring(i) == "-") {
                        foundDash = true;
                    }
                }
                i++;
            }
        }
        
        System.out.println("\f");
        boolean going2 = true;
        boolean yesDash = false;
        while (going2 && !foundDash) {
            System.out.println("Do you want dashes in your username?");
            System.out.println("(If you put dashes in one of your responses, answer yes)");
            String response = s.nextLine();
            if (response.equals("yes") || response.equals("Yes")) {
                going2 = false;
                yesDash = true;
            }
            else if (response.equals("no") || response.equals("No")) {
                going2 = false;
            }
            else {
                System.out.println("That's not a valid response!");
            }
        }
        
        String username = getUsername(firstQ, secondQ, thirdQ, yesDash);
        System.out.println("Your tumblr username is: " + username);
        System.out.println("Visit tumblr.com to sign up now!");
    }
}
