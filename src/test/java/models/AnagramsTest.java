package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class AnagramsTest {
    @Test
    public void anagramCheck_returnsScoreForSingleLetter_1() throws Exception {
        Anagrams testAnagram = new Anagrams();
        String expected = "true";
        assertEquals(expected, testAnagram.anagramCheck("taco","coat"));
    }
}