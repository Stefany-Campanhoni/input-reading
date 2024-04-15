package terminalcolors;

public class AnsiWriter {
    public static <T> void printWithColor(AnsiPalette color, T output) {
        printColor(color);

        System.out.println(output);

        printColor(AnsiPalette.RESET);
    }

    public static void printColor(AnsiPalette color) {
        System.out.print(color.getColorName());
    }

    public static <T> void printWithColorFormat(AnsiPalette color, String format, Object... args) {
        if (args.length == 0) {
            printWithColor(color, format);
        } else {
            System.out.printf(color.getColorName() + format + AnsiPalette.RESET, args);
        }
    }

    public static void printError(String err) {
        printColor(AnsiPalette.RED);

        System.err.println(err);

        printColor(AnsiPalette.RESET);
    }
}
