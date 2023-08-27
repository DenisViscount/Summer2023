package main.task06;

import java.util.List;

public class ListElementCopier {
    public static <T> void copyElements(List<? extends T> sourceList, List<? super T> targetList) {
        targetList.addAll(sourceList);
    }
}
