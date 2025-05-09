package coffeeorder.service;

import coffeeorder.coffee.*;

public class OderService {

    Americano americano = new Americano();
    CafeLatte cafeLatte = new CafeLatte();
    MatchaLatte matchaLatte = new MatchaLatte();
    Mocha mocha = new Mocha();
    Cappuccino cappuccino = new Cappuccino();

    public void customAmericano(int sizeNum, int tempNum, int storeTypeNum, int optionNum) {
        americano.selectSize(sizeNum);
        americano.selectTemp(tempNum);
        americano.selectStoreType(storeTypeNum);
        americano.selectOption(optionNum);
        System.out.println("가격 : " + (americano.selectSize(sizeNum) + americano.getPrice()));
    }

    public void customCafeLatte(int sizeNum, int tempNum, int storeTypeNum, int optionNum) {
        cafeLatte.selectSize(sizeNum);
        cafeLatte.selectTemp(tempNum);
        cafeLatte.selectStoreType(storeTypeNum);
        cafeLatte.selectOption(optionNum);
        System.out.println("가격 : " + (cafeLatte.selectSize(sizeNum) + cafeLatte.getPrice()));
    }

    public void customMocha(int sizeNum, int tempNum, int storeTypeNum, int optionNum) {
        mocha.selectSize(sizeNum);
        mocha.selectTemp(tempNum);
        mocha.selectStoreType(storeTypeNum);
        mocha.selectOption(optionNum);
        System.out.println("가격 : " + (mocha.selectSize(sizeNum) + mocha.getPrice()));
    }

    public void customMatchaLatte(int sizeNum, int tempNum, int storeTypeNum) {
        matchaLatte.selectSize(sizeNum);
        matchaLatte.selectTemp(tempNum);
        matchaLatte.selectStoreType(storeTypeNum);
        System.out.println("가격 : " + (matchaLatte.selectSize(sizeNum) + matchaLatte.getPrice()));
    }

    public void customCappuccino(int sizeNum, int tempNum, int storeTypeNum, int optionNum) {
        cappuccino.selectSize(sizeNum);
        cappuccino.selectTemp(tempNum);
        cappuccino.selectStoreType(storeTypeNum);
        cappuccino.selectOption(optionNum);
        System.out.println("가격 : " + (cappuccino.selectSize(sizeNum) + cappuccino.getPrice()));
    }
}