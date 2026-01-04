package com.nelson.SRVPGM01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Greeting pgmsrv = new Greeting();
    String result = "";
    result= pgmsrv.execute("Nelson");
    System.out.println(result);
    }
}