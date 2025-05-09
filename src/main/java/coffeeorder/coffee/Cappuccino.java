package coffeeorder.coffee;

import coffeeorder.option.Powder;

public class Cappuccino extends Coffee{
    private Powder powder;

    public Cappuccino() {
        this.price = 3500;
    }

    // 파우더 선택 옵션
    @Override
    public void selectOption(int powderOption) {

        String selectedPowder = "";

        switch (powderOption) {
            case 0 :
                System.out.println("파우더 선택 안함");
                break;
            case 1 :
                selectedPowder = powder.COCOA.getPowder();
                break;
            case 2 :
                selectedPowder = powder.CINAMON.getPowder();
                break;
            default :
                System.out.println("파우더 옵션을 선택해주세요.");
                break;
        }

        System.out.println(selectedPowder + "이 선택되었습니다.");
    }
}
