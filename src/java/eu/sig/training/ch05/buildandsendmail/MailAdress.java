package eu.sig.training.ch05.buildandsendmail;

public class MailAdress {
    private String mId;

    public MailAdress(String firstName, String lastName, String division) {
        this.mId = firstName.charAt(0) + "." + lastName.substring(0, 7) + "@"
                + division.substring(0, 5) + ".compa.ny";
    }
}
