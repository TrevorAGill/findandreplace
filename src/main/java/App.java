import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/1/17.
 */
public class App {
    public static void main(String[] args) {
        Game newGame = new Game();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Type a sentence.");
            String initialString = bufferedReader.readLine().toLowerCase();
            System.out.println("Type a word to replace.");
            String searchWord = bufferedReader.readLine().toLowerCase();
            System.out.println("Type a replacement word.");
            String newWord = bufferedReader.readLine();
            System.out.println(newGame.findAndReplace(searchWord,initialString,newWord));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
