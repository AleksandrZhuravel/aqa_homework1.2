package ru.netology.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackData.csv", numLinesToSkip = 1)
    @DisplayName("Should be 100 for amount 900")
    void shouldReturn100IfAmountIs900(int amount, int expected) {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackData.csv", numLinesToSkip = 1)
    @DisplayName("Should be 0 for amount 1000")
    void shouldReturn0IfAmountIs1000(int amount, int expected) {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackData.csv", numLinesToSkip = 1)
    @DisplayName("Should be 500 for amount 500")
    void shouldReturn500IfAmountIs500(int amount, int expected) {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should be message for amount 0")
    void shouldReturnMessageIfAmountIs0() {
        CashbackHackService cashbackHackServiceNull = new CashbackHackService();
        Throwable thrownZero = assertThrows(IllegalArgumentException.class, () -> cashbackHackServiceNull.remain(0));
        assertNotNull(thrownZero.getMessage());
    }

    @Test
    @DisplayName("Should be message for amount -1")
    void shouldReturnMessageIfAmountIsMinus() {
        CashbackHackService cashbackHackServiceMinus = new CashbackHackService();
        Throwable thrownMinus = assertThrows(IllegalArgumentException.class, () -> cashbackHackServiceMinus.remain(-1));
        assertNotNull(thrownMinus.getMessage());
    }

}

