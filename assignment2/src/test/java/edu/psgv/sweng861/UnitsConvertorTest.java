package edu.psgv.sweng861;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * This class performs the JUnit tests for the UnitsConvertor.java class
 * And provides 95% code coverage
 * @author Evan Pomponio
 *
 */
class UnitsConvertorTest {
    /*
     * test to convert 1 inch to metric
     */
    @Test
    void testInchToMetric() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 inch".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "1 inch is:\n" +
                        "25.400000 mm\n" +
                        "2.540000 cm\n" +
                        "0.025400 m\n" +
                        "0.000025 km";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test to convert 1 foot to metric
     */
    @Test
    void testFootToMetric() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 foot".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "1 foot is:\n" +
                        "304.800000 mm\n" +
                        "30.480000 cm\n" +
                        "0.304800 m\n" +
                        "0.000305 km";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test to convert 1 yard to metric
     */
    @Test
    void testYardToMetric() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 yd".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "1 yd is:\n" +
                        "914.400000 mm\n" +
                        "91.440000 cm\n" +
                        "0.914400 m\n" +
                        "0.000914 km";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test to convert 1 mile to metric
     */
    @Test
    void testMileToMetric() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 mile".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "1 mile is:\n" +
                        "1609344.000000 mm\n" +
                        "160934.400000 cm\n" +
                        "1609.344000 m\n" +
                        "1.609344 km";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test to convert 1 mil to metric
     */
    @Test
    void testMilToMetric() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 mil".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "1 mil is:\n" +
                        "0.025400 mm\n" +
                        "0.002540 cm\n" +
                        "0.000025 m\n" +
                        "0.000000 km";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test to convert 1 millimeter to imperial
     */
    @Test
    void testMmToImperial() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 mm".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "1 mm is:\n" +
                        "39 mil\n" +
                        "0.039 inch\n" +
                        "0.0033 ft\n" +
                        "0.0011 yard\n" +
                        "6.2e-07 mile";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test to convert 1 centimeter to imperial
     */
    @Test
    void testCmToImperial() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 cm".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "1 cm is:\n" +
                        "3.9e+02 mil\n" +
                        "0.39 inch\n" +
                        "0.033 ft\n" +
                        "0.011 yard\n" +
                        "6.2e-06 mile";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test to convert 1 meter to imperial
     */
    @Test
    void testMeterToImperial() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 m".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "1 m is:\n" +
                        "3.9e+04 mil\n" +
                        "39 inch\n" +
                        "3.3 ft\n" +
                        "1.1 yard\n" +
                        "0.00062 mile";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test to convert 1 kilometer to imperial
     */
    @Test
    void testKmToImperial() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 km".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "1 km is:\n" +
                        "3.9e+07 mil\n" +
                        "3.9e+04 inch\n" +
                        "3.3e+03 ft\n" +
                        "1.1e+03 yard\n" +
                        "0.62 mile";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test for invalid unit (second argument) parameter
     */
    @Test
    void testInvalidUnit() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 xv".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "Invalid input";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test for invalid number (first argument) parameter
     */
    @Test
    void testInvalidNumber() {
        ByteArrayInputStream in = new ByteArrayInputStream("A mile".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "Invalid input";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test to convert larger km value imperial
     */
    @Test
    void testLargeKmToImperial() {
        ByteArrayInputStream in = new ByteArrayInputStream("20 km".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "20 km is:\n" +
                        "7.9e+08 mil\n" +
                        "7.9e+05 inch\n" +
                        "6.6e+04 ft\n" +
                        "2.2e+04 yard\n" +
                        "12 mile";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test to convert larger mile value metric
     */
    @Test
    void testLargeMileToMetric() {
        ByteArrayInputStream in = new ByteArrayInputStream("20 mile".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "20 mile is:\n" +
                        "32186880.000000 mm\n" +
                        "3218688.000000 cm\n" +
                        "32186.880000 m\n" +
                        "32.186880 km";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test to convert larger meter value imperial
     */
    @Test
    void testLargeMeterToImperial() {
        ByteArrayInputStream in = new ByteArrayInputStream("20000 m".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "20000 m is:\n" +
                        "7.9e+08 mil\n" +
                        "7.9e+05 inch\n" +
                        "6.6e+04 ft\n" +
                        "2.2e+04 yard\n" +
                        "12 mile";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * test to convert larger yard value metric
     */
    @Test
    void testHundredYardsToMetric() {
        ByteArrayInputStream in = new ByteArrayInputStream("100 yd".getBytes());
        System.setIn(in);
        final String unNormalizedExpectedOutput =
                "Please Enter the input value followed by the unit:\n" +
                        "100 yd is:\n" +
                        "91440.000000 mm\n" +
                        "9144.000000 cm\n" +
                        "91.440000 m\n" +
                        "0.091440 km";
        final String expectedOutput =
                normalizeExpectedOutput(unNormalizedExpectedOutput);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        UnitsConvertor.main(null);
        final String printResult = myOut.toString();
        assertNotNull(printResult);
        assertFalse(printResult.isEmpty());
        assertEquals(expectedOutput, printResult);
    }
    /*
     * normalizeExpectedOutput - generate the eol character at run-time.
     * then there is no need to hard-code "\r\n" or "\n" for eol
     * and string comparisons are portable between Windows, macOS, Linux.
     */
    public String normalizeExpectedOutput(String expectedOutput) {
        String normExpectedOutput;
        String[] outputs = expectedOutput.split("\n");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        for (String str : outputs) {
            pw.println(str);
        }
        pw.close();
        normExpectedOutput = sw.toString();
        return normExpectedOutput;
    }
}
