public class JavaProject {
    public static void main(String[] args) throws Exception {
     
    //objects from Contact   
    Contact c1=new Contact(" Ali "," Amiri "," friend "," 09101111010 ","C:\\Users\\Dear User\\Pictures\\Pictures"); 
    Contact c2=new Contact(" Mina "," Torabi "," friend "," 09101234567 ","C:\\Users\\Dear User\\Pictures\\Pictures"); 
    Contact c3=new Contact(" Maryam "," Ahmadi "," family "," 09101122345 ","C:\\Users\\Dear User\\Pictures\\Pictures"); 
    Contact c4=new Contact(" Ehsan "," Khorami "," Univercity "," 09100223344 ","C:\\Users\\Dear User\\Pictures\\Pictures"); 

    //object from PhoneBook
    PhoneBook ph=new PhoneBook("\\d:save contacts");   
    
    //write contacts on file
    ph.defineContact(c1);
    ph.defineContact(c2);
    ph.defineMultipleContacts(c3,c4);
    
    //searching contacs
    ph.searchContactInfo("Ali");
    ph.searchContactInfo("Torabi");
    ph.searchContactInfo("09100223344");
    
    //delette all contacts
    /* if(ph.deleteAll())
    System.out.prinln("All of the contacts deleted.");  
    */
    
//    //display contacts
    ph.display();
    ph.castToStringArray();
    
    }
}
