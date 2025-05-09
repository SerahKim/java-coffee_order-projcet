package coffeeorder.coffee;

import coffeeorder.option.Syrup;

public class CafeLatte extends Coffee {
    private Syrup syrup;

    public CafeLatte() {
        this.price = 2500;
    }

    // TODO : 제네릭 메소드를 통해 아메리카노, 카페라떼에서 공통으로 사용할 수 있도록 하기
    // 시럽 선택 옵션
    @Override
    public void selectOption(int syrupOption) {
        String selectedSyrup = "";

        switch (syrupOption) {
            case 0 :
                System.out.println("시럽 선택 안함");
                break;
            case 1 :
                selectedSyrup = syrup.VANILLA.getSyrup();
                System.out.println(selectedSyrup + "이 선택되었습니다.");
                break;
            case 2 :
                selectedSyrup = syrup.HAZELNUT.getSyrup();
                System.out.println(selectedSyrup + "이 선택되었습니다.");
                break;
            case 3 :
                selectedSyrup = syrup.CARAMEL.getSyrup();
                System.out.println(selectedSyrup + "이 선택되었습니다.");
                break;
            default :
                System.out.println("시럽 옵션을 선택해주세요.");
                return;
        }

    }
}
