package com.core.concepts.newfeatures.java14;

public class Records {

    //Records were introduced to reduce repetitive boilerplate code in data model POJOs
    public static void main(String[] args) {
        User user1 = new User(1, "UserOne");

        System.out.println("user id :: " + user1.id + ", User Pwd :: " + user1.password);

        User user2 = user1;
        System.out.println(user1.equals(user2));

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1.toString().contains("UserOne"));
    }

    public record User(int id, String password) { };
}
