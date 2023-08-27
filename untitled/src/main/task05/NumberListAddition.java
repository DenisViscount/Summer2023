package main.task05;

import java.util.List;

public class NumberListAddition {
    public static <T extends Number> void addAllToList(List<? extends T> sourceList, List<T> targetList) {
        targetList.addAll(sourceList);
    }
}
