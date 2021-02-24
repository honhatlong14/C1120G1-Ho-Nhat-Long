package casestudy.Controllers;

import casestudy.models.person.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ManagerEmployee {
    private static Map<String, Employee> myMap = new TreeMap<>();

    public void showInformationE(){
        readEmployee();
//        for (String key: myMap.keySet()){
//            System.out.println(myMap.get(key).toString());

//        }
        System.out.println( "**-----------------------------------------------------------------------------**" );
        System.out.printf( "%-17s%-25s%-17s%-26s", "ID", "NAME EMPLOYEE", "AGE", "ADDRESS" );
        System.out.println();
        System.out.println();
        myMap.forEach( (key, value) -> {
            System.out.printf( "%-17s%-25s%-17s%-26s",key, value.getNameEmployee(), value.getAgeEmployee(), value.getEmployeeAddress() );
            System.out.println();
        } );
        System.out.println( "**-----------------------------------------------------------------------------**" );
        System.out.println();
    }
    public static void readEmployee(){
        ArrayList<Employee> list = new ArrayList<>();
        try {
            myMap.clear();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/casestudy/data/Employee.csv"));
            String line;
            String[] arrayFile;
            while ((line=bufferedReader.readLine())!=null){
                arrayFile = line.split(",");
                Employee employee = new Employee(arrayFile[0],arrayFile[1],arrayFile[2],arrayFile[3]);
                list.add(employee);
                myMap.put(arrayFile[0],employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
