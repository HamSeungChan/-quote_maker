package com.ll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App6 {

    private String command;

    public void application() {

        System.out.println("==명언 앱==");
        Scanner sc = new Scanner(System.in);
        List<Storage> storage = new ArrayList<>();
        int number = 1;

        while (true) {
            System.out.print("명령) ");
            command = sc.nextLine();
            if (command.equals("등록")) {

                System.out.print("멍언 : ");
                String wiseSaying = sc.nextLine();

                System.out.print("작가 : ");
                String author = sc.nextLine();

                storage.add(new Storage(wiseSaying,author,number));
                System.out.println(storage.size()+"번 명언이 등록되었습니다.");
                number++;
            }
            else if(command.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for(int i=storage.size()-1;i>=0;i--){
                    Storage s = storage.get(i);
                    System.out.printf("%d / %s / %s\n",s.number,s.author,s.wiseSaying);
                }
            }
            else if(command.contains("?")){

                int id = command.charAt(command.length()-1)-'0';
                storage.remove(id-1);
                System.out.println(id+"번 명언이 삭제되었습니다.");
                }

            else {
                break;
            }
        }
    }
}

//class Storage{
//    String wiseSaying;
//    String author;
//    int number;
//
//    public Storage(String wiseSaying, String author,int number) {
//        this.wiseSaying = wiseSaying;
//        this.author = author;
//        this.number = number;
//    }
//}
