package com.jensen;
/* Would not run as testsuite.java, had to be TestSuite.java to run */
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages; // Not necessary according to Daniel
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages(value = { "com.jensen" } )

// Add on more classes as we make more to the test suite
@SelectClasses( { CalculatorTest.class, Calculator2Test.class, CupTest.class, BookTest.class } )

public class TestSuite {

}