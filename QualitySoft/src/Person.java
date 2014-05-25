import java.util.Scanner;

/**
 *  Each object of class Person represents a person and holds its name, address,
 *  email, phone number and notes.
 * @author TaylorLeung DoritAdar
 *
 */
public class Person implements Comparable <Person>{
    private Name name;
    private StreetAddress streetAddress;
    private String email;
    private String phoneNum;
    private String notes;
    /**
     * The constructor method initializes a person's name,
     *  address, email, phone number and notes to null.
     *  @author TaylorLeung
     */
    public Person(){
    	name = new Name();
    	streetAddress = new StreetAddress();
    	email = null;
    	phoneNum = null;
    	notes = null;
    }
    /**
     * getName method return one's full name.
     * @return fullName
     * @author DoritAdar
     */
    public String getName(){
        return name.toString();
    }

    /**
     * The readPerson method reads user input from scanner 
     * if lastName is not empty and 
     * sets the input into the name, address, email, phone number and notes variables.
     * Return true if lastName is not empty.
     * Return false if lastName is empty.
     * @author TaylorLeung
     */
    public boolean readPerson(){
    	
        if( !name.readName() ){ // check if last name is entered before asking for rest of the info
        	streetAddress.readStreetAddress();
        	Scanner PersonScanner = new Scanner(System.in);
        	System.out.print("Enter Email:");
        	email = PersonScanner.nextLine();
        	System.out.print("Enter Phone Num:");
        	phoneNum = PersonScanner.nextLine();
        	System.out.print("Notes:");
        	notes = PersonScanner.nextLine();
        	return true;
       }
        else{
        	return false;
        }
    }
    /**
     * A method compares this Person's last name
     * to the other Person's last name and returns an int.
     * Returns negative int if thisPerson < otherPerson.
     * Returns zero if thisPerson == otherPerson.
     * Returns positive int if thisPerson > otherPerson.
     * @param otherPerson
     * @author TaylorLeung
     */
    public int compareTo(Person otherPerson){
    	//Sort by first name
       if (this.name.getLastName().compareTo(otherPerson.name.getLastName())!= 0)
    	   return this.name.getLastName().compareTo(otherPerson.name.getLastName());
       //If last name is the same, sort by first name
       else
    	   return this.name.getFirstName().compareTo(otherPerson.name.getFirstName());
}
    /**
	 * The equalLastName method checks for a match of of this Person's lastName with a searched lastName,
	 * and returns an boolean.
	 * Returns true if last names are matched.
	 * Returns false if there is no match in last name.
	 * @param searchedLastName
	 * @author DoritAdar
	 */
    public boolean equalLastName(String searchedLastName){
		if (name.getLastName().equalsIgnoreCase(searchedLastName))
			// equlasIgnoreCase to ignore case sensitivity during search
			return true;
		else
			return false;
	}

    /**
     * The toString method formats data of a Person object.
     * @author TaylorLeung
     */
    public String toString(){
        return "\n" + name + "\n" +
               "Phone Num: " + phoneNum  + "\n" +
               "Email: " + email + "\n" +
               "Address: " + streetAddress + "\n"+
               "Notes: " + notes + "\n" ; 
    }
}

