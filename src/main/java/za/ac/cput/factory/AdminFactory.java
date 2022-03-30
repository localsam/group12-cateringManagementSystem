package za.ac.cput.factory;

import za.ac.cput.entity.Admin;

/*
AdminFactory.java
Factory class for Admin
Author: Ameer Samsodien (220005060)
Date : 29 March 2022
*/

public class AdminFactory {

    public static Admin createAdmin (String adminNum, String firstName, String lastName, String email, String phoneNum) {
        if (adminNum.equals("") || adminNum == null)
            return null;

        if (firstName.equals("") || firstName == null)
            return null;

        if (lastName.equals("") || lastName == null)
            return null;

        if (email.equals("") || email == null)
            return null;

        if (phoneNum.equals("") || phoneNum == null)
            return null;

        return new Admin.Builder().setadminNum(adminNum)
                .setfirstName(firstName)
                .setlastName(lastName)
                .setEmail(email)
                .setPhoneNum(phoneNum)
                .build();
    }

}
