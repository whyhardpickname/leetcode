class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] rowCount = new int[board.length][board.length];
        int[][] columnCount = new int[board.length][board.length];
        int[][]  boxCount = new int[board.length][board.length];
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board.length; j++)
            {
                if (Character.compare(board[i][j], '.') != 0)
                {
                    int number = (int) (board[i][j] - '1');
                    if (rowCount[i][number] > 0)
                    {
                        return false;
                    }
                    else
                    {
                        rowCount[i][number]++;
                    }

                    if (columnCount[j][number] > 0)
                    {
                        return false;
                    }
                    else
                    {
                        columnCount[j][number]++;
                    }
                    
                    if (boxCount[3 * (i / 3) + j / 3][number] > 0)
                    {
                        return false;
                    }
                    else
                    {
                        boxCount[3 * (i / 3) + j / 3][number]++;
                    }
                }
            }
        }
        return true;
    }
}
