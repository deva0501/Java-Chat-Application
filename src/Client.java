import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 5000);

            System.out.println("Connected to Server!");

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            writer.println("a networking demo");

            writer.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}