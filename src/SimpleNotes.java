import java.io.*;

//Usage ShowFile <file_name.txt> <data>

public class SimpleNotes{
    public static void main(String[] args){
        FileOutputStream fout;
        if (args.length<1){
            System.out.println("Usage ShowFile <file_name.txt> <data>\n" +
                    "if u need more write 1 word, use:\n" +
                    "On Linux: 'data'\n" +
                    "On Windows \"data\"");
            return;
        }
        try {
            fout = new FileOutputStream(args[0]);
            try {
                fout.write(args[1].getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                fout.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }}