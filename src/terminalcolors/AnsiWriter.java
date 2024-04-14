package terminalcolors;

public class AnsiWriter {
    public static <T> void printWithColor(AnsiPalette color, T text) {
        System.out.println(color.getColorName() + text + AnsiPalette.RESET);
    }

    public static void printWithColor(AnsiPalette color) {
        System.out.print(color.getColorName());
    }

    public static <T> void printWithColorFormat(AnsiPalette color, String format, Object... args) {
        if (args.length == 0) {
            printWithColor(color, format);
        } else {
            System.out.printf(color.getColorName() + format + AnsiPalette.RESET, args);
        }
    }

    public static void printError(Exception err) {
        printWithColor(AnsiPalette.RED);

        System.err.println(err.getMessage());

        printWithColor(AnsiPalette.RESET);
    }
}
