package network; /**
 * Created by Azad on 11-May-16.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * What Is a Socket?

 A socket is one end-point of a two-way communication link between two
 programs running on the network. Socket classes are used to represent
 the connection between a client program and a server program. The java.net
 package provides two classes--Socket and ServerSocket--that implement the
 client side of the connection and the server side of the connection,
 respectively.
 */
import java.net.*;
import java.io.*;

public class Server extends Thread
{
    private ServerSocket serverSocket;

    public Server(int port) throws IOException
    {
        serverSocket = new ServerSocket(port);
        //serverSocket.setSoTimeout(10000);
    }
    private String process(DataInputStream in){
        return "";
    }
    public void run()
    {
        while(true)
        {

            try
            {

                System.out.println("Waiting for client on port " +
                        serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("Just connected to "
                        + server.getRemoteSocketAddress());
                DataOutputStream out =
                        new DataOutputStream(server.getOutputStream());

                DataInputStream in =
                        new DataInputStream(server.getInputStream());

                String s = in.readUTF();
                if (s.compareTo("Hi") ==0){
                    out.writeUTF("Hello");
                    continue;
                }


                System.out.println();
                  out.writeUTF("A response from Server Echo " );
                server.close();
            }catch(SocketTimeoutException s)
            {
                System.out.println("Socket timed out!");
                break;
            }catch(IOException e)
            {
                e.printStackTrace();
                break;
            }
        }
    }
    public static void main(String [] args)
    {
        int port = 8080;
        try
        {
            Thread t = new Server(port);
            t.start();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
