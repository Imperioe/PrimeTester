package edu.up.cs371.primetester;

import java.util.ArrayList;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        // for now, return a random result
        if (n == 0 || n == 1) {
            return false;
        }
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        for(int i = 3; i <= n; i++){
            boolean prime = true;
            for(int j = 0; j < primes.size(); j++){
                if(i % primes.get(j) == 0){
                    prime = false;
                }
            }
            if(prime == true){
                primes.add(i);
            }
        }
        for(int k = 0; k < primes.size(); k++){
            if(primes.get(k) == n){
                return true;
            }
        }
        return false;
    }
}
