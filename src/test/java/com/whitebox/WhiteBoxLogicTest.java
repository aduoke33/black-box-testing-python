package com.whitebox;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * White-box Testing Test Cases
 * Đạt 100% Statement Coverage và 100% Branch Coverage
 */
@DisplayName("White-box Logic Tests")
class WhiteBoxLogicTest {

    // ============ Test Problem 1: Rectangle ============
    @Test
    @DisplayName("Rectangle: Valid perimeter calculation")
    void testRectanglePerimeterValid() {
        assertEquals(14, WhiteBoxLogic.getRectanglePerimeter(3, 4));
        assertEquals(20, WhiteBoxLogic.getRectanglePerimeter(5, 5));
    }

    @Test
    @DisplayName("Rectangle: Invalid length (<=0)")
    void testRectanglePerimeterInvalidLength() {
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getRectanglePerimeter(0, 5));
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getRectanglePerimeter(-1, 5));
    }

    @Test
    @DisplayName("Rectangle: Invalid width (<=0)")
    void testRectanglePerimeterInvalidWidth() {
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getRectanglePerimeter(5, 0));
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getRectanglePerimeter(5, -2));
    }

    @Test
    @DisplayName("Rectangle: Valid area calculation")
    void testRectangleAreaValid() {
        assertEquals(12, WhiteBoxLogic.getRectangleArea(3, 4));
        assertEquals(25, WhiteBoxLogic.getRectangleArea(5, 5));
    }

    @Test
    @DisplayName("Rectangle: Invalid area dimensions")
    void testRectangleAreaInvalid() {
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getRectangleArea(0, 5));
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getRectangleArea(5, -1));
    }

    // ============ Test Problem 2: Quadratic Equation ============
    @Test
    @DisplayName("Quadratic: a=0, b!=0 => linear equation")
    void testQuadraticLinearEquation() {
        double[] result = WhiteBoxLogic.solveQuadratic(0, 2, -4);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(2.0, result[0]);
    }

    @Test
    @DisplayName("Quadratic: a=0, b=0, c=0 => infinite solutions")
    void testQuadraticInfiniteSolutions() {
        double[] result = WhiteBoxLogic.solveQuadratic(0, 0, 0);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(Double.POSITIVE_INFINITY, result[0]);
    }

    @Test
    @DisplayName("Quadratic: a=0, b=0, c!=0 => no solution")
    void testQuadraticNoSolutionLinear() {
        double[] result = WhiteBoxLogic.solveQuadratic(0, 0, 5);
        assertNull(result);
    }

    @Test
    @DisplayName("Quadratic: Delta > 0 => two distinct roots")
    void testQuadraticTwoRoots() {
        double[] result = WhiteBoxLogic.solveQuadratic(1, -5, 6);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals(3.0, result[0]);
        assertEquals(2.0, result[1]);
    }

    @Test
    @DisplayName("Quadratic: Delta = 0 => one root (double)")
    void testQuadraticOneRoot() {
        double[] result = WhiteBoxLogic.solveQuadratic(1, -2, 1);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(1.0, result[0]);
    }

    @Test
    @DisplayName("Quadratic: Delta < 0 => no real roots")
    void testQuadraticNoRealRoots() {
        double[] result = WhiteBoxLogic.solveQuadratic(1, 0, 1);
        assertNull(result);
    }

    // ============ Test Problem 3: Days in Month ============
    @Test
    @DisplayName("Days in month: 31-day months")
    void testDaysIn31DayMonths() {
        assertEquals(31, WhiteBoxLogic.getDaysInMonth(1, 2024));  // January
        assertEquals(31, WhiteBoxLogic.getDaysInMonth(3, 2024));  // March
        assertEquals(31, WhiteBoxLogic.getDaysInMonth(5, 2024));  // May
        assertEquals(31, WhiteBoxLogic.getDaysInMonth(7, 2024));  // July
        assertEquals(31, WhiteBoxLogic.getDaysInMonth(8, 2024));  // August
        assertEquals(31, WhiteBoxLogic.getDaysInMonth(10, 2024)); // October
        assertEquals(31, WhiteBoxLogic.getDaysInMonth(12, 2024)); // December
    }

    @Test
    @DisplayName("Days in month: 30-day months")
    void testDaysIn30DayMonths() {
        assertEquals(30, WhiteBoxLogic.getDaysInMonth(4, 2024));  // April
        assertEquals(30, WhiteBoxLogic.getDaysInMonth(6, 2024));  // June
        assertEquals(30, WhiteBoxLogic.getDaysInMonth(9, 2024));  // September
        assertEquals(30, WhiteBoxLogic.getDaysInMonth(11, 2024)); // November
    }

    @Test
    @DisplayName("Days in month: February in leap year")
    void testFebruaryLeapYear() {
        assertEquals(29, WhiteBoxLogic.getDaysInMonth(2, 2024)); // Leap year (div by 4)
        assertEquals(29, WhiteBoxLogic.getDaysInMonth(2, 2000)); // Leap year (div by 400)
    }

    @Test
    @DisplayName("Days in month: February in non-leap year")
    void testFebruaryNonLeapYear() {
        assertEquals(28, WhiteBoxLogic.getDaysInMonth(2, 2023)); // Non-leap year
        assertEquals(28, WhiteBoxLogic.getDaysInMonth(2, 1900)); // Not leap (div by 100 but not 400)
    }

    @Test
    @DisplayName("Days in month: Invalid month")
    void testInvalidMonth() {
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getDaysInMonth(0, 2024));
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getDaysInMonth(13, 2024));
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getDaysInMonth(-1, 2024));
    }

    // ============ Test Problem 4: Prime Number ============
    @Test
    @DisplayName("Prime: Numbers < 2 are not prime")
    void testPrimeNegativeAndZeroOne() {
        assertFalse(WhiteBoxLogic.isPrime(-5));
        assertFalse(WhiteBoxLogic.isPrime(0));
        assertFalse(WhiteBoxLogic.isPrime(1));
    }

    @Test
    @DisplayName("Prime: 2 is prime")
    void testPrimeTwo() {
        assertTrue(WhiteBoxLogic.isPrime(2));
    }

    @Test
    @DisplayName("Prime: Even numbers are not prime (except 2)")
    void testPrimeEvenNumbers() {
        assertFalse(WhiteBoxLogic.isPrime(4));
        assertFalse(WhiteBoxLogic.isPrime(10));
        assertFalse(WhiteBoxLogic.isPrime(100));
    }

    @Test
    @DisplayName("Prime: Odd prime numbers")
    void testPrimeOddNumbers() {
        assertTrue(WhiteBoxLogic.isPrime(3));
        assertTrue(WhiteBoxLogic.isPrime(5));
        assertTrue(WhiteBoxLogic.isPrime(7));
        assertTrue(WhiteBoxLogic.isPrime(11));
        assertTrue(WhiteBoxLogic.isPrime(13));
        assertTrue(WhiteBoxLogic.isPrime(17));
        assertTrue(WhiteBoxLogic.isPrime(97));
    }

    @Test
    @DisplayName("Prime: Composite odd numbers")
    void testPrimeCompositeOdd() {
        assertFalse(WhiteBoxLogic.isPrime(9));  // 3*3
        assertFalse(WhiteBoxLogic.isPrime(15)); // 3*5
        assertFalse(WhiteBoxLogic.isPrime(25)); // 5*5
        assertFalse(WhiteBoxLogic.isPrime(49)); // 7*7
    }

    // ============ Test Problem 5: Alternating Sum ============
    @Test
    @DisplayName("Alternating Sum: n < 1 throws exception")
    void testAlternatingSumInvalid() {
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getAlternatingSum(0));
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getAlternatingSum(-5));
    }

    @Test
    @DisplayName("Alternating Sum: S = 1")
    void testAlternatingSumOne() {
        assertEquals(1, WhiteBoxLogic.getAlternatingSum(1));
    }

    @Test
    @DisplayName("Alternating Sum: S = 1 - 2 = -1")
    void testAlternatingSumTwo() {
        assertEquals(-1, WhiteBoxLogic.getAlternatingSum(2));
    }

    @Test
    @DisplayName("Alternating Sum: S = 1 - 2 + 3 = 2")
    void testAlternatingSumThree() {
        assertEquals(2, WhiteBoxLogic.getAlternatingSum(3));
    }

    @Test
    @DisplayName("Alternating Sum: S = 1 - 2 + 3 - 4 = -2")
    void testAlternatingSumFour() {
        assertEquals(-2, WhiteBoxLogic.getAlternatingSum(4));
    }

    @Test
    @DisplayName("Alternating Sum: Large n")
    void testAlternatingSumLarge() {
        assertEquals(50, WhiteBoxLogic.getAlternatingSum(100)); // (100-99)/2 = 50
        assertEquals(-50, WhiteBoxLogic.getAlternatingSum(99));  // (1-99)/2 = -50
    }

    // ============ Test Problem 6: GCD ============
    @Test
    @DisplayName("GCD: Negative input throws exception")
    void testGCDNegative() {
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getGCD(-5, 10));
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getGCD(10, -5));
    }

    @Test
    @DisplayName("GCD: When a = 0")
    void testGCDZeroA() {
        assertEquals(5, WhiteBoxLogic.getGCD(0, 5));
    }

    @Test
    @DisplayName("GCD: When b = 0")
    void testGCDZeroB() {
        assertEquals(5, WhiteBoxLogic.getGCD(5, 0));
    }

    @Test
    @DisplayName("GCD: Both zeros")
    void testGCDZeroBoth() {
        assertEquals(0, WhiteBoxLogic.getGCD(0, 0));
    }

    @Test
    @DisplayName("GCD: Standard cases")
    void testGCDStandard() {
        assertEquals(12, WhiteBoxLogic.getGCD(36, 24));
        assertEquals(1, WhiteBoxLogic.getGCD(13, 7));
        assertEquals(5, WhiteBoxLogic.getGCD(25, 15));
        assertEquals(10, WhiteBoxLogic.getGCD(100, 50));
    }

    @Test
    @DisplayName("GCD: When numbers are equal")
    void testGCDEqual() {
        assertEquals(5, WhiteBoxLogic.getGCD(5, 5));
        assertEquals(10, WhiteBoxLogic.getGCD(10, 10));
    }

    @Test
    @DisplayName("GCD: When one divides the other")
    void testGCDDivisor() {
        assertEquals(3, WhiteBoxLogic.getGCD(3, 9));
        assertEquals(7, WhiteBoxLogic.getGCD(7, 14));
    }

    // ============ Test Problem 7: Factorial ============
    @Test
    @DisplayName("Factorial: Negative input throws exception")
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.factorial(-1));
    }

    @Test
    @DisplayName("Factorial: 0! = 1 and 1! = 1")
    void testFactorialBaseCase() {
        assertEquals(1, WhiteBoxLogic.factorial(0));
        assertEquals(1, WhiteBoxLogic.factorial(1));
    }

    @Test
    @DisplayName("Factorial: Standard values")
    void testFactorialStandard() {
        assertEquals(2, WhiteBoxLogic.factorial(2));
        assertEquals(6, WhiteBoxLogic.factorial(3));
        assertEquals(24, WhiteBoxLogic.factorial(4));
        assertEquals(120, WhiteBoxLogic.factorial(5));
        assertEquals(720, WhiteBoxLogic.factorial(6));
    }

    @Test
    @DisplayName("Sum of Factorials: n < 1 throws exception")
    void testSumOfFactorialsInvalid() {
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getSumOfFactorials(0));
        assertThrows(IllegalArgumentException.class, () ->
            WhiteBoxLogic.getSumOfFactorials(-1));
    }

    @Test
    @DisplayName("Sum of Factorials: S = 1! = 1")
    void testSumOfFactorialsOne() {
        assertEquals(1, WhiteBoxLogic.getSumOfFactorials(1));
    }

    @Test
    @DisplayName("Sum of Factorials: S = 1! + 2! = 3")
    void testSumOfFactorialsTwo() {
        assertEquals(3, WhiteBoxLogic.getSumOfFactorials(2));
    }

    @Test
    @DisplayName("Sum of Factorials: S = 1! + 2! + 3! = 9")
    void testSumOfFactorialsThree() {
        assertEquals(9, WhiteBoxLogic.getSumOfFactorials(3));
    }

    @Test
    @DisplayName("Sum of Factorials: S = 1! + 2! + 3! + 4! = 33")
    void testSumOfFactorialsFour() {
        assertEquals(33, WhiteBoxLogic.getSumOfFactorials(4));
    }

    @Test
    @DisplayName("Sum of Factorials: S = 1! + 2! + 3! + 4! + 5! = 153")
    void testSumOfFactorialsFive() {
        assertEquals(153, WhiteBoxLogic.getSumOfFactorials(5));
    }

    @Test
    @DisplayName("Sum of Factorials: Larger n")
    void testSumOfFactorialsLarge() {
        long result = WhiteBoxLogic.getSumOfFactorials(10);
        // 1 + 2 + 6 + 24 + 120 + 720 + 5040 + 40320 + 362880 + 3628800 = 4037913
        assertEquals(4037913, result);
    }
}
