package com.gap.course.number;

/**
 * Created by ssibaja on 4/19/17.
 */
public class NumberImpl implements Number {

    private int value;


    public NumberImpl(int val){
        this.value = val;

    }

    public double getValue() {
        return this.value;
    }
}
