package robot;

public class Robot {
	RobotConfiguration configuration;
	Vector position;
	double direction;
	
	
	public Robot (Vector position, double direction, RobotConfiguration configuration) {
		this.position = position;
		this.configuration = configuration;
		this.direction = direction;
	}
	
	public Robot move (RobotCommand command){
		if (command.angularSpeed != 0) {
			return new Robot(position, direction += command.angularSpeed * command.dt, configuration);
		}
		double way = command.linearSpeed * command.dt;		
		double x = Math.cos(direction) * way;
		double y = Math.sin(direction) * way;
		return new Robot(new Vector(position.x + x, position.y + y), direction, configuration);
	}
}
