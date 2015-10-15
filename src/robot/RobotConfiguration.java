package robot;

public class RobotConfiguration {
	double radius;
	double maxLinearSpeed;
	double maxAngularSpeed;
	
	public RobotConfiguration (double radius, double maxLinearSpeed, double maxAngularSpeed) {
		this.radius = radius;
		this.maxLinearSpeed = maxLinearSpeed;
		this.maxAngularSpeed = maxAngularSpeed;
	}
}
