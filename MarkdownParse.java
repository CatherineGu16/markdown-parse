import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) {

        ArrayList<String> toReturn = new ArrayList<>();
        int currentIndex = 0;

        while(currentIndex < markdown.length()) {
            int backticks = markdown.indexOf("```", currentIndex);
            int nextOpenBracket = markdown.indexOf("[", currentIndex);

             // No links can be found inside code block
             if(backticks != -1 && backticks < nextOpenBracket) {
                int nextBackticks = markdown.indexOf("```", backticks+1);
                if (nextBackticks == -1) {
                    break;
                }
                currentIndex = nextBackticks+1;
                continue;
            }
            
            // If all links have been found, finish the program
            if(nextOpenBracket == -1){
                break;
            }

            int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
            int openParen = markdown.indexOf("(", nextCloseBracket);
            int closeParen = markdown.indexOf(")", openParen);
            // make sure it is a valid link so nothign between the [ and (
            if (nextOpenBracket == -1 || nextCloseBracket == -1 || openParen == -1 || closeParen == -1) {
                break;
            }
            if (nextCloseBracket == openParen - 1 
                && markdown.indexOf("!") != nextOpenBracket - 1) {
                    toReturn.add(markdown.substring(openParen + 1, closeParen));
           }
            currentIndex = closeParen + 1;
            System.out.println();
        }
        
        return toReturn;

    }
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String contents = Files.readString(fileName);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
} 

//File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
