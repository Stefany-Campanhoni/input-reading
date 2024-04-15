import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.function.Supplier;

import terminalcolors.AnsiPalette;
import terminalcolors.AnsiWriter;

public class Reader {
    private static Scanner scanner = new Scanner(System.in);

    private static <T> T readInput(Supplier<T> reader, String errorMessage) {
        try {
            return reader.get();
        } catch (InputMismatchException err) {
            AnsiWriter.printError(errorMessage);

            scanner.nextLine(); // clear the buffer

            return readInput(reader, errorMessage);
        } catch (NoSuchElementException err) {
            AnsiWriter.printWithColor(AnsiPalette.CYAN, "Goodbye, be careful! c:");

            System.exit(0);

            return null; // unreachable, but required for compilation
        } catch (Exception err) {
            AnsiWriter.printError(err.getMessage());
            err.printStackTrace();

            System.exit(1);

            return null; // unreachable, but required for compilation
        }
    }

    public static byte readByte() {
        return readInput(scanner::nextByte, "\n!!!- Type a integer number between -128 to 127 -!!!\n");
    }

    public static short readShort() {
        return readInput(scanner::nextShort, "\n!!!- Type a integer number between -32768 to 32767 -!!!\n");
    }

    public static int readInt() {
        return readInput(scanner::nextInt, "\n!!!- Type a integer number between -2147483648 to 2147483647 -!!!\n");
    }

    public static long readLong() {
        return readInput(scanner::nextLong,
                "\n!!!- Type a integer number between -9223372036854775808 to 9223372036854775807 -!!!\n");
    }

    public static float readFloat() {
        return readInput(scanner::nextFloat, "\n!!!- Type a number -!!!\n");
    }

    public static double readDouble() {
        return readInput(scanner::nextDouble, "\n!!!- Type a number -!!!\n");
    }

    public static char readChar() {
        return readInput(() -> scanner.nextLine().charAt(0), "\n!!!- Type a character -!!!\n");
    }

    public static String readString() {
        return readInput(scanner::nextLine, "\n!!!- Type a string -!!!\n");
    }

    public static boolean readBoolean() {
        return readInput(scanner::nextBoolean, "\n!!!- Type a boolean value -!!!\n");
    }
}