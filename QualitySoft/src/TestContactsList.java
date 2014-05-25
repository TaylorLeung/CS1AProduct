import java.util.Scanner;
/**
 * TestContactsList class tests add new contacts, 
 * print the entire contact list, and search contacts by last name features 
 * by creating a ContactList object.
 * @author DoritAdar TaylorLeung
 */
public class TestContactsList {
	private static ContactsList contactsList;
	private static boolean quit = false;
	private static Scanner myscanner = new Scanner(System.in);
	
    public static void main(String args[]){
    	contactsList = new ContactsList();
    	System.out.println("Welcome to the Contact List Program!\n"); 
    	
    	while(quit == false){
    		menu();
    	}
 }
/**
 * Menu method prompts the user to use the features in the program. 
 * @author TaylorLeung
 */
 public static void menu(){
	    System.out.println("Please select an option.");
    	System.out.println("1:Create a new contact");
    	System.out.println("2:Print your entire contact list");
    	System.out.println("3:Search your contact by last name");
    	System.out.println("4:Quit the program");
    	System.out.println("Your choice:");
    	String choice = myscanner.nextLine();
    	
    	if(choice.equals("1")){
    		System.out.println("Create a new contact:");
    		contactsList.addNewContact();	
    	}
    	else if (choice.equals("2")){
    		 if (contactsList.sizeOfArray() == 0)
    			 System.out.println("Your contact list is currently empty,"
    				+ " please add new contact to it.\n");
    		 else
    			 contactsList.printContactsList();
    		 }
    	else if (choice.equals("3")){
    		if (contactsList.sizeOfArray() == 0){
   			 System.out.println("Your contact list is currently empty,"
   				+ " please add new contact to it.\n");
   			 }
    		else{
    			System.out.println("Enter last name to be searched by:");
    			String LastName = myscanner.nextLine();
    			contactsList.searchContacts(LastName);
    		}
    	}
    	else if (choice.equals("4")){
    		System.out.println("You are quitting the program" +
    		", thank you for visiting!");
    		quit =true;
    	}
    	else{
    			System.out.println("Please enter a valid choice!\n");
    		}	
    	}
}


/*-------Paste of Run--------------
 Welcome to the Contact List Program!

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
2
Your contact list is currently empty, please add new contact to it.

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
blah
Please enter a valid choice!

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
3
Your contact list is currently empty, please add new contact to it.

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
1
Create a new contact:
> Enter name
Last Name (required):
Last name is required to create a contact, please try again!

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
1
Create a new contact:
> Enter name
Last Name (required):Smith
First Name:Jenny
> Enter address:
Street:1 Hobart Street
Suite/Apartment:5
City:Hubart
State:OU
Zip:3000
Country:USA
Enter Email:
Enter Phone Num:04110111111
Notes:Hi Jenny!
Jenny Smith is successfully added to your contacts!

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
1
Create a new contact:
> Enter name
Last Name (required):Aaiaz
First Name:Monja
> Enter address:
Street:
Suite/Apartment:
City:
State:CA
Zip:90021
Country:USA
Enter Email:mohansf@gmail.com
Enter Phone Num:028943489
Notes:I am Aaiaz
Monja Aaiaz is successfully added to your contacts!

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
1
Create a new contact:
> Enter name
Last Name (required):
Last name is required to create a contact, please try again!

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
1
Create a new contact:
> Enter name
Last Name (required):Aaiaz
First Name:Sophie
> Enter address:
Street:
Suite/Apartment:
City:sulaziti
State:UN
Zip:21640
Country:USA
Enter Email:
Enter Phone Num:019647733
Notes:
Sophie Aaiaz is successfully added to your contacts!

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
1
Create a new contact:
> Enter name
Last Name (required):Clendon
First Name:Evan
> Enter address:
Street:Treeta
Suite/Apartment:
City:
State:
Zip:923442
Country:England
Enter Email:Cledon
Enter Phone Num:46963
Notes:
Evan Clendon is successfully added to your contacts!

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
2
Your entire contact list:

Monja Aaiaz
Phone Num: 028943489
Email: mohansf@gmail.com
Address:  , CA 90021 USA
Notes: I am Aaiaz



Sophie Aaiaz
Phone Num: 019647733
Email: 
Address:  sulaziti, UN 21640 USA
Notes: 



Evan Clendon
Phone Num: 46963
Email: Cledon
Address: Treeta ,  923442 England
Notes: 



Jenny Smith
Phone Num: 04110111111
Email: 
Address: 1 Hobart Street suite 5 Hubart, OU 3000 USA
Notes: Hi Jenny!


Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
1
Create a new contact:
> Enter name
Last Name (required):Brian
First Name:Trvor
> Enter address:
Street:Teaoja
Suite/Apartment:5
City:LAS
State:
Zip:
Country:
Enter Email:BT@gmail.com
Enter Phone Num:
Notes:
Trvor Brian is successfully added to your contacts!

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
2
Your entire contact list:

Monja Aaiaz
Phone Num: 028943489
Email: mohansf@gmail.com
Address:  , CA 90021 USA
Notes: I am Aaiaz



Sophie Aaiaz
Phone Num: 019647733
Email: 
Address:  sulaziti, UN 21640 USA
Notes: 



Trvor Brian
Phone Num: 
Email: BT@gmail.com
Address: Teaoja suite 5 LAS,   
Notes: 



Evan Clendon
Phone Num: 46963
Email: Cledon
Address: Treeta ,  923442 England
Notes: 



Jenny Smith
Phone Num: 04110111111
Email: 
Address: 1 Hobart Street suite 5 Hubart, OU 3000 USA
Notes: Hi Jenny!


Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
3
Enter last name to be searched by:
lekaa
Sorry, no matches found, please try again!

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
3
Enter last name to be searched by:
Aaiax
Sorry, no matches found, please try again!

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
3
Enter last name to be searched by:
Aaiaz
List Of Contacts With Last Name Aaiaz:

Monja Aaiaz
Phone Num: 028943489
Email: mohansf@gmail.com
Address:  , CA 90021 USA
Notes: I am Aaiaz


Sophie Aaiaz
Phone Num: 019647733
Email: 
Address:  sulaziti, UN 21640 USA
Notes: 

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
3
Enter last name to be searched by:
Brian
List Of Contacts With Last Name Brian:

Trvor Brian
Phone Num: 
Email: BT@gmail.com
Address: Teaoja suite 5 LAS,   
Notes: 

Please select an option.
1:Create a new contact
2:Print your entire contact list
3:Search your contact by last name
4:Quit the program
Your choice:
4
You are quitting the program, thank you for visiting!

-----------------------------------------------------------*/