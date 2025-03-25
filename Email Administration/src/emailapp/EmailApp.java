package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("Hariram", "Tej");

        email1.changePassword("Sample@password");
        email1.setMailboxCapacity(100);

        email1.setAlterinateEmail("Sample@gmial.com");
        System.out.println(email1.getAlternateEmail());

        System.out.println(email1.showInfo());
    }
}
