
public class ContestOrganizer {
	/** the number of rows of contestant */
	public static final int NUM_ROWS = 10;

	/** the number of columns of contestant */
	public static final int CONTESTANTS_PER_ROW = 10;

	/** the two-dimensional array of contestant */
	private Contestant[][] contestants;

	/**
	 * Sorts arr in increasing order by score Postcondition: - arr sorted in
	 * increasing order by score. - Location of each contestant correctly updated
	 * such that column number matches contestant's position in arr.
	 * 
	 * @param arr
	 *            the array to be sorted.
	 */
	public void sort(Contestant[] arr) {

	}

	/**
	 * Sorts each row of contestants into increasing order by score. Postcondition:
	 * Contestant with highest score in row[k] is in the rightmost column of row[k],
	 * 0 <= k < NUM_ROWS
	 */
	public void sortAllRows() {
		for (Contestant[] r : contestants) {
			sort(r);
		}
		/*
		 * int currentLowest = 999999999; Location currentLowestLoc = null; for (int i =
		 * 0; i < contestants.length; i++) { for (int iterate = 0; iterate <
		 * contestants[i].length; iterate++) { for (int search = 0; search <
		 * contestants[iterate].length; search++) { if
		 * (contestants[i][search].getScore() < currentLowest) { currentLowest =
		 * contestants[i][search].getScore(); currentLowestLoc =
		 * contestants[i][search].getLoc(); } int tempVal =
		 * contestants[i][iterate].getScore();
		 * contestants[i][iterate].setScore(contestants[currentLowestLoc.getRowNumber()]
		 * [currentLowestLoc.getColNumber()].getScore());
		 * contestants[currentLowestLoc.getRowNumber()][currentLowestLoc.getColNumber()]
		 * .setScore(tempVal); }
		 * 
		 * } } I messed up and wrote the code from scratch
		 */

	}

	/**
	 * Returns name of contestant with highest score Precondition: - Contestants
	 * have not been sorted by score. - Top score is unique - Only one contestant
	 * has the highest score.
	 * 
	 * @return name of contestant with highest score.
	 */
	public String findWinnerName() {
		sortAllRows();
		int highScore = 0;
		String highestScorer = " ";
		for (int col = 0; col < contestants[0].length; col++) {
			if (contestants[contestants.length - 1][col].getScore() > highScore) {
				highScore = contestants[contestants.length - 1][col].getScore();
				highestScorer = contestants[contestants.length - 1][col].getName();
			}	
		}
		return highestScorer;
		
		/*
		 * int highScore = 0; String highestScorer= ""; for (int row = 0; row <
		 * contestants.length; row++) { for (int col = 0; col < contestants[row].length;
		 * col++) { if(contestants[row][col].getScore() > highScore); highScore =
		 * contestants[row][col].getScore(); highestScorer =
		 * contestants[row][col].getName(); } } return highestScorer; I messed up and
		 * wrote the code from scratch
		 */
	}
}
