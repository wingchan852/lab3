import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReverseInPlace2() {
    int[] input2 = { 3, 4, 1 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] { 1, 4, 3 }, input2);
  }

  @Test
  public void testReverseInPlace3() {
    int[] input3 = {};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[] {}, input3);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input2 = { 1, 2, 3 };
    assertArrayEquals(new int[] { 3, 2, 1 }, ArrayExamples.reversed(input2));
  }

  @Test
  public void testReversed3() {
    int[] input3 = { 1 };
    assertArrayEquals(new int[] { 1 }, ArrayExamples.reversed(input3));
  }
}
