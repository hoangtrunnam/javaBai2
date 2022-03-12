/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuce.cntt.oop.th1.bai2;

/**
 *
 * @author Admin
 */
public class SeatBelt {
    String brand;
    int width;
    boolean statusSeatBelt;

    public SeatBelt() {
    }

    public SeatBelt(String brand, int width, boolean statusSeatBelt) {
        this.brand = brand;
        this.width = width;
        this.statusSeatBelt = statusSeatBelt;
    }

    public String getBrand() {
        return brand;
    }

    public int getWidth() {
        return width;
    }

    public boolean isStatus() {
        return statusSeatBelt;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setStatus(boolean status) {
        this.statusSeatBelt = status;
    }
    
    public void changeStatusSeatBelt(boolean stt){
        this.statusSeatBelt=stt;
    }
    
}
