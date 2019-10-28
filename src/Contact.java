import java.io.File;
public class Contact implements java.io.Serializable {
    
//data fields
    private String name;
    private String lastName;
    private String group;
    private String phoneNumber;
    File image;

//constructors
public Contact() {}
public Contact(String name,String lastName,String group,String phoneNumber,String imageAdr) {
this.name=name;
this.lastName=lastName;
this.group=group;
this.phoneNumber=phoneNumber;
image=new File(imageAdr);
}

//setters
public void setName(String n){name=n;}
public void setLastName(String l){lastName=l;}
public void setGroup(String g){group=g;}
public void setPhoneNumber(String ph){phoneNumber=ph;}

//getters
public String getName(){return name;}
public String getLastName(){return lastName;}        
public String getGroup(){return group;}        
public String getPhoneNumber(){return phoneNumber;}               
}
