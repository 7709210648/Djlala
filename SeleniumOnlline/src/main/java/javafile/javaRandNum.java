package javafile;

import java.util.Random;

public class javaRandNum {

	public int getRandnum() {

		Random r1 = new Random();

		int data = r1.nextInt(1000);
		return data;

	}
}
