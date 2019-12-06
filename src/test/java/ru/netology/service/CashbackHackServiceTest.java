package ru.netology.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CashbackHackServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackData.csv", numLinesToSkip = 1)
    @DisplayName("Should be 100 for amount 900")
    void shouldReturn100IfAmountIs900(int amount, int expected) {
        CashbackHackService cashbackHackService100 = new CashbackHackService();
        int actual = cashbackHackService100.remain(amount);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackData.csv", numLinesToSkip = 1)
    @DisplayName("Should be 0 for amount 1000")
    void shouldReturn0IfAmountIs1000(int amount, int expected) {
        CashbackHackService cashbackHackService0 = new CashbackHackService();
        int actual = cashbackHackService0.remain(amount);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackData.csv", numLinesToSkip = 1)
    @DisplayName("Should be 500 for amount 500")
    void shouldReturn500IfAmountIs500(int amount, int expected) {
        CashbackHackService cashbackHackService500 = new CashbackHackService();
        int actual = cashbackHackService500.remain(amount);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Should be exeption for amount 0")
    void shouldReturnThrowIfAmountIs0() {
        CashbackHackService one = new CashbackHackService();
        assertThrows(IllegalArgumentException.class, () -> one.remain(0));
    }

}

