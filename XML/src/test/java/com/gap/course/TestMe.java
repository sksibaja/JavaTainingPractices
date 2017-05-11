package com.gap.course;

import org.junit.*;

import java.util.Random;

/**
 * Created by ssibaja on 5/2/17.
 */
public class TestMe {


    @BeforeClass
    public static void primeroQueTodo(){
        System.out.println("Primero, al iniciar la clase 1 vez");
    }

    @Before
    public  void primero(){
        System.out.println("Ptimero que todo");

    }

    @Test
    public void testFoo(){
        Random r = new Random();
        Assert.assertTrue(r.nextBoolean());
    }

    @After
    public  void despues(){
        System.out.println("Despues, despues de todo");

    }

    @AfterClass
    public static void despuesQueTodo(){
        System.out.println("Final, al finalizar la clase 1 vez");

    }



}
