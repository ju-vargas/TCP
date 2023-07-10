package test;
import calculator.*;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc; 
    
    @BeforeClass
    public static void start(){
        System.out.println("Os testes estão iniciando");
    }

    @Before
    public void init(){
        calc = new Calculator();
    }

    @Test
    public void addTest(){
        //soma valida
        double result = calc.add(4.2, 2);
        assertEquals(6.2, result,0);
        
        //soma de positivo e negativo
        result = calc.add(4, -2);
        assertEquals(2, result,0);
    }

    @Test 
    public void divideTest(){
        //divisão 
        double result = calc.divide(4, 2);
        assertEquals(2, result,0);
        
        //divisão por zero
        result = calc.divide(10,0);
        assertEquals(0, result,0);
    }

    @Test
    public void sqrtTest(){
        //raiz valida
        double result = calc.sqrt(4);
        assertEquals(2, result,0);

        //raiz de numero negativo     
        result = calc.sqrt(-1);
        assertEquals(0, result,0);
  
    }

    @AfterClass
    public static void close(){
        System.out.println("Os testes terminaram");
    }
}