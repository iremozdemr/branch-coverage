import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Before;

public class TestCompute {
  Compute c;
  MessageQueue queue;

  @Before
  public void setUp() {
    queue = mock(MessageQueue.class);
    c = new Compute(queue);
  }

  @Test
  public void test_emptyQueue(){
    when(queue.size()).thenReturn(0);
    assertEquals(-1,c.countNumberOfOccurrences("string1"));
  }

  @Test
  public void test_elementNotFound(){
    when(queue.size()).thenReturn(2);
    when(queue.contains("string2")).thenReturn(false);
    assertEquals(0,c.countNumberOfOccurrences("string2"));
  }

  @Test
  public void test_ElementFound(){
    when(queue.size()).thenReturn(4);
    when(queue.contains("string3")).thenReturn(true);
    when(queue.getAt(0)).thenReturn("string3");
    when(queue.getAt(1)).thenReturn("string3");
    when(queue.getAt(2)).thenReturn("string3");
    when(queue.getAt(3)).thenReturn("mystring");
    assertEquals(3,c.countNumberOfOccurrences("string3"));
  }
}