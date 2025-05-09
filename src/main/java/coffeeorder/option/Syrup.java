package coffeeorder.option;

public enum Syrup {
    VANILLA("바닐라 시럽"),
    HAZELNUT("헤이즐넛 시럽"),
    CARAMEL("카라멜 시럽")
    ;

    private final String syrup;

    Syrup(String syrup) {
        this.syrup = syrup;
    }

    public String getSyrup() {
        return syrup;
    }
}
