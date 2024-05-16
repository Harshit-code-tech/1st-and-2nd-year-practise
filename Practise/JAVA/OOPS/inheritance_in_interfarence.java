package OOPS;
interface sample{
    void meth1();
    void meth2();
}
interface childsample extends sample{
    void meth3();
    void meth4();

}
class sample2 implements childsample{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }




    public void meth4(){
        System.out.println("meth4");
    }
}
public class inheritance_in_interfarence {
    public static void main(String[] args) {
        sample2 obj = new sample2();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
