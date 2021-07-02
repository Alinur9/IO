import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Mail {
    public static void send(String from, String password, String sub, String to, String msg){
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
           protected PasswordAuthentication getPasswordAuthentication(){return new PasswordAuthentication(from,password)
           ;}
        });
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(sub);
            message.setText(msg);
            Transport.send(message);
            System.out.println("sent message");
        }
        catch (MessagingException e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        Mail.send("novemberrainali@gmail.com","akmamnirjhor","hudai","Faiyazkradi@gmail.com",
                "Eita ekta test... ei dekh tore arekta pathailam.. mama khub feel lagtase... ");
    }
}