class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        
        // positions of zeros
        java.util.ArrayList<Integer> Z = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') Z.add(i);
        }
        
        int totalZeros = Z.size();
        int LIM = (int)Math.sqrt(n) + 2;

        int ans = 0;

        for (int i = 0; i < n; i++) {
            // find the first zero >= i
            int idx = java.util.Collections.binarySearch(Z, i);
            if (idx < 0) idx = -idx - 1;

            // Case z = 0: no zero in substring
            int firstZero = (idx == totalZeros ? n : Z.get(idx));
            ans += (firstZero - i);

            // Case z = 1..LIM
            for (int z = 1; z <= LIM; z++) {
                int zeroIdx = idx + z - 1;
                if (zeroIdx >= totalZeros) break;

                int posZ = Z.get(zeroIdx);   // position of z-th zero from i
                
                // Count ones from i to posZ
                int onesUpToZ = posZ - i + 1 - z;
                
                // Need: ones >= z²
                int needOnes = z * z;
                
                // Find the next zero position (for upper bound)
                int nextZero = (zeroIdx + 1 < totalZeros ? Z.get(zeroIdx + 1) : n);
                
                if (onesUpToZ >= needOnes) {
                    // Already satisfied at posZ
                    ans += (nextZero - posZ);
                } else {
                    // Need more ones: additional = needOnes - onesUpToZ
                    int additionalOnes = needOnes - onesUpToZ;
                    
                    // The ending position must be at least posZ + additionalOnes
                    int minEnd = posZ + additionalOnes;
                    
                    if (minEnd < nextZero) {
                        ans += (nextZero - minEnd);
                    }
                }
            }
        }

        return ans;
    }
}
