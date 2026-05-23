public enum Level {
    LOW(1, "низкий"),
    MEDIUM(2, "средний"),
    HIGH(3, "высокий"),
    URGENT(4, "срочный");

    private final int code;
    private final String description;

    Level(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public boolean isUrgent() {
        return this == URGENT;
    }

    public static Level fromCode(int code) {
        for (Level l : Level.values()) {
            if (l.code == code) {
                return l;
            }
        }
        return LOW;
    }

    public static void main(String[] args) {
        Level taskLevel = Level.HIGH;

        System.out.println("Уровень: " + taskLevel);
        System.out.println("Код: " + taskLevel.getCode());
        System.out.println("Описание: " + taskLevel.getDescription());
        System.out.println("Срочный? " + taskLevel.isUrgent());

        System.out.println("\n=== Все уровни ===");
        for (Level l : Level.values()) {
            System.out.printf("%s: код=%d, %s%n", l, l.getCode(), l.getDescription());
        }

        System.out.println("\nПоиск по коду 4: " + Level.fromCode(4));
    }
}