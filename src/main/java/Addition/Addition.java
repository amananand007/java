package Addition;

interface Intra{
    public abstract void sum(int a,int b);
}
public class Addition {
    public static void main(String[] args) {
        Intra i = (a,b) -> {
            System.out.println(a+b);
        };
        i.sum(10,20);

    }
}
