package robot;

import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double xRobot = sc.nextDouble();
		double yRobot = sc.nextDouble();
		double xTarget = sc.nextDouble();
		double yTarget = sc.nextDouble();
		double rotationAngle = sc.nextDouble();
		double radius = sc.nextDouble();
		double maxLinearSpeed = sc.nextDouble();
		double maxAngularSpeed = sc.nextDouble();
		Robot robot = new Robot(new Vector(xRobot, yRobot), rotationAngle, new RobotConfiguration(radius, maxLinearSpeed, maxAngularSpeed));
		World world = new World(robot, new Vector(xTarget, yTarget));
	}
}
