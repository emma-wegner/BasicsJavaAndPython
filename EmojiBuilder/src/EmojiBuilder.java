// Emoji Builder Scaffold Code

import bridges.games.NonBlockingGame;
import bridges.base.NamedColor;
import bridges.base.NamedSymbol;

public class EmojiBuilder extends NonBlockingGame {
    // Grid must be less than 1024 cells total. The largest square grid is 32 x 32

    // class (static) variables -- numRows, numCols
    private static int numRows = 10; // change the numRows dimension if you would like
    //YOUR LINE OF CODE HERE:
    private static int numCols = 10;

    // constructor
    public EmojiBuilder(int assid, String login, String apiKey, int numRows, int numCols) {
        super(assid, login, apiKey, numRows, numCols);
        // set game title
        setTitle("Cool Emoji");
        // Set a description which will show under the title
        setDescription("The emoji is cool");
        // start method
        initialize();
        start();
    }

    //main method
    public static void main(String args[]) {
        // Create an EmojiBuilder object -- Don't forget to fill in your assignment number, username, and apiKey
        // (numRows and numCols values are passed in from the class variables above)
        EmojiBuilder emoji = new EmojiBuilder(1, "ewegner22", "732737780094", numRows, numCols);
    }

    // initialize
    public void initialize() {
        // Use nested loops to set the background color of your emoji
        // HINT: Remember that getBoardHeight() and getBoardWidth() exist for your use
        // YOUR CODE HERE:
         for (int i=0; i<getBoardHeight(); i++)
         {
        	 for (int j=0; j<getBoardWidth(); j++)
        	 {
        		 setBGColor(i,j, NamedColor.yellow);
        	 }
         }
        // use setBGColor calls for your emoji
        // for example:
        setBGColor(2,2, NamedColor.black);
        setBGColor(2,3, NamedColor.black);
        setBGColor(3,2, NamedColor.black);
        setBGColor(3,3, NamedColor.black);
        setBGColor(3,5, NamedColor.black);
        setBGColor(2,6, NamedColor.black);
        setBGColor(2,7, NamedColor.black);
        setBGColor(3,8, NamedColor.black);
        setBGColor(6,1, NamedColor.black);
        for (int i=2;i<8;i++)
        {
        setBGColor(7,i, NamedColor.black);
        }
        setBGColor(6,8, NamedColor.black);
        setBGColor(8,6, NamedColor.pink);
        //YOUR CODE HERE:
    }

    // gameloop
    public void gameLoop() {
        // Since we are drawing only once (this is not a game yet),
        // we do not need any code inside the gameLoop() method.
    }
} // end class


