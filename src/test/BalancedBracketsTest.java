package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void twoBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void bracketsInBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void bracketsInBracketWithBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]] []"));
    }
    @Test
    public void tripleBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    @Test
    public void tripleDoubleBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][]]]"));
    }
    @Test
    public void wordsInBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void wordsInAndOutBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void emptyBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void singleOpenBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void singleCloseBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void BackFacingBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void wordsInBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]Code]"));
    }
}
