import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

  @Test
  public void checkNameToEmboss_ShouldReturnTrue_WhenValidName() {
    Account account = new Account("Тимоти Шаламе");
    assertTrue(account.checkNameToEmboss());
  }

  @Test
  public void checkNameToEmboss_ShouldReturnFalse_WhenNameTooShort() {
    Account account = new Account("Ти");
    assertFalse(account.checkNameToEmboss());
  }

  @Test
  public void checkNameToEmboss_ShouldReturnFalse_WhenNameTooLong() {
    Account account = new Account("Тимотей Александрович");
    assertFalse(account.checkNameToEmboss());
  }

  @Test
  public void checkNameToEmboss_ShouldReturnFalse_WhenNoSpace() {
    Account account = new Account("ТимотиШаламе");
    assertFalse(account.checkNameToEmboss());
  }

  @Test
  public void checkNameToEmboss_ShouldReturnFalse_WhenSpaceAtStart() {
    Account account = new Account(" ТимотиШаламе");
    assertFalse(account.checkNameToEmboss());
  }

  @Test
  public void checkNameToEmboss_ShouldReturnFalse_WhenSpaceAtEnd() {
    Account account = new Account("ТимотиШаламе ");
    assertFalse(account.checkNameToEmboss());
  }

  @Test
  public void checkNameToEmboss_ShouldReturnFalse_WhenMultipleSpaces() {
    Account account = new Account("Тимоти  Шаламе");
    assertFalse(account.checkNameToEmboss());
  }

  @Test
  public void checkNameToEmboss_ShouldReturnTrue_WhenMinimumLength() {
    Account account = new Account("И я");
    assertTrue(account.checkNameToEmboss());
  }

  @Test
  public void checkNameToEmboss_ShouldReturnTrue_WhenMaximumLength() {
    Account account = new Account("Анна Маркович");
    assertTrue(account.checkNameToEmboss());
  }
}

