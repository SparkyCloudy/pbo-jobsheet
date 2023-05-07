package pnb.pbo1.latihan.satu;

public class Person
{
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName()
    {
        return firstName;
    }

    String getLastName()
    {
        return lastName;
    }

    protected String getFullName()
    {
        return firstName + " " + lastName;
    }
}
