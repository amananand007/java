package Practice;

public class CustomerPrimitiveToString extends Customer{



        @Override
        public String toString() {
            return "Customer"  + ", getFirstName()=" + getFirstName()
                    + ", getLastName()=" + getLastName() + "]";
        }


}


