package emailapp;
import java.util.Scanner;

public class Email {
    private String fristName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    // Constructor to recive the first name and last name

    public Email(String firstName , String lastName){
        this.fristName =firstName;
        this.lastName = lastName;


        // Call the method for asking for the department - return the department
        this.department = setDepartment();

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // COmbine the elements and generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);

    }

    // Ask for the department
    private String setDepartment(){
        System.out.println("Department Codes\n1 for Sales\n2 for Developnment\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        in.close();
        if (depChoice == 1){return "salse";}
        else if (depChoice == 2){return "dev";}
        else if (depChoice == 3){return "acct";}
        else {return "";}
        
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#$%&!";
        char[] password = new char[length];
        
        for (int i = 0; i < length; i++){
            int rand = (int ) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlterinateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
 
    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMmailboxCapacityailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + fristName + " " + lastName + 
                "\nCompany Name: " + email +
                "\nMailbox capacity: " + mailboxCapacity + "ab";
    }
}