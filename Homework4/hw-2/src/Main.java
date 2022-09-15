public class Main {
    public static void main(String[] args)
    {
        Drum drum1 = new Drum();
        drum1.Size = 14;
        Guitar guitar1 = new Guitar();
        guitar1.NumberOfStrings = 6;
        Trumpet trumpet1 = new Trumpet();
        trumpet1.Diametr = 8;

        Instrument[] instr = {drum1,guitar1,trumpet1};
        for (int i =0; i<instr.length; i++)
        {
            instr[i].play();
        }
    }
}