import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class Example2 {
    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("g:/MyFile.txt");
            readAllByByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();
            InputStream inURL = new URL("https://www.google.com/").openStream();
            readAllByByte(inURL);
            System.out.println("\n\n\n");
            inURL.close();
            InputStream inArray = new ByteArrayInputStream(new byte[] {97,98,99,100,101});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public static void readAllByByte(InputStream in) throws IOException {
        while (true){
            int oneByte = in.read();
            if (oneByte != -1){
                System.out.print((char) oneByte);
            } else {
                System.out.println("\nend");
                break;
            }
        }
    }
}
