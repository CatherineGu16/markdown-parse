//imports necessary JUnit tester addons
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//class header for the .java file
public class MarkdownParseTest {
    //Labels the next part of code as the test
    @Test
    //creates a test called "addition"
    public void addition() {
        //tests whether 2 is equal to 1 + 1
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> result = MarkdownParse.getLinks(contents);
        assertEquals(result.get(0), "https://something.com");
        assertEquals(result.get(1), "some-page.html");
    }

    
}