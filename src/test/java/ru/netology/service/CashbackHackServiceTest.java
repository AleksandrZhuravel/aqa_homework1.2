package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService cashbackHackService100 = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService100.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashbackHackService0 = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService0.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn500IfAmountIs500() {
        CashbackHackService cashbackHackService0 = new CashbackHackService();
        int amount = 500;
        int actual = cashbackHackService0.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }
}

