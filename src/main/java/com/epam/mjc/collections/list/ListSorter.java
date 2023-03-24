package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x1 = Integer.parseInt(a);
        int x2 = Integer.parseInt(b);
        int f1 = 5*x1*x1 + 3;
        int f2 = 5*x2*x2 + 3;
        if (f1 == f2) {
            return x1 - x2;
        }
        return f1 - f2;
    }
    }

