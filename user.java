public class user {
    public void login(String username, String password) {

    }

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.sendEmail("john", "Meeting", "Greetings");
    }
}

class EmailService {
    public void sendEmail(String to, String subject, String body) {
        System.out.printf("Email Service");
    }

}