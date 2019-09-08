package se.ec.utb.ahmed;
import se.ec.utb.ahmed.change_Name_Later.runObject;
import java.util.Scanner;
import se.ec.utb.ahmed.getSetObject;

public class App {

    public static void main(String[] args){
        System.out.println("================================================");
        System.out.println("to write a whole word do space between lettters or write character by character");
        System.out.println("GOOD luck WINNING IT");
        System.out.println("=================================================");
        StringBuilder sb = new StringBuilder();
        String[] secretWord = new String[]{"hejsan","sweden","hello","good","developer","kingkong","inteliji","whatchdog","onepiece","naruto","sverige","somalia","manchester","nutella","marabou","nougat","pirate","hangman"};
        String wordToGuess = secretWord[(int) (Math.random() * secretWord.length)];
        getSetObject setObject = new getSetObject(secretWord, 8, 0);
        setObject.run(0,8, secretWord[(int) (Math.random() * secretWord.length)]);
        sb.append(secretWord);

    }


}




