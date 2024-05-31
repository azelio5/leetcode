package com.anvar.leetcode.Middle;

import java.util.*;

public class InsertDeleteGetRandom {
    private final Map<Integer, Integer> valueToIndexMap = new HashMap<>(); // Maps value to its index in 'valuesList'.
    private final List<Integer> valuesList = new ArrayList<>(); // Stores the values.
    private final Random randomGenerator = new Random(); // Random generator for getRandom() method.

    // Constructor of the RandomizedSet.
    public void RandomizedSet() {
    }

    // Inserts a value to the set. Returns true if the set did not already contain the specified element.
    public boolean insert(int val) {
        if (valueToIndexMap.containsKey(val)) {
            // If the value is already present, return false.
            return false;
        }
        // Map the value to the size of the list which is the future index of this value.
        valueToIndexMap.put(val, valuesList.size());
        // Add the value to the end of the values list.
        valuesList.add(val);
        return true;
    }

    // Removes a value from the set. Returns true if the set contained the specified element.
    public boolean remove(int val) {
        if (!valueToIndexMap.containsKey(val)) {
            // If the value is not present, return false.
            return false;
        }
        // Get index of the element to remove.
        int indexToRemove = valueToIndexMap.get(val);
        // Get last element in the list.
        int lastElement = valuesList.get(valuesList.size() - 1);
        // Move the last element to the place of the element to remove.
        valuesList.set(indexToRemove, lastElement);
        // Update the map with the new index of lastElement.
        valueToIndexMap.put(lastElement, indexToRemove);
        // Remove the last element from the list.
        valuesList.remove(valuesList.size() - 1);
        // Remove the entry for the removed element from the map.
        valueToIndexMap.remove(val);
        return true;
    }

    // Get a random element from the set.
    public int getRandom() {
        // Returns a random element using the random generator.
        return valuesList.get(randomGenerator.nextInt(valuesList.size()));
    }
}
