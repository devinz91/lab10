 package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class TestCountryCodes {

  private CountryCodes fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new CountryCodes();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

  @Test
  public void testNegativeTen(){
    assertNull(fixture.fizzBuzzList(-10));
  }
  @Test
  public void testNegativeOne(){
    assertNull(fixture.fizzBuzzList(-1));
  }
  @Test
  public void testZero() {
    assertNull(fixture.fizzBuzzList(0));
  }
  @Test
  public void testOne() {
    List<String> expected= Arrays.asList("1");
    Assert.assertEquals(expected,fixture.fizzBuzzList(1));
  }
  @Test
  public void testSeven() {
    List<String> expected= Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7");
    Assert.assertEquals(expected, fixture.fizzBuzzList(7));
  }
  @Test
  public void testSeventeen() {
    List<String> expected= Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "CountryCodes", "16", "17");
    Assert.assertEquals(expected, fixture.fizzBuzzList(17));

  }

}

