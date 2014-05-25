//Changes made
import java.util.*;
/**
 * Each ContactsList object is an array of Person objects.
 * @author DoritAdar TaylorLeung
 *
 */
public class ContactsList {
    private ArrayList<Person> contactsList = new ArrayList<Person>();

    /**
     * The addNewContact method adds a new Person contact to the
     * end of the contactsList if the last name is not empty
     * and print a message if contact is successfully added.
     * @author TaylorLeung DoritAdar
     */
    public void addNewContact(){
        Person person = new Person();
       
        if (person.readPerson()){ //check if last name is entered before adding a new contact
        	contactsList.add(person);
        	System.out.println(person.getName() +
        			" is successfully added to your contacts!\n");
        }
    }
    /**
     * The SortContacts method sorts contactsList according to the alphabetical order.
     * @author TaylorLeung
     */
    public void sortContacts(){
    	Collections.sort(contactsList);  	
    }
    /**
     *The printContactList method prints all the contacts sorted by alphabetical
     * order of last name.
     * If there is more than one contact with the same lastName, the method
     * sub sorts the list of same lastName and prints it by alphabetical
     * order of firstName.
     * @author TaylorLeung
     */
    public void printContactsList(){
    	System.out.println("Your entire contact list:");
    	this.sortContacts();

    	for (int i=0; i < contactsList.size() ; i++){
    		System.out.println(contactsList.get(i) + "\n");
    }
  }       
    /** 
	 * The searchContacts method take lastName as parameter and searches the
	 *  contactList for matches.
	 *  The method will print all data of matched contacts,
	 *  sorted by alphabetical order of firstName.
	 *  If no matches found, the method will print a message.
	 * @param lastName
	 * @author DoritAdar TaylorLeung
	 */
	public void searchContacts(String searchedLastName){
		ArrayList<Person> matchedLastNameList = new ArrayList<Person>() ;
		for (int i=0; i < contactsList.size() ; i++){
			if (contactsList.get(i).equalLastName(searchedLastName)){
				matchedLastNameList.add(contactsList.get(i));
			}
		}
		
		if (matchedLastNameList.isEmpty())
			System.out.println("Sorry, no matches found, please try again!\n");
		else{
			System.out.println("List Of Contacts With Last Name " + searchedLastName + ":");
			this.sortContacts();
			for (int i=0; i < matchedLastNameList.size() ; i++){
	    		System.out.println(matchedLastNameList.get(i));
	    }
	  }
	}
	/**
	 * sizeOfArray method returns an int that represents the size of a contactsList array.
	 * @return sizeofArray
	 * @author TaylorLeung
	 */
	public int sizeOfArray() {
		return this.contactsList.size();
	}
}
