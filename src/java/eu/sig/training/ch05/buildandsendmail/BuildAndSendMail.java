package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    public void buildAndSendMail(MailMan m, MailAdress mailAdress, MailBody mailMessage) {
        Mail mail = new Mail(mailAdress, mailMessage);
        // Send message
        m.send(mail);
    }

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(Mail mail) {
        }
    }

    private class MailFont {

    }

    private class MailMessage {


    }

}