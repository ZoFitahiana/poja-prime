package com.hei.school.endpoint.prime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Random;

@RestController
public class PrimeController {

    @GetMapping("/prime-number")
    public BigInteger getPrimeNumber() {
        return BigInteger.probablePrime(24, new Random());
    }
}
