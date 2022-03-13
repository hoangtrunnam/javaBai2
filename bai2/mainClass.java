
package nuce.cntt.oop.th1.bai2;

/**
 * this is main class
 * @author Admin
 */


  
public class mainClass {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        
        SeatBelt seatBelt = new SeatBelt("meccc",33,false);
        Engine engine = new Engine("mecsdes",200,false);
        
        Car car = new Car("mec","mec",false,engine,seatBelt);
        
        car.started();
//        car.run();
//        car.stop();
        car.leaveCar();
        
        
    }
    
}
