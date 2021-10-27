package PackOCP13GenericsAndCollections.CollectionMap;

public enum Weekday {

    MONDAY(2, "Segunda"),
    TUESDAY(3, "Terca"),
    WEDNESDAY(4, "Quarta"),
    THURSDAY(5, "Quinta"),
    FRIDAY(6, "Sexta"),
    SATURDAY(7, "Sabado"),
    SUNDAY(1, "Domingo");

    public int key;
    public String value;

    Weekday(int key, String value) {
        this.key = key;
        this.value = value;
    }
}
