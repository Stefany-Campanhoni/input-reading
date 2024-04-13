import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.function.Supplier;

public class Read {
    private static Scanner scanner = new Scanner(System.in);

    private static <T> T readInput(Supplier<T> reader, String errorMessage) {
        try {
            return reader.get();
        } catch (InputMismatchException err) {
            System.err.println(errorMessage);
            System.out.print("Type enter to continue...");
            scanner.next(); // discard invalid input
            return readInput(reader, errorMessage);
        } catch (NoSuchElementException err) {
            System.out.println("Goodbye, be careful! c:");
            System.exit(0);
            return null; // unreachable, but required for compilation
        } catch (Exception err) {
            System.err.println("An unexpected error occurred: " + err.getMessage());
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

    public static char readChar() {
        return readInput(() -> scanner.next().charAt(0), "\n!!!- Type a character -!!!\n");
    }

    public static String readString() {
        return readInput(scanner::nextLine, "\n!!!- Type a string -!!!\n");
    }
}