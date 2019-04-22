import java.util.Random;

public class Main{
	
	public static void main(String[] args) {
		Random random = new Random();
		double numNodes = 6;
		double probability = 0.3;
		
		int successfulFrames = 0;
		int emptyFrames = 0;
		int collisionFrames = 0;
		
		int currentFrame = 0;
		int numFrames = 5000000;	//amount of frames that we want to run ALOHA
		while (currentFrame < numFrames) {
			int numNodesTransmitting = 0;
			for (int i = 0; i < numNodes; i++) {
				double randomDouble = random.nextDouble();
				if (randomDouble <= probability) {
					numNodesTransmitting++;
				}
			}
			
			if (numNodesTransmitting == 0) {
				emptyFrames++;
			}
			else if (numNodesTransmitting == 1) {
				successfulFrames++;
			}
			else {
				collisionFrames++;
			}
			currentFrame++;
		}
		
		double base = 1 - probability;
		double exponent = numNodes - 1;
		double estimatedSuccessRate = numNodes * probability * Math.pow(base, exponent);
		System.out.println("Estimated Success Rate: " + estimatedSuccessRate);
		
		double successRate = (double) successfulFrames / (double) (emptyFrames + collisionFrames);
		System.out.println("Actual Success Rate: " + successRate);
		
		System.out.println("");
		System.out.println("Number of Successful Frames: " + successfulFrames);
		System.out.println("Number of Empty Frames: " + emptyFrames);
		System.out.println("Number of Collision Frames: " + collisionFrames);
	}
}