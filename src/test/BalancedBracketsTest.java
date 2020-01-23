package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void bracketsSurroundingStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Taco Cat]"));
    }

    @Test
    public void bracketsInMiddleOfStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Red [red] rose"));
    }

    @Test
    public void emptyBracketsOutsideOfStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Pluto the Dog[]"));
    }

    @Test
    public void multiplePairOfBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("The [old] man and the [sea]."));
    }

    @Test
    public void backwardsBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void backwardsBracketsSurroundingStrReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Fiji Water["));
    }

    @Test
    public void backwardsBracketsInMiddleOfStrReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Wicked ]witch[ of the west."));
    }

    @Test
    public void  singleBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]So Lonely"));
    }
}
