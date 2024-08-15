package com.ucodeacademy.practice;

import org.junit.*;

public class JUnitAnnotations {

    @Before  // from junit 4
    public void beforeEachTestMethod(){ // this method runs before each @Test/method
        System.out.println("I run before each test method");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("I run before class");
    }

    @After
    public void afterEachTest(){
        System.out.println("I run after each test method");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("I run after class");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Ignore
    @Test
    public void test2(){
        System.out.println("Test 2");
    }

    //setting time out for this test
    @Test (timeout = 2000) // 3000 == 3 seconds
    public void test3() throws Exception{

        Thread.sleep(2000);
        System.out.println("Test 3");
    }

    //String s; we get NullPointerException because it is null
    //String s = null; // when the string is declared and null is assigned to it
        //System.out.println(s.charAt(1));

    @Test(expected = NullPointerException.class)
    public void test4(){

        String s = null; // when the string is declared and null is assigned to it
        System.out.println(s.charAt(1));
        //System.out.println(5/0);
    }





}
