package com.snapIT.dictionaryApp;

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


public class WordTest {
    public static void main(String[] args) {
        Word newWord = new Word("Apple", "This is a fruit from the fruit family", "English", true);
        Word tagalogWord = new Word("Masipag", "Arduous, hardworking", "Tagalog", true);

        newWord.printInfo();
        System.out.println();
        tagalogWord.printInfo();
    }
}
