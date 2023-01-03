package ru.netology.javaqa;


public class Main {
    public static
    void main(String[] args) {
        Post post = new Post();
        post.name = "Евгений";
        post.passport = "5555 № 66666666";
        post.patronymic = "Александрович";
        post.phone = "8(915)0027163";
        post.surname = "Попов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 25;
        post.birthday.month = 11;
        post.birthday.year = 1994;

    }
}