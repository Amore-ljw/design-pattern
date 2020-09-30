package com.amore.design.simplefactory.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-15 15:00
 * @since 七月
 */
public class ParamValidaUtil {

    private final static Pattern VALIDNUM = Pattern.compile("^(\\-|\\+)?\\d+(\\.\\d+)?$");

    public static boolean validInput(String inputPrarm) {
        if (inputPrarm == null || inputPrarm.isEmpty()) return false;
        Matcher matcher = VALIDNUM.matcher(inputPrarm);
        while (matcher.find()) {
            return true;
        }
        return false;
    }

}
