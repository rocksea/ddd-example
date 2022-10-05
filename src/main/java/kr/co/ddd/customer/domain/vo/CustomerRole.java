package kr.co.ddd.customer.domain.vo;

public enum CustomerRole {
    OWNER("OWNER"), DRIVER("DRIVER");
    private final String value;

    CustomerRole(String value) {
        this.value = value;
    }

    public final String getValue() {
        return this.value;
    }
}
