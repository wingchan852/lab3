import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

class SomeStringChecker implements StringChecker {

    @Override
    public boolean checkString(String s) {
        if (s.indexOf('a') == 0 || s.indexOf('e') == 0 || s.indexOf('i') == 0 || s.indexOf('o') == 0
                || s.indexOf('u') == 0)
            return true;
        return false;
    }

}

public class ListTests {
    @Test
    public void testFilter() {
        List<String> input = Arrays.asList("apple", "banana");
        List<String> output = Arrays.asList("apple");
        SomeStringChecker stringChecker = new SomeStringChecker();
        assertEquals(ListExamples.filter(input, stringChecker), output);
    }

    @Test
    public void testFilter2() {
        List<String> input = Arrays.asList("banana");
        List<String> output = Arrays.asList("");
        SomeStringChecker stringChecker = new SomeStringChecker();
        assertEquals(ListExamples.filter(input, stringChecker), output);
    }

    @Test
    public void testFilter3() {
        List<String> input = Arrays.asList("apple", "apple", "banana");
        List<String> output = Arrays.asList("apple", "apple");
        SomeStringChecker stringChecker = new SomeStringChecker();
        assertEquals(ListExamples.filter(input, stringChecker), output);
    }

    @Test
    public void testMerge() {
        List<String> list1 = Arrays.asList("apple", "cat");
        List<String> list2 = Arrays.asList("banana");
        List<String> output = Arrays.asList("apple", "banana", "cat");
        assertEquals(output, ListExamples.merge(list1, list2));
    }

    // @Test
    public void testMerge2() {
        List<String> list1 = Arrays.asList("banana", "cat", "bee");
        List<String> list2 = Arrays.asList("apple");
        List<String> output = Arrays.asList("apple", "banana", "bee", "cat");
        assertEquals(output, ListExamples.merge(list1, list2));
    }

    @Test
    public void testMerge3() {
        List<String> list1 = Arrays.asList("apple", "cat", "banana");
        List<String> list2 = Arrays.asList("banana");
        List<String> output = Arrays.asList("apple", "banana", "banana", "cat");
        assertEquals(output, ListExamples.merge(list1, list2));
    }
}
