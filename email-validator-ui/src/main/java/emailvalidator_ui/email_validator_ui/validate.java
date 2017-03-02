package emailvalidator_ui.email_validator_ui;
public class validate {
 public validate() {
  
 }
public static void main(String[] args) {
 validate test = new validate();
 String email1 = "chicken@yahoo.com";
 String email2 = "bushesofLOVE.";
 String email3 = "stopitnow";
 System.out.println(test.validateEmail(email1));
 System.out.println(test.validateEmail(email2));
 System.out.println(test.validateEmail(email3));
}
public boolean validateEmail(String email){
 if ((email.contains("@"))||(email.contains("."))||(email.contains("yahoo"))||(email.contains("google"))) return true;
 else return false;
}
}
