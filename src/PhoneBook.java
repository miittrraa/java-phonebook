import java.util.*;
import java.util.Arrays.*;
import java.io.*;
public class PhoneBook{

//data fields
private int numberOfPeople;  
File file;
ArrayList <Contact> list;    
ArrayList <Contact> display;   

//constructors
public PhoneBook(){list=new ArrayList<>();
display=new ArrayList<>();
}
public PhoneBook(String fileName){
file=new File(fileName);
list=new ArrayList<>();
display=new ArrayList<>();
}

//getter for number of people    
public int getNumberOfPeople(){
return numberOfPeople;}


//define contact method
public void defineContact(Contact obj) throws Exception{
FileOutputStream fos=new FileOutputStream(file,true);
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(obj);
oos.flush();
numberOfPeople++;
}

//define multiple contacts method
public void defineMultipleContacts(Contact ... obj) throws Exception{
    for(Contact c:obj){
FileOutputStream fos=new FileOutputStream(file,true);
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(obj);
oos.flush();
numberOfPeople++;}
}

//search by number,name,lastname,group   
public ArrayList searchContactInfo(String info) throws Exception{
FileInputStream fis=new FileInputStream(file);
ObjectInputStream ois=new ObjectInputStream(fis);
Object o=ois.readObject();
    if(((Contact)o).getName().equals(info)){
    list.add((Contact)o);}
    else    if(((Contact)o).getLastName().equals(info)){
    list.add((Contact)o);}
    else    if(((Contact)o).getGroup().equals(info)){
    list.add((Contact)o);}
    if(((Contact)o).getPhoneNumber().equals(info)){
    list.add((Contact)o);}
    return list;}

//delete contact
public void delete(Contact c){
numberOfPeople--;
}

//delete all contact
public boolean deleteAll(){
boolean b=file.delete();
return b;}
 
//display contacts
// from file to ArrayList
public void display() throws Exception{
    for(int i=0;i<=numberOfPeople;i++){
FileInputStream fis=new FileInputStream(file);
ObjectInputStream ois=new ObjectInputStream(fis);
Object o=ois.readObject();
    display.add((Contact)o);}
    }
//cast ArrayList to String array
public String[] castToStringArray(){
Object[] objNames = display.toArray();
        //Object array to String array
        String[] strNames = Arrays.copyOf(objNames, objNames.length, String[].class);
    //return elements of String array
        return strNames;
    }

}
