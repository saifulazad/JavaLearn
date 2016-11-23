package network; /**
 * Created by Azad on 11-May-16.
 */
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class GreetingClient
{
    public static void main(String [] args)
    {
        String serverName = "192.168.0.102";
        int port =8080;
        while (true)
        try
        {
            System.out.println("Connecting to " + serverName +
                    " on port " + port);
            Socket client = new Socket(serverName, port);
            System.out.println("Just connected to "
                    + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            out.writeUTF(s);
//            out.writeUTF("Hello from "
//                    + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in =
                    new DataInputStream(inFromServer);
            System.out.println("Server says " + in.readUTF());
            client.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}