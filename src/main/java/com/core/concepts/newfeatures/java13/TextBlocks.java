package com.core.concepts.newfeatures.java13;

public class TextBlocks {
    public static void main(String[] args) {
        //Old style
        String JSON_STRING = "{\r\n" + "\"name\" : \"Amazon\",\r\n" + "\"website\" : \"http://www.amazon.com/\"\r\n" + "}";

        // New version style
        // There is no need to escape double quotes or to add a carriage return.
        // By using text blocks, the embedded JSON is much simpler to write and easier to read and maintain.
        String TEXT_BLOCK_JSON = """
                {
                    "name" : "Amazon",
                    "website" : "http://www.amazon.com/"
                }
                """;
    }
}
