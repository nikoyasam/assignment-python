import random

def create_maze(rows, columns):
    maze = [[0]*columns for _ in range(rows)]
    return maze

def set_start_goal(maze, rows, columns):
    start = (random.randint(0, rows-1), random.randint(0, 1))
    goal = (random.randint(0, rows-1), random.randint(columns-2, columns-1))
    maze[start[0]][start[1]] = 7
    maze[goal[0]][goal[1]] = 8
    return start, goal

def set_barriers(maze, rows, columns, num_barriers):
    for _ in range(num_barriers):
        while True:
            barrier = (random.randint(0, rows-1), random.randint(0, columns-1))
            if maze[barrier[0]][barrier[1]] == 0:
                maze[barrier[0]][barrier[1]] = 1
                break

def print_maze(maze):
    for row in maze:
        print(row)

rows, columns = 6, 6
maze = create_maze(rows, columns)
start, goal = set_start_goal(maze, rows, columns)
set_barriers(maze, rows, columns, 4)
print_maze(maze)



