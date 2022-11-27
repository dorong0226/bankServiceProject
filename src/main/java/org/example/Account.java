package org.example;

public class Account {

    /* Field */

    private String ownerName;

    private String accountNum; // 계좌번호

    private int balance; //잔고


    /* Method */

    // Construtor
    Account(String ownerName, String accountNum){

    } // balance = 0 으로 고정해버리기.


    // Getter

    public String getOwnerName(){
        return this.ownerName;
    }

    public String getAccountNum(){
        return this.accountNum;
    }


    // ( 요구사항 8 ) 계좌는 잔고 확인 기능이 있다.
    public int getBalance() {
        // Bank가 호출은 함. -> Bank가 AccountRepository 한테,
        // accountNum을 넘겨 줌.
        //	-> AccountRepository가 가지고 있는 계좌 돌려봐서, 맞으면. 그 Account를 찾아서
        // getBalance(). 를 써서, 잔고를 가져온다.
        return this.balance;
    }


    // ( 요구사항 7-1 ) 계좌는 입금 기능이 있다.
    public void deposit(int amount) {

        this.balance += amount;


    }


    // ( 요구사항 7-2 ) 계좌는 출금 기능이 있다.
    public void withdraw(int amount) {
        // 만약, 출금할 금액 > 계좌의 현재 금액 인 경우 예외처리
        // 그에 맞는 로직

        this.balance -= amount;



    }


    // ( 요구사항 9 ) 계좌에서 잔고의 변화가 있을 때마다 거래 내역에 기록된다.
    public void recordBill(Bill bill) {
        BillManager billManager = new BillManager();
        billManager.recordBill(bill);
    }


    // ( 요구사항 11 ) 계좌는 모든 거래 내역을 조회할 수 있다.
    public void getAllBills( String accountNum ){
        BillManager billManager = new BillManager();
        billManager.getAllBills(accountNum);
    }
}
