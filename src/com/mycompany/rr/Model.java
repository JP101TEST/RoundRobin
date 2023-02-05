package com.mycompany.rr;

/**
 *
 * @author JP
 */
public class Model {

    private int processName;
    private int arrivalTime;
    private int burstTime;
    private int waittingTime;
    private String statusProcess;

    // Constructor
    public Model() {

    }

    public Model(int processName, int arrivalTime, int burstTime, int waittingTime, String statusProcess) {
        this.processName = processName;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.waittingTime = waittingTime;
        this.statusProcess = statusProcess;
    }

    // method
    public int getProcessName() {
        return this.processName;
    }

    public void setProcessName(int processName) {
        this.processName = processName;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getWaittingTime() {
        return waittingTime;
    }

    public void setWaittingTime(int waittingTime) {
        this.waittingTime = waittingTime;
    }

    public String getStatusProcess() {
        return statusProcess;
    }

    public void setStatusProcess(String statusProcess) {
        this.statusProcess = statusProcess;
    }
}
