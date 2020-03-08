import java.util.ArrayList;
class IsogramChecker {

    boolean isIsogram(String phrase) {
        ArrayList<Character> strChars = new ArrayList<Character>();
	// 1
	for (int i = 0; i<phrase.length(); i++) {
	    if (Character.isWhitespace(phrase.charAt(i)) == false && phrase.charAt(i) != '-') {
		strChars.add(Character.toLowerCase(phrase.charAt(i)));
	    }
	}
	// 2
	for (int i = 0; i<strChars.size(); i++) {
	    for (int j = 0; j<strChars.size(); j++) {
		if (i != j && strChars.get(i) == strChars.get(j)) {
		    // 3
		    return false;
		}
	    }
	}
	// 4
	return true;
    }
}

/*
Pseudocode
1. store every non-whitespace and non-hypen character,
converted to lowercase in a list.
2. check every character against each other except for
the one that is currently being checked.
3. if it matches then it is not an isogram (return false)
4. if there are not matches during the entire loop then
the word or phrase is an isogram.
*/
