package oose.rowanpaulflynn;

public class Main
{
    public static void main( String[] args ) throws Exception
    {
        // Opgave 1b
        Box box1 = new Box("eggs", 12,50);
        System.out.println( "TotalWeight: " + box1.getTotalWeight() );

        // Opgave 1g
        Box box2 = new Box("eggs", 12,50);
        System.out.println(box2.toJSON());

    }
}
