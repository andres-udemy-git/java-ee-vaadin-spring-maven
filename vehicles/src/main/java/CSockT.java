import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class CSockT extends Thread{

    private int id;

    public CSockT(int id) {
        this.id = id;
    }

    public void run() {
        try {
            InetAddress host = InetAddress.getLocalHost();
            int port = 6666;
            Socket socket = new Socket(host, port);
            OutputStream oStream = socket.getOutputStream();
            String message = String.format("Hello from object %d!", id);
            oStream.write(message.getBytes());
            oStream.flush();
            Thread.sleep(200);
            oStream.write("exit".getBytes());
            oStream.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new CSockT(i).start();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
