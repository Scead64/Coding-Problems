package AssignCookies;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Assign Cookies
     */
    @Test
    void testSingleKidNoCookieNotSatisfiable() {
        int[] kids = {2};
        int[] cookies = {};
        int expectedsolution = 0;
        assertEquals(expectedsolution, Solution.findContentChildren(kids, cookies));
    }

    @Test
    void testManyKidsNoCookieNotSatisfiable() {
        int[] kids = {2,5,2,7,1,2,7,8,3};
        int[] cookies = {};
        int expectedsolution = 0;
        assertEquals(expectedsolution, Solution.findContentChildren(kids, cookies));
    }

    @Test
    void testSingleKidSingleCookieNotSatisfiable() {
        int[] kids = {2};
        int[] cookies = {1};
        int expectedsolution = 0;
        assertEquals(expectedsolution, Solution.findContentChildren(kids, cookies));
    }

    @Test
    void testSingleKidManyCookiesNotSatisfiable() {
        int[] kids = {22};
        int[] cookies = {1,1,1,1,2,6,10,12};
        int expectedsolution = 0;
        assertEquals(expectedsolution, Solution.findContentChildren(kids, cookies));
    }

    @Test
    void testManyKidsManyCookieNotSatisfiable() {
        int[] kids = {12,15,12,17,12,12,17,18,13};
        int[] cookies = {11,10,2,7,8,2,3};
        int expectedsolution = 0;
        assertEquals(expectedsolution, Solution.findContentChildren(kids, cookies));
    }

    @Test
    void testSingleKidSingleCookieSatisfiable() {
        int[] kids = {2};
        int[] cookies = {2};
        int expectedsolution = 1;
        assertEquals(expectedsolution, Solution.findContentChildren(kids, cookies));
    }

    @Test
    void testSingleKidManyCookiesOneSatisfiable() {
        int[] kids = {22};
        int[] cookies = {12,2,6,4,9,18,2,23,7,3};
        int expectedsolution = 1;
        assertEquals(expectedsolution, Solution.findContentChildren(kids, cookies));
    }

    @Test
    void testManyKidsManyCookiesAllSatisfiable() {
        int[] kids = {22,14,17,12,8,2,89,23};
        int[] cookies = {70,200,6,9,18,15,23,13};
        int expectedsolution = 8;
        assertEquals(expectedsolution, Solution.findContentChildren(kids, cookies));
    }

    @Test
    void testManyKidsManyCookiesSomeSatisfiable() {
        int[] kids = {22,14,17,12,8,2,89,23};
        int[] cookies = {70,200,6,7,18,13,23,1};
        int expectedsolution = 6;
        assertEquals(expectedsolution, Solution.findContentChildren(kids, cookies));
    }
}
