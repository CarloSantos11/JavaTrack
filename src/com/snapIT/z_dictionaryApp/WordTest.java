package com.snapIT.z_dictionaryApp;

//        11.18.20
//
//        Let’s create a program
//        that can create a library of words
//        we can add words
//        add definitions to our library
//        we can call those definitions
//
//        class Word
//        - word :string
//        - definition :string
//        - language :string
//        - root :boolean


import java.util.Scanner;

public class WordTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean promptUser = true;
        boolean root = false;
        Word[] myDictionary = new Word [1];

        while(promptUser) {

            int wordIndex = 0;

            System.out.println("What's the word? or type ':p' to quit");
            String word = input.nextLine();

            if( word.equals(":p")) {
                break;
            }

            System.out.println("Have a definition?");
            String definition = input.nextLine();

            System.out.println("Language?");
            String language = input.nextLine();

            System.out.println("Is this the root form of the word? true or false.");
            String rootStringFormat = input.nextLine();
            root = Boolean.parseBoolean(rootStringFormat);




            Word wordObject1 = new Word(word, definition, language, root);
            myDictionary[wordIndex] = wordObject1;
            wordIndex++;
            root = false;
        }

        for (Word word : myDictionary) {
            word.printInfo();
        }
    }
}


//    Word newWord = new Word("Apple", "This is a fruit from the fruit family", "English", true);
//    Word tagalogWord = new Word("Masipag", "Arduous, hardworking", "Tagalog", true);
//
//        newWord.printInfo();
//        System.out.println();
//        tagalogWord.printInfo();


// Possible