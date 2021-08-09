package ru.netology.task1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dictionary implements Function<String, List<String>> {
    @Override
    public List<String> apply(String s) {
        return Arrays.stream(s.split("[ !,.?:;'\"]"))
                .filter(e -> e.length() > 0)
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
