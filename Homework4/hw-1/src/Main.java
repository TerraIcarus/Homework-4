public class Main
{
    public static void main(String[] args)
    {
        Book book1 = new Book();
        book1.Name ="Евгений Онегин";
        Book book2 = new Book();
        book2.Name ="Руслан и Людмила";
        Magazine magazine1 = new Magazine();
        magazine1.Name ="Классный";
        Magazine magazine2 = new Magazine();
        magazine2.Name ="Галилео";
        Printable[] prnt ={book1,book2 ,magazine1, magazine2};

        for(int i=0; i< prnt.length; i++)
        {
            prnt[i].Print();
            if(prnt[i] instanceof Book)
            {
                ((Book) prnt[i]).printBooks(prnt);
            }
            if(prnt[i] instanceof Magazine)
            {
                ((Magazine) prnt[i]).printMagazines(prnt);
            }

        }
    }
}
