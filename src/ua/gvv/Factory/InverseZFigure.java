package ua.gvv.Factory;
/*
 
0 0 0        1 0 0 
0 1 1        1 1 0     
1 1 0        0 1 0  
 
 This figure has two postures.
  */
public class InverseZFigure implements Figure {

	private boolean[] posture = {false,false,false,false};	
	private int[][] workPosture;	
	private String postureDraw;

	private int[][] postureOne = {{0,1,0},
								  {0,1,0},
								  {0,1,1}};
								 
	private int[][] postureTwo = {{0,0,0},
								  {1,1,1},
								  {1,0,0}};
								 
	
	InverseZFigure(){
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
		if(posture[1]){ workPosture = postureTwo; posture[1] = false; posture[0] = true; postureDraw = "ONE";}

	}

}


