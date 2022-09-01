package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> duplicates = new ArrayList<>();
        for (int i = 2; i < sourceList.size(); i += 3) {
            duplicates.add(sourceList.get(i));
            duplicates.add(sourceList.get(i));
        }
        return duplicates;
    }
}
