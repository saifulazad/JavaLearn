package javaio.file;

import java.io.*;

/**
 * Created by Azad on 04-May-16.
 */
public class FileWritterC {

    public static void main(String[] args) throws IOException {
        /**
         * pass file name (Which file we want to read) as a constructor FileInputStream
         */

        File inputfile = new File("file.txt");


        FileInputStream fstream = new FileInputStream(inputfile);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));


        /**
         * pass file name (Which file we want to write) and Encoding type as a constructor PrintWriter
         */
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");

        String strLine;

        while ((strLine = br.readLine()) != null)   {


            // Print the content on the file

            writer.printf("Amar value %s%n", strLine);

        }

        //Close the input stream
        br.close();
        writer.close();

    }
}
