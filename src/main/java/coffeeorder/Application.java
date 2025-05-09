package coffeeorder;

import coffeeorder.coffee.*;
import coffeeorder.service.OderService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OderService oderService = new OderService();

        while (true) {
            System.out.println("메뉴를 선택해 주세요");
            System.out.println("1. 아메리카노 / 2. 카페라떼 / 3. 말차라떼 / 4. 모카 / 5. 카푸치노");
            int menuNumber = sc.nextInt();

            System.out.println("사이즈를 선택해 주세요");
            System.out.println("1. 스몰, 2. 미디움, 3. 라지");
            int sizeNumber = sc.nextInt();

            System.out.println("온도를 선택해 주세요");
            System.out.println("1. HOT, 2. ICE");
            int tempNumber = sc.nextInt();

            System.out.println("드실 방식을 선택해 주세요");
            System.out.println("1. 매장 2. 포장");
            int storeTypeNumber = sc.nextInt();

            switch (menuNumber) {
                case 1 :
                    System.out.println("시럽을 선택해 주세요");
                    System.out.println("0. 선택 안함 1. 바닐라, 2. 헤이즐넛, 3. 카라멜");
                    int syrupNumber = sc.nextInt();

                    oderService.customAmericano(sizeNumber, tempNumber, storeTypeNumber, syrupNumber);
                    break;
                case 2:
                    System.out.println("시럽을 선택해 주세요");
                    System.out.println("0. 선택 안함 1. 바닐라, 2. 헤이즐넛, 3. 카라멜");
                    int syrupNumber1 = sc.nextInt();

                    oderService.customCafeLatte(sizeNumber, tempNumber, storeTypeNumber, syrupNumber1);
                    break;
                case 3:
                    oderService.customMatchaLatte(sizeNumber, tempNumber, storeTypeNumber);
                    break;
                case 4:
                    System.out.println("휘핑을 선택해 주세요");
                    System.out.println("1. 선택함 2. 선택 안함");
                    int whipNum = sc.nextInt();

                    oderService.customAmericano(sizeNumber, tempNumber, storeTypeNumber, whipNum);
                    break;
                case 5 :
                    System.out.println("파우더를 선택해 주세요");
                    System.out.println("0. 선택 안함 1. 코코아, 2. 시나몬");
                    int powderNumber = sc.nextInt();

                    oderService.customAmericano(sizeNumber, tempNumber, storeTypeNumber, powderNumber);
                    break;
            }

            // 주문하기 메소드
        }
    }
}
