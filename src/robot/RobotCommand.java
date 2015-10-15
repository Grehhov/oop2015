package robot;

public class RobotCommand {
	double angularSpeed;
	double linearSpeed;
	double dt;
	
	public RobotCommand (double angularSpeed, double linearSpeed, double dt) {
		this.angularSpeed = angularSpeed;
		this.linearSpeed = linearSpeed;
		this.dt = dt;
	}
}
