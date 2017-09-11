import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class JeepneyTripTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testJeepneyTrip() {
    JeepneyTrip t = new JeepneyTrip(5, 5, 3);
    
    assertEquals(5.0, t.distance);
    assertEquals(5, t.totalPassengers);
    assertEquals(3, t.discountPassengers);
  }
  
  public void testFareChange() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 0);
    JeepneyTrip t1 = new JeepneyTrip(7, 2, 0);
    JeepneyTrip t2 = new JeepneyTrip(5, 1, 1);
    JeepneyTrip t3 = new JeepneyTrip(7, 1, 1);
    
    assertEquals(13.0, t.fareChange(20));
    assertEquals(4.0, t1.fareChange(20));
    
    assertEquals(4.0, t2.fareChange(10));
    assertEquals(3.0, t3.fareChange(10));
  }
  
  public void testTotalFarre(){
    JeepneyTrip t = new JeepneyTrip(5, 1, 0);
    JeepneyTrip t1 = new JeepneyTrip(7, 3, 1);
    JeepneyTrip t2 = new JeepneyTrip(5, 1, 1);
    JeepneyTrip t3 = new JeepneyTrip(7, 4, 0);
    
    assertEquals(7.0, t.totalFare());
    assertEquals(23.0, t1.totalFare());
    assertEquals(6.0, t.totalFare());
    assertEquals(29.0, t.totalFare());
  }
  
  public void testIsBeyond5Km(){
    JeepneyTrip t = new JeepneyTrip(4, 3, 1);
    JeepneyTrip t1 = new JeepneyTrip(7, 1, 0);
    JeepneyTrip t2 = new JeepneyTrip(5, 4, 0);
    
    assertEquals(false, t.isBeyond5Km());
    assertEquals(true, t1.isBeyond5Km());
    assertEquals(false, t2.isBeyond5Km());
  }
  
  public void testDiscountedFare(){
    JeepneyTrip t = new JeepneyTrip(5, 1, 0);
    JeepneyTrip t1 = new JeepneyTrip(7, 2, 0);
    JeepneyTrip t2 = new JeepneyTrip(5, 1, 1);
    JeepneyTrip t3 = new JeepneyTrip(7, 1, 1);
    JeepneyTrip t4 = new JeepneyTrip(7, 2, 1);
    
    assertEquals(0.0, t.discountedFare());
    assertEquals(0.0, t1.discountedFare());
    assertEquals(6.0, t2.discountedFare());
    assertEquals(7.0, t3.discountedFare());
    assertEquals(7.0, t4.discountedFare());
  }
  
   public void testNoDiscountFare(){
    JeepneyTrip t = new JeepneyTrip(5, 1, 0);
    JeepneyTrip t1 = new JeepneyTrip(7, 2, 0);
    JeepneyTrip t2 = new JeepneyTrip(5, 1, 1);
    JeepneyTrip t3 = new JeepneyTrip(7, 1, 1);
    JeepneyTrip t4 = new JeepneyTrip(7, 2, 1);
    
    assertEquals(7.0, t.noDiscountFare());
    assertEquals(15.0, t1.noDiscountFare());
    assertEquals(0.0, t2.noDiscountFare());
    assertEquals(0.0, t3.noDiscountFare());
    assertEquals(8.0, t4.noDiscountFare());
  }
  
}
