
public class StringCharacters {
	    public static void main(String[] args) {
	        String text = "To be or not to be, that is the question;"
	                    + " Whether `tis nobler in the mind to suffer"
	                    + " the slings and arrows of outrageous fortune,"
	                    + " or to take arms against a sea of troubles,"
	                    + " and by opposing end them?";int spaces = 0, vowels = 0, letters = 0;
	        for (char c : text.toCharArray()) {
	            if (Character.isLetter(c)) {
	                letters++;
	                char lowerChar = Character.toLowerCase(c);
	                if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || 
	                    lowerChar == 'o' || lowerChar == 'u') {
	                    vowels++;
	                }
} else if (Character.isWhitespace(c)) 
{
	                spaces++;
}
}
 System.out.println("The text contained vowels: " + vowels + "\n" + "Consonants: " + (letters - vowels) + "\n" + "Spaces: " + spaces);
}
}

