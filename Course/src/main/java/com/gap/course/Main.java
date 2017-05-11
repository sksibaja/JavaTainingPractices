package com.gap.course;

import com.gap.course.number.Number;
import com.gap.course.number.NumberDoubleImpl;
import com.gap.course.number.NumberImpl;
import com.gap.course.utils.CUtils;
import sun.util.calendar.CalendarUtils;
import java.util.*;

import java.util.ArrayList;

/**
 * Created by ssibaja on 4/19/17.
 */
public class Main {

    public static void main(String[] args){
        Number moo = new NumberImpl(10);
        Number foo = new NumberImpl(7);

        Number xas = new NumberDoubleImpl(4.5);

        Number bar = CUtils.sum(moo,xas);

        CUtils.areEquals(bar,17);

        int[] array = new int[10];
        array = CUtils.fillArray();

        List list = CUtils.fillList(10);

        for (int i=0; i<10; i++){
            System.out.println("list [" + i + "] = " + list.get(i));
        }


    }


}
