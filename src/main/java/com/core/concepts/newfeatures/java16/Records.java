package com.core.concepts.newfeatures.java16;

public class Records {

    class OuterClass {
        class InnerClass {
            Book book = new Book("Title", "author", "isbn");
        }
    }

    public record Book(String title, String author, String isbn) {
    }

    public static void main(String[] args) {

    }
}
