package Stats;

import java.io.*;
import java.util.Scanner;


class ClassThread extends Thread {
    String fileName;
    String word;
    int count;
    
    
    public ClassThread(String filename, String word) {
        this.fileName = filename;
        this.word = word;
        this.count = 0;
    }
    
   
    @Override
    public void run() {
        try {
            Scanner fin = new Scanner(new File(fileName));
            String line;
            while (fin.hasNextLine()) {
                line = fin.nextLine();
                String tab[] = line.split("[ ,.\n]+");
                for (int i = 0; i < tab.length; i++) {
                    if (tab[i].equals(word)) {
                        count++;
                    }
                }
            } 
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public int getCount() {
        return count;
    }
}

public class ClassThreads {
    
    public static void main(String[] args) {
        int total = 0;
        Scanner in = new Scanner(System.in);
        String searchWord = in.next();
        
        ClassThread f1 = new ClassThread("ex1.txt", searchWord);
        ClassThread f2 = new ClassThread("ex2.txt", searchWord);
        ClassThread f3 = new ClassThread("ex3.txt", searchWord);
        
        f1.start();
        f2.start();
        f3.start();
        
        total += f1.getCount();
        total += f2.getCount();
        total += f3.getCount();
        
        System.out.println(total);
    }
} 



