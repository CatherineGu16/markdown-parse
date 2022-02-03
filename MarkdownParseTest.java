//imports necessary JUnit tester addons
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//class header for the .java file
public class MarkdownParseTest {
    //Labels the next part of code as the test
    @Test
    //creates a test called "addition"
    public void additionFail() {
        //tests whether 2 is equal to 1 + 1
        assertEquals(1, 1 + 1);
    }

    // @Test
    // public void testTestFile1() throws IOException{
    //     Path fileName = Path.of("test-file.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> result = MarkdownParse.getLinks(contents);
    //     assertEquals(result.get(0), "https://something.com");
    //     assertEquals(result.get(1), "some-page.html");
    // }

    // @Test
    // public void testTestFile2() throws IOException{
    //     Path fileName = Path.of("test-file2.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> result = MarkdownParse.getLinks(contents);
    //     List<String> expected = List.of("https://something2.com", "https://something.com", "some-page.html", "youtube.com", "example.com");
    //     assertEquals(result, expected);
    // }

    // @Test
    // public void testTestFile3() throws IOException{
    //     Path fileName = Path.of("test-file3.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> result = MarkdownParse.getLinks(contents);
    //     List<String> expected = List.of("hello.com", "thisiscool.html");
    //     assertEquals(result, expected);
    // }

    // @Test
    // public void testTestFile4() throws IOException{
    //     Path fileName = Path.of("test-file4.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> result = MarkdownParse.getLinks(contents);
    //     List<String> expected = new ArrayList<>();
    //     assertEquals(result, expected);
    // }


}