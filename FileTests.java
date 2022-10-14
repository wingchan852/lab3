import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class FileTests {
    @Test
    public void testGetFile() throws IOException {
        List<File> input = new ArrayList<>();
        File file = new File("some-files/a.txt");
        input.add(file);
        File output = new File("some-files/a.txt");
        assertEquals(input, FileExample.getFiles(output));
    }

    @Test
    public void testGetFile1() throws IOException {
        List<File> input = new ArrayList<>();
        File file1 = new File("some-files/a.txt");
        File file2 = new File("some-files/more-files/b.txt");
        File file3 = new File("some-files/more-files/c.java");
        File file4 = new File("some-files/even-more-files/d.java");
        File file5 = new File("some-files/even-more-files/a.txt");
        input.add(file1);
        input.add(file2);
        input.add(file3);
        input.add(file4);
        input.add(file5);
        File output = new File("some-files/");
        assertEquals(input, FileExample.getFiles(output));
    }
}
