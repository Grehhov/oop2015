package robot;

public class RobotAI {
	public RobotCommand nextMove(Robot robot, World world) {
		double deltaX = - robot.position.x + world.target.x;
		double deltaY = - robot.position.y + world.target.y;
		double ang = Math.atan2(deltaY, deltaX);
		double deltaAngle = ang - robot.direction;
		if (Math.abs(deltaAngle) < 0.00000001) {
			double dist = Math.sqrt(deltaX * deltaX + deltaY * deltaY) - robot.configuration.radius;
			double time = dist / robot.configuration.maxLinearSpeed;
			world.time += Math.abs(time);
			return new RobotCommand(0, robot.configuration.maxLinearSpeed, time);
		} else {
			double time = deltaAngle / robot.configuration.maxAngularSpeed;
			world.time += Math.abs(time);
			return new RobotCommand(robot.configuration.maxAngularSpeed, 0, time);
		}
	}

	
}
