class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        
        // Build the graph using the equations and values
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            double value = values[i];
            
            // Add both directions since it's a bidirectional relationship
            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());
            
            graph.get(a).put(b, value);
            graph.get(b).put(a, 1.0 / value);
        }

        // Step 2: Define DFS to find the result of a query
        double[] result = new double[queries.size()];
        
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String start = query.get(0);
            String end = query.get(1);
            
            // If either of the variables is not in the graph, result is -1.0
            if (!graph.containsKey(start) || !graph.containsKey(end)) {
                result[i] = -1.0;
            } else {
                // Perform DFS to find the path from start to end
                Set<String> visited = new HashSet<>();
                result[i] = dfs(graph, start, end, visited);
            }
        }
        
        return result;
    }
    
    // Helper function to perform DFS and calculate the result
    private double dfs(Map<String, Map<String, Double>> graph, String start, String end, Set<String> visited) {
        // Base case: if start equals end, return 1.0
        if (start.equals(end)) {
            return 1.0;
        }
        
        visited.add(start);
        
        // Explore neighbors of the current node
        for (Map.Entry<String, Double> neighbor : graph.get(start).entrySet()) {
            String next = neighbor.getKey();
            double value = neighbor.getValue();
            
            if (!visited.contains(next)) {
                double result = dfs(graph, next, end, visited);
                if (result != -1.0) {
                    return value * result; // Multiply the current value by the result of the next recursive call
                }
            }
        }
        
        // If no valid path is found, return -1.0
        return -1.0;
    }
}
