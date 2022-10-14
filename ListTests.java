import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

class SomeStringChecker implements StringChecker {

    @Override
    public boolean checkString(String s) {

        return false;
    }

}

public class ListTests {
    // @Test
    // public void testFilter() {
    // List<String> input1 = Arrays.asList("apple", "banana");
    // List<String> output = Arrays.asList("apple", "banana");
    // assertEquals(ListExamples.filter(input1, ));
    // }

    // @Test
    // public void testFilter2() {
    // int[] input2 = { 1, 2, 3 };
    // assertArrayEquals(new int[] { 1, 2, 3 }, input2);
    // }

    // @Test
    // public void testFilter3() {
    // int[] input3 = { 1, 1, 2, 3 };
    // assertArrayEquals(new int[] { 1, 1, 2, 3 }, input3);
    // }

    // @Test
    public void testMerge() {
        List<String> list1 = Arrays.asList("apple", "cat");
        List<String> list2 = Arrays.asList("banana");
        List<String> output = Arrays.asList("apple", "banana", "cat");
        assertEquals(output, ListExamples.merge(list1, list2));
    }

    @Test
    public void testMerge2() {
        List<String> list1 = Arrays.asList("banana", "cat");
        List<String> list2 = Arrays.asList("apple");
        List<String> output = Arrays.asList("apple", "banana", "cat");
        assertEquals(output, ListExamples.merge(list1, list2));
    }

    // @Test
    public void testMerge3() {
        List<String> list1 = Arrays.asList("apple", "cat", "banana");
        List<String> list2 = Arrays.asList("banana");
        List<String> output = Arrays.asList("apple", "banana", "banana", "cat");
        assertEquals(output, ListExamples.merge(list1, list2));
    }
}
