# Unit Testing with JUnit5 and Maven

### repo: test-maven-junit-school

**Explanation:** This is a school assignment for the course Testverktyg at Jensen Education Yrkeshögskola.

## Test suite

I have chosen to use a test suite where we can choose to run all classes in `com.jensen` with `@SelectPackages` or run individual classes with `@SelectClasses`. Currently I am using `@SelectClasses` so that I can run them one by one if I wish to.

## Thought process

Each method in each class has a corresponding test method, with the exception of `getCounter()` (that gets tested with each other test method) in the **Calculator2.java-class**. The reason for doing so is to get coverage of all methods and make sure that they return the value we seek. 

Since I did not develop these methods and have no idea what the requirements are, I have decided not to test for functionality I think should be included, rather test the functionality that is already there. 

Typically all tests are ran in an order that is decided by JUnit or possibly JVM, I let this happen in all cases except in the **Calculator2Test-class** where the `getCounter()`-method needs a specific order. In this case I have used `@TestMethodOrder` and `Order(n)` to force the tests to run in a specific order.

In the **CalculatorTest-class** there are no return-values with the methods, thus I decided instead on capturing STDOUT/Console output by setting PrintStream to a `ByteArrayOutputStream` that I can later convert to a string and test against. Each test method thus has a setup method that is run with the `@BeforeEach` statement. This `ByteArrayOutputStream`is not reset between calls, so each method contains only one test. To test another output, I have to create a new method, with the way I chose to do it. 

In `outputTestExecuteDefaultUnicode()`still in the **CalculatorTest-class** I test with the unicode character ✔ - a non-ascii character. This is not returned from JVM, instead a `?`comes back. I have decided to test for that, since tests will fail otherwise, which is not ideal but these classes will not be further developed.

## Test design

The classes in this exercise are very basic and has no method overloading, so in many cases it's hard to find ways to test outside of normal `assertEquals`. A lot of the time IntelliJ will also *simplify* the tests down to `assertEquals` or `assertTrue` giving them even less variation. 

In a lot of the classes there is also a lack of exception handling. But when these are present, I have decided to test with values that are caught in exceptions by using `assertThrows(IllegalArgumentException.class)` in order to fetch the message and test for equality with `assertEqual`. In the **Calculator2Test-class** I also test one of the methods for overflow when using **Integer.MAX_VALUE + 1**, if this was in production the developers might hinder this kind of behaviour, but here I just let the test pass.