# There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

# For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
# Return the ordering of courses you should take to finish all courses. If there are many valid answers, return any of them. If it is impossible to finish all courses, return an empty array.

 

# Example 1:

# Input: numCourses = 2, prerequisites = [[1,0]]
# Output: [0,1]
# Explanation: There are a total of 2 courses to take. To take course 1 you should have finished course 0. So the correct course order is [0,1].
# Example 2:

# Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
# Output: [0,2,1,3]
# Explanation: There are a total of 4 courses to take. To take course 3 you should have finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
# So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3].
# Example 3:

# Input: numCourses = 1, prerequisites = []
# Output: [0]


class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        # Creating preMap for courses to store it's prerequisites
        # Initializing it as empty list
        preMap = {i: [] for i in range(numCourses)}
        # Updating preMap
        for crs, pre in prerequisites:
            preMap[crs].append(pre)
        #Initializing visitSet and cycleSet
        visitSet,cycleSet = set(),set()
        #Initializing output array
        output = []
        
        #DFS Algorithm
        def dfs(crs):
            #Base cases
            #If course is already in cycle means it will form a loop
            if crs in cycleSet:
                return False
            #If course is in visitSet means it is already visited and it does not have any prerequisites
            if crs in visitSet:
                return True
            
            #After base case verification course is added to the cycle
            cycleSet.add(crs)
            for pre in preMap[crs]:
                if not dfs(pre):
                    return False
            #After course is visited it is removed from cycle and added to visitSet
            cycleSet.remove(crs)
            visitSet.add(crs)
            #Adding the proper visited course in output
            output.append(crs)
            return True
        
        for crs in range(numCourses):
            if not dfs(crs):
                return []
        return output
            

