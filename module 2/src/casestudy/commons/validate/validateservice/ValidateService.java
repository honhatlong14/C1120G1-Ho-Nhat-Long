package casestudy.commons.validate.validateservice;

import casestudy.commons.read_and_write_file.ReadAndWriteFile;
import casestudy.models.service.House;
import casestudy.models.service.Room;
import casestudy.models.service.Villa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateService {
    public static boolean validateIdVilla(String id){
        String idRegexVilla = "^(SVVL-)\\d{4}$";

        Pattern pattern = Pattern.compile(idRegexVilla);
        Matcher matcher = pattern.matcher(id);
        if (matcher.matches()){
            for (Villa element : ReadAndWriteFile.readVilla()){
                if (id.equals(element.getId())){
                    return false;
                }
            }
            return true;
        }return false;
    }
    public static boolean validateIdHouse(String id){
        String idRegexHouse = "^(SVHO-)\\d{4}$";

        Pattern pattern = Pattern.compile(idRegexHouse);
        Matcher matcher = pattern.matcher(id);
        if (matcher.matches()){
            for (House element: ReadAndWriteFile.readHouse()){
                if (id.equals(element.getId())) {
                    return false;
                }
            }
            return true;
        }return false;
    }
    public static boolean validateIdRoom(String id){
        String idRegexRoom = "^(SVRO-)\\d{4}$";

        Pattern pattern = Pattern.compile(idRegexRoom);
        Matcher matcher = pattern.matcher(id);
        if (matcher.matches()){
            for (Room element: ReadAndWriteFile.readRoom()) {
                if (id.equals(element.getId())){
                    return false;
                }
            }
            return true;
        }return false;
    }
    public static boolean validateNameService(String name){
        return name.matches("[A-Z][a-z]+");
    }
    public static boolean validateArea(String area){
        return area.matches("^[3-9][0-9]|[1-9]\\d{2}$");
    }
    public static boolean validatePrice(String price){
        return price.matches("\\d+");
    }
    public static boolean validatePeople(String people){
        return people.matches("^([1-9]|[1]\\d)$");
    }
    public static boolean validateType(String type){
        return type.matches("(Day|Week|Month|Year)");
    }
    public static boolean validateTypeService(String typeService){
        return typeService.matches("(Vip|Business|Normal)");
    }
    public static boolean validateAreaPool(String areaPool){
        return areaPool.matches("^[3-9][0-9]|[1-9]\\d{2}$");
    }
    public static boolean validateFloor(String floor){
        return floor.matches("\\d+");
    }
//    public static boolean asdasd(String test){
////        return test.matches("^[A-Z\\d][a-z0-9]*(\\s[A-Z][a-z0-9]*)*$");
//    }
}