# Reader Class - User Input Simplified 🎉

The `Reader` class is a utility class designed to simplify the process of getting user input in Java applications. It uses a `Scanner` object to read input and handles `InputMismatchException` and `NoSuchElementException` errors gracefully.

## How to Use 🚀

The `Reader` class provides several methods to read different types of input from the user:

- `readString()`: Reads a `String` from the user.
- `readChar()`: Reads a `char` from the user.
- `readInt()`: Reads an `int` from the user.
- `readLong()`: Reads a `long` from the user.
- `readDouble()`: Reads a `double` from the user.
- `readFloat()`: Reads a `float` from the user.
- `readByte()`: Reads a `byte` from the user.
- `readShort()`: Reads a `short` from the user.
- `readBoolean()`: Reads a `boolean` from the user.

Here's an example of how to use the `Reader` class to read an integer from the user:

```java
int number = Reader.readInt();
```

In this example, if the user enters something that's not an integer, the `Reader` class will print an error message and prompt the user for input again.

## Integration with IntelliJ and VSCode 🛠️

To use the `Reader` class in your IntelliJ or VSCode project, you need to include the `Reader` class's JAR file in your project's classpath.

### IntelliJ

1. Go to `File > Project Structure > Modules`.
2. Click on the `Dependencies` tab.
3. Click on the `+` button and select `JARs or directories`.
4. Navigate to the location of the `Reader` class's JAR file, select it, and click `OK`.
5. Click `Apply` and then `OK`.

### VSCode

1. Copy the `Reader` class's JAR file to a `lib` directory in your project.
2. Update your `.vscode/settings.json` file to include the `lib` directory in your project's classpath. The `java.project.referencedLibraries` setting should include `"lib/**/*.jar"`.

Your `.vscode/settings.json` file should look something like this:

```json
{
    "java.project.sourcePaths": ["src"],
    "java.project.outputPath": "bin",
    "java.project.referencedLibraries": [
        "lib/**/*.jar"
    ]
}
```

3. Restart VSCode to ensure the new settings take effect.

Now, you should be able to use the `Reader` class in your project. Enjoy coding! 🎈🎈🎈
