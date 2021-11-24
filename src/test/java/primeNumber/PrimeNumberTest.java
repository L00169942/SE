package primeNumber;

import static org.junit.Assert.*;

import org.junit.Test;

import primeNumber.PrimeNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrimeNumberTest {

    @Test
    public void testIsPrime() {
        assertTrue("Result", PrimeNumber.checkPrime(37));  
        assertEquals(true,PrimeNumber.checkPrime(11));

    }
}
