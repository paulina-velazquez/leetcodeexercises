package com.paulinavelazquez.easy;

public class DefangingIPAddress {
    public static void main(String[] args) {
        defangingAddressFirst("255.100.50.0");
        defangingAddressSecond("1.1.1.1");
    }

    private static void defangingAddressFirst(String address) {
        System.out.println("First Method: \nAddress before: " + address);
        address = address.replace(".", "[.]");
        System.out.println("Address after: " + address);
    }

    public static void defangingAddressSecond(String address) {
        System.out.println("Second Method: \nAddress before: " + address);
        String newAddress = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                newAddress += "[.]";
            } else {
                newAddress += address.charAt(i);
            }
        }
        System.out.println("Address after: " + newAddress);
    }
}
