#include <set>
using namespace std;

class Solution {
public:
    bool containsNearbyAlmostDuplicate(vector<int>& nums, int indexDiff, int valueDiff) {
        set<long long> window; // use long long to prevent overflow

        for (int i = 0; i < nums.size(); ++i) {
            long long num = nums[i];

            // Find the smallest number >= num - valueDiff
            auto it = window.lower_bound(num - (long long)valueDiff);

            // Check if this number is within valueDiff of nums[i]
            if (it != window.end() && *it - num <= valueDiff)
                return true;

            // Insert current number into the window
            window.insert(num);

            // Maintain window size <= indexDiff
            if (i >= indexDiff)
                window.erase(nums[i - indexDiff]);
        }

        return false;
    }
};
