package modifier;

class ModifierPrivate{

    private String name = "Aman"; // private

    private String account = "9876543210";

    public String password = "Aman@12345";

    public String getName() {
        return name;
    }

    private void display(){
        System.out.println("Hello" + name);
    }

}

public class PrivateModifier {

    public static void main(String[] args) {

    ModifierPrivate modifierPrivate = new ModifierPrivate();


        System.out.println(modifierPrivate.password);

        System.out.println(modifierPrivate.getName());

        modifierPrivate.password = "Astha@123";

        System.out.println(modifierPrivate.password);

//        modifierPrivate.setName("sumit");
//        System.out.println(modifierPrivate.display());
    }

}
