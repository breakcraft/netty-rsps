package com.runescape.revised.logic.cycle;

import java.util.LinkedList;
import java.util.Queue;

import com.runescape.revised.annotation.AnnotationDesignType;
import com.runescape.revised.annotation.impl.DesignPattern;
import com.runescape.revised.system.System;

@DesignPattern(getAnnotationDesignType = AnnotationDesignType.CREATIONAL)
public class CycleSystem extends System {

	private static CycleSystem cycleSystem;
	private Queue<Cycle> currentCycleList;
	private Queue<Cycle> newCycleList;

	public CycleSystem() {
		this.setCurrentCycleList(new LinkedList<Cycle>());
		this.setNewCycleList(new LinkedList<Cycle>());
	}

	public void addCycle(final Cycle cycle, final int delay) {
		// TODO add in delay
		this.getCurrentCycleList().add(cycle);
		// this.getNewCycleList().
	}

	@Override
	public void executeSystem() {

	}

	public static void setCycleSystem(final CycleSystem cycleSystem) {
		CycleSystem.cycleSystem = cycleSystem;
	}

	public static CycleSystem getCycleSystem() {
		if (CycleSystem.cycleSystem == null) {
			CycleSystem.setCycleSystem(new CycleSystem());
		}
		return CycleSystem.cycleSystem;
	}

	public void setCurrentCycleList(final Queue<Cycle> currentCycleList) {
		this.currentCycleList = currentCycleList;
	}

	public Queue<Cycle> getCurrentCycleList() {
		return this.currentCycleList;
	}

	public void setNewCycleList(final Queue<Cycle> newCycleList) {
		this.newCycleList = newCycleList;
	}

	public Queue<Cycle> getNewCycleList() {
		return this.newCycleList;
	}
}