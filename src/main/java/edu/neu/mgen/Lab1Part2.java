package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab1Part2 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Naomi", "Kevin", "Daisy", "Irene", "Ian"));
        ArrayList<String> switchedNames = new ArrayList<>();

        for (String name : names) {
            switchedNames.add(switchFirstAndLast(name));
        }

        System.out.println("Names = " + listToString(names));
        System.out.println("Names (switched) = " + listToString(switchedNames));
    }

    public static String switchFirstAndLast(String name) {
        if (name.length() <= 1) {
            return name;
        }
        char firstChar = name.charAt(name.length() - 1);
        char lastChar = name.charAt(0);
        String middle = name.substring(1, name.length() - 1);
        return Character.toUpperCase(firstChar) + middle + Character.toLowerCase(lastChar);
    }

    public static String listToString(ArrayList<String> list) {
        String result = "{ ";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
            if (i < list.size() - 1) {
                result += ", ";
            }
        }
        result += " }";
        return result;
    }
}
