package homework6_1;
/* 
 * Chapter No. 6    Excercise No. 1
 * File Name: HomeWork6_1.java
 * @author: Eric Schenck
 * Date: October 5, 2012
 * 
 * 
 * Problem Statement: All heights are in inches. Write a program that takes
 * as input the gender of the child, the height of the mother in inches, and the
 * height of the father in inches, and outputs the estimated height of the child
 * in inches. The program shall allow the user to enter a new set of values, 
 * and output the predicted height untill the user decides to exit. The user
 * should be able to input the heights in feet and inches and the program, shall
 * output the estimated height of the child in feet and inches. Use the int
 * data type to store the heights.
 * 
 * Formuals: makeChildHeight = ((mothersHeight * 13/12) + fathersHeight)/2
 * femaleChildHeight = ((fathersHeight * 12/130 + mothersHeight)/2
 *
 * Overall plan:
 * 1.) ask the user to enter whether they will use feet and inches, or just
 * inches as the method of measuring the height of all three subjects...
 * i.e. the child, the mother, and the father.
 * 2.) use a if/else statement to divide the program into either of the two
 * forms of measurement mentioned prior.
 * 3.) create a while loop, with a sentinel value of "exit" so the user
 * can exit the program, so the program will run until they type "exit".
 * 4.) ask the user to enter the gender of the child which they wish to find
 * the estimated height of.
 * 5.) create a if/else statement, one for a male child, the other a female.
 * 6.) in either case ask the user to input the height of the mother, followed
 * by the height of the father.
 * 7.) use the above formulas to calculate the estimated childs height,
 * Note: if the user chose to use feet and inches, i must first translate the 
 * value into inches in order to perform the calculation, and make sure to 
 * revert back to the feet/inches form when outputting the estimated height. 
 * 8.) after each final output, ask the user if they want to continue, and to 
 * enter the word "exit" if they so choose to end the program.
 *
 * P.S. Use JOptionPane, just because it looks so much nicer!
 */


//importing the JOptionPane window to use for input, and output
import javax.swing.JOptionPane;

//beggining of class HomeWork6_1
public class HomeWork6_1 
{

    //beggining of main
    public static void main(String[] args) 
    {
        
        //make string and define value to get into the while
        String userInput = "yes";
        
        
        //ask the user whether they will use feet/inches or just inches.
        String inchesOrFeet = JOptionPane.showInputDialog(null,
                               "Before we begin, would you like to enter all "
                               + "measurements in feet and inches?\nOr just "
                               + "inches?\nPlease enter 'feet' for the first "
                               + "option and 'inches' for the second:");
        
        
        //this if statement will be alloted for INCHES 
        if (inchesOrFeet.equalsIgnoreCase("inches"))
        {
        
        //will continue to run the program until sentinel value entered
        while (!"exit".equalsIgnoreCase(userInput))
        {
           
            //ask the user to input the gender of the child
            String childGender = JOptionPane.showInputDialog(null, "Please"
                    + " enter the childs gender\nMake sure to enter either"
                    + " Male or Female");
            
            
            //this section is used if male is chosen
            if (childGender.equalsIgnoreCase("male"))
            {
                 
                 
                 String mothersHeight = JOptionPane.showInputDialog(null,
                                "Now enter the height of the mother in inches");
                       
                 String fathersHeight = JOptionPane.showInputDialog(null, 
                               "Now enter the height of the father in inches");
                       
                 int heightOfMother = Integer.parseInt(mothersHeight);
                       
                 int heightOfFather = Integer.parseInt(fathersHeight);
                 
                 int malesHeight = ((heightOfMother * 13 / 12) 
                                                        + heightOfFather) / 2;
                 
                 JOptionPane.showMessageDialog(null, "By my calculations...\n"
                         + "The estimated height for your male child is: "
                         + malesHeight + " inches");
                 
                 
                 //ask the user whether the will continue or not
                 userInput = JOptionPane.showInputDialog(null, "Would you like "
                         + "to continue with estimations?\nPress any key "
                         + "to continue, or enter 'exit' to end the program.");
                       
            }//end of first if statement - inches - male - back to line 73
            
            //this section alloted for a female child
            else if (childGender.equalsIgnoreCase("female"))
            {
                String mothersHeight = JOptionPane.showInputDialog(null,
                                "Now enter the height of the mother in inches");
                       
                 String fathersHeight = JOptionPane.showInputDialog(null, 
                               "Now enter the height of the father in inches");
                       
                 int heightOfMother = Integer.parseInt(mothersHeight);
                       
                 int heightOfFather = Integer.parseInt(fathersHeight);
                 
                 int femalesHeight = ((heightOfFather * 12 / 13) 
                                                        + heightOfMother) / 2;
                
                 JOptionPane.showMessageDialog(null, "By my calculations...\n"
                         + "The estimated height for your female child is: "
                         + femalesHeight + " inches");
                 
                 userInput = JOptionPane.showInputDialog(null, "Would you like "
                         + "to continue with estimations?\nPress any key "
                         + "to continue, or enter 'exit' to end the program.");
            
            }//end of second if statement - inches - female - back to line 73
            
            //section used for wrong input
            else
            {
                JOptionPane.showMessageDialog(null, "Im sorry, but you must"
                        + " have entered incorrectly.\nPlease try again.");
            
            }//end of else - incorrect entry - back to asking childs gender
                                    // back to line 73
       
        }//end of first while statement - section for inches
                
        
        JOptionPane.showMessageDialog(null, "Goodbye");
        
        }// end of if "inches"
        
        else if (inchesOrFeet.equalsIgnoreCase("feet"))
        {
            while (!"exit".equalsIgnoreCase(userInput))
        {
           
            //ask the user to input the gender of the child
            String childGender = JOptionPane.showInputDialog(null, "Please"
                    + " enter the childs gender\nMake sure to enter either"
                    + " Male or Female");
            
            
            //this section is used if male is chosen
            if (childGender.equalsIgnoreCase("male"))
            {
                 
                 
                String mothersHeightInFeet = JOptionPane.showInputDialog(null,
                                "First, enter the mothers height in feet:\n"
                         + "Note: I will prompt you for the remaining inches");
                 
                String mothersHeightInInch = JOptionPane.showInputDialog(null,
                         "Now, enter the remain inches for the mothers "
                         + "height:");
                       
                String fathersHeightInFeet = JOptionPane.showInputDialog(null, 
                               "Enter the fathers height in feet:\n"
                         + "Note: I will prompt you for the remaining inches");
                 
                String fathersHeightInInch = JOptionPane.showInputDialog(null,
                         "Now, enter the ramaining inches for the fathers"
                         + " height:");
                         
                 
                int heightOfMotherFeet = Integer.parseInt(mothersHeightInFeet);
                 
                int heightOfMotherInch = Integer.parseInt(mothersHeightInInch);
                 
                int heightOfFatherFeet = Integer.parseInt(fathersHeightInFeet);
                 
                int heightOfFatherInch = Integer.parseInt(fathersHeightInInch);
                 
                 
                int mothersFinalHeight;
                mothersFinalHeight = (heightOfMotherFeet * 12) 
                                                        + heightOfMotherInch;
                
                int fathersFinalHeight;
                fathersFinalHeight = (heightOfFatherFeet * 12) 
                                                        + heightOfFatherInch;
                 
                int malesHeight = ((mothersFinalHeight * 13 / 12) 
                        + fathersFinalHeight) / 2;
                
                
                int malesHeightInFeet = (malesHeight / 12);
                
                int malesHeightInInch = (malesHeight % 12);
                 
                JOptionPane.showMessageDialog(null, "By my calculations...\n"
                         + "The estimated height for your male child is: "
                         + malesHeightInFeet + " feet, and " 
                         + malesHeightInInch + " inch(es)");
                 
                 
                 //ask the user whether the will continue or not
                 userInput = JOptionPane.showInputDialog(null, "Would you like "
                         + "to continue with estimations?\nPress any key "
                         + "to continue, or enter 'exit' to end the program.");
                       
            }//end of first if statement - feet - male - back to line 156
            
            //this section alloted for a female child
            else if (childGender.equalsIgnoreCase("female"))
            {
                 String mothersHeightInFeet = JOptionPane.showInputDialog(null,
                                "First, enter the mothers height in feet:\n"
                         + "Note: I will prompt you for the remaining inches");
                 
                String mothersHeightInInch = JOptionPane.showInputDialog(null,
                         "Now, enter the remain inches for the mothers "
                         + "height:");
                       
                String fathersHeightInFeet = JOptionPane.showInputDialog(null, 
                               "Enter the fathers height in feet:\n"
                         + "Note: I will prompt you for the remaining inches");
                 
                String fathersHeightInInch = JOptionPane.showInputDialog(null,
                         "Now, enter the ramaining inches for the fathers"
                         + " height:");
                         
                 
                int heightOfMotherFeet = Integer.parseInt(mothersHeightInFeet);
                 
                int heightOfMotherInch = Integer.parseInt(mothersHeightInInch);
                 
                int heightOfFatherFeet = Integer.parseInt(fathersHeightInFeet);
                 
                int heightOfFatherInch = Integer.parseInt(fathersHeightInInch);
                
                
                
                int mothersFinalHeight;
                mothersFinalHeight = (heightOfMotherFeet * 12) 
                                                        + heightOfMotherInch;
                
                int fathersFinalHeight;
                fathersFinalHeight = (heightOfFatherFeet * 12) 
                                                        + heightOfFatherInch;
                 
                 
                int femalesHeight = ((fathersFinalHeight * 12 / 13) 
                        + mothersFinalHeight) / 2;
                
                
                int femalesHeightInFeet = (femalesHeight / 12);
          
                
                int femalesHeightInInch = (femalesHeight % 12);
                 
                JOptionPane.showMessageDialog(null, "By my calculations...\n"
                         + "The estimated height for your female child is: "
                         + femalesHeightInFeet + " feet, and " 
                         + femalesHeightInInch + " inch(es)");
                 
                 
                 //ask the user whether the will continue or not
                 userInput = JOptionPane.showInputDialog(null, "Would you like "
                         + "to continue with estimations?\nPress any key "
                         + "to continue, or enter 'exit' to end the program.");
            
            }//end of second if statement - feet - female - back to line ^156
            
            //section used for wrong input
            else
            {
                JOptionPane.showMessageDialog(null, "Im sorry, but you must"
                        + " have entered incorrectly.\nPlease try again.");
            
            }//end of else - incorrect entry - back to asking childs gender ^156
       
        }//end of second while statement - section for feet 
            
            JOptionPane.showMessageDialog(null, "Goodbye");
            
        }//end of else if ("feet")
        else
        {
            JOptionPane.showMessageDialog(null, "Im sorry you must have"
                    + " entered incorrectly, because I did not understand"
                    + " your input.\nPlease re-start the program, and try "
                    + "again.\nThank you and sorry for the inconvenience.");
        
        }//end of wrong input else statement
    }//end of main 
}//end of class HomeWork6-1
