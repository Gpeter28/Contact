package source;

import javafx.beans.property.SimpleStringProperty;

public class Person
{
    private final SimpleStringProperty Name = new SimpleStringProperty("");
    private final SimpleStringProperty Phone = new SimpleStringProperty("");
    private final SimpleStringProperty Email = new SimpleStringProperty("");
    // private final SimpleStringProperty Group = new SimpleStringProperty("");


    public Person()
    {
        this("", "", "");
    }

    public Person(String Name, String Phone, String Email)
    {
        setName(Name);
        setPhone(Phone);
        setEmail(Email);
    }

    /*private void setGroup(String group) {
        Group.set(group);
    }

    private String getGroup(){
        return Group.get();
    }*/

    private void setEmail(String email) {
        Email.set(email);
    }

    public String getEmail(){
        return Email.get();
    }

    private void setPhone(String phone) {
        Phone.set(phone);
    }

    public String getPhone(){
        return Phone.get();
    }

    private void setName(String name) {
        Name.set(name);
    }

    public String getName(){
        return Name.get();
    }

    static Person p;

    static void setPerson(Person pr)
    {
        p = pr;
    }

    static Person getPerson()
    {
        return p;
    }



}
