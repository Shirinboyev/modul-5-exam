package main.java.uz.pdp.lesson1;

import main.java.uz.pdp.lesson1.User;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        User user;
        user = new User(12,"Usmon","g40");

        printPrivateFields(user);



    }
    public static void printPrivateFields(Object obj) {
        Class<?> userClass = obj.getClass();
        Field[] fields = userClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                System.out.println(field.getName()+ ": " + field.get(obj));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}