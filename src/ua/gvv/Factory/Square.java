package ua.gvv.Factory;
/*

 0 0 0
 1 1 0
 1 1 0


This figure has only one posture.
 */
public class Square implements Figure {

	private int[][] posture = {{0,0,0},
							   {1,1,0},
							   {1,1,0}};
	public int[][] create() {
		return posture;
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub

	}

	

}
