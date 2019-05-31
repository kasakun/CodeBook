/**
 * Naive solution
 */
class Solution {
public:
    int trap(vector<int>& height) {
        int ans = 0;
        int size = height.size();
        // add each bar 
        // the size() return unsigned 0 when it is empty
        for (int i = 1; i < size - 1; ++i) {
            int left_max = 0, right_max = 0;
            
            for (int j = i; j >= 0; --j)
                left_max = max(left_max, height[j]);
            
            for (int j = i; j < height.size(); ++j)
                right_max = max(right_max, height[j]);
            
            ans += min(left_max, right_max) - height[i];
        }
        
        return ans;
    }
};