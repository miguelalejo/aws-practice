package ec.aws.code.practice;

public class FrogJump {

	public int solution(int X, int Y, int D) {
		if (X >= Y) {
			return 0;
		}
		int firtJump = X + D;
		if (firtJump >= Y) {
			return 1;
		}
		int numberJumps = (Y - firtJump) / D;
		int modJump = (Y - firtJump) % D;
		if (modJump != 0) {
			numberJumps++;
		}
		return numberJumps + 1;
	}

}
