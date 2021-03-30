package com.example.service.impl;

import com.example.service.DictionaryService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Override
    public String searchDictionary(String word) {
        Map<String,String> dic = new HashMap<>();
        dic.put("hello","xin chào");
        dic.put("student","student");
        dic.put("fan","cái quạt");
        dic.put("air conditioning","điều hòa");
        dic.put("fridge","tủ lạnh");
        dic.put("chair","cái ghế");

        String result = dic.get(word);

        if (result == null){
            return "khong tim thay";
        }else {
            return result;
        }
//        return (result == null) ? "Khong Tim Thay" : result;
    }
}
