package com.gap.course.utils;

import com.gap.course.number.NumberDoubleImpl;
import com.gap.course.number.NumberImpl;
import com.gap.course.number.Number;
import java.util.Random;
import java.util.*;

/**
 * Created by ssibaja on 4/19/17.
 */
public class CUtils {

    public static Number sum(Number val1, Number val2){

        double sumValues = val1.getValue() + val2.getValue();
        Number result = new NumberDoubleImpl(sumValues);
        return result;

    }

    public static boolean areEquals (Number value1, int value2){

        return ((int)value1.getValue()) == value2;
    }

    public static int[] fillArray() {
        int[] intArray = new int[10];
        Random random = new Random();
        for (int i=0; i<intArray.length; i++) {
            intArray[i] = random.nextInt();
            System.out.println("List [" + i + "] = " + intArray[i]);
        }

        return intArray;
    }

    public static List fillList(int lenght){
        List list = new ArrayList(lenght);
        Random random = new Random();

        for (int i=0; i<lenght; i++){
            list.add(i,random.nextInt(500));
            //System.out.println("intArray [" + i + "] = " + list.get(i));
        }

        for (Object element:list){
            System.out.println(element);
        }
        return list;
    }


    public static void listas(){
        Iterator it = list.iterator()
                while (it.hasNext()){
            System.out...
                }
    }



}
