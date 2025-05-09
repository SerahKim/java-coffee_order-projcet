package coffeeorder.coffee;

public class MatchaLatte extends Coffee {
    public MatchaLatte() {
        this.price = 3500;
    }

    @Override
    public void selectOption(int optionNum) {
        System.out.println("선택할 옵션이 없습니다.");
    }
}
