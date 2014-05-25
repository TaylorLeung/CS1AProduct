import java.util.Scanner;
/**
 * Each object of class Name represents a name that holds the last name and the first name.
 * @author TaylorLeung
 */
public class Name {
    private String lastName;
    private String firstName;
    /**
     * Constructor method initializes firstName and lastName to an empty string.
     * @author TaylorLeung
     */
    public Name(){
        lastName = "";
        firstName = "";
    }
    /**
     * ReadName method reads lastName and firstName from Scanner
     * and sets the inputs into the lastName and firstName variables.
     * Return true if last name is empty.
     * Return false if last name is not empty.
     * @author TaylorLeung
     */
    public boolean readName(){
        Scanner nameScanner = new Scanner(System.in);
        boolean emptyLastName = true;
        
        System.out.println( "> Enter name");  
        System.out.print("Last Name (required):");
        lastName = nameScanner.nextLine();
        
        if ("".equals(lastName)){
        	System.out.print("Last name is required to create a contact,"
        			+" please try again!\n\n");
        }
        else {
        	System.out.print("First Name:");
        	firstName = nameScanner.nextLine();
        	emptyLastName = false;
        }
        return emptyLastName;
    }
    
    /**
     * ToString method formats Name info.
     * @return fullName
     * @author TaylorLeung
     */
    public String toString(){
        return firstName + " " + lastName;
    }
    /**
     * getLastName method returns the last name 
     * of a name object as a string.
     * @return lastName
     * @author TaylorLeung
     */
    public String getLastName(){
        return lastName;
    }
    /**
     * getFirstName method returns the first name
     * of a name object as a string.
     * @return firstName
     * @author TaylorLeung
     */
    public String getFirstName(){
    	return firstName;
    }
}
