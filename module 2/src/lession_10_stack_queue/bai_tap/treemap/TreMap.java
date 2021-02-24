package lession_10_stack_queue.bai_tap.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TreMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Enter string: " );
        String string = scanner.nextLine();
        String[] array = string.split( "\\s+ " );
        Map<String,Integer> map=new HashMap<>();

        for(String str: array){
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }else{
                map.put(str,1);
            }
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
