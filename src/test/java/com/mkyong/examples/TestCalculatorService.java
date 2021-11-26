package com.mkyong.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestCalculatorService {

    @Test
    public void testCube() {
        CalculatorService obj = new CalculatorService();
        assertEquals(1000, obj.cube(10));
        assertEquals(0, obj.cube(0));
        assertEquals(-8, obj.cube(-2));
    }

    @Test
    public void testSquare() {
        CalculatorService obj = new CalculatorService();
        assertEquals(100, obj.square(10));
        assertEquals(0, obj.square(0));
        assertEquals(4, obj.square(-2));
    }

    @Test
    public void testInverse() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0.1, obj.inverse(10));
        assertEquals(0, obj.inverse(0));
    }

    @Test
    public void testFactorial() {
        CalculatorService obj = new CalculatorService();
        assertEquals(120, obj.factorial(5));
        assertEquals(-1, obj.factorial(-10));
        assertEquals(1, obj.factorial(0));
    }

    @Test
    public void testInverseCosin() {
        CalculatorService obj = new CalculatorService();
        assertEquals(Double.NEGATIVE_INFINITY, obj.inverseCosin(5));
        assertEquals(0, obj.inverseCosin(-10));
        assertEquals(1.5707963267948966, obj.inverseCosin(0));
        assertEquals(3.141592653589793, obj.inverseCosin(-1));
        assertEquals(0.0, obj.inverseCosin(1));
    }

    @Test
    public void testCosin() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0.9961946980917455, obj.cosin(5));
        assertEquals(0.984807753012208, obj.cosin(-10));
    }

    @Test
    public void testSin() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0.08715574274765817, obj.sine(5));
        assertEquals(-0.17364817766693033, obj.sine(-10));
    }

    @Test
    public void testTangent() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0.087488663525924, obj.tangent(5));
        assertEquals(-0.17632698070846498, obj.tangent(-10));
    }

    @Test
    public void testCombination() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0, obj.combination(0, 1));
        assertEquals(0, obj.combination(-1, 10));
        assertEquals(0, obj.combination(1, 10));
        assertEquals(1, obj.combination(10, 0));
        assertEquals(0, obj.combination(5, -1));
        assertEquals(0, obj.combination(5, 20));
        assertEquals(1, obj.combination(5, 5));
        assertEquals(10, obj.combination(5, 2));
    }

    @Test
    public void testNaturalLog() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0, obj.naturalLog(0));
        assertEquals(0, obj.naturalLog(1));
        assertEquals(0, obj.naturalLog(-1));
        assertEquals(0.6931471805599453, obj.naturalLog(2));
    }

    @Test
    public void testAddition() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0, obj.addition(0, 0));
        assertEquals(0, obj.addition(1, -1));
        assertEquals(-9, obj.addition(1, -10));
    }

    @Test
    public void testSubtraction() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0, obj.subtraction(0, 0));
        assertEquals(2, obj.subtraction(1, -1));
        assertEquals(11, obj.subtraction(1, -10));
    }

    @Test
    public void testMultiplication() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0, obj.multiply(0, 0));
        assertEquals(-1, obj.multiply(1, -1));
        assertEquals(-10, obj.multiply(-1, 10));
    }

    @Test
    public void testDivision() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0, obj.division(0, 0));
        assertEquals(0, obj.division(1, 0));
        assertEquals(-0.1, obj.division(-1, 10));
        assertEquals(1, obj.division(10, 10));
    }

    @Test
    public void testModulus() {
        CalculatorService obj = new CalculatorService();
        assertEquals(Integer.MIN_VALUE, obj.modulus(0, 0));
        assertEquals(Integer.MIN_VALUE, obj.modulus(10, 100));
        assertEquals(2, obj.modulus(10, 4));
        assertEquals(0, obj.modulus(4, 4));
    }

    @Test
    public void testPositive() {
        CalculatorService obj = new CalculatorService();
        assertEquals("positive", obj.isPositive(10));
        assertEquals("positive", obj.isPositive(0));
        assertEquals("negative", obj.isPositive(-1));
    }

    @Test
    public void testPowerFunction() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0, obj.powerFunction(10, -20));
        assertEquals(0, obj.powerFunction(0, 10));
        assertEquals(100, obj.powerFunction(10, 2));
        assertEquals(1, obj.powerFunction(10, 0));
    }

    @Test
    public void testSquareRoot() {
        CalculatorService obj = new CalculatorService();
        assertEquals(2, obj.squareRoot(4));
    }

    @Test
    public void testNegate() {
        CalculatorService obj = new CalculatorService();
        assertEquals(-4, obj.negate(4));
        assertEquals(-4, obj.negate(-4));
        assertEquals(-1, obj.negate(-1));
    }

    @Test
    public void testIncrementByOne() {
        CalculatorService obj = new CalculatorService();
        assertEquals(5, obj.incrementByOne(4));
        assertEquals(-3, obj.incrementByOne(-4));
    }

    @Test
    public void testDecrementByOne() {
        CalculatorService obj = new CalculatorService();
        assertEquals(3, obj.decrementByOne(4));
        assertEquals(-5, obj.decrementByOne(-4));
    }

    @Test
    public void testConcatenate() {
        CalculatorService obj = new CalculatorService();
        assertEquals("abc", obj.concatenate("", "abc"));
        assertEquals("abc", obj.concatenate("abc", ""));
        assertEquals("ab c", obj.concatenate("ab", "c"));
    }

    @Test
    public void testAreaOfSquare() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0, obj.areaOfSquare(-2));
        assertEquals(0, obj.areaOfSquare(-1));
        assertEquals(0, obj.areaOfSquare(0));
        assertEquals(4, obj.areaOfSquare(2));
    }

    @Test
    public void testAreaOfRect() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0, obj.areaOfRect(-2, 1));
        assertEquals(0, obj.areaOfRect(2, -3));
        assertEquals(8, obj.areaOfRect(2, 4));
        assertEquals(0, obj.areaOfRect(-1, 5));
//        assertEquals(0, obj.areaOfRect(-1, -1));
        assertEquals(0, obj.areaOfRect(1, -1));
    }

    @Test
    public void testAreaOfCircle() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0, obj.areaOfCircle(-1));
        assertEquals(0, obj.areaOfCircle(0));
        assertEquals(12.568, obj.areaOfCircle(2));
    }

    @Test
    public void testAreaOfSphere() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0, obj.areaOfSphere(-1));
        assertEquals(0, obj.areaOfSphere(0));
        assertEquals(50.272, obj.areaOfSphere(2));
    }

    @Test
    public void testAreaOfCylinder() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0, obj.areaOfCylinder(-2, 1));
        assertEquals(0, obj.areaOfCylinder(-1, 5));
        assertEquals(0, obj.areaOfCylinder(1, -1));
        assertEquals(0, obj.areaOfCylinder(2, -3));
        assertEquals(50.272, obj.areaOfCylinder(2, 4));
    }

    @Test
    public void testMaximum() {
        int arr[] = {};
        int b[] = {1, 2, 3};
        int c[] = {1, 2, 3, 5, 4, 5, 7, 3, 0, 7};
        CalculatorService obj = new CalculatorService();
        assertEquals(-1, obj.Maximum(arr));
        assertEquals(2, obj.Maximum(b));
        assertEquals(9, obj.Maximum(c));
    }

    @Test
    public void testMinimum() {
        int arr[] = {};
        int b[] = {1, 2, 3};
        int c[] = {1, 2, 3, 5, 4, 5, 7, 3, 0, 0};
        CalculatorService obj = new CalculatorService();
        assertEquals(-1, obj.Minimum(arr));
        assertEquals(0, obj.Minimum(b));
        assertEquals(9, obj.Minimum(c));
    }

    @Test
    public void testStringLength() {
        CalculatorService obj = new CalculatorService();
        assertEquals(0, obj.stringLength(null));
        assertEquals(4, obj.stringLength("abcd"));
    }

    @Test
    public void testStringReverse() {
        CalculatorService obj = new CalculatorService();
        assertNull(null, obj.stringReverse(null));
        assertEquals("dcba", obj.stringReverse("abcd"));
    }


}
