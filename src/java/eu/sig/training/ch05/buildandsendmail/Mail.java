package eu.sig.training.ch05.buildandsendmail;

public class Mail {
    private MailAdress emailAdress;
    private MailBody emailMessage;

    public Mail(MailAdress mailAdress, MailBody mailBody) {
        this.emailAdress = mailAdress;
        this.emailMessage = mailBody;
    }
}
