package eu.sig.training.ch05.buildandsendmail;

public class MailBody {
    String Subject;
    MailAdress message;

    public MailBody(String subject, MailAdress message) {
        Subject = subject;
        this.message = message;
    }
}
