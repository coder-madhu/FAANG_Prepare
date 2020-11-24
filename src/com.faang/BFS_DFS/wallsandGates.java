package com.faang.BFS_DFS;

public class wallsandGates {
    public int numIslands(int[][] grid) {

        if( grid == null || grid.length == 0)
        {
            return 0;
        }

        int numIslands =0;
        for (int i = 0; i < grid.length; i++)
        {
            for( int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j] == 0)
                {
                    dfs(grid,i,j, 0);
                }
            }
        }
        return numIslands;
    }

    public void dfs( int[][] grid, int i, int j, int count)
    {

        if( i < 0 || i >= grid.length ||j<0 || j >= grid[i].length || grid[i][j] < count)
        {
            return ;
        }

        grid[i][j] = count;

        dfs(grid,i+1,j, count+1);
        dfs(grid,i-1,j, count+1);
        dfs(grid,i,j-1, count+1);
        dfs(grid,i,j+1, count+1);
        //return 1;
    }


}