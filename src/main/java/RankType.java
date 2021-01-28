public enum RankType {

    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    JACK(10),
    QUEEN(10),
    KING(10); // If your goig to add values after this, then use a semi-colon.

    private final int value;

    // Constructor for the enum
    RankType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
