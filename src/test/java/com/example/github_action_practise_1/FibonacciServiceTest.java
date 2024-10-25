package com.example.github_action_practise_1;

import com.example.github_action_practise_1.service.FibonacciService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FibonacciServiceTest {

    @Autowired
    private FibonacciService fibonacciService;

    @Test
    public void testThat10thFibonacciNumberIs55(){
        List<Long> result = fibonacciService.generateFibonacci(10);

        // Expected Fibonacci sequence up to the 10th number
        List<Long> expected = List.of(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L);

        assertEquals(expected, result.subList(0, 11));
    }

}
