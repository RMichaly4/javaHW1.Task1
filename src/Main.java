import java.io.*;

public class Main {

    // specify file below
    static String FILE = "C:\\=DATA\\#WORK\\TestScripts\\javaHW1.Task1.v02\\src\\Logs.txt";

    // specify string to find below
    static String STRING_TO_FIND = "ERROR";


    public static void main(String[] args) {
        System.out.println("\n" + "Searching string: " + "'" + STRING_TO_FIND +"'"+ " in the file: " + "'" + FILE + "'"+ "\n" + "***************************************" + "\n");
//      int matchCount = 0;


        try{
            FileInputStream fstream = new FileInputStream(FILE);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            int lineNum = 0;
            int matchCount = 0;
            while ((strLine = br.readLine()) != null){
                //System.out.println(strLine);
                lineNum++;

                if(strLine.indexOf(STRING_TO_FIND) > -1) {
                    if (matchCount == 0) {System.out.println("'StringToFind' was found on line(s)"+ "\n");
                    }
                    System.out.println("Str. " + lineNum +": " + strLine + "\n" );
                    matchCount++;
                }


            }

            System.out.println("TOTAL " + matchCount+ " LINES FOUND");
            if (matchCount == 0) {System.out.println("\n" + "!!! 'StringToFind' not found !!!");
            }

        }

        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }



}
