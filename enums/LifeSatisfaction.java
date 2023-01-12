package enums;

public enum LifeSatisfaction {
    SATISFACTION("Жизнь удалась"),
    DISSATISFACTION("No");
    private String name;
    LifeSatisfaction(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
