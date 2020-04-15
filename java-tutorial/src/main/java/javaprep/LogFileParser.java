package javaprep;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pmukkamala on 7/31/18.
 */
public class LogFileParser {


    //  private static final Scanner scan = new Scanner(System.in);

    public static void main(String args[]) throws Exception {
        // read the string filename

        File filename = new File("logFile.txt");
        Scanner scan = new Scanner(filename);
        while (scan.hasNextLine()) {

            HashMap<String, String> output = new HashMap<String, String>();


            String str = scan.nextLine();
            String regexHostName = "(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*";

            String regexNumberOfBytes = "(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])$";

            Pattern p = Pattern.compile(regexHostName);
            Matcher matcher = p.matcher(str);
            if (matcher.find()) {

                String result = matcher.group();

                String[] temp = str.split("-");
                String hostname = temp[0];
                //parse the string str
                System.out.println("Hostname is: " + hostname);

                Pattern p1 = Pattern.compile(regexNumberOfBytes);
                Matcher matcher1 = p1.matcher(str);
                if (matcher1.find()) {


                    String result1 = matcher1.group();
                    output.put(hostname, result1);


                }

                System.out.println(Arrays.asList(output));

            }
        }
    }
}

