# Job-Schedular
Implemented different Job Scheduling Algorithms.

Input consists of following.
1. Job Name
2. Duration Time taken for completion
3. Priority of jobs. P0>P1>P2
4. Deadline.
5. UserType. (root>admin>user)

Algorithms:
1. First Come First Serve(FCFS)
2. Shortest Job First(SJF) - Process with smallest execution time first.
                           - If tie check for priority.
3. Fixed Priority Scheduling(FPS) - Highest priority executed first.
                                  - If tie
                                      1) User Type
                                      2) Longest job first.

Example:
Sample Input:
Number of Jobs: 6
No of threads: 2

j1
10
p0
10
root
j2
20
p0
40
admin
j3
15
p2
40
user
j4
30
p1
30
admin
j5
10
p2
30
root
j6
19
p1
30
admin
