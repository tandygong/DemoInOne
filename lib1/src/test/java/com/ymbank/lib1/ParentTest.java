package com.ymbank.lib1;


import junit.framework.TestCase;

import org.junit.Assert;

public class ParentTest extends TestCase {
    Parent parent;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        parent = new Parent();
    }

    public void tearDown() throws Exception {
    }

    public void testGetSex() {
        Assert.assertEquals(parent.getSex(),"男");
    }

    public void testGetAge() {
        Assert.assertEquals(parent.getAge(),18);
    }

    public void testGetAddress() {
        Assert.assertEquals(parent.getAddress(),"南昌市");
    }

    public void testTestGetName() {
        Assert.assertEquals(parent.getName(),"gongzhixing");
    }
}