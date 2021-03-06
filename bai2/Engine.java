/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuce.cntt.oop.th1.bai2;

/**
 *
 * @author Admin
 */
public class Engine {

    String brand;
    int wattage;
    boolean statusEngine;

    public Engine() {
    }

    public Engine(String brand, int wattage, boolean statusEngine) {
        this.brand = brand;
        this.wattage = wattage;
        this.statusEngine = statusEngine;
    }

    public boolean isStatusEngine() {
        return statusEngine;
    }

    public String getBrand() {
        return brand;
    }

    public int getWattage() {
        return wattage;
    }

    public boolean isStatus() {
        return statusEngine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public void setStatus(boolean statusEngine) {
        this.statusEngine = statusEngine;
//        System.out.println("status engine la :"+statusEngine);
    }

    /*
    *ham khoi dong dong co, neu dong co tat thi set thanh bat
     */
    public void start() {
        this.statusEngine = true;
        System.out.println("engine da khoi dong");
    }

    /*
    *ham tat may
     */
    public void turnOff() {
        this.statusEngine = false;
        System.out.println("engine da tat");
    }

}
