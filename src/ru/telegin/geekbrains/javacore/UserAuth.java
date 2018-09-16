package ru.telegin.geekbrains.javacore;

public class UserAuth {
    String login;
    String password;
    String name;

    public void register(String login, String password,String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public boolean auth(String login, String password){
        if (this.login.equals(login) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public void printGreeting() {
        System.out.println("Приветствую, " + name + "!");
    }



}
