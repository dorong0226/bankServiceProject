package org.example;

import java.util.Scanner;

public class BankManagementService {    // UI

    public void run(){
        showInitialMenu();

        insertUserInput();


    }


    public void showInitialMenu(){
        System.out.println("===============");
        System.out.println("1.고객으로 로그인");
        System.out.println("2.관리자 메뉴");
        System.out.println("3.프로그램 종료");
        System.out.println("===============");
    }

    public void insertUserInput(){
        Scanner s = new Scanner(System.in);

        int userInputNumber;

        try {
            userInputNumber = Integer.parseInt(s.nextLine());
        } catch(NumberFormatException e){
            System.out.println("잘못된 입력입니다. 1~3사이 숫자로 다시 시도해주세요");
        }
    }


    public void customerLogin(){

        System.out.println("===============");


    }




}
