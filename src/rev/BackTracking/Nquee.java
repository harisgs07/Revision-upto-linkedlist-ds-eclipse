package rev.BackTracking;

import java.util.Arrays;

public class Nquee {
	boolean [][] chessboard= new boolean[4][4];
	boolean[][] generateMatrix() {
		for (boolean[] i : chessboard) {
			Arrays.fill(i, false);
		}
		return chessboard;
	}
	
	boolean isFeasible(int row, int col) {
		
		//row check
		for(int i = 0; i< chessboard.length;i++) {
			if(chessboard[row][i])
				return false;
		}
		
		//column check
		for(int i=row;i>=0;i--) {
			if(chessboard[i][col])
				return false;
		}
		
		//left upper check
		for(int i = row, j= col; i>=0 && j>=0;i--,j--) {
			if(chessboard[i][j])
				return false;
		}
		
		//right upper check
		for(int i = row, j= col; i>=0 && j<chessboard.length;i--,j++) {
			if(chessboard[i][j])
				return false;
		}
		
		return true;
	}
	
	void printChess() {
		for (boolean[] bs : chessboard) {
			for (boolean b : bs) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
	
	boolean arrangeQueen(boolean [][] chessboard,int row) {
		if(row>chessboard.length-1)
			return true;
		for(int i = 0; i< chessboard.length;i++) {
			if(isFeasible(row,i)) {
				chessboard[row][i]=true;
				if(arrangeQueen(chessboard,row + 1))
					return true;
			}
			chessboard[row][i]=false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Nquee obj = new Nquee();
		boolean [][] arr = obj.generateMatrix();
		obj.arrangeQueen(arr,0);
		obj.printChess();
	}
}
