import java.util.*;

public class MazeSolver {
    public static void main(String[] args) {
        int[][] randomMaze = createRandomMaze(6, 6);
        printMaze(randomMaze);

        int startCellRow = (int) (Math.random() * 2);
        int startCellColumn = (int) (Math.random() * 6);
        randomMaze[startCellColumn][startCellRow] = 7;

        int goalCellRow = 4 + (int) (Math.random() * 2);
        int goalCellColumn = (int) (Math.random() * 6);
        randomMaze[goalCellColumn][goalCellRow] = 8;

        int barrierCounter = 0;
        while (barrierCounter < 4) {
            int barrierRow = (int) (Math.random() * 6);
            int barrierColumn = (int) (Math.random() * 6);

            if (randomMaze[barrierColumn][barrierRow] != 0) {
                continue;
            }

            randomMaze[barrierColumn][barrierRow] = 1;
            barrierCounter++;
        }

        printMaze(randomMaze);
        System.out.println();

        int[][] exploreCellsStack = new int[randomMaze.length * randomMaze[0].length][2];
        Set<Integer> visited = new HashSet<>();
        validMoves(startCellRow, startCellColumn, randomMaze);
        dfsProcess(randomMaze, exploreCellsStack, visited);
        System.out.println("\nEnd of DFS Search Algorithm\n");
        System.out.println("Start of A* Search Algorithm\n");

        int[][] heuristicValues = chebyshevDistanceCalculation(goalCellRow, goalCellColumn);
        aStarSearch(randomMaze, startCellRow, startCellColumn, goalCellRow, goalCellColumn, heuristicValues);
    }

    public static int[][] createRandomMaze(int numRows, int numCols) {
        int[][] maze = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                maze[i][j] = 0;
            }
        }
        return maze;
    }

    public static void printMaze(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static List<int[]> validMoves(int xCoordinate, int yCoordinate, int[][] maze) {
        List<int[]> nextValidMoves = new ArrayList<>();
        // Search directions
        int westSearch = maze[yCoordinate][xCoordinate - 1];
        int northSearch = yCoordinate < 5 ? maze[yCoordinate + 1][xCoordinate] : 0;
        int eastSearch = xCoordinate < 5 ? maze[yCoordinate][xCoordinate + 1] : 0;
        int southSearch = maze[yCoordinate - 1][xCoordinate];
        int northwestSearch = yCoordinate < 5 && xCoordinate > 0 ? maze[yCoordinate + 1][xCoordinate - 1] : 0;
        int northeastSearch = yCoordinate < 5 && xCoordinate < 5 ? maze[yCoordinate + 1][xCoordinate + 1] : 0;
        int southeastSearch = xCoordinate < 5 ? maze[yCoordinate - 1][xCoordinate + 1] : 0;
        int southwestSearch = yCoordinate > 0 ? maze[yCoordinate - 1][xCoordinate - 1] : 0;

        // Search process
        if (xCoordinate - 1 >= 0 && westSearch != 1) {
            nextValidMoves.add(new int[]{yCoordinate, xCoordinate - 1});
        }
        if (yCoordinate + 1 < maze.length && northSearch != 1) {
            nextValidMoves.add(new int[]{yCoordinate + 1, xCoordinate});
        }
        if (xCoordinate + 1 < maze[0].length && eastSearch != 1) {
            nextValidMoves.add(new int[]{yCoordinate, xCoordinate + 1});
        }
        if (yCoordinate - 1 >= 0 && southSearch != 1) {
            nextValidMoves.add(new int[]{yCoordinate - 1, xCoordinate});
        }
        if (xCoordinate - 1 >= 0 && yCoordinate + 1 < maze.length && northwestSearch != 1) {
            nextValidMoves.add(new int[]{yCoordinate + 1, xCoordinate - 1});
        }
        if (xCoordinate + 1 < maze[0].length && yCoordinate + 1 < maze.length && northeastSearch != 1) {
            nextValidMoves.add(new int[]{yCoordinate + 1, xCoordinate + 1});
        }
        if (xCoordinate + 1 < maze[0].length && yCoordinate - 1 >= 0 && southeastSearch != 1) {
            nextValidMoves.add(new int[]{yCoordinate - 1, xCoordinate + 1});
        }
        if (xCoordinate - 1 >= 0 && yCoordinate - 1 >= 0 && southwestSearch != 1) {
            nextValidMoves.add(new int[]{yCoordinate - 1, xCoordinate - 1});
        }
        return nextValidMoves;
    }

    public static void dfsProcess(int[][] maze, int[][] stack, Set<int[]> visitedCells) {
        int startCellRow = stack[0][0];
        int startCellColumn = stack[0][1];
        int goalCellRow = -1; // Set to -1 to initialize
        int goalCellColumn = -1; // Set to -1 to initialize

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 7) {
                    startCellRow = j;
                    startCellColumn = i;
                } else if (maze[i][j] == 8) {
                    goalCellRow = j;
                    goalCellColumn = i;
                }
            }
        }

        if (goalCellRow == -1 || goalCellColumn == -1) {
            System.out.println("Goal not found in the maze");
            return;
        }

        stack[0][0] = startCellColumn;
        stack[0][1] = startCellRow;

        while (stack.length > 0) {
            int[] currentExploreCell = stack[stack.length - 1];
            stack = pop(stack);

            if (currentExploreCell[0] == goalCellColumn && currentExploreCell[1] == goalCellRow) {
                System.out.println("Goal found");
                System.out.println("This is the Final path: " + visitedCells);
                int totalNode = visitedCells.size();
                System.out.println("Time taken to find the goal: " + totalNode + " minutes");
                return;
            }

            int a = currentExploreCell[0];
            int b = currentExploreCell[1];
            List<int[]> nextSteps = validMoves(a, b, maze);

            for (int[] nextCell : nextSteps) {
                if (visitedCells.contains(nextCell)) {
                    continue;
                }
                visitedCells.add(nextCell);
                stack = push(stack, nextCell);
            }
        }
    }

    public static int[][] push(int[][] stack, int[] value) {
        int[][] newStack = new int[stack.length + 1][2];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        newStack[stack.length] = value;
        return newStack;
    }

    public static int[][] pop(int[][] stack) {
        int[][] newStack = new int[stack.length - 1][2];
        System.arraycopy(stack, 0, newStack, 0, stack.length - 1);
        return newStack;
    }

    public static int[][] chebyshevDistanceCalculation(int goalRow, int goalCol) {
        int[][] chebyshevValueList = new int[6][6];

        for (int rowNode = 0; rowNode < 6; rowNode++) {
            for (int columnNode = 0; columnNode < 6; columnNode++) {
                int value = Math.max(Math.abs(rowNode - goalRow), Math.abs(columnNode - goalCol));
                chebyshevValueList[rowNode][columnNode] = value;
            }
        }
        return chebyshevValueList;
    }

    public static void aStarSearch(int[][] maze, int startRow, int startColumn, int goalRow, int goalColumn, int[][] heuristicValues) {
        int[][] cellValueList = new int[6][6];
        int[][] pQueue = new int[6][6];
        Set<Integer> visitedNodesList = new HashSet<>();
        int[][] pathReverseDictionary = new int[6][6];

        int startNodeColumn = startColumn;
        int startNodeRow = startRow;
        int goalNodeColumn = goalColumn;
        int goalNodeRow = goalRow;
        int[] childNode = new int[]{startNodeColumn, startNodeRow};
        int[][] pathForward = new int[6][6];

        int[][] gScoreDict = new int[6][6];
        int[][] fScoreDict = new int[6][6];
        int[] startNode = new int[]{startNodeColumn, startNodeRow};

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int[] tempCell = new int[]{j, i};
                cellValueList[i][j] = tempCell;
            }
        }

        int[][] heuristicValueDictionary = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                heuristicValueDictionary[i][j] = heuristicValues[i][j];
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                gScoreDict[i][j] = Integer.MAX_VALUE;
                fScoreDict[i][j] = Integer.MAX_VALUE;
            }
        }

        gScoreDict[startNodeRow][startNodeColumn] = 0;
        fScoreDict[startNodeRow][startNodeColumn] = heuristicValueDictionary[startNodeRow][startNodeColumn];

        pQueue[0] = startNode;
        int currentIndex = 0;

        while (currentIndex < pQueue.length) {
            int currCellNode = pQueue[currentIndex];
            int startColumn = currCellNode[0];
            int startRow = currCellNode[1];

            visitedNodesList.add(currentIndex);

            int westSearch = maze[startColumn][startRow - 1];
            int northSearch = startColumn < 5 ? maze[startColumn + 1][startRow] : 0;
            int eastSearch = startRow < 5 ? maze[startColumn][startRow + 1] : 0;
            int southSearch = maze[startColumn - 1][startRow];
            int L = (startRow - 1 >= 0 && startColumn + 1 < maze.length) ? maze[startRow - 1][startColumn + 1] : 0;
            int M = (startRow + 1 < maze.length && startColumn + 1 < maze[0].length) ? maze[startRow + 1][startColumn + 1] : 0;
            int P = (startRow + 1 < maze.length && startColumn - 1 >= 0) ? maze[startRow + 1][startColumn - 1] : 0;
            int O = (startRow - 1 >= 0 && startColumn - 1 >= 0) ? maze[startRow - 1][startColumn - 1] : 0;

            if (currCellNode[0] == goalNodeColumn && currCellNode[1] == goalNodeRow) {
                System.out.println("Goal has found");
                System.out.println("Visited nodes");
                System.out.println(visitedNodesList);
                int lengthNodeList = visitedNodesList.size();
                System.out.println("Time taken to find the goal: " + lengthNodeList + " minutes");
                break;
            } else {
                for (String i : new String[]{"E", "S", "N", "W", "L", "M", "P", "O"}) {
                    if (i.equals("W") && startRow - 1 >= 0 && westSearch != 1) {
                        childNode = new int[]{startColumn, startRow - 1};
                    } else if (i.equals("N") && startColumn + 1 < maze.length && northSearch != 1) {
                        childNode = new int[]{startColumn + 1, startRow};
                    } else if (i.equals("S") && startColumn - 1 > 0 && southSearch != 1) {
                        childNode = new int[]{startColumn - 1, startRow};
                    } else if (i.equals("E") && startRow + 1 < maze[0].length && eastSearch != 1) {
                        childNode = new int[]{startColumn, startRow + 1};
                    } else if (i.equals("L") && startRow - 1 >= 0 && startColumn + 1 < maze.length && L != 1) {
                        childNode = new int[]{startColumn + 1, startRow - 1};
                    } else if (i.equals("M") && startRow + 1 < maze.length && startColumn + 1 < maze[0].length && M != 1) {
                        childNode = new int[]{startColumn + 1, startRow + 1};
                    } else if (i.equals("P") && startRow + 1 < maze.length && startColumn - 1 >= 0 && P != 1) {
                        childNode = new int[]{startColumn - 1, startRow + 1};
                    } else if (i.equals("O") && startRow - 1 >= 0 && startColumn - 1 >= 0 && O != 1) {
                        childNode = new int[]{startColumn - 1, startRow - 1};
                    }

                    int tempGValue = gScoreDict[currCellNode[1]][currCellNode[0]] + 1;
                    int tempFinalValue = tempGValue + heuristicValueDictionary[childNode[1]][childNode[0]];

                    if (tempFinalValue < fScoreDict[childNode[1]][childNode[0]]) {
                        gScoreDict[childNode[1]][childNode[0]] = tempGValue;
                        fScoreDict[childNode[1]][childNode[0]] = tempFinalValue;
                        currentIndex++;
                        pQueue[currentIndex] = childNode;
                        pathReverseDictionary[childNode[1]][childNode[0]] = currCellNode;
                    }
                }
            }
        }

        int[] cellTemp = new int[]{goalColumn, goalRow};
        while (cellTemp[0] != startNodeColumn || cellTemp[1] != startNodeRow) {
            pathForward[pathReverseDictionary[cellTemp[1]][cellTemp[0]][1]][pathReverseDictionary[cellTemp[1]][cellTemp[0]][0]] = cellTemp;
            cellTemp = new int[]{pathReverseDictionary[cellTemp[1]][cellTemp[0]]};
        }

        System.out.println("\nThe final path:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (null != pathForward[i][j]) {
                    System.out.print(Arrays.toString(pathForward[i][j]) + " ");
                }
            }
        }
    }
}
