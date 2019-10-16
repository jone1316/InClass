import java.util.Comparator;

public class CompareLastFirstName implements Comparator<Student>
{
    public int CompareLastFirstName(Student first, Student last)
    {
        String firstName = first.getFirstName();
        String lastName = first.getLastName();
        String firstNameLast = last.getFirstName();
        String lastNameLast = last.getLastName();
        
        if(firstName.compareTo(firstNameLast) < 0)
        {
            // do something
            return -1;
        }
        else if(firstName.compareTo(firstNameLast) == 0)
        {
            // do the equal thing
            if(lastName.compareTo(lastNameLast) < 0)
            {
                return -1;
            }
            else if(lastName.compareTo(lastnameLast) == 0)
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return 1;
        }
    }

}
