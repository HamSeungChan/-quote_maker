package com.ll;

import java.util.Scanner;

public class APP2 {

    private String command;

    public void application() {

        System.out.println("==명언 앱==");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("명령) ");
            command = sc.next();
            if (command.equals("등록")) {

                System.out.print("멍언 : ");
                String wiseSaying = sc.next();

                System.out.print("작가 : ");
                String author = sc.next();
            }
            else {
                break;
            }
        }
    }
}
