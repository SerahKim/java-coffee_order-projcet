package coffeeorder.coffee;

import coffeeorder.option.Size;
import coffeeorder.option.StoreType;
import coffeeorder.option.Temperature;

public abstract class Coffee {
    Size size;
    Temperature temperature;
    StoreType storeType;
    int price;

    // TODO : 제네릭 메소드를 통해 공통된 코드 합치기
    // 사이즈 선택 메소드
    // small : -300원, medium : 기본 가격, Large : +300원
    public int selectSize(int sizeOption) {
        int extraCharge = 0;
        String selectedSize = "";

        switch (sizeOption) {
            case 1 :
                selectedSize = size.SMALL.getSize();
                extraCharge = -300;
                break;
            case 2 :
                selectedSize = size.MEDIUM.getSize();
                break;
            case 3 :
                selectedSize = size.LARGE.getSize();
                extraCharge = 300;
                break;
            default:
                System.out.println("사이즈를 선택해주세요");
                break;
        }

        System.out.println(selectedSize + "이 선택되었습니다.");
        return extraCharge;
    }

    // 온도 선택 메소드
    public void selectTemp(int tempOption) {
        String selectedTemp = "";

        switch (tempOption) {
            case 1 :
                selectedTemp = temperature.HOT.getTemp();
                break;
            case 2 :
                selectedTemp = temperature.COLD.getTemp();
                break;
            default:
                System.out.println("온도를 선택해주세요");
                break;
        }

        System.out.println(selectedTemp + "이 선택되었습니다.");
    }

    // 매장 타입 선택 메소드
    public void selectStoreType(int storeOption) {
        String selectedStoreType = "";

        switch (storeOption) {
            case 1:
                selectedStoreType = storeType.FOR_HERE.getStore();
                break;
            case 2:
                selectedStoreType = storeType.TO_GO.getStore();
                break;
            default:
                System.out.println("매장 또는 포장을 선택해주세요");
                break;
        }

        System.out.println(selectedStoreType + "이 선택되었습니다.");
    }

    public int getPrice() {
        return price;
    }

    public abstract void selectOption(int optionNum);

}
