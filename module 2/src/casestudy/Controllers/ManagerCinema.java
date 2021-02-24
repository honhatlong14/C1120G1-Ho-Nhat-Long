package casestudy.Controllers;


import casestudy.commons.validate.FileUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ManagerCinema {
    private final static String FILEPATH_CUSTOMER = "src/casestudy/data/Customer.csv";

    public static void displayListCustomer4D(){
        List<String> listCustomer = FileUtils.readFile(FILEPATH_CUSTOMER);
        Queue<String> customerQueue = new LinkedList<>();
        for (String s : listCustomer) {
            customerQueue.add(s);
        }
        for (String list : customerQueue){
            System.out.println(list);
        }
    }

}
