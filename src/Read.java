import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Read {
    public static byte readByte() {
        Scanner scanner = new Scanner(System.in);
        byte n = 0;

        try {
            n = scanner.nextByte();
        } catch (InputMismatchException err) {
            System.err.println("\n!!!! Digite um número inteiro !!!!\n");
            readByte();
        } catch (NoSuchElementException err) {
            System.out.println("Goodbye, be careful! c:");
        } finally {
            scanner.close();
        }

        return n;
    }

    public static short readShort() {
        Scanner scanner = new Scanner(System.in);
        short n = 0;

        try {
            n = scanner.nextShort();
        } catch (InputMismatchException err) {
            System.err.println("\n!!!! Digite um número inteiro !!!!\n");
            readShort();
        } catch (NoSuchElementException err) {
            System.out.println("Goodbye, be careful! c:");
        } finally {
            scanner.close();
        }

        return n;
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        try {
            n = scanner.nextInt();
        } catch (InputMismatchException err) {
            System.err.println("\n!!!! Digite um número inteiro !!!!\n");
            readInt();
        } catch (NoSuchElementException err) {
            System.out.println("Goodbye, be careful! c:");
        } finally {
            scanner.close();
        }

        return n;
    }

    public static long readLong() {
        Scanner scanner = new Scanner(System.in);
        long n = 0;

        try {
            n = scanner.nextLong();
        } catch (InputMismatchException err) {
            System.err.println("\n!!!! Digite um número inteiro !!!!\n");
            readLong();
        } catch (NoSuchElementException err) {
            System.out.println("Goodbye, be careful! c:");
        } finally {
            scanner.close();
        }

        return n;
    }

    public static float readFloat() {
        Scanner scanner = new Scanner(System.in);
        float n = 0;

        try {
            n = scanner.nextFloat();
        } catch (InputMismatchException err) {
            System.err.println("\n!!!! Digite um número inteiro !!!!\n");
            readFloat();
        } catch (NoSuchElementException err) {
            System.out.println("Goodbye, be careful! c:");
        } finally {
            scanner.close();
        }

        return n;
    }

    public static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        double n = 0;

        try {
            n = scanner.nextDouble();
        } catch (InputMismatchException err) {
            System.err.println("\n!!!! Digite um número inteiro !!!!\n");
            readDouble();
        } catch (NoSuchElementException err) {
            System.out.println("Goodbye, be careful! c:");
        } finally {
            scanner.close();
        }

        return n;
    }
}
