
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

        Car car = new Car();
        SeatBelt seatBelt = new SeatBelt();
        Engine engine = new Engine();
        
        
        engine.setStatus(true);
        car.run();
    }
    
}
