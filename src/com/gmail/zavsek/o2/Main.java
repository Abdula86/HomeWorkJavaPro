package com.gmail.zavsek.o2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("bird", "cat", "dog", "bird", "cat", "dog", "fox", "rabbit", "bird", "cat");
        System.out.println("Occurrence of 'bird': " + StringUtils.countOccurrence(words, "bird"));

        Integer[] array = {1, 2, 3};
        List<Integer> list = ArrayUtils.toList(array);
        System.out.println("Converted list: " + list);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 4, 5, 3, 6, 7, 8, 9, 4, 5);
        System.out.println("Unique numbers: " + ArrayUtils.findUnique(numbers));

        ArrayUtils.calcOccurrence(words);

        List<ArrayUtils.WordOccurrence> occurrences = ArrayUtils.findOccurrence(words);
        System.out.println("Occurrences: " + occurrences);
    }
}

class StringUtils {
    public static int countOccurrence(List<String> words, String target) {
        int count = 0;
        for (String word : words) {
            if (word.equals(target)) {
                count++;
            }
        }
        return count;
    }
}

class ArrayUtils {
    public static <T> List<T> toList(T[] array) {
        return Arrays.asList(array);
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        return new ArrayList<>(uniqueNumbers);
    }

    public static void calcOccurrence(List<String> words) {
        Map<String, Integer> occurrences = new HashMap<>();
        for (String word : words) {
            occurrences.put(word, occurrences.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static class WordOccurrence {
        String name;
        int occurrence;

        WordOccurrence(String name, int occurrence) {
            this.name = name;
            this.occurrence = occurrence;
        }

        @Override
        public String toString() {
            return "{name: \"" + name + "\", occurrence: " + occurrence + "}";
        }
    }

    public static List<WordOccurrence> findOccurrence(List<String> words) {
        Map<String, Integer> occurrences = new HashMap<>();
        for (String word : words) {
            occurrences.put(word, occurrences.getOrDefault(word, 0) + 1);
        }
        List<WordOccurrence> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            result.add(new WordOccurrence(entry.getKey(), entry.getValue()));
        }
        return result;
    }
}
