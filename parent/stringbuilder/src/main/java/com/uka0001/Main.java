package com.uka0001;

public class Main {
    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder(); //+
//        stringBuilder.append("New name"); //TODO
//        stringBuilder.reverse(); //TODO
//        stringBuilder.deleteCharAt(4); //TODO
//        stringBuilder.delete(1,3); //TODO

        PetStringBuilder petStringBuilder = new PetStringBuilder();
        petStringBuilder.append("Pet");
        petStringBuilder.append("New");
        System.out.println(petStringBuilder.toString());
    }
}
