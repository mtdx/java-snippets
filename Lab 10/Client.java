package Client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;


public class ChatClient {

    public static void main(String[] args) throws IOException{
      Scanner in = new Scanner(System.in);
      System.out.print("Address: ");
      String addr = in.nextLine();
      
      System.out.print("Nr. port: ");
      int port = in.nextInt();
      in.nextLine();
    
      Socket cs = new Socket(addr, port); // calls accept
      
      DataInputStream fin = new DataInputStream(cs.getInputStream());
      DataOutputStream fout = new DataOutputStream(cs.getOutputStream());
      
      String m;
      while (true) {
          System.out.print("mesaj: ");
          m = in.nextLine();
          fout.writeUTF(m);
   
          m = fin.readUTF();
          if (m.equals("stop")) {
              break;
          }
          
          System.out.print("received: " + m);
          in.nextLine();
      }
      
      cs.close();
      fin.close();
      fout.close();
    }
}