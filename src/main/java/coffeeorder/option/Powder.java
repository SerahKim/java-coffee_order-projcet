package coffeeorder.option;

public enum Powder {
    COCOA("코코아 파우더"),
    CINAMON("시나몬 파우더")
    ;

    private final String powder;

    // Temperature Enum 클래스의 생성자
    Powder(String powder) {
        this.powder = powder;
    }

    public String getPowder() {
        return powder;
    }
}
