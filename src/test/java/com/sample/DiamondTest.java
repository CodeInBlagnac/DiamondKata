package com.sample;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DiamondTest {

    @Test public void testShouldReturnAWhenDiamondA() {
        assertThat(Diamond.draw("A"), is("A"));
    }

    @Test public void testShouldReturn_AForFirstLineWhenGivenB() {
        assertThat(Diamond.draw("B").split("\n")[0], is(" A"));
    }

    @Test public void testShouldReturnB_BForSecondLineWhenGivenB() {
        assertThat(Diamond.draw("B").split("\n")[1], is("B B"));
    }

    @Test public void testShouldReturn_AForThirdLineWhenGivenB() {
        assertThat(Diamond.draw("B").split("\n")[2], is(" A"));
    }

    @Test public void testShouldReturn__AForFirstLineWhenGivenC() {
        assertThat(Diamond.draw("C").split("\n")[0], is("  A"));
    }

    @Test public void testShouldReturn_B_BForSecondLineWhenGivenC() {
        assertThat(Diamond.draw("C").split("\n")[1], is(" B B"));
    }

}
