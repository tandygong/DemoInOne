package com.ymbank.lib1;

import com.ymbank.lib2.GradeParent;
import com.ymbank.lib2.Info;

public class Parent  extends GradeParent implements Info {
    public String getSex() {
        return "男";
    }

    public int getAge() {
        return 18;
    }

    @Override
    public String getAddress() {
        return "南昌市";
    }

    public String getName() {
        return "gongzhixing";
    }
}
