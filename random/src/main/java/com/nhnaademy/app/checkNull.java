package com.nhnaademy.app;

import org.apache.commons.lang3.StringUtils;

public class checkNull {
    public static void main(String[] args) {
        String blank = "";
        String nullCheck = null;

        if (nullCheck == null) {
            System.out.println("널 입니다.");
        }

        if (blank.isEmpty()) {
            System.out.println("공백입니다.");
        }
        StringUtils s = new StringUtils();
        System.out.println("StringUtils(null값 empty메소드) : " + s.isEmpty(nullCheck));
        System.out.println("StringUtils(null값 blank메소드) : " + s.isBlank(nullCheck));
        System.out.println("StringUtils(공백값  blank메소드) : " + s.isBlank(blank));
        System.out.println("StringUtils(공백값  empty메소드) : " + s.isEmpty(blank));
    }
}
