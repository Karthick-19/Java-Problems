package Java;
// Given an m x n grid of characters board and a string word, return true if word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
// Output: true
public class WordSearch_DFS {
    public static void main(String[] args) {
        WordSearch_DFS wsdfs = new WordSearch_DFS();
        System.out.println(wsdfs.wordSearch());
    }
    public boolean wordSearch(){
        
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";

        //Creating size of rows and columns
        int rows = board.length;
        int cols = board[0].length;

        //Iteratig the board 
        for(int row = 0;row < rows;row++){
            for(int col = 0;col < cols;col++){
                //If the first character found and dfs follows all return true meaning adjacent elements match elements of word.//Then the word is present at the board
                if(board[row][col] == word.charAt(0) && dfs(board, word, row, col, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    //dfs to check the adjacent elements are matching up,down,left and right
    private static  boolean dfs(char[][] board,String word,int row,int col,int index){
        //if index equals length of word meaning index indicates the current position element in word,if it matches lenght then all elements present in board.
        if(index == word.length()){
            return true;
        }

        //Checking condition whether character matches
        if(row < 0||row >= board.length||col < 0||col >= board[0].length||board[row][col] != word.charAt(index)){
            return false;
        }
        //If true
        //marking the character as visited
        char temp = board[row][col];
        board[row][col] = '#';
        //Checking the next possible directions adjacency match
        //incerasing index as it cheks for next element
        boolean found = dfs(board, word, row-1, col, index+1)||//up
        dfs(board, word, row+1, col, index+1)||//down
        dfs(board, word, row, col-1, index+1)||//left
        dfs(board, word, row, col+1, index+1);//right
        //Unmarking for checking the element in different possible combination
        board[row][col] = temp;

        return found;
    }
}
