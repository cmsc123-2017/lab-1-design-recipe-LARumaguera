import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ItemTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testItem() {
    Item a = new Item("Ball",3000.0);
    assertEquals("Ball", a.name);
    assertEquals(3000.0, a.price);
    
    Item b = new Item("Jersey", 1000.0);
    assertEquals("Jersey", b.name);
    assertEquals(1000.0, b.price);
    
  }
  
  public void testSalePrice1000(){
    Item c = new Item("Soccer Shoes", 4000.0);
    assertEquals(3600.0, c.salePrice(0.10));  
    
    Item d = new Item("Net", 999.0);
    assertEquals(999.0, d.salePrice(0.05));
                 
    Item e = new Item("Cleats", 1000.0);
    assertEquals(1000.0, e.salePrice(0.15));                 
  }  
}