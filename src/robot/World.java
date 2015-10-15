package robot;

public class World {
	private Robot robot;
	final Vector target;
	final RobotAI ai;
	public double time;
	
	public World (Robot robot, Vector target) {		
		this.target = target;
		this.ai = new RobotAI();
		this.robot = robot;
		this.time = 0;
		moveToTarget();
	}
	
	private void moveToTarget() {
		while (!isTarget()) {
			robot = robot.move(ai.nextMove(robot, this));
		}
		System.out.println(this.time);
	}
	
	private boolean isTarget() {
		double deltaX = robot.position.x - target.x;
		double deltaY = robot.position.y - target.y;
		double dist = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		return dist <= robot.configuration.radius;
	}
}
