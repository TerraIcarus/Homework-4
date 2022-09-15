public class Guitar implements Instrument
{
    int NumberOfStrings;

    @Override
    public void play()
    {
        System.out.println("Играет гитара с "+NumberOfStrings+" струнами");
    }
}
