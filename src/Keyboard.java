import java.util.Scanner;

public class Keyboard {
    //method to handle expected integers on user input
    public int keyboardInt() {
        //initialize scanner
        Scanner input = new Scanner(System.in);
        //initialize value variable
        int value = 0;
        //initialize boolean and set to true
        boolean failedInt = true;
        //set while loop to loop until we get a usable input
        while (failedInt) {
            //initialize variable to save user input to
            String stringInt = input.nextLine();
            //try to fix an exception if user entered wrong input
            try {
                //attempt to parse input to an integer
                value = Integer.parseInt(stringInt);
                //change variable to end loop
                failedInt = false;
                //catch exception and alert user to invalid input
            } catch (NumberFormatException e) {
                System.out.print(stringInt + " is not a correct option, please enter a number: ");
            }
        }
        //return the successful value of users input
        
        return value;
    }

    
    // this method handles users inputs when expecting a string
    // passes in a prompt message to ask user for details
    public String keyboardStr() {
        //declare string to save users input
        String intString;
        //ask the user for their input
        
        //initialize scanner
        Scanner input = new Scanner(System.in);
        //initialize value and set start point to null
        String value = null;
        //initialize boolean and set to true for while loop
        boolean failedStr = true;
        //start while loop passing in condition
        while (failedStr) {
            //save variable to users input
            intString = input.nextLine();          
            
            //check for exception
            try {
                // checks if user entered a word or a word less then 50 characters and throws message if not
                if (intString == null || intString.length() == 0) {
                    throw new Exception("Must enter a word: ");
                }
                //attempt to convert possible integer into string
                value = String.valueOf(intString);
                //exit loop by changing condition to false
                failedStr = false;
            }
            //catch exception and prompt user if they entered an invalid response
            catch (NumberFormatException e) {
                System.out.print(intString + " is not a correct option, please enter a word: ");
                //catch thrown exception for not meeting parameters
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        //return the validated response      
        
        return value;
    }
    
}