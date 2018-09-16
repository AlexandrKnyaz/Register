package ru.telegin.geekbrains.javacore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scanner = new Scanner(System.in);
        UserAuth user = new UserAuth();
        String exitAnswer = "";
        int startAnswer = 0;

        while (!exitAnswer.equals("exit")) {
            System.out.println("Для регистрации нажмите 1, для авторизации нажмите 2");
            startAnswer = scanner.nextInt();
            if(startAnswer == 1) {
                scanner = new Scanner(System.in);
                System.out.println("Придумайте логин.");
                String userLogin = scanner.nextLine();
                System.out.println("Придумайте пароль.");
                String userPassword = scanner.nextLine();
                System.out.println("Введите имя.");
                String userName = scanner.nextLine();
                user.register(userLogin, userPassword, userName);
                System.out.println("Регистрация успешно пройдена!");
                System.out.println(userLogin + " " + userPassword + " " + userName);
            } else if(startAnswer == 2) {
                scanner = new Scanner(System.in);
                System.out.println("Введите логин:");
                String enterLogin = scanner.nextLine();
                System.out.println("Введите пароль:");
                String enterPassword = scanner.nextLine();
                if(user.auth(enterLogin, enterPassword)) {
                    user.printGreeting();
                }
            } else {
                System.out.println("Введено не известное значение, повторите попытку.");
            }
            System.out.println("Для выхода введите exit");
            exitAnswer = scanner.nextLine();        }
    }
}
