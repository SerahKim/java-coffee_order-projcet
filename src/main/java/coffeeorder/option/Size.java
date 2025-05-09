package coffeeorder.option;

public enum Size {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large"),
    ;

    private final String size;

    // Size Enum 클래스의 생성자
    Size(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
