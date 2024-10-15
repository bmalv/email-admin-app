public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("John", "Smith");

        email1.setAlternateEmail("js@gmail.com");
        System.out.println("Alt email: " + email1.getAlternateEmail());
    }
}