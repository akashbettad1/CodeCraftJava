package codingpractices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FindStringInFile {

    /**
     * Checks if the specified string is present in the given file.
     *
     * @param searchString the string to search for
     * @param file the file to search in
     * @return true if the string is found, false otherwise
     * @throws IOException if an I/O error occurs
     */
    public static boolean isStringPresentInFile(String searchString, File file) throws IOException {
        if (searchString == null || searchString.isEmpty() || file == null || !file.exists() || !file.canRead()) {
            return false;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchString)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");

        FindStringInFile obj = new FindStringInFile();
        System.out.println(obj.isStringPresentInFile("first", file));
        System.out.println(obj.isStringPresentInFile("second", file));
        System.out.println(obj.isStringPresentInFile("third", file));
    }
}