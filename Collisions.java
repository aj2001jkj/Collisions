package yourpackage;

public class Collision {

  public Collision(float startingX, float startingY, float startingZ, float endingX, float endingY, float endingZ) {
		for (float x = startingX; x < endingX; x++) {
			for (float y = startingY; y < endingY; y++) {
				for (float z = startingZ; z < endingZ; z++) {
					detectHit(x, y, z);
				}
			}
		}
	}
	
	public void detectHit(float x, float y, float z) {
		Camera.vector.x = Camera.previous.x;
		Camera.vector.y = Camera.previous.y;
		Camera.vector.z = Camera.previous.z;
	}
	
}
