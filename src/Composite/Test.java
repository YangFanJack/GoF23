package Composite;

import jdk.jfr.events.ExceptionThrownEvent;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try{
            String a = null;
            a.equals("aa");
        }
        catch (Exception e){

        }
    }
}
