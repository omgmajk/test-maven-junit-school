# Unit Testing with JUnit5 and Maven

### repo: test-maven-junit-school

**Explanation:** This is a school assignment for the course Testverktyg at Jensen Education Yrkeshögskola.

## Test suite

I have chosen to use a test suite where we can chose to run all classes in com.jensen with `@SelectPackages` or run individual classes with `@SelectClasses`. Currently I am using `@SelectClasses` so that I can run them one by one if I wish to.

## Thought process

Each method in each class has a corresponding test method, with the exception of `getCounter()` (that gets tested with each test method in the Calculator2Test-class) in the Calculator2.java-class. The reason for doing so it to get coverage of all methods and make sure that they return the value we seek. Since I did not develop these methods and have no idea what the requirements are, I have decided not to test for functionality I think should be included, rather test the functionality that is already there. 

Typically all tests are ran in an order that is decided by JUnit or possibly JVM, I let this happen in all cases except in the Calculator2Test-class where the `getCounter()`-method needs a specific order. In this case I have used `@TestMethodOrder` and `Order(n)` to force the tests to run in a specific order.

