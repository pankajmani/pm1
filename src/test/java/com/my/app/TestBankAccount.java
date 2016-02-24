package com.my.app;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {
  
  @Test
  public void testDebitWithSufficientFunds(){
    BankAccount account = new BankAccount(10);
    double Amount = account.debit(5);
    Assert.assertEquals(5.0, amount);
  }
  
  @Test
  public void testDebitWithoutSufficientFunds(){
    BankAccount account = new BankAccount(10);
    double Amount = account.debit(11);
    Assert.assertEquals(10.0, amount);
  }
}
