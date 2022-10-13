public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Engine engine=new Engine();
        System.out.println("Normal two stroke engines");
        engine.suctionStroke();
        engine.compressionStroke();
        FourStrokeEngine engine1=new FourStrokeEngine();
        System.out.println("Four stroke engine");
        engine1.suctionStroke();
        engine1.compressionStroke();
        engine1.powerStroke();
        engine1.exhaustStroke();
    }
}
class Engine
{
    int stoke=2;
    public void suctionStroke()
    {
System.out.println("Suction stroke is the first stroke");
    }
    public void compressionStroke()
    {
System.out.println("Compression stroke is the second stroke");
    }
}
class FourStrokeEngine extends Engine
{
    int stroke=4;
    public void powerStroke()
    {
System.out.println("Power stroke is the third Stroke");
    }
    public void exhaustStroke()
    {
System.out.println("Exhaust stroke is the fourth stroke");
    }
}