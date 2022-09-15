public class Book implements Printable
{
    String Name;

    @Override
    public void Print()
    {
        System.out.println("Печать книги: ");
    }
    public void printBooks(Printable[] printable)
    {
        System.out.println(Name);
    }
}
