class Solution {
    public int swimInWater(int[][] grid) {
         int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        
        // Priority queue: [time, x, y]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{grid[0][0], 0, 0});
        
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int time = cur[0], x = cur[1], y = cur[2];
            
            if (visited[x][y]) continue;
            visited[x][y] = true;
            
            // If we've reached the bottom-right cell
            if (x == n - 1 && y == n - 1) return time;
            
            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                
                if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
                    // The time needed is the max of current water level and the next cell’s height
                    pq.offer(new int[]{Math.max(time, grid[nx][ny]), nx, ny});
                }
            }
        }
        
        return -1; // This line is never actually reached
    }
}
