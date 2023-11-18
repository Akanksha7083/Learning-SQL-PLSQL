
//Get all characters from the file, count number of lines, words, characters and display on the screen


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

class FileStats {
    public static void main(String[] args) {
        try {
            
            String fileName = "myFile.txt";
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;

            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                StringTokenizer tokenizer = new StringTokenizer(line);
                wordCount += tokenizer.countTokens();
            }

            reader.close();

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

