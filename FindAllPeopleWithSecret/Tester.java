package FindAllPeopleWithSecret;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Find All People With Secret
     */
    @Test
    void testOneMeetingTwoPeople() {
        int n = 2;
        int[][] meetings = {{0,1,1}};
        int firstPerson = 1;
        List<Integer> expectedAnswer = new ArrayList<>(Arrays.asList(0, 1));
        assertEquals(expectedAnswer, Solution.findAllPeople(n, meetings, firstPerson));
    }

    @Test
    void testOneMeetingThreePeopleSecretShared() {
        int n = 3;
        int[][] meetings = {{1,2,1}};
        int firstPerson = 1;
        List<Integer> expectedAnswer = new ArrayList<>(Arrays.asList(0, 1, 2));
        assertEquals(expectedAnswer, Solution.findAllPeople(n, meetings, firstPerson));
    }

    @Test
    void testOneMeetingThreePeopleSecretNotShared() {
        int n = 3;
        int[][] meetings = {{1,0,1}};
        int firstPerson = 1;
        List<Integer> expectedAnswer = new ArrayList<>(Arrays.asList(0, 1));
        assertEquals(expectedAnswer, Solution.findAllPeople(n, meetings, firstPerson));
    }

    @Test
    void testManyMeetingsThreePeopleSecretNotShared() {
        int n = 3;
        int[][] meetings = {
            {0,1,8},
            {0,1,2},
            {0,1,7},
            {0,1,3},
            {0,1,1},
            {0,1,16},
            {0,1,9},
            {0,1,13},
            {0,1,11},
            {0,1,12}
        };
        int firstPerson = 1;
        List<Integer> expectedAnswer = new ArrayList<>(Arrays.asList(0, 1));
        assertEquals(expectedAnswer, Solution.findAllPeople(n, meetings, firstPerson));
    }

    @Test
    void testManyMeetingsThreePeopleSecretShared() {
        int n = 3;
        int[][] meetings = {
            {0,1,8},
            {0,1,2},
            {0,1,7},
            {0,1,3},
            {0,1,1},
            {0,2,16},
            {0,1,9},
            {0,1,13},
            {0,1,11},
            {0,1,12}
        };
        int firstPerson = 1;
        List<Integer> expectedAnswer = new ArrayList<>(Arrays.asList(0, 1, 2));
        assertEquals(expectedAnswer, Solution.findAllPeople(n, meetings, firstPerson));
    }

    @Test
    void testManyMeetingsManyPeopleSecretShared() {
        int n = 10;
        int[][] meetings = {
            {4,5,8},
            {1,2,2},
            {3,4,7},
            {2,3,3},
            {0,1,1},
            {8,9,16},
            {7,8,13},
            {5,6,11},
            {6,7,12}
        };
        int firstPerson = 1;
        List<Integer> expectedAnswer = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8 , 9));
        assertEquals(expectedAnswer, Solution.findAllPeople(n, meetings, firstPerson));
    }

    @Test
    void testManyMeetingsSameTimeManyPeopleSecretShared() {
        int n = 10;
        int[][] meetings = {
            {1,5,3},
            {7,2,3},
            {0,1,3},
            {2,6,3},
            {7,5,3},
            {3,4,3},
            {3,6,3},
            {8,9,3},
            {4,9,3},
            {2,5,3}
        };
        int firstPerson = 1;
        List<Integer> expectedAnswer = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8 , 9));
        assertEquals(expectedAnswer, Solution.findAllPeople(n, meetings, firstPerson));
    }
}
