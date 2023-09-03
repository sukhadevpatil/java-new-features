package com.core.concepts.newfeatures.java14;

public class TextBlocks {

    public static void main(String[] args) {

        // text blocks now have two new escape sequences
        // \  : to indicate the end of the line, so that a new line character is not introduced
        // \s : to indicate a single space

        String multiline = "A quick brown fox jumps over a lazy dog; the lazy dog howls loudly.";
        System.out.println(multiline);

        //can now be written as
        //This improves the readability of the sentence for a human eye but does not add a new line after dog
        multiline = """
                A quick brown fox jumps over a lazy dog; \
                the lazy dog howls loudly.""";

        System.out.println(multiline);
    }
}
