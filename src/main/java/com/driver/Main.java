package com.driver;

public class Main {

    public static void main(String[] args){
        RWOnly obj = new RWOnly();

       // obj.name = "Manjeet";    Name can't be set like this as name variable is private

        obj.setName("Manjeet");
        String ans = obj.getName();
        System.out.println(ans);
    }
}