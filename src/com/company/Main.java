package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        String word = new String();
        word = "hello world";
        char[] wordArray = word.toCharArray();
        int wordCounter = 0;
        int indexOne;
        char s = 'l';

        //int[] wordPosition = word.indexOf(s);

       // System.out.println("the number o letters in the word: " + word.length());
       // System.out.println("the number o letters in the array: " + wordArray.length);
       // System.out.println("letter in a possition: " + wordArray[5]);

        for (int i=0; i<wordArray.length; i++){
            System.out.println(wordArray[i]);
        }

        System.out.println(wordArray);

        for (indexOne=0; indexOne<wordArray.length; indexOne++){
            if (s == wordArray[indexOne]){
                wordCounter ++;
                System.out.println("the letter you are looking for in in the position: " );
            }else {
                System.out.println("the is not that letter in the word");
            }
        }

        int y=0;


        int[] indexOfLetter = new int[wordCounter];

            for (indexOne=0; indexOne<wordArray.length; indexOne++){
                if (s == wordArray[indexOne]){

                    indexOfLetter[y]= indexOne;
                    y++;

                }
            }

        System.out.println(indexOfLetter[0]);
        System.out.println(indexOfLetter[1]);
        System.out.println(indexOfLetter[2]);


    }


}
