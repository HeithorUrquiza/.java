package poo.prova_final_visio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Manipulator {

    public static void reader(String path) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = "";
        int os = 0;
        while(true){
            if (line != null){
                System.out.println(line);
                if(line.equals("Os") || line.equals("os"));
                os += 1;
            } else {
                break;
            }
            line = br.readLine();
        }
        System.out.println(os);
        br.close();
    }
}
