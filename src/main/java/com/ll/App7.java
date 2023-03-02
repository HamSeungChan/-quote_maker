package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App7 {

    private String command;
    private List<Storage> big = new ArrayList<>();

    public void application() {

        System.out.println("==명언 앱==");
        Scanner sc = new Scanner(System.in);
        List<Storage> storage = new ArrayList<>();
        int number = 1;

        while (true) {
            System.out.print("명령) ");
            command = sc.nextLine().trim();
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
            else if(command.contains("삭제")){

                int id = command.charAt(command.length()-1)-'0';
                if(storage.get(id-1).number == id){
                    storage.remove(id-1);
                    System.out.println("1번 명언이 삭제되었습니다.");
                }
                else{
                    System.out.println("1번 명언은 존재하지 않습니다.");
                }
            }
            else if(command.contains("수정")){
                Storage s1 = null;
                int id = command.charAt(command.length()-1)-'0';
                for(Storage s2 : storage){
                    if(s2.number == id){
                        System.out.println("수정찾음");
                        s1 = s2;
                        break;
                    }
                }
                System.out.println("명언(기존) : "+s1.wiseSaying);
                System.out.println("명언 : ");
                s1.wiseSaying = sc.nextLine();

                System.out.println("작가(기존) : "+s1.author);
                System.out.println("작가 : ");
                s1.author = sc.nextLine();
            }

            else {
                break;
            }
        }
    }
    public void store(List<Storage> s){
        big.addAll(s);
    }
    public List<Storage> getStore(){
        return big;
    }
}


class Storage{
    String wiseSaying;
    String author;
    int number;

    public Storage(String wiseSaying, String author,int number) {
        this.wiseSaying = wiseSaying;
        this.author = author;
        this.number = number;
    }
}
