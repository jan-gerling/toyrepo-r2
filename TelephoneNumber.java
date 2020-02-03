public class TelephoneNumber {
  private String officeAreaCode;
  private String officeNumber;

  public String getTelephoneNumber() {
    return "This is the number: " + this.officeAreaCode + this.officeNumber;
  }
}