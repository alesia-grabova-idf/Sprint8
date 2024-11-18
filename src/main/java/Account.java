public class Account {

  private final String name;

  public Account(String name) {
    this.name = name;
  }

  public boolean checkNameToEmboss() {
    if (name.length() <= 3 || name.length() > 16) {
      return false;
    }
    if (name.contains(" ")) {
      if (name.indexOf(" ") == name.lastIndexOf(" ")) {
        return !name.startsWith(" ") && !name.endsWith(" ");
      }
    }
    return false;
  }
}
