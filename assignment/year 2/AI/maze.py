import random

def create_maze(rows, columns):   #takes 2 parameters rows and columns
    maze = [[0]*columns for _ in range(rows)] #creates a 2D list with specified no. of rows and cols, each cell in the maze is initially 0
    return maze #returns the maze created

def set_start_goal(maze, rows, columns): 
    start_node = (random.randint(0, rows-1), random.randint(0, 1)) #randomly selects a cell in the first two columns to be the start cell.
    goal_node = (random.randint(0, rows-1), random.randint(columns-2, columns-1)) #randomly selects a cell in the last two columns to be the goal cell.
    maze[start_node[0]][start_node[1]] = 7 #sets the start cell in maze to 7
    maze[goal_node[0]][goal_node[1]] = 8 # sets the goal cell in the maze to 8
    return start_node, goal_node

def set_barriers(maze, rows, columns, num_barriers):
    for _ in range(num_barriers):
        while True: #for each iteration while loop runs until it finds an empty cell in the maze.
            barrier = (random.randint(0, rows-1), random.randint(0, columns-1)) # randomly selects a cell in the maze.
            if maze[barrier[0]][barrier[1]] == 0: #indicating cell is empty
                maze[barrier[0]][barrier[1]] = 1 # indicating cell is a barrier so sets the value of that cell to one. 
                break #breaks out the while loop 

def print_maze(maze):
    for row in maze:
        print(row)

rows, columns = 6, 6  #creates a 6 by 6 maze
maze = create_maze(rows, columns) 
start_node, goal_node = set_start_goal(maze, rows, columns)
set_barriers(maze, rows, columns, 4) #places four barriers randomly
print_maze(maze)

#TASK 2 - DFS ALGORITHM

def moves_valid(x_value, y_value, maze): # defined to find all valid moves from a given cell in the maze
    next_valid_move = [] # empty list is initialized to store the valid moves.

    maze_directions = [(0, -1), #West
                       (-1, 0), #North
                       (0, 1), #East
                       (1, 0), #South
                       (-1, -1), #Northwest
                       (-1, 1), #Northeast
                       (1, -1), #Southwest
                       (1, 1) #Southeast
                    ] 
    #  list contains eight possible directions to move in the form of (dx, dy).

    for x,y in maze_directions: # iterates over each direction in maze_directions
        new_x = x_value + x # calculate the coordinates of the neighboring cell in the current direction.
        new_y = y_value + y

        if 0 <= new_x < len(maze) and 0 <= new_y < len(maze[0]) and maze[new_x][new_y] != 1:
            # checks if the new coordinates are within the maze boundaries and if the cell is not a barrier then move is considered valid
            next_valid_move.append((new_x,new_y)) # adds the coordinates of the valid move to the list.

    return next_valid_move # returns the list of valid neighboring moves

# Apply DFS search to the maze to find the goal

def DFS_Process(maze, stack, visited_cells): #a stack to store cells to be explored, and a set to store visited cells.
    start = (start_cell_column, start_cell_row) #set the start and goal cells based on their row and column indices.
    goal = (goal_cell_column, goal_cell_row)
    stack.append(start) #  adds the start cell to the stack.

    while stack: #  runs as long as there are cells in the stack to be explored.
        current_explore_cell = stack.pop() #  removes and returns the last cell from the stack to be explored.

        if current_explore_cell == goal:
            print("Goal found")   #checks if the current cell is the goal. If it is, it prints “Goal found”
            print("This is the Final path", visited_cells)
            Total_Nodes = len(visited_cells)
            print("Time taken to find the goal: ", Total_Nodes, "minutes")
            return

        a = current_explore_cell[0] # extract the x and y coordinates of the current cell.
        b = current_explore_cell[1]
        next_steps = moves_valid(a, b, maze) #function to get a list of valid neighboring moves from the current cell.

        # Sort the next steps based on increasing order
        next_steps.sort() #  sorts these moves in increasing order

        for next_cell in next_steps: # iterates over each valid move.
            if next_cell in visited_cells: #  checks if a move has already been visited.if so,it skips that move 
                continue
            visited_cells.add(next_cell) # adds that move to visited cells
            stack.append(next_cell) #adds it to the stack 

start_cell_row, start_cell_column = 0, 0 #you initialize your start and goal cells with specific row and column indices
goal_cell_row, goal_cell_column = 4, 4

# "explore_cells_stack" list works as a stack
explore_cells_stack = [] #initializes stack
# visited set doesn't contain repeated cells.
visited = set()

DFS_Process(maze, explore_cells_stack, visited)

print("\n")
print("End of DFS Search Algorithm")





#Task 03 - heuristic cost

def calculate_manhattan_distance(goal_row_distance, goal_col_distance, row, column):
    return abs(goal_row_distance - row) + abs(goal_col_distance - column)

def a_star_search(maze, start_row, start_column, goal_row, goal_column):
    cell_value_list = []
    priority_queue = []
    visited_nodes_list = []
    heuristic_value_dictionary = {}
    start_node = (start_column, start_row)
    goal_node = (goal_column, goal_row)
    child_node = start_node
    path_reverse_dic = {}

    heuristic_value = [calculate_manhattan_distance(goal_row, goal_column, i, j) for i in range(6) for j in range(6)]
    
    for i in range(6):
        for j in range(6):
            temp_cell = (j, i)
            cell_value_list.append(temp_cell)
    for i in range(36):
        value = cell_value_list[i]
        heuristic_value_dictionary[value] = heuristic_value[i]

    g_score_dict = {cell: float('inf') for cell in cell_value_list}
    g_score_dict[start_node] = 0

    f_score_dict = {cell: float('inf') for cell in cell_value_list}
    f_score_dict[start_node] = heuristic_value_dictionary[start_node]

    priority_queue.append(start_node)

    while len(priority_queue) != 0:
        curr_cell_node = priority_queue.pop(0)
        start_column = curr_cell_node[0]
        start_row = curr_cell_node[1]
        visited_nodes_list.append(curr_cell_node)

        west_search = maze[start_column][start_row - 1]
        if start_column < 5:
            north_search = maze[start_column + 1][start_row]
        if start_row < 5:
            east_search = maze[start_column][start_row + 1]
        south_search = maze[start_column - 1][start_row]

        if start_column < 5:
            L = maze[start_row - 1][start_column + 1]

        if start_column < 5 and start_row < 5:
            M = maze[start_row + 1][start_column + 1]

        if start_row < 5:
            P = maze[start_row + 1][start_column - 1]

        O = maze[start_row - 1][start_column - 1]

        if curr_cell_node == goal_node:
            print("Goal has been found")
            print(visited_nodes_list)
            length_node_list = len(visited_nodes_list)
            print("Time taken to find the goal: ", length_node_list, "minutes")
            break
        else:
            for i in "ESNWLMPO":
                if i == "W":
                    if start_row - 1 >= 0 and west_search != 1:
                        child_node = (start_column, start_row - 1)

                elif i == "N":
                    if start_column + 1 < len(maze) and north_search != 1:
                        child_node = (start_column + 1, start_row)

                elif i == "S":
                    if start_column - 1 > 0 and south_search != 1:
                        child_node = (start_column - 1, start_row)

                elif i == "E":
                    if start_row + 1 < len(maze) and east_search != 1:
                        child_node = (start_column, start_row + 1)

                elif i == "L":
                    if (start_row - 1 >= 0 and start_column + 1 < len(maze)) and L != 1:
                        child_node = (start_column + 1, start_row - 1)

                elif i == "M":
                    if (start_row + 1 < len(maze) and start_column + 1 < len(maze)) and M != 1:
                        child_node = (start_column + 1, start_row + 1)

                elif i == "P":
                    if (start_row + 1 < len(maze) and start_column - 1 >= 0) and P != 1:
                        child_node = (start_column - 1, start_row + 1)

                elif i == "O":
                    if (start_row - 1 >= 0 and start_column - 1 >= 0) and O != 1:
                        child_node = (start_column - 1, start_row - 1)

                temp_g_value = g_score_dict[curr_cell_node] + 1
                temp_final_value = temp_g_value + heuristic_value_dictionary[child_node]

                if temp_final_value < f_score_dict[child_node]:
                    g_score_dict[child_node] = temp_g_value
                    f_score_dict[child_node] = temp_final_value
                    priority_queue.append(child_node)
                    path_reverse_dic[child_node] = curr_cell_node

    cell_temp = (goal_column, goal_row)
    path_forward = {}
    while cell_temp != start_node:
        path_forward[path_reverse_dic[cell_temp]] = cell_temp
        cell_temp = path_reverse_dic[cell_temp]

    print("\n")
    print("The final path :")
    print(path_forward.values())
# Calculate Manhattan distance for each cell in the maze
# Perform A* search using Manhattan distance as the heuristic
a_star_search(maze, start_cell_row, start_cell_column, goal_cell_row, goal_cell_column)





        
        
        
           
