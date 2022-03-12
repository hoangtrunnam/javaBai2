/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuce.cntt.oop.th1.bai2;

/**
 *
 * @author Admin
 */
public class Car {
    String carName;
    String brand;
    boolean statusCar;
    SeatBelt seatBelt = new SeatBelt();
    Engine engine = new Engine();

    public Car() {
    }

    public Car(String carName, String brand, boolean statusCar) {
        this.carName = carName;
        this.brand = brand;
        this.statusCar = statusCar;
    }

    public void setStatusCar(boolean statusCar) {
        this.statusCar = statusCar;
    }
    
    
    
    public void seatBelted(){
        seatBelt.changeStatusSeatBelt(true);
    }
    
    public void started(){
        if(this.seatBelt.statusSeatBelt&&this.engine.start()){
                setStatusCar(true);
        }
        else{
            System.out.println("khoi dong xe bi loi @@@");
        }
    }
    
    public void run(){
        System.out.println("statusEngine trong car la: "+this.engine.statusEngine);
        if(this.engine.statusEngine==true){
            System.out.println("dong co dang bat ne!!!");
        }
        else{
             System.out.println("dong co dang tat!!!");
        }
    }
    
    public void stop(){
        this.engine.setStatus(!statusCar);
        this.setStatusCar(false);
    }
    
    public void leaveCar(){
        this.seatBelt.setStatus(false);
        if(this.engine.statusEngine==false){
            System.out.println("xe chua tat dong co");
        }
    }
    
}
