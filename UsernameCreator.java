import java.util.Random;
/**
 * Write a description of class TumblrRandomUsername here.
 *
 * @author Anant Verma
 * @version v1.0
 */
public class UsernameCreator
{
    //fields
    private static String[] catagory = {"", "", ""};
    private static Random r = new Random();
    
    //methods
    /**
     * Asks the user questions, then creates a username based on answers
     * @param typeOfUsername the way you want your username to be formatted
     * @since v1.0
     */
    public static void makeUsernameQuestions(int typeOfUsername) {
       String[][] question = {
           
           {
               "<Favorite Animal>",
               "<Common Nickname>",
               "<Name of First Pet>",
               "<Favorite Flavor>",
               "<Favorite Food>",
               "<Favorite Weapon>",
               "<Favorite Fandom Name (i.e. Potterhead)>",
               "<Group of People (i.e. Emo, Indian)>",
            }, 
        
            {
               "<Country You Live In>",
               "<State You Live In>",
               "<Common Nickname>",
               "<Species of Your Pet>",
               "<Name of Country Your Legal Guardian of Choice is From>",
               "<Your Ideal Vacation is to go To...>",
               "<Favorite Fruit>",
               "<Favorite Vegetable>"
           },
            
            {
                "<Favorite Activity>",
                "<Favorite Summer Hobby>",
                "<Favorite Winter Hobby>",
                "<Favorite Means of Transporation (i.e. Driving, Walking, Skipping)>"
            },
            
            {
                "<Gender>",
                "<Hot or Cold?>",
                "<Favorite Color>",
                "<Favorite Flavor>"
            }
        }; //0 is name, 1 is noun, 2 is verbs ending in -ing, 3 is adjectives
        
       if (typeOfUsername == 1) { // <Name> the <Noun>
           catagory[0] = question[0][r.nextInt(question[0].length)];
           catagory[1] = "the";
           catagory[2] = question[1][r.nextInt(question[1].length)];
        }
       else if (typeOfUsername == 2) { // the <adjective> <noun>
           catagory[0] = "the";
           catagory[1] = question[3][r.nextInt(question[3].length)];
           catagory[2] = question[1][r.nextInt(question[1].length)];
        }
       else if (typeOfUsername == 3) { // <adjective> <adjective> <noun>
           catagory[0] = question[3][r.nextInt(question[3].length)];
           catagory[1] = question[3][r.nextInt(question[3].length)];
           catagory[2] = question[1][r.nextInt(question[1].length - 1)];
        }
       else if (typeOfUsername == 4) { // the <verb ending in -ing> <noun>
           catagory[0] = "the";
           System.out.println(question[2].length - 1);
           catagory[1] = question[2][r.nextInt(question[2].length)];
           catagory[2] = question[1][r.nextInt(question[1].length)];
        }
       else if (typeOfUsername == 5) { // <verb ending in -ing> <adjective> <noun>
           catagory[0] = question[2][r.nextInt(question[2].length)];
           catagory[1] = question[3][r.nextInt(question[3].length)];
           catagory[2] = question[1][r.nextInt(question[1].length)];
        }
       else if (typeOfUsername == 6) { // <adjective> <verb ending in -ing> <noun>
           catagory[0] = question[3][r.nextInt(question[3].length)];
           catagory[1] = question[2][r.nextInt(question[2].length)];
           catagory[2] = question[1][r.nextInt(question[1].length)];
        }
       else if (typeOfUsername == 7) { // <adjective> <noun> <noun>
           catagory[0] = question[3][r.nextInt(question[3].length)];
           catagory[1] = question[1][r.nextInt(question[1].length)];
           catagory[2] = question[1][r.nextInt(question[1].length)];
        }
        }
    
    /**
     * returns the questions to be asked to the user
     * 
     * @param questionNum which question should be returned (one more than the index)
     * @since v1.0
     * @return the question that corresponds to the number in the parameters
     */
    public static String getCat(int questionNum) {
        return catagory[questionNum - 1];
    }
    
    /**
     * Uses inputs in the parameters to put together a username
     * 
     * @param firstW the first word in the username
     * @param secondW the second word in the username
     * @param thirdW the third word in the username 
     * @param yesDash whether the user wants dashes in their username or not
     * @since v1.0
     * @return the username
     */
    public static String getUsername(String firstW, String secondW, String thirdW, boolean yesDash) {
        if (!yesDash) {
            return firstW + secondW + thirdW;
        }
        else {
            return firstW + "-" + secondW + "-" + thirdW;
        }
    }
    }
