import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testPrepend() {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(1);
        assertEquals(1, linkedList.first());
    }

    @Test
    public void testPrepend1() {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(1);
        linkedList.prepend(2);
        assertEquals(2, linkedList.first());
    }

    @Test
    public void testAppend() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        assertEquals(1, linkedList.last());
    }

    @Test
    public void testAppend1() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(9);
        assertEquals(9, linkedList.last());
    }

    @Test
    public void testAppend2() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        assertEquals(2, linkedList.last());
    }

    @Test
    public void testLength() {
        LinkedList linkedList = new LinkedList();
        assertEquals(0, linkedList.length());
    }

    @Test
    public void testLength1() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        assertEquals(1, linkedList.length());
    }

    @Test
    public void testLength2() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(1);
        linkedList.append(1);
        assertEquals(3, linkedList.length());
    }

    @Test
    public void testToString() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(1);
        linkedList.append(1);
        assertEquals("1 1 1 ", linkedList.toString());
    }

    @Test
    public void testToString1() {
        LinkedList linkedList = new LinkedList();
        assertEquals("", linkedList.toString());
    }

}
