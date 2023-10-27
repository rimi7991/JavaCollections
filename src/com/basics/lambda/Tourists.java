package com.basics.lambda;

import java.util.Arrays;
import java.util.List;

public class Tourists {
    public static List<Tourist> customersList()
        {
            Tourist t1 = new Tourist(1000,12,"Jammu&Kashmir",25,"Platinum",true, Arrays.asList("Srinagar","Pahalgram","Gulmarg","Sonmarg"));
            Tourist t2 = new Tourist(1001,13,"Himachal Pradesh",26,"Gold",true,  Arrays.asList("Shimla","Manali","DehraDun"));
            Tourist t3 = new Tourist(1002,14,"Rajasthan",27,"Silver",true, Arrays.asList("Jodhpur","Bhangar","Udaipur"));
            Tourist t4 = new Tourist(1003,15,"Goa",25,"Platinum",false, Arrays.asList("Panaji","Sea Coast1","Sea Coast2"));
            Tourist t5 = new Tourist(1004,16,"Kerala",25,"Gold",false, Arrays.asList("Munnar","Wayanand","Ooty"));
            Tourist t6 = new Tourist(1005,17,"Jammu&Kashmir",25,"Gold",true, Arrays.asList("Srinagar","Pahalgram","Dal Lake"));

            List<Tourist> list = Arrays.asList(t1,t2,t3,t4,t5,t6);
            return list;
    }
}
