package ru.itaros.asmutils;

public class ASMUtils {

    public static String internalize(String packageName){
        return packageName.replace('.','/');
    }

}
