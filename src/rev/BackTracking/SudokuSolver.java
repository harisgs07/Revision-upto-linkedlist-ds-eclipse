package rev.BackTracking;

public class SudokuSolver {
	
	int row,col;
	int[][] sudoku = {{0,0,0,2,6,0,7,0,1},{6,8,0,0,7,0,0,9,3},{1,9,0,0,0,4,5,0,0},
					  {8,2,0,1,0,0,0,4,0},{0,0,4,6,0,2,9,0,0},{0,5,0,0,0,3,0,2,8},
					  {0,0,9,3,0,0,0,7,4},{0,4,0,0,5,0,0,3,6},{7,0,3,0,1,8,0,0,0}};
	
	boolean isFeasible(int row,int col, int num) {
		
		//look number already in the row or not!!
		for(int i = 0;i<sudoku.length;i++){
			if(sudoku[row][i]==num)
				return false;
		}
		
		//look number already in the column or not!!
		for(int i = 0;i<sudoku.length;i++){
			if(sudoku[i][col]==num)
				return false;
		}
		
		//look number already in the box or not!!
		int root = 3;
		int startRow = row - row % root;
		int startCol = col - col % root;
		for(int i = startRow; i<(startRow+3);i++) {
			for(int j = startCol;j <(startCol+3);j++) {
				if(sudoku[i][j]==num)
					return false;
			}
		}
		
		return true;
	}
	
	void printSudoku() {
		for (int[] is : sudoku) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	boolean solveSudoku(int row,int col) {
		int count = 0;
		for(int i = row; i< sudoku.length; i++) {
			for(int j = 0; j<sudoku.length;j++) {
				if(sudoku[i][j]==0) {
					row = i;
					col = j;
					count+=1;
					break;
				}
			}
			if(count!=0)
				break;
		}
		if(count == 0)
			return true;
		
		for(int num=1;num<=sudoku.length;num++) {
			if(isFeasible(row, col, num)) {
				sudoku[row][col] = num;
				if(solveSudoku(row,col))
					return true;
			}
			sudoku[row][col] = 0;
		}
		return false;
	}
	
	public static void main(String[] args) {
		SudokuSolver obj = new SudokuSolver();
		obj.solveSudoku(0,0);
		obj.printSudoku();
	}
}
