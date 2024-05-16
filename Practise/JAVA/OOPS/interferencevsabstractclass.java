package OOPS;

interface Bicycle{
    int a =45;
    int b= 30;
    void applyBreak(int decrement);
    void speedup( int increment);
}
interface HornBicycle{

    void blowhorn232();
    void blow();
}
class Avon implements Bicycle,HornBicycle{
    void blowhorn(){
        System.out.println("Blowing horn...");

    }
    public void applyBreak(int decrement){
        System.out.println("AAppling break ");
    }
    public void speedup(int increment){
        System.out.println("Speediing up");
    }

    public void blowhorn232(){
        System.out.println("kabhi kushi kabhi gam");

    }
    public void blow(){
        System.out.println("mai hui  na");
    }

}
public class interferencevsabstractclass {
    public static void main(String[] args) {
        Avon cycle = new Avon();
        cycle.applyBreak(Bicycle.b);
        System.out.println(cycle.b);
        cycle.speedup(Bicycle.a);
        System.out.println(cycle.a);
        cycle.blowhorn();
        cycle.blowhorn232();
        cycle.blow();


    }
}
