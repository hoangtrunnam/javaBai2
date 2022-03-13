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
    SeatBelt seatBelt ;
    Engine engine ;

    public Car() {
        seatBelt= new SeatBelt();
        engine = new Engine();
    }

    public Car(String carName, String brand, boolean statusCar, Engine engine,SeatBelt seatBelt) {
        this();
        this.carName = carName;
        this.brand = brand;
        this.statusCar = statusCar;
        this.engine = engine;
        this.seatBelt = seatBelt;
    }

    public void setStatusCar(boolean statusCar) {
        this.statusCar = statusCar;
    }

    public boolean isStatusCar() {
        return statusCar;
    }
    
    
    
    public void seatBelted(){
         seatBelt.changeStatusSeatBelt(true);
    }
    public void callstart(){
         engine.start();
    }
    
    public void started(){
        seatBelted();
        callstart();
        if(seatBelt.statusSeatBelt&&engine.statusEngine){
                this.setStatusCar(true);
                System.out.println("khoi dong xe thanh cong");
        }
        else{
            System.out.println("khoi dong xe bi loi @@@");
        }
    }
    
    public void run(){
        System.out.println("statusEngine trong car la: "+this.engine.statusEngine);
        if(engine.statusEngine==true){
            System.out.println("dong co dang bat ne!!!");
        }
        else{
             System.out.println("dong co dang tat!!!");
        }
    }
    
    public void stop(){
        engine.setStatus(false);// tat dong co
        this.setStatusCar(false); // doi trang thai xe sang tat
        System.out.println("dong co da tat roi do"+ engine.isStatusEngine());
        System.out.println("xe da tắt tất cả rồi đó"+ this.isStatusCar());
    }
    
    public void leaveCar(){
        seatBelt.setStatus(false);
        System.out.println("da thao day an toan, false la da thao"+seatBelt.isStatusSeatBelt());
        if(this.engine.statusEngine==true){
            System.out.println("xe chua tat dong co");
        }
        else{
             System.out.println("xe da tat dong co");
        }
    }
}
