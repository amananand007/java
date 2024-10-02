package Project;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {


//    Aadhaar a = new Aadhaar();
    private static Map<String,Aadhaar> aadhaarMap = new HashMap<>();

    static{
        aadhaarMap.put("123456789",new Aadhaar("123456789","Aman",
                "Mr. Suresh Kumar","Patna"));
        aadhaarMap.put("123456790",new Aadhaar("123456790","Anand",
                "Mr. Sumit Kumar","Nalanda"));
    }

    public Aadhaar getAadhaarByNumber(String aadhaarNumber){
        return aadhaarMap.get(aadhaarNumber);

    }

}
