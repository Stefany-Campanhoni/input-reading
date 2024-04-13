package terminalcolors;

public enum ColorPalette {
    RED("dasd"),
    BLUE("bububub");

    private final String colorName;

    ColorPalette(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return this.colorName;
    }
}
