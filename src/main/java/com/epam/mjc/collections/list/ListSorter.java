package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        if(formula(intA) == formula(intB))
            return Integer.parseInt(a) - Integer.parseInt(b);
        else
            return formula(intA) - formula(intB);
    }

    private int formula(int num) {
        return 5 * num * num + 3;
    }
}
