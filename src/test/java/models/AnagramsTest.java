package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class AnagramsTest {
    @Test
    public void anagramCheck_compareWordLength_1() throws Exception {
        Anagrams testAnagram = new Anagrams();
        String expected = "taco";
        assertEquals(expected, testAnagram.anagramCheck("taco","taco"));
    }
    @Test
    public void anagramCheck_checkifsinglewordsareAnagrams_2() throws Exception {
        Anagrams testAnagram = new Anagrams();
        String expected = "true";
        assertEquals(expected, testAnagram.anagramCheck("taco","coat"));
    }
}