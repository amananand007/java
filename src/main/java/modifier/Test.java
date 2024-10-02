package modifier;

class ModifierDefault{

    String name = "Aman";   // default modofier

    void display(){     // default modifier
        System.out.println("Hello " + name);
    }

}

public class Test {

    public static void main(String[] args) {

        ModifierDefault modifierDefault= new ModifierDefault();

        System.out.println(modifierDefault.name);

        modifierDefault.display();

    }
}


