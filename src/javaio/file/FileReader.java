package javaio.file;

import java.io.*;

/**
 * Created by Azad on 04-May-16.
 */
public class FileReader {

    public static void main(String[] args) throws IOException {

        FileInputStream fstream = new FileInputStream("file.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

//Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
            // Print the content on the console
            if (strLine instanceof String)
            System.out.println (strLine);
        }

//Close the input stream
        br.close();
    }
}
