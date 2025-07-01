import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * FileOperationsDemo
 * 
 * A simple Java program demonstrating how to:
 *  - Write to a text file
 *  - Read from a text file
 *  - Modify text file contents
 * 
 * DELIVERABLE: Script with clear documentation on file handling.
 */
public class  filereportery{

    public static void main(String[] args) {
        String fileName = "FileDemo.txt";

        // Step 1: Define original content
        List<String> originalContent = Arrays.asList(
            "CREATE A JAVA PROGRAM TO READ,",
            "WRITE, AND MODIFY TEXT FILES.",
            "",
            "INS T R U C T I O NS :",
            "DELIVERABLE: A SCRIPT",
            "DEMONSTRATING FILE OPERATIONS",
            "WITH CLEAR DOCUMENTATION."
        );

        // Step 2: Write original content to file
        writeToFile(fileName, originalContent);
        System.out.println("✅ File created and content written.\n");

        // Step 3: Read and display original content
        System.out.println("📖 Original File Content:");
        List<String> readLines = readFromFile(fileName);
        readLines.forEach(System.out::println);

        // Step 4: Modify content (fix spacing or typos)
        List<String> modifiedContent = new ArrayList<>();
        for (String line : readLines) {
            line = line.replace("INS T R U C T I O NS", "INSTRUCTIONS");
            modifiedContent.add(line);
        }

        // Step 5: Write modified content back to the file
        writeToFile(fileName, modifiedContent);
        System.out.println("\n✍️ File modified successfully.\n");

        // Step 6: Display modified content
        System.out.println("📘 Modified File Content:");
        readFromFile(fileName).forEach(System.out::println);
    }

    /**
     * Writes the given content to the specified file.
     * Creates the file if it doesn't exist or overwrites it.
     */
    public static void writeToFile(String fileName, List<String> content) {
        try {
            Files.write(Paths.get(fileName), content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.err.println("❌ Error writing to file: " + e.getMessage());
        }
    }

    /**
     * Reads content from the specified file and returns it as a list of strings.
     */
    public static List<String> readFromFile(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.err.println("❌ Error reading file: " + e.getMessage());
            return Collections.emptyList();
        }
    }
}

    

