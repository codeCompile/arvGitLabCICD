import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {
  
  public static String GREETING = "Hello world!";

  @Test
  void getSum() {
    int result = Hello.getSum(10, 12);
    int expected = 22;
    assertEquals(expected,result);
  }

  public void testMain(String []args) {
    Hello.main(new String[]{"1", "2"});

  }  
}

