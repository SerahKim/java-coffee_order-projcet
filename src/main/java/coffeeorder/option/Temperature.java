package coffeeorder.option;

public enum Temperature {
    HOT("HOT"),
    COLD("COLD")
    ;

    private final String temp;

    // Temperature Enum 클래스의 생성자
    Temperature(String temp) {
        this.temp = temp;
    }

    public String getTemp() {
        return temp;
    }
}
