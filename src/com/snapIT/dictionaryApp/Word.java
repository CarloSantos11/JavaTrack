package com.snapIT.dictionaryApp;

public class Word {
    // word
    // definition
    // language
    // root
    private String word;
    private String definition;
    private String language;
    private boolean root;

    public Word() {
        this.word = "N/A";
        this.definition = "N/A";
        this.language = "English";
        this.root = true;
    }

    public Word(String word, String definition, String language, boolean root) {
        this.word = word;
        this.definition = definition;
        this.language = language;
        this.root = root;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isRoot() {
        return root;
    }

    public void setRoot(boolean root) {
        this.root = root;
    }


    public void printInfo() {
        System.out.print(
                "Word: " + this.word + "\n" +
                "Definiton: " + this.definition + "\n" +
                "Language: " + this.language + "\n" +
                "Root: " + this.root + "\n"
        );

    }
}
