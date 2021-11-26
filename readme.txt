Problem Statement:
Mutation-source-code: Projects that use mutation testing, based on mutation operators applied at the level of a statement within a method or
a function. The mutated program needs to be strongly killed by the designed test cases. At least three different mutation operators should be
used.

Team Members:
- Mohit Choudhary (MT2020134)
- Aditya Satam (MT2020058)
- Shubham Ahlawat (MT2020163)

Source code is in maven-mutation-testing/CalculatorService file.

Designed test cases are in maven-mutation-testing/TestCalculatorService file.

Testing Tool Used:
We use PITesting Tool, which is used in mutation testing for Java code.
PIT is fast, easy to use - works with ant, maven, gradle and others, actively developed, actively supported.
The reports produced by PIT are in an easy to read format combining line coverage and mutation coverage information.
PIT renerated report can be found in target folder, in pit-reports -> index.html
We attached the screenshot of the result generated after testing using PIT, i.e 100% line coverage and 100% Mutation Coverage, you can check this in screen shot attached in folder.

PIT uses Mutators:
-INCREMENTS_MUTATOR
-VOID_METHOD_CALL_MUTATOR
-RETURN_VALS_MUTATOR
-MATH_MUTATOR
-NEGATE_CONDITIONALS_MUTATOR
-INVERT_NEGS_MUTATOR
-CONDITIONALS_BOUNDARY_MUTATOR

Test result examined:
-com.mkyong.examples.TestCalculatorService.testAreaOfCircle() (13 ms)
-com.mkyong.examples.TestCalculatorService.testConcatenate() (11 ms)
-com.mkyong.examples.TestCalculatorService.testModulus() (13 ms)
-com.mkyong.examples.TestCalculatorService.testFactorial() (11 ms)
-com.mkyong.examples.TestCalculatorService.testNegate() (10 ms)
-com.mkyong.examples.TestCalculatorService.testSquare() (71 ms)
-com.mkyong.examples.TestCalculatorService.testDecrementByOne() (12 ms)
-com.mkyong.examples.TestCalculatorService.testInverse() (10 ms)
-com.mkyong.examples.TestCalculatorService.testAreaOfSphere() (11 ms)
-com.mkyong.examples.TestCalculatorService.testSin() (10 ms)
-com.mkyong.examples.TestCalculatorService.testMinimum() (11 ms)
-com.mkyong.examples.TestCalculatorService.testDivision() (11 ms)
-com.mkyong.examples.TestCalculatorService.testStringReverse() (11 ms)
-com.mkyong.examples.TestCalculatorService.testAddition() (175 ms)
-com.mkyong.examples.TestCalculatorService.testSubtraction() (8 ms)
-com.mkyong.examples.TestCalculatorService.testMaximum() (12 ms)
-com.mkyong.examples.TestCalculatorService.testMultiplication() (11 ms)
-com.mkyong.examples.TestCalculatorService.testNaturalLog() (9 ms)
-com.mkyong.examples.TestCalculatorService.testCombination() (11 ms)
-com.mkyong.examples.TestCalculatorService.testInverseCosin() (12 ms)
-com.mkyong.examples.TestCalculatorService.testCube() (8 ms)
-com.mkyong.examples.TestCalculatorService.testIncrementByOne() (12 ms)
-com.mkyong.examples.TestCalculatorService.testPositive() (11 ms)
-com.mkyong.examples.TestCalculatorService.testPowerFunction() (9 ms)
-com.mkyong.examples.TestCalculatorService.testTangent() (9 ms)
-com.mkyong.examples.TestCalculatorService.testStringLength() (11 ms)
-com.mkyong.examples.TestCalculatorService.testSquareRoot() (10 ms)
-com.mkyong.examples.TestCalculatorService.testCosin() (9 ms)
-com.mkyong.examples.TestCalculatorService.testAreaOfCylinder() (16 ms)
-com.mkyong.examples.TestCalculatorService.testAreaOfSquare() (13 ms)
-com.mkyong.examples.TestCalculatorService.testAreaOfRect() (14 ms)