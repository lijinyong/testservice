package com.huawei.paas.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectlpza {

        ProjectlpzaDelegate projectlpzaDelegate = new ProjectlpzaDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectlpzaDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}