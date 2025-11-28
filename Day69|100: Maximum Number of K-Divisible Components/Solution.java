class Solution(object):
    def maxKDivisibleComponents(self, n, edges, values, k):
        """
        :type n: int
        :type edges: List[List[int]]
        :type values: List[int]
        :type k: int
        :rtype: int
        """
        # Build adjacency list
        graph = [[] for _ in range(n)]
        for a, b in edges:
            graph[a].append(b)
            graph[b].append(a)
        
        self.components = 0
        
        def dfs(node, parent):
            # Start with the value of the current node
            subtree_sum = values[node]
            
            # Add values from all children
            for neighbor in graph[node]:
                if neighbor != parent:
                    subtree_sum += dfs(neighbor, node)
            
            # If this subtree's sum is divisible by k, we can make it a component
            if subtree_sum % k == 0:
                self.components += 1
                return 0  # Return 0 to parent since we're cutting this subtree off
            
            # Otherwise, return the sum to be added to parent
            return subtree_sum
        
        # Start DFS from node 0
        dfs(0, -1)
        
        return self.components
