/*
    DATE: Jan 26, 2022
    Author: Brittany
*/

package student;

import java.util.Scanner;


public class Student {

    public static void main(String[] args) {
/*
        char[] myWord = new char[7];
        myWord[0] = 's';
        myWord[1] = 't';
        myWord[2] = 'u';
        myWord[3] = 'd';
        myWord[4] = 'e';
        myWord[5] = 'n';
        myWord[6] = 't';
        
        System.out.println("myWord:"+myWord.length);        //prints out length of array
        
        for (int i = 0; i<myWord.length; i++) {             //prints out the values listed in the array
            System.out.println(myWord[i]);
        }
        
        System.out.println("Printing in reverse");
        
        
        for (int i = myWord.length-1;i>=0; i--) {           //prints out the values listed in the array IN REVERSE
            System.out.println(myWord[i]);
        }
*/
        

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = input.nextLine();
        
        
        char[] myLetters = new char[word.length()] ;  
    
        for (int i = 0; i<myLetters.length; i++) {             
            myLetters[i]=word.charAt(i);                      //adds the characters to the array from the word
            
            System.out.println(myLetters[i]);
        }
    
    }
    
}
