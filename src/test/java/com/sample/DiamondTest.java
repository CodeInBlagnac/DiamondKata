package com.sample;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DiamondTest {

    @Test public void testShouldReturnAWhenDiamondA() {
        assertThat(Diamond.draw("A"), is("A"));
    }

}
