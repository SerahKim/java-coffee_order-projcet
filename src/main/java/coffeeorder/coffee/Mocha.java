package coffeeorder.coffee;

import coffeeorder.option.Powder;

public class Mocha extends Coffee{
    public Mocha() {
        this.price = 3500;
    }

    // 파우더 선택 옵션
    @Override
    public void selectOption(int whippingOption) {
        switch (whippingOption) {
            case 1 :
                System.out.println("휘핑을 선택하셨습니다.");
                break;
            case 2 :
                System.out.println("휘핑을 선택하지 않으셨습니다.");
                break;
            default :
                System.out.println("휘핑 옵션을 선택해주세요.");
                return;
        }
    }
}
