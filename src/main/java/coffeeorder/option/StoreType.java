package coffeeorder.option;

public enum StoreType {
    FOR_HERE("매장"),
    TO_GO("포장")
    ;

    private final String store;

    StoreType(String store) {
        this.store = store;
    }

    public String getStore() {
        return store;
    }
}
