package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getPermission(40,24));
        System.out.println(getPermission(18,20));
        System.out.println(getPermission(30,18));
        System.out.println(getPermission(25,15));
        System.out.println(getPermission(20,10));
    }

    public static String getPermission(int age,int tempOut){
        if ((age > 20 && age < 45 ) && (tempOut>-20 && tempOut<30)){
          return "Можно идти гулять";
        }
        else if (age <20 && (tempOut >0 && tempOut<28)) {
            return "Можно идти гулять";
        } else if (age >45 && (tempOut>-10 && tempOut<25)){
            return "Можно идти гулять";
        }else {
            return "Оставайтесь дома";
        }
    }

}


