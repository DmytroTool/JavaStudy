package homeJob_9;

public enum Size {
    S("S", 20, 30),
    M("M", 30, 40),
    XL("XL", 40, 50);

    private final String abbreviation;
    private final int width;
    private final int length;

    Size(String abbreviation, int width, int length) {
        this.abbreviation = abbreviation;
        this.width = width;
        this.length = length;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}

