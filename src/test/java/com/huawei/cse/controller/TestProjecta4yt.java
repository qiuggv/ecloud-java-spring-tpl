package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjecta4yt {

        Projecta4ytDelegate projecta4ytDelegate = new Projecta4ytDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projecta4ytDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}