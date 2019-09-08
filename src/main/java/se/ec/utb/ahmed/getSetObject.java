package se.ec.utb.ahmed;

import java.util.ArrayList;
import java.util.Scanner;

public class getSetObject {
    String[] secretWord = new String[]{"programming","exhaustive","violin","selection","repetition","serendipity","watermelon","football","mobilephone","handbag","teddybear","cardigan","waterfall","cupcake","pineapple","strawberry","collection","chicken","tablecloth","candlestick","notebook","radiator","champagne","wineyard","parent","circus","snowbell","clocktower","mermaid","cardigan"};
    String wordToGuess = secretWord[(int) (Math.random() * secretWord.length)];
    private int maxGuess;
    private int madeGuesses;

    public getSetObject(String[] secretWord, int maxGuess, int madeGuesses) {
        this.secretWord = secretWord;
        this.maxGuess = maxGuess;
        this.madeGuesses = madeGuesses;
    }

    public void run(int madeGuesses, int maxGuess, String secretWord) {

        boolean bool=true;
        char[] secretBox = new char[secretWord.length()];
        int i = 0;
        while (i < secretWord.length()) {
            secretBox[i] = '-';
            if (secretWord.charAt(i) == ' ') {
                secretBox[i] = ' ';
            }
            i++;

        }
        System.out.println(secretBox);
        System.out.println("remaining guesses " + maxGuess);
        System.out.println("The word your going to guess has " + secretWord.length() + " letters ");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> l = new ArrayList<Character>();

        while (maxGuess > 0) {
            madeGuesses++;
            char x = scanner.next().charAt(0);
            if (l.contains(x)) {
                System.out.println("this alredy exsist try another one");
                continue;
            }
            l.add(x);
            if (secretWord.contains(x + "")) {
                for (int y = 0; y < secretWord.length(); y++) {
                    if (secretWord.charAt(y) == x) {
                        secretBox[y] = x;
                    }
                }
            } else {
                maxGuess--;
            }
            if (secretWord.equals((String.valueOf(secretBox)))) {
                System.out.println(secretBox);

                System.out.println("  wohoooo you woon  " + madeGuesses);
                break;

            }

            if (maxGuess == 0) {
                System.out.println("  you lose my friend  ");
                System.out.println("the secretWord was "+ secretWord);
            }
            System.out.println(secretBox);

            System.out.println("    guess remaining    " + maxGuess);

        }
    }
}
