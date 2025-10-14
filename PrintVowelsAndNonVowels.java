import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
	  
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string containing only alphabetic characters: ");
    String vowel = scanner.nextLine();
	  
    int returnedVowelNumber =
      getVowelNumber(vowel);
    if (returnedVowelNumber == 0) {
      System.out.println("There are no vowels!!!");
    } else {
      System.out.println("Amount of Vowels: " + returnedVowelNumber);
    }
  }
  
  public static int getVowelNumber(String vowel) {
	  
    int vowelNumber = 0;
    int aNumber = 0; // Move all these to globals?
    int eNumber = 0;
    int iNumber = 0;
    int oNumber = 0;
    int uNumber = 0;
    int otherNumber = 0;
    if (vowel == null) {
      return vowelNumber;
    }
	  
    String aString ="a";
    String eString = "e";
    String iString = "i";
    String oString = "o";
    String uString = "u";
	  
    for (int aIndex = vowel.indexOf(aString); // for "a".
      aIndex >= 0;
      aIndex = vowel.indexOf(aString, aIndex + 1)) {
        aNumber = aNumber + 1;
        vowelNumber = vowelNumber + 1;
    }
		
    for (int eIndex = vowel.indexOf(eString); // for "e".
      eIndex >= 0;
      eIndex = vowel.indexOf(eString, eIndex + 1)) {
        eNumber = eNumber + 1;
	vowelNumber = vowelNumber + 1;
    }
	  
    for (int iIndex = vowel.indexOf(iString); // for "i".
      iIndex >= 0;
      iIndex = vowel.indexOf(iString, iIndex + 1)) {
        iNumber = iNumber + 1;
        vowelNumber = vowelNumber + 1;
    }
		
    for (int oIndex = vowel.indexOf(oString); // for "o".
      oIndex >= 0;
      oIndex = vowel.indexOf(oString, oIndex + 1)) {
        oNumber = oNumber + 1;
        vowelNumber = vowelNumber + 1;
    }
	  
    for (int uIndex = vowel.indexOf(uString); // for "u".
      uIndex >= 0;
      uIndex = vowel.indexOf(uString, uIndex + 1)) {
        uNumber = uNumber + 1;
        vowelNumber = vowelNumber + 1;
    }
	  
    System.out.println("Instanes of 'a': " + aNumber);
    System.out.println("Instanes of 'e': " + eNumber);
    System.out.println("Instanes of 'i': " + iNumber);
    System.out.println("Instanes of 'o': " + oNumber);
    System.out.println("Instanes of 'u': " + uNumber);
    int len = vowel.length();
    int nonVowels = (len - vowelNumber);
    System.out.println("Instanes of non-vowels: " + nonVowels);
    return vowelNumber;
  }
}
