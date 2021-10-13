package sajjad;

import java.math.BigInteger;

public class MyCalculator implements AdvanceArtihmetic{

    /*
       Md. Sajjadur Rahman
       2012020299
       5F
       cse_2012020299@lus.ac.bd
       Date : 13 - 10 - 2021
    */

    @Override
    public int divisorSum(int n) {
        int divCout = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            if(n%i==0)divCout +=i;
        }

        return  divCout;
    }

    @Override
    public BigInteger findFactorial(int n) {
        BigInteger result = BigInteger.ONE;

        for(int i = 1 ; i <= n ; i++)
        {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
