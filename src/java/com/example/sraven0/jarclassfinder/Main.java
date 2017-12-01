package com.example.sraven0.jarclassfinder;

public class Main{
    public static void main(String[] args){
        System.out.println(
        Main.class.getClassLoader().getResource("com/example/sraven0/jarclassfinder/Main.class"));
    }
}

