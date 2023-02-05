package com.mycompany.rr;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author JP
 */
public class Controller {

	private int counList = 0;// ชื่อ Process
	private int countClock = 0;// เวลา
	private int runJob = 0;// ตำแหน่งที่ใช้อ้างอิงตำแหน่ง Process ที่กำลังทำงานอยู่
	private int runTimeJob = 0;// run time Job 0 - 5
	private int runTimeJobMax = 10; // max run time Job
	private int rJTMax = 0;// ใช้ อ้างอิง run time Job เริ่มต้น ซึ่ง = 0
	private String[] statusProcess = { "New", "Ready", "Running", "Waiting", "Terminate" };// 0-4

	private LinkedList<Model> joblist = new LinkedList<Model>();
	private LinkedList<Model> terminatelist = new LinkedList<Model>();
	private LinkedList<Model> ioUsblist = new LinkedList<Model>();
	private LinkedList<Model> ioCdlist = new LinkedList<Model>();

	public int joblistSize() {
		return this.joblist.size();
	}

	public int terminatelistSize() {
		return this.terminatelist.size();
	}

	public int ioUsblistSize() {
		return this.ioUsblist.size();
	}

	public int ioCdlistSize() {
		return this.ioCdlist.size();
	}

	public Model joblistRow(int index) {
		return this.joblist.get(index);
	}

	public Model terminatelistRow(int index) {
		return this.terminatelist.get(index);
	}

	public Model ioUsblistRow(int index) {
		return this.ioUsblist.get(index);
	}

	public Model ioCdlistRow(int index) {
		return this.ioCdlist.get(index);
	}

	public String getStatusProcess(int statusProcess) {
		return this.statusProcess[statusProcess];
	}

	public int getCountClock() {
		return this.countClock;
	}

	public Model getJoblistLast() {
		return this.joblist.getLast();
	}

	public Model getIoUsbLast() {
		return this.ioUsblist.getLast();
	}

	public int getRunJob() {
		return this.runJob;
	}

	public String getRunTimeJobMax() {
		return Integer.toString(runTimeJobMax);
	}

	public void CountClock() {
		this.countClock++;
	}

	public void reduceBurstTime(int index) {
		if (this.joblist.get(index).getBurstTime() > 0
				&& this.joblist.get(index).getStatusProcess() == statusProcess[2]) {
			this.joblist.get(index).setBurstTime(this.joblist.get(index).getBurstTime() - 1);
		}
	}

	public void creatProcess() {
		// สร้างProcess
		this.counList++;// ชื่อ Process ใช้ counList + 1 : ซึ่ง counList เป็น int
		int ranB = 0;// คือค่า burstTime ที่ต้องใส่เข้าไป
		// Model(int processName, int arrivalTime, int burstTime, int waittingTime,
		// String statusProcess)
		// getStatusProcess(0) ให้สถานะ Process เริ่มต้นเป็น new
		Model process = new Model(this.counList, countClock, ranB, 0, getStatusProcess(0));
		// เอา Process ที่สร้างใหม่ใส่เข้าไปใน joblist
		this.joblist.add(process);
	}

	public void joblistSNewToSReady() {
		// Process จาก new เป็น ready
		// loop เพื่อตรวจหาว่า Process ใน joblist ใดเป็น new ให้เปลี่ยนเป็น ready
		for (int i = 0; i < this.joblist.size(); i++) {
			// เพื่อตรวจหาว่า Process ใน joblist ใดเป็น new
			if (this.joblist.get(i).getStatusProcess() == this.statusProcess[0]) { // statusProcess[0] = "new"
				// เปลี่ยน Process เป็น ready
				this.joblist.get(i).setStatusProcess(this.statusProcess[1]);// statusProcess[1] = "ready"
			}
		}
	}

	public void waitingCount() {
		// เพิ่ม waitingTime ของ Process
		// loop เพื่อตรวจหาว่า Process ใน joblist ใดเป็น ready หรือ Waiting ให้เพิ่ม
		// WaittingTime ของ Process นั้นๆ
		for (int i = 0; i < this.joblist.size(); i++) {
			// เพื่อตรวจหาว่า Process ใน joblist ใดเป็น ready หรือ Waiting ให้เพิ่ม
			// WaittingTime ของ Process นั้นๆ
			if (this.joblist.get(i).getStatusProcess() == this.statusProcess[1]
					|| this.joblist.get(i).getStatusProcess() == this.statusProcess[3]) {// statusProcess[3] = "Waiting"
				// เพิ่ม WaittingTime ของ Process นั้นๆ
				this.joblist.get(i).setWaittingTime(this.joblist.get(i).getWaittingTime() + 1);
			}
		}

	}

	public void waitingCountUsb() {
		for (int i = 0; i < this.ioUsblist.size(); i++) {
			this.ioUsblist.get(i).setWaittingTime(this.ioUsblist.get(i).getWaittingTime() + 1);
		}
	}

	public void waitingCountCd() {
		for (int i = 0; i < this.ioCdlist.size(); i++) {
			this.ioCdlist.get(i).setWaittingTime(this.ioCdlist.get(i).getWaittingTime() + 1);
		}
	}

	public void addIoUsbProcess() {
		if (this.joblist.size() > 0) {// T0-01 เช็คว่า joblist มีมากกว่า 0
			if (this.joblist.get(runJob).getStatusProcess() == this.statusProcess[2]) {// T0-01-01 เช็คว่าสถานะ joblist
																						// ตำแหน่งมีสถานะ Running
				this.joblist.get(runJob).setStatusProcess(statusProcess[3]);// เปลี่ยน joblist ตำแหน่งนั้นให้มีสถานะ
																			// Waiting
				Model ioUsbItem = new Model(this.joblist.get(runJob).getProcessName(),
						this.joblist.get(runJob).getBurstTime(), this.joblist.get(runJob).getBurstTime(),
						this.joblist.get(runJob).getWaittingTime(), this.joblist.get(runJob).getStatusProcess());// สร้าง
																													// Process
																													// ioUsbItem
				this.ioUsblist.add(ioUsbItem);// เอา Process ioUsbItem ไปเก็บใน ioUsblist
				this.ioUsblist.get(ioUsblistSize() - 1).setWaittingTime(0);
				this.runTimeJob = this.rJTMax;// ให้ runTimeJob เท่ากับ runTimeMax
				if (this.joblist.size() > 0) {// T0-01-01-01 เช็คว่า joblist มีมากกว่า 0
					if (this.runJob + 1 != this.joblist.size()) {// T0-01-01-01-01 ถ้า runJob + 1
																	// ยังไม่เป็นตัวสุดท้ายของ joblist ให้ runJob บวก 1
						this.runJob += 1;
					} else {// T0-01-01-01-02 ถ้า runJob + 1 เป็นตัวสุดท้ายของ joblist ให้ runJob เท่ากับ 0
						this.runJob = 0;
					}
				}
			}
		}
		return;
	}

	public void addIoCdProcess() {
		if (this.joblist.size() > 0) {// T0-01 เช็คว่า joblist มีมากกว่า 0
			if (this.joblist.get(runJob).getStatusProcess() == this.statusProcess[2]) {// T0-01-01 เช็คว่าสถานะ joblist
																						// ตำแหน่งมีสถานะ Running
				this.joblist.get(runJob).setStatusProcess(statusProcess[3]);// เปลี่ยน joblist ตำแหน่งนั้นให้มีสถานะ
																			// Waiting
				Model ioCdItem = new Model(this.joblist.get(runJob).getProcessName(),
						this.joblist.get(runJob).getBurstTime(), this.joblist.get(runJob).getBurstTime(),
						this.joblist.get(runJob).getWaittingTime(), this.joblist.get(runJob).getStatusProcess());// สร้าง
																													// Process
																													// ioCdItem
				this.ioCdlist.add(ioCdItem);// เอา Process ioCdItem ไปเก็บใน ioCdlist
				this.ioCdlist.get(ioCdlistSize() - 1).setWaittingTime(0);
				this.runTimeJob = this.rJTMax;// ให้ runTimeJob เท่ากับ runTimeMax
				if (this.joblist.size() > 0) {// T0-01-01-01 เช็คว่า joblist มีมากกว่า 0
					if (this.runJob + 1 != this.joblist.size()) {// T0-01-01-01-01 ถ้า runJob + 1
																	// ยังไม่เป็นตัวสุดท้ายของ joblist ให้ runJob บวก 1
						this.runJob += 1;
					} else {// T0-01-01-01-02 ถ้า runJob + 1 เป็นตัวสุดท้ายของ joblist ให้ runJob เท่ากับ 0
						this.runJob = 0;
					}
				}
			}
		}
		return;
	}

	public void endIoUsbProcess() {
		if (this.ioUsblist.size() > 0) {// T0-01 เช็คว่า ioUsblist มีมากกว่า 0
			for (int i = joblistSize() - 1; i >= 0; i--) {// loop จากค่า index ล่าสุดจาก joblistSize ถึง 0
				if (this.joblist.get(i).getProcessName() == this.ioUsblistRow(this.ioUsblist.size() - 1)
						.getProcessName()) {// ถ้า joblistSize ตำแหน่งนั้นมีชื่อตรงกับ ioUsblist ตำแหน่งล่าสุด
											// ให้เปลี่ยนสถานะจาก Waiting เป็น Rady
					this.joblist.get(i).setStatusProcess(statusProcess[1]);
					break;
				}
			}
			this.ioUsblist.remove(this.ioUsblist.size() - 1);// remove ioUsblist ตำแหน่งล่าสุด
		}
		return;
	}

	public void endIoCdProcess() {
		if (this.ioCdlist.size() > 0) {// T0-01 เช็คว่า ioCdlist มีมากกว่า 0
			for (int i = joblistSize() - 1; i >= 0; i--) {// loop จากค่า index ล่าสุดจาก joblistSize ถึง 0
				if (this.joblist.get(i).getProcessName() == this.ioCdlistRow(this.ioCdlist.size() - 1)
						.getProcessName()) {// ถ้า joblistSize ตำแหน่งนั้นมีชื่อตรงกับ ioCdlist ตำแหน่งล่าสุด
											// ให้เปลี่ยนสถานะจาก Waiting เป็น Ready
					this.joblist.get(i).setStatusProcess(statusProcess[1]);
					break;
				}
			}
			this.ioCdlist.remove(this.ioCdlist.size() - 1);// remove ioCdlist ตำแหน่งล่าสุด
		}
		return;
	}

	public void terminateProcess() {
		if (this.joblist.size() > 0) {// T0-01
			if (this.joblist.get(runJob).getStatusProcess() == this.statusProcess[2]) {// T0-01-01
				this.joblist.get(runJob).setStatusProcess(statusProcess[4]);
				this.terminatelist.add(this.joblist.get(runJob));
				this.joblist.remove(this.joblist.get(runJob));
				this.runTimeJob = this.rJTMax;
				avgWaitingTime();
				if (this.joblist.size() > 0) {// T0-01-01-01
					if (this.runJob == this.joblist.size()) {// T0-01-01-01-01
						this.runJob = 0;
					}
				}
			}
		}
		return;
	}

	public void runProcess() {
		// เพิ่ม BurstTime กับเลือก Process ที่จะเปลี่ยนเป็น run
		if (this.joblist.size() > 0) {// F0-01
			if (this.joblist.get(runJob).getStatusProcess() == statusProcess[1]
					|| this.joblist.get(runJob).getStatusProcess() == statusProcess[2]) {// F1
				subRunProcess();
			} else {// F2
				if (this.joblist.size() != 1) {// F2-01
					int radyListCount = 0;
					for (int i = 0; i < joblistSize(); i++) {
						if (this.joblist.get(i).getStatusProcess() == statusProcess[1]) {
							radyListCount += 1;
						}
					}
					if (radyListCount > 0) {
						do {
							if (this.runJob + 1 != this.joblist.size()) {// F2-01-01
								this.runJob += 1;
							} else {// F2-01-02
								this.runJob = 0;
							}
						} while (this.joblist.get(runJob).getStatusProcess() != statusProcess[1]);
						subRunProcess();
					}

				}
			}

		}
		return;
	}

	public void subRunProcess() {
		// เพิ่ม BurstTime กับเลือก Process ที่จะเปลี่ยนเป็น run
		if (this.joblist.get(runJob).getStatusProcess() == statusProcess[1]) {// F1-01
			this.joblist.get(runJob).setStatusProcess(statusProcess[2]);
		}
		this.runTimeJob += 1;
		this.joblist.get(runJob).setBurstTime(this.joblist.get(runJob).getBurstTime() + 1);
		if (this.runTimeJob == this.runTimeJobMax) {// F3-01
			this.runTimeJob = this.rJTMax;
			this.joblist.get(runJob).setStatusProcess(statusProcess[1]);
			if (this.joblist.size() != 1) {// F3-01-01
				int radyListCount = 0;
				for (int i = 0; i < joblistSize(); i++) {//loop หาค่า Ready
					if (this.joblist.get(i).getStatusProcess() == statusProcess[1]) {
						radyListCount += 1;
					}
				}
				if (radyListCount > 0) {
					int oleRunJob = this.runJob;// เก็บค่าเก่าเพื่อเปรียบเทียบว่าค่าที่ runjob ไม่เท่าเดิม
					do {
						if (this.runJob + 1 != this.joblist.size()) {// F2-01-01
							this.runJob += 1;
						} else {// F2-01-02
							this.runJob = 0;
						}
					} while (this.joblist.get(runJob).getStatusProcess() != statusProcess[1]);
					if (this.runJob == oleRunJob) {// ถ้าเท่าเดิมให้ค่าสถานะยังคงอยู่สถานะ Running
						this.joblist.get(runJob).setStatusProcess(statusProcess[2]);
					}
				}
				/*
				 * if (this.runJob + 1 != this.joblist.size()) {// F3-01-01-01 this.runJob += 1;
				 * } else { this.runJob = 0; }
				 */
			} else {
				this.joblist.get(runJob).setStatusProcess(statusProcess[2]);// ถ้าเหลือ 1 นับต่อไป
			}
		}
	}
 
	private int avgT = 0;

	public String getAvgT() {
		return Integer.toString(avgT);
	}

	public int avgWaitingTime() {
		// เอาค่า WaittingTime ของ Process ใน joblist ทั้งหมด มาบวกกันแล้วหารจำนวนของ
		// Process ที่อยู่ใน joblist

		// ตรวจสอบว่า joblist ไม่ว่างไหม
		if (!this.joblist.isEmpty()) {
			// loop เอาค่า WaittingTime ของ Process ใน joblist ทั้งหมด
			for (int i = 0; i < this.joblistSize(); i++) {
				avgT += this.joblistRow(i).getWaittingTime();
			}
			// เอาค่า WaittingTime ทั้งหมด หารจำนวนของ Process ที่อยู่ใน joblist
			avgT = (avgT / this.joblist.size());
			return avgT;
		} else {
			return avgT;
		}
	}
}
