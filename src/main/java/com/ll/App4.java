package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App4 {

    private String command;

    public void application() {

        System.out.println("==명언 앱==");
        Scanner sc = new Scanner(System.in);
        List<Storage> storage = new ArrayList<>();

        while (true) {
            System.out.print("명령) ");
            command = sc.next();
            if (command.equals("등록")) {

                System.out.print("멍언 : ");
                String wiseSaying = sc.next();

                System.out.print("작가 : ");
                String author = sc.next();

                storage.add(new Storage(wiseSaying,author));
                System.out.println(storage.size()+"번 명언이 등록되었습니다.");
            }
            else {
                break;
            }
        }
    }
}

class Storage{
    String wiseSaying;
    String author;

    public Storage(String wiseSaying, String author) {
        this.wiseSaying = wiseSaying;
        this.author = author;
    }
}
