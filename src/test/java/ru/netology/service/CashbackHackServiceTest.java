package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturnNineHundr() {
        CashbackHackService chs = new CashbackHackService();
        int act = chs.remain(100);
        int exp = 900;
        assertEquals(act, exp);
    }

    @Test
    public void shouldReturnFiveHundr() {
        CashbackHackService chs = new CashbackHackService();
        int act = chs.remain(500);
        int exp = 500;
        assertEquals(act, exp);
    }

    @Test
    public void shouldReturn999() {
        CashbackHackService chs = new CashbackHackService();
        int act = chs.remain(1);
        int exp = 999;
        assertEquals(act, exp);
    }

    @Test
    public void shouldReturnWithZeroAmount() {
        CashbackHackService chs = new CashbackHackService();
        int act = chs.remain(0);
        int exp = 1000;
        assertEquals(act, exp);
    }

    @Test
    public void shouldNotReturnWithBoundaryAmount() {
        CashbackHackService chs = new CashbackHackService();
        int act = chs.remain(1000);
        int exp = 0;
        assertEquals(act, exp);
    }
}