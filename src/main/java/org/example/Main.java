package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {
    public static void main(String[] args) {
       String a = createAccountNum();
       String[] b = a.split("-");
        System.out.println(b[2]);
        System.out.println(b[0]+"-"+b[1]+"-"+accountNoMasking(b[2]));

    }

    static int counter = 1;
    private static String createAccountNum(){
        /* 계좌번호 생성 로직 = 정규 표현식 */
        Random random = new Random();
        int createNum = 0;
        String ranNum = "";
        String randomNum = "";
             for (int i=0; i<5; i++) {
                createNum = random.nextInt(9);
             ranNum = Integer.toString(createNum);
                 randomNum += ranNum;
             }
        String onlyBankNum = "8016";
        String countAccountNum = String.format("%04d",counter);

        counter++;
        String accountNum = onlyBankNum+"-"+countAccountNum+"-"+randomNum;
        return accountNum;
    }
    public static String accountNoMasking(String accountNo){
        // 계좌번호는 숫자만 파악하므로
        String regex = "(^[0-9]+)$";

        Matcher matcher = Pattern.compile(regex).matcher(accountNo);
        if(matcher.find()) {
            int length = accountNo.length();
            if(length >= 5) {
                char[] c = new char[5];
                Arrays.fill(c, '*');

                return accountNo.replace(accountNo, accountNo.substring(0, length-5) + String.valueOf(c));
            }
        }
        return accountNo;
    }
}