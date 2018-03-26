package org.rhea.cloudtestjenkins;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class DmathTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DmathTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DmathTest.class );
    }

    public void testDSumExample()
    {
        //ciao
        Dmath exSum = new Dmath(2, 3);
        assertEquals( 5,exSum.DSumExample() );
    }
}
