package summerSeven;

public class Text {
	static final char[] punctuation = { //pretty much all non-letter characters, from tilde to line return/tab.
			'~',
			'`',
			'_',
			'-',
			'+',
			'=',
			'{',
			'[',
			'}',
			']',
			'|',
			'\\',
			':',
			';',
			'"',
			'\'',
			'<',
			',',
			'>',
			'.',
			'?',
			'/',
			' ',
			'\n',
			'\t'
	};

	Text(){}
	
	/**
	 * Tests {@link String} s for being a palindrome (e.g. passing "racecar" will return true but "Madam, I'm Adam." will not).
	 * @param s The string to test for being a palindrome.
	 * @return Whether or not s is a palindrome.
	 */
	public static boolean palindrome(String s) {
		String reverse = ""; //establish the reverse string
		
		for (int i = s.length(); i > 0; i--) {
			reverse = reverse + s.substring(i - 1, i); //concatenation addends to the back of the string, so if we concatenate from the last char to the first we get a reverse string.
		}
		
		return reverse.equals(s);
	}
	
	public static String removeBlankAndPunctuation(String s) {
		s = s.toLowerCase().trim(); //set s to lowercase and gets rid of leading/trailing whitespace.
				
		for(int i = 0; i < s.length(); i ++) { //iterate through the string to check for punctuation.
			for(char c : punctuation) {
				if(s.charAt(i) == c) {
					s = s.substring(0, i) + s.substring(i + 1, s.length()); //cut out the internal punctuation character.
					i--; //bring down the index to not skip anything.
				}
			}
		}
		return s;
	}
	
	//end class
}
