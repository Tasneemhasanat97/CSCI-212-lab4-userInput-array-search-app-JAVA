import javax.swing.*;

public class lab4 {

	public static void main(String[] args) {
	
		String[] wordArray = { "bmw", "mercedes", "audi", "toyota", "honda", "nissan", "ford", "gmc", "ferrari", "porche", "kia" };
		String isOrIsNot, inputWord;
			
		// This line asks the user for input by popping out a single window
		// with text input
		
		inputWord = JOptionPane.showInputDialog(null, "Enter car company name in all lower case:");
		
		// if the inputWord is contained within wordArray return true
		
		if (wordIsThere(inputWord, wordArray)) 
			
			isOrIsNot = "is"; // set to is if the word is on the list
		else
			
			isOrIsNot = "is not"; // set to is not if the word is not on the list
		
		// Output to a JOptionPane window whether the word is on the list or not
		
		JOptionPane.showMessageDialog(null, "The car company " + inputWord + " " + isOrIsNot + " on the list :)");
	} //main function

	public static boolean wordIsThere(String findMe, String[] theList) {
		
		String s1 = findMe;
		String[] s2 = theList;
		
		for (int i=0; i<theList.length; i++) {
			if(s1.equals(s2[i]))
				return true;
		}
		return false;
		

		// Algorithm
		// 1. Iterate thru array to access list of elements/objs -> for loop
		// 2. Compare current element == to input or not
		// 3. If equal return true -> if statement
		// 4. move to next element
		// 5. repeat step 2 && 3 
		// 6. Return false
		
		// NOTE: In the function wordIsThere we don't have to call inputWord && wordArray anymore
		// NOTE: It is already assigned to findMe && theList
		// NOTE: Insted of assigning s1 && s2 we can directly use findMe && theList
		// NOTE: if(findMe.equals(theList[i]))
		// NOTE: ^ can iterate the loop with pointer i letter by letter comparsion
		
		
		
	} // wordIsThere function
} 