package com.uca.capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	
	@AssertTrue(message="Ups no puedes agregar tu producto porque eres un robot, por favoe hacer clic en regresar<")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	

}
