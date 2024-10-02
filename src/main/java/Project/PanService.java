package Project;

import java.util.HashMap;
import java.util.Map;

public class PanService {

    public static Map<String,Pan> panMap = new HashMap<>();
    static {
        panMap.put("CJHPA4099M",new Pan("CJHPA4099M","123456789",
                "HDFC Bank","Stock,ELSS,FD"));
        panMap.put("CJHPA4099N",new Pan("CJHPA4099N","123456790",
                "SBI Bank","Stock,FD"));
    }

    public Pan getPanByAadhaarNumber(String aadhaarNumber){
        for(Pan pan: panMap.values()){
            if(pan.getAadhaarNumber().equals(aadhaarNumber)){
                return pan;
            }
        }
        return null;
    }

}

