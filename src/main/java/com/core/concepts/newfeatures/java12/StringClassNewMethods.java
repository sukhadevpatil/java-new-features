package com.core.concepts.newfeatures.java12;

public class StringClassNewMethods {
    public static void main(String[] args) {
        String text = "Hello World!\nThis is Java 12 article.";

        //without indent
        System.out.println(text);

        //with indent 4
        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-4);
        System.out.println(text);

        String textToTransform = "Welcome";
        String transformed = textToTransform.transform(value ->
                new StringBuilder(value).reverse().toString()
        );

        System.out.println(transformed);
    }
}
