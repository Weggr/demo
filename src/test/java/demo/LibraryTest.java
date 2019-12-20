package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
  @Test
  public void testaddition(){
      Library calc = new Library();
      assertEquals(calc.addition(2,5),7);
  }
  @Test
  public void testcarre(){
      Library calc = new Library();
      assertEquals(calc.carre(8), 68);
  }
  @Test
  public void testdivide_y_by_x(){
      Library calc = new Library();
      assertEquals(calc.divide_y_by_x(8,2), 4.0,10E-12);
  }
}
