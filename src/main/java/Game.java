/**
 * Created by Guest on 8/1/17.
 */
public class Game {

    public boolean findString(String searchWord, String initialString){
        return initialString.contains(searchWord);
    }
    public String replaceString(String searchWord, String initialString, String newWord){
        return initialString.replace(searchWord,newWord);
    }

    public String findAndReplace(String searchWord, String initialString, String newWord) {
        if (findString(searchWord, initialString)) {
            return replaceString(searchWord, initialString, newWord);
        } else {
            return "No occurrences of the given word found";
        }
    }
}
