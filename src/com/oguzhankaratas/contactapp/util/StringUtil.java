package com.oguzhankaratas.contactapp.util;

public class StringUtil {
    public static String findByFieldName(String fieldName , String line){
        int index= line.indexOf(fieldName) + fieldName.length()+2;
        int endIndex = line.indexOf('\'',index);
        return line.substring(index, endIndex);
    }
}
