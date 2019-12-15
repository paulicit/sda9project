package com.sda.trestian.travelagency.validator;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class AddCarValidator {

    public static boolean isInputValid(List<String> inputs){
        for (String input: inputs){
            if (!StringUtils.isAlphanumeric(input)){
                return false;
            }
        }
        return true;
    }
}
