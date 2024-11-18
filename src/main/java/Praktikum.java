public class Praktikum {

  public static void main(String[] args) {
    String testName = "Тимоти Шаламе";
    Account account = new Account(testName);

    if (account.checkNameToEmboss()) {
      System.out.println("Можно в печать");
    } else {
      System.out.println("Упс, неподходящее имя");
    }
  }
}


