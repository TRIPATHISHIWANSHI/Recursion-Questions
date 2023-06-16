 class Solution {
    int missingNumber(int array[], int n) {
        int expectedSum = (n * (n + 1)) / 2;
        return findMissing(array, 0, expectedSum);
    }
    
    int findMissing(int array[], int index, int expectedSum) {
        if (index == array.length) {
            return expectedSum;
        }
        
        int currentSum = 0;
        for (int i = index; i < array.length; i++) {
            currentSum += array[i];
        }
        
        return expectedSum - currentSum;
    }
}
