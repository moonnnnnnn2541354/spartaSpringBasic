package Dongmin.base;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정답 : " + randomNum);
        System.out.println("---------------------");
        System.out.println("1 ~ 1000 사이 숫자를 입력하시오");
        
        // while문 활용
        boolean wEnded = false;
        while (!wEnded) {
            int num = Integer.parseInt(sc.nextLine());
            if (randomNum > num) {
                System.out.println("Up");
            } else if (randomNum < num) {
                System.out.println("Down");
            } else if (randomNum == num) {
                System.out.println("정답");
                wEnded = true;
            }
        }

        // for문 활용
//        int fEnded = 1000;
//        for (int i = 0; i < fEnded; i++) {
//            int num = Integer.parseInt(sc.nextLine());
//            if (randomNum > num) {
//                System.out.println("Up");
//            } else if (randomNum < num) {
//                System.out.println("Down");
//            } else if (randomNum == num) {
//                System.out.println("정답");
//                i = 1000;
//            }
//        }
    }
}

