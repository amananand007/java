package modifier;

 public class ModifierProtected{

    protected String name = "aman";
    protected void display(){
        System.out.println("Hello " + name);
    }

}

class ModifierProtectedChild extends ModifierProtected{

}

class TestProtected {

}


 class ProtectedTest {
    public static void main(String[] args) {

        ModifierProtected modifierProtectedChild = new ModifierProtected();
        ModifierProtectedChild modifierProtectedChilds = new ModifierProtectedChild();

        System.out.println(modifierProtectedChild.name);

        modifierProtectedChild.display();

        modifierProtectedChilds.display();

//        TestProtected testProtected = new TestProtected();

//        System.out.println(testProtected.name);
    }
}
