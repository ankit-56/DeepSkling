package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount("Shainiha", 1000);
        System.out.println(">> Opening test account with ₹1000 balance");
    }

    @After
    public void tearDown() {
        account = null;
        System.out.println(">> Account test completed");
    }

    @Test
    public void testDeposit() {

        // Arrange
        int depositAmount = 500;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(1500, account.getBalance());
    }

    @Test
    public void testWithdraw() {

        // Arrange
        int withdrawAmount = 300;

        // Act
        account.withdraw(withdrawAmount);

        // Assert
        assertEquals(700, account.getBalance());
    }

    @Test
    public void testWithdrawMoreThanBalance() {

        // Arrange
        int withdrawAmount = 1500;

        // Act
        account.withdraw(withdrawAmount);

        // Assert
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testNegativeDeposit() {

        // Arrange
        int depositAmount = -200;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(1000, account.getBalance());
    }
}