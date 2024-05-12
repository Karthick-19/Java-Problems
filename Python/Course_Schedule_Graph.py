# There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

# For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
# Return true if you can finish all courses. Otherwise, return false.

 

# Example 1:

# Input: numCourses = 2, prerequisites = [[1,0]]
# Output: true
# Explanation: There are a total of 2 courses to take. 
# To take course 1 you should have finished course 0. So it is possible.
# Example 2:

# Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
# Output: false
# Explanation: There are a total of 2 courses to take. 
# To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        #Creating premap to store each course's prerequisites
        #Initializing it as empty prerequisites for all course
        preMap = {i:[] for i in range(numCourses)}
        #Updating premap using crs and pre to denote the inner lists first and second value
        for crs, pre in prerequisites:
            preMap[crs].append(pre)
        
        #Initializing vist set
        visitSet = set()

        #DFS method
        def dfs(crs):
            #Base cases 
            #If course already visited it would become a loop which is impossible to finish
            if crs in visitSet:
                return False
        #If preMap of particular course is an empty list meaning it does not need any prerequisite course
            if preMap[crs] == []:
                return True

            #Every course in preMap is added after visiting
            visitSet.add(crs)
            for pre in preMap[crs]:
                if not dfs(pre):
                    return False
#After a course's prerequisite list is completed the courses marked as visited are removed from visitSet
#So that for next course will be checked also the one who marked as visited and deleted and removed from 
#visitSet it's List becomes empty
            visitSet.remove(crs)
            preMap[crs] = []
            return True
        for crs in range(numCourses):
            if not dfs(crs):
                return False
        return True


        