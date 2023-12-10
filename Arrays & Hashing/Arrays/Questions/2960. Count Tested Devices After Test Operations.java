/* Solution 1
TC -> O(N^2)
SC -> O(1)
*/

class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        
        int countOfTestedDevices = 0; // Counter to keep track of tested devices
        int n = batteryPercentages.length; // Length of the input array
        
        for (int i = 0; i < n; i++) {
            if (batteryPercentages[i] <= 0) {
                continue; // Skip devices with non-positive battery percentages
            }
            
            for (int j = i + 1; j < n; j++) {
                if (batteryPercentages[j] > 0) {
                    // Decrement the battery percentage of the next device by 1
                    int current = batteryPercentages[j] - 1;
                    batteryPercentages[j] = current;
                }   
            }
            
            countOfTestedDevices++; // Increment the count for each tested device
        }
        
        return countOfTestedDevices;
    }
}


/* Solution 2
TC -> O(N)
SC -> O(1)
*/

class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        
        int countOfTestedDevices = 0; // Counter to keep track of tested devices
       
        int n = batteryPercentages.length; // Length of the input array
        

        for (int batteryPercentage : batteryPercentages) {

            // If the battery percentage is greater than the current count of tested devices,
            // increment the count to simulate testing the device
            if (batteryPercentage > countOfTestedDevices) {
                countOfTestedDevices++;
            }
        }
        return countOfTestedDevices;
    }
}
