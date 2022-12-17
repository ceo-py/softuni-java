import java.io.*;

public class Main {
    private final static String FILE_PATH = "C:\\Users\\Erik\\Desktop\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream(new File(FILE_PATH));
            int currentByte = fileInputStream.read();
            while (currentByte >= 0){
                System.out.print(Integer.toBinaryString(currentByte) + " ");
                currentByte = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}