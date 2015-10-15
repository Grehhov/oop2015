package robot;

import static org.junit.Assert.*;

import java.util.Hashtable;

import org.junit.Test;

public class Tests {

	@Test
	public void test() {
		double[][] f = {{100.0, 100.0, 200.0, 200.0, 0.0, 50.0, 10.0, 1.0},
				{500.0, 100.0, 600.0, 200.0, Math.PI, 5.0, 1.0, 0.05},
				{0.0, 1.0, 20.0, 1.0, 2.0, 7.0, 10.0, 1.0},
				{200.0, 700.0, 600.0, 700.0, Math.PI, 50.0, 50.0, 0.01},
				{0.0, 0.0, 0.0, 1000.0, 0.0, 1.0, 1.0, 1.0},
				{0.0, 0.0, -100.0, -200.0, 0.0, 30.0, 10.0, 0.1},
				{123.0, 321.0, 120.0, 321.0, Math.PI * 3/4, 100.0, 1.0, 0.01},
				{100.0, 200.0, 100.0, 100.0, Math.PI, 90.0, 10.0, 0.01}
				};
		
		for(int i = 0; i < f.length; i++) {
			Robot robot = new Robot(new Vector(f[i][0], f[i][1]), f[i][4], new RobotConfiguration(f[i][5], f[i][6], f[i][7]));
			World world = new World(robot, new Vector(f[i][2], f[i][3]));
		}
	}

}
