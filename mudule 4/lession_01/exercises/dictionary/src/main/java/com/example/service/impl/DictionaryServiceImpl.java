package com.example.service.impl;

import com.example.service.DictionaryService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Override
    public String searchDictionary(String word) {

        Map<String,String> mapDictionary = new HashMap<>();
        mapDictionary.put("hello","xin chào");
        mapDictionary.put("student","student");
        mapDictionary.put("fan","cái quạt");
        mapDictionary.put("air conditioning","điều hòa");
        mapDictionary.put("fridge","tủ lạnh");
        mapDictionary.put("chair","cái ghế");

        String result = mapDictionary.get(word);

        if (result == null){
            return "khong tim thay";
        }else {
            return result;
        }
//        return (result == null) ? "Khong Tim Thay" : result;
    }
}
