import java.io.*;

public class Main {

    // specify file to read from below
    static String FILE = "C:\\=DATA\\#WORK\\IDEA projects\\javaHW1.Task1.v02\\src\\Logs.txt";

    // specify string to find below
    static String STRING_TO_FIND = "ERROR";


    public static void main(String[] args) {
        System.out.println("\n" + "Searching string: " + "'" + STRING_TO_FIND +"'"+ " in the file: " + "'" + FILE + "'"+ "\n" + "====================================");

        try{
            FileInputStream fstream = new FileInputStream(FILE);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            // specify file to write to below
            FileWriter writer = new FileWriter("C:\\=DATA\\#WORK\\IDEA projects\\javaHW1.Task1.v02\\src\\errorLogs.txt", false);
        int lineNum = 0;
        int matchCount = 0;
        String strLine;
            while ((strLine = br.readLine()) != null){
                //System.out.println(strLine);
                lineNum++;

                if(strLine.indexOf(STRING_TO_FIND) > -1) {
                    if (matchCount == 0) {System.out.println("'"+ STRING_TO_FIND + " was found on line(s)"+ "\n");
                    }
                    String textToWrite = "Str. " + lineNum +": " + strLine + "\n";
                    System.out.println(textToWrite);

                    writer.write(textToWrite);
                    writer.flush();
                    matchCount++;
                }

            }

            System.out.println("TOTAL " + matchCount+ " LINES FOUND");
            if (matchCount == 0) {System.out.println("\n" + "### String: '" + STRING_TO_FIND +"'" +" not found! ###");
            }
        }



        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }



}
