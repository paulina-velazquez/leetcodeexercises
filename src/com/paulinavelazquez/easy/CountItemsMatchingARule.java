package com.paulinavelazquez.easy;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingARule {

    public static void main(String[] args) {

        List<List<String>> listOfLists = new ArrayList<>();

        List<String> list1 = new ArrayList<>();
        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");
        listOfLists.add(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");
        listOfLists.add(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("phone");
        list3.add("gold");
        list3.add("iphone");
        listOfLists.add(list3);

        System.out.println(countMatches(listOfLists, "color", "silver"));   // should return 1
        System.out.println(countMatches(listOfLists, "type", "phone"));    // should return 2
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int indexRuleKey = 0;
        int count = 0;
        if (ruleKey.equals("color")) {
            indexRuleKey = 1;
        }
        if (ruleKey.equals("name")) {
            indexRuleKey = 2;
        }
        for (List<String> item : items) {
            if (item.get(indexRuleKey).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
