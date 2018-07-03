package oo_patterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    private static final HashMap<String, Boolean> MAP = new HashMap();

    static {
        for (int i = 0; i < 500; i++) {
            MAP.put("true" + i, true);
        }
        for (int i = 0; i < 500; i++) {
            MAP.put("false" + i, false);
        }
    }

    public static void main(String[] args) {

        Long start7 = System.currentTimeMillis();
        List<String> list7 = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : MAP.entrySet()) {
            if (entry.getValue() != null && entry.getValue()) {
                list7.add(entry.getKey());
            }
        }
        Long java7Time = System.currentTimeMillis() - start7;

        Long start8 = System.currentTimeMillis();
        List<String> list8 = MAP.entrySet()
                        .stream()
                        .filter(featureEnabled -> featureEnabled.getValue())
                        .map(featureEnabled -> featureEnabled.getKey())
                        .collect(Collectors.toList());
        Long java8Time = System.currentTimeMillis() - start8;

        System.out.println("Java 7 time:" + java7Time + "ms");
        System.out.println("Java 8 time:" + java8Time + "ms");
    }
}
