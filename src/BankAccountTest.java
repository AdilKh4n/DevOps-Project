
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {

  @Test
  public void testDebitwithSuff()
  {
    BankAccount acct = new BankAccount(10);
    double amt = acct.debit(5);
    Assert.assertEquals(5.0,amt); 
  }

}