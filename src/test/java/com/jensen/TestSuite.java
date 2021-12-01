package com.jensen;
/* Would not run as testsuite.java, had to be TestSuite.java to run */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages; // Not necessary according to Daniel
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages(value = { "com.person" } )

// Add on more classes as we make more to the test suite
@SelectClasses( { CalculatorTest.class, Calculator2Test.class, CupTest.class, BookTest.class } )

// So that we can run tests in order by using @Order(n)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TestSuite {

}