package com.nosetr.basic.model;

/**
 *
 * @author nosetr
 */
public class Car {
    private String mark;
    private String model;
    private Worker driver;
    private String vin;
    private double vEngine;

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the driver
     */
    public Worker getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Worker driver) {
        this.driver = driver;
    }

    /**
     * @return the vin
     */
    public String getVin() {
        return vin;
    }

    /**
     * @param vin the vin to set
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * @return the vEngine
     */
    public double getvEngine() {
        return vEngine;
    }

    /**
     * @param vEngine the vEngine to set
     */
    public void setvEngine(double vEngine) {
        this.vEngine = vEngine;
    }
}
