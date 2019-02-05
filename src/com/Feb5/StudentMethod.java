package com.Feb5;

public class StudentMethod {
    public void checkName(String name, String[] array) throws CustomException {
        for (int counter = 0; counter < array.length; counter++) {
            if (name.equalsIgnoreCase(array[counter])) {
                System.out.println("it is there");
                return;
            }
        }
        throw new CustomException("- name doesn't exist in the list");
    }
}



