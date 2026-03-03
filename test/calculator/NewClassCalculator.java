package calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NewClassCalculator {
    
    @Test
    public void addsTwoNumbers() {
        Calculator calculator = new Calculator ();
        assertEquals ("1 + 1 should equal 2", 2, calculator.add (1,1));
}
    
    @Test
    public void subtractTwoNumbers () {
        Calculator calculator = new Calculator ();
        assertEquals ("2 - 1 should equal 1", 1, calculator.subtract (2, 1)); 
        
        
    }
    
}
