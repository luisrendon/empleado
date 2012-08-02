import org.junit.*;

import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {


    @Test
    public void alta()
    {
      empleado e = new empleado("luis" ,"rendon", "acosta").save();
    }
    
    @Test
    public void buscar()
    {
      empleado e =  empleado.find("byNombre","luis").first();
      System.out.println("el nombres es : " +e.nombre);
     
    }
    
    @Test
    public void cambio()
    {
      empleado e =  empleado.find("byNombre","luis").first();
      e.nombre = "luis rendon acosta";
      e.save();
      System.out.println("el nombres es : " + e.nombre);
     
    }
    
    @Test
    public void del()
    {
      empleado e =  empleado.find("byNombre","luis rendon acosta").first();
     
      e.delete();
     
    }

    
   

}
