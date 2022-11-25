package org.example;

import java.util.ArrayList;

public class AccountRepository{

    // 계좌를 다 가지고 있음.
    static ArrayList<Account> accounts = new ArrayList<>();

    // (요구사항 1) 은행은 계좌를 등록한다 ( 단, 계좌번호는 정규 표현식으로 제한 )
    public void registerAccount(String ownerName, String accountNum){
        // 계좌 생성
        Account account = new Account(ownerName, accountNum);

        // 계좌를 account arraylist에 저장한다.
        accounts.add(account);
    }

    // ( 요구사항 2 )

    // ( 요구사항 3 ) 은행은 계좌번호로 계좌를 찾을 수 있다.
    public Account findAccountByAccountNum(String accountNum){

        for( Account account : accounts ){
            if( accountNum.equals(account.getAccountNum()))
                return account;
        }
        // 없으면
        return null;
    }

    // ( 요구사항 4 ) 은행은 계좌의 소유자 명으로 계좌를 찾을 수 있다.
    public ArrayList<Account> findAccountByOwnerName(String ownerName) {

        ArrayList<Account> foundAccountsByOwnerName = new ArrayList<>();

        for ( Account account : accounts ) {
            if ( ownerName.equals(account.getOwnerName()) )
                foundAccountsByOwnerName.add(account);
        }

        if( foundAccountsByOwnerName.size() == 0 ) // 비어있다면
            return null;
        else // 있다면
            return foundAccountsByOwnerName;
    }


    // ( 요구사항 5 ) 은행은 모든 계좌의 목록을 조회할 수 있다.
    public ArrayList<Account> findAllAccounts(){
        return accounts;
    }

}
