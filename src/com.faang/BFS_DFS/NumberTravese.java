package com.faang.BFS_DFS;

public class NumberTravese {
    public void  numIslands(int [][] grid) {

        boolean checkFlag = false;
        if( grid == null || grid.length == 0)
        {
            System.out.println("Matrix should not be empty");
        }

       // int numIslands =0;
        for (int i = 0; i < grid.length; i++)
        {
            for( int j = 0; j < grid[i].length; j++) {

             checkFlag =  dfs(grid, i, j, grid[i][j]);
            }
        }
        //return numIslands;
        System.out.println(checkFlag);
    }

    public boolean dfs(int[][] grid, int i, int j, int val)
    {

        //if( i < 0 || i >= grid.length ||j<0 || j >= grid[i].length ) //

        if( i >= 0 || i < grid.length ||j >=0 || j < grid[i].length )
        {
           if ( grid[i][j] <= val)
           {
               return true;
           }
            else
                return false;
        }

        dfs(grid,i+1,j,grid[i][j]);
        dfs(grid,i-1,j,val);
        dfs(grid,i,j-1,val);
        dfs(grid,i,j+1,val);
        return true;
    }


}