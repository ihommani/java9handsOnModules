package main;

import com.google.common.base.Preconditions;
import firstgreeting.GreetingFromFirstModule;
import secondgreeting.GreetingFromSecondModule;


public class Greeting {

    public static void main(String[] varargs){

        Preconditions.checkArgument(true);

        GreetingFromFirstModule.main("world");
        GreetingFromSecondModule.main("second world");
    }
}
