# FILE-HANDLING-UTILITY

COMPANY: CODE IT SOLUTION
NAME: SOURAV KUMAR
INTERN ID: :CT04DG1328
DOMAIN: Java Programming. 
DURATION:4WEEKS
MENTOR: NELLA SANTOSH

in my 1st project i have maked these programe by implenting
The Java program provided demonstrates fundamental file handling operations using Java’s Standard I/O (Input/Output) libraries, primarily from the java.io and java.nio.file packages. These tools are essential for performing operations such as creating, reading, writing, and modifying files in Java-based applications.

🔧 Tools Used in the Program:
1. java.nio.file.Files
The Files class from the java.nio.file package provides highly efficient and simplified methods to perform file operations such as reading and writing file content. It is part of the New I/O (NIO) library introduced in Java 7 and is widely used because it simplifies file handling compared to older methods.

write() Method:

Used to write a list of strings (List<String>) directly to a file.

Supports options like StandardOpenOption.CREATE (to create the file if it doesn't exist) and StandardOpenOption.TRUNCATE_EXISTING (to overwrite existing content).

readAllLines() Method:

Reads all lines from a file and returns them as a list.

It handles encoding and buffering internally, making it both efficient and simple to use.

2. java.nio.file.Paths
The Paths utility class is used to create a Path object from a file path string. This Path is passed to Files methods to specify the target file.

Paths.get(fileName) converts a filename into a platform-independent Path object, improving cross-platform compatibility.

3. java.util.List and Arrays
The program makes extensive use of List<String> and Arrays.asList() to manage lines of text in memory. This allows the developer to easily modify file content line-by-line before writing it back.

4. try-catch for Exception Handling
The program uses try-catch blocks to gracefully handle IOException, which might occur due to issues like file not found, permission errors, or file lock. This ensures the program doesn’t crash and instead provides user-friendly error messages.

🧠 Why These Tools Were Chosen:
Simplicity: Using Files.write() and Files.readAllLines() abstracts away many complexities involved in traditional file handling with BufferedReader or FileWriter.

Performance: The NIO package is designed for better performance and scalability, especially for larger files.

Readability: The code is cleaner and more readable, which is important for instructional or internship deliverables.

Cross-Platform Compatibility: Using Paths and NIO-based methods ensures that the program works seamlessly across different operating systems (Windows, Linux, macOS).


