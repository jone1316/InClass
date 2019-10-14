
public abstract class NameHolder
{
    protected String firstName;
    
    public abstract void DescribeSelf();
    
    @Override
    public String toString()
    {
        return "First Name: ", firstName;
    }

}
