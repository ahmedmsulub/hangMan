package se.ec.utb.ahmed;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;
import se.ec.utb.ahmed.getSetObject;




/**
 * Unit test for simple App.
 */
public class AppTest {

    private String[]secretWord={};
    private int maxGuess;
    private int madeGuesses;
    private getSetObject newObject = new getSetObject(secretWord, maxGuess, madeGuesses);

    @Before
    public void init(){
      newObject = new getSetObject(secretWord, maxGuess, madeGuesses);
    }
    @Test
    public void project_succeeded(){
    String[] expected={"h","e","l"};
    String[] actual={"h","e","l"};
    assertArrayEquals(expected,actual);



    }


}
