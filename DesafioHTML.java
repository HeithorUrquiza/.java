import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;

public class DesafioHTML{
    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("Please provide a URL as argument.");
            return;
        }
        
        String url = args[0]; 
        String deepestText = "";
        int deepestLevel = 0;
        int countOpenings = 0;
        int countClosings = 0;

        try {
            URLConnection conected = new URL(url).openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conected.getInputStream()));

            int level = 0;
            StringBuilder text = new StringBuilder();
            for (String line : reader.lines().map(String::trim).toArray(String[]::new)) {
                for (char c : line.toCharArray()) {
                    if (c == '<' && line.toCharArray()[1] != '/') {
                        level++;
                        countOpenings++;
                    } else if (c == '<' && line.toCharArray()[1] == '/') {
                        level--;
                        countOpenings++;
                    }else if(c == '>'){
                        countClosings++;    
                    } else if (line.toCharArray()[0] != '<') {
                        text.append(c);
                    } 
                }
                    
                if (level > deepestLevel) {
                    if(!text.toString().trim().isBlank()){ 
                        deepestLevel = level;
                        deepestText = text.toString().trim();
                    }
                } else if (level < deepestLevel || level == deepestLevel) {
                    continue;
                }

                text = new StringBuilder();
            }

            if (countOpenings != countClosings) {
                System.out.println("Malformed HTML");
            }

            System.out.println("Texto contido no nível mais profundo: " + deepestText);

        } catch (IOException e) {
            System.out.println("URL connection error");
            return;
        }
    }
}


