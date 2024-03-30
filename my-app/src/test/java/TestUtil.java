import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp(){ 
    c = new Util(); 
  }

  @Test
  public void test_OneVariable(){
    assertFalse(c.compute(3));
  }

  @Test
  public void test_DivideByTwo(){
    assertFalse(c.compute(4,5,6,7));
  }

  @Test(expected = RuntimeException.class)
  public void test_Zero(){
    c.compute(0,1,2);
  }

  @Test
  public void test_Normal1(){
    assertTrue(c.compute(1,2,3));
  }

  @Test
  public void test_Normal2(){
    assertFalse(c.compute(7,11,11));
  }
}