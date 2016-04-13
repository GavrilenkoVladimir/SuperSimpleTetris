package ua.gvv.Factory;
/*

0 1 0       1 0 0		0 1 1		0 0 0
0 1 0 		1 1 1		0 1 0		1 1 1
1 1 0 		0 0 0 		0 1 0		0 0 1

This figure has four postures.
 */
public class JFigure implements Figure {
	
	private boolean[] posture = {false,false,false,false};	
	private int[][] workPosture;
	private String postureDraw;
	private int[][] postureOne = {{0,1,0},
								  {0,1,0},
								  {1,1,0}};
								 
	private int[][] postureTwo = {{1,0,0},
								  {1,1,1},
								  {0,0,0}};
								 
	private int[][] postureThree ={{0,1,1},
								   {0,1,0},
								   {0,1,0}};
								  
	private int[][] postureFour = {{0,0,0},
								   {1,1,1},
								   {0,0,1}};
	
	JFigure(){
		workPosture = create();
		posture [0] = true;
	}
	public int[][] create() {
		
	return postureOne;

	}

	@Override
	public void rotate() {

		if(posture[0]){ workPosture = postureTwo; posture[0] = false; posture[1] = true; postureDraw = "TWO";}
		else	
	if(posture[1]){ workPosture = postureThree; posture[1] = false; posture[2] = true; postureDraw = "THREE";}
		else
	if(posture[2]){ workPosture = postureFour; posture[2] = false; posture[3] = true; postureDraw = "FOUR";}
		else
	if(posture[3]){ workPosture = postureOne; posture[3] = false; posture[0] = true; postureDraw = "ONE";}

		

	}



}
