import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksFromFile1() throws IOException{
        Path fileName = Path.of("/Users/cathy/Downloads/ednafiles-main/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        links.add("https://something.com");
        links.add("some-thing.html");
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile2() throws IOException{
        Path fileName = Path.of("/Users/cathy/Downloads/ednafiles-main/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        links.add("https://something.com");
        links.add("some-page.html");
        assertEquals(links, MarkdownParse.getLinks(content));
    }
    
    @Test
    public void getLinksFromFile3() throws IOException{
        Path fileName = Path.of("/Users/cathy/Downloads/ednafiles-main/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile4() throws IOException{
        Path fileName = Path.of("/Users/cathy/Downloads/ednafiles-main/test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile5() throws IOException{
        Path fileName = Path.of("/Users/cathy/Downloads/ednafiles-main/test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksFromFile6() throws IOException{
        Path fileName = Path.of("/Users/cathy/Downloads/ednafiles-main/test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    public void getLinksFromFile7() throws IOException{
        Path fileName = Path.of("/Users/cathy/Downloads/ednafiles-main/test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    public void getLinksFromFile8() throws IOException{
        Path fileName = Path.of("/Users/cathy/Downloads/ednafiles-main/test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        links.add("a link on the first line");
        assertEquals(links, MarkdownParse.getLinks(content));
    }
}
