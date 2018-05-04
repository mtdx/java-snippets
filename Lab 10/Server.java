package Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ChatServer {

    public static void main(String[] args) throws IOException{
      Scanner in = new Scanner(System.in);
      System.out.print("Nr. port: ");
      int port = in.nextInt();
    
      ServerSocket ss = new ServerSocket(port);
      System.out.println("Server ON"); 
      in.nextLine();
      
      Socket cs = ss.accept();
      System.out.println("Server accepts clients");
      
      DataInputStream fin = new DataInputStream(cs.getInputStream());
      DataOutputStream fout = new DataOutputStream(cs.getOutputStream());
      
      String m;
      while (true) {
          m = fin.readUTF();
          System.out.println("in: " + m);
          
          if (m.equals("stop")) {
              break;
          }
          
          System.out.print("out: ");
          m = in.nextLine();
          fout.writeUTF(m);
      }
      
      ss.close();
      cs.close();
      fin.close();
      fout.close();
    }
}
