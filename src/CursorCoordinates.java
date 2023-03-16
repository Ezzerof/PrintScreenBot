import java.awt.MouseInfo;
import java.awt.Point;

public class CursorCoordinates {

    public static void getXYCords() {
        System.out.println("Point your cursor on the top left corner of your picture");

        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Get First Point cords
        Point p = MouseInfo.getPointerInfo().getLocation();
        int x = (int) p.getX();
        int y = (int) p.getY();
        System.out.println("Enter this cords in the Screenshot class: x = " + x + ", y = " + y);
        System.out.println("Move to the second point now");

        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Get Second Points cords
        Point p2 = MouseInfo.getPointerInfo().getLocation();
        int secondPointX = (int) p2.getX();
        int secondPointY = (int) p2.getY();

        System.out.println("x2 = " + secondPointX + ", y2 = " + secondPointY);

        int width;
        int height;
        if (secondPointX > x) {
            width = secondPointX - x;
            height = secondPointY - y;
        } else {
            width = x - secondPointX;
            height = y - secondPointY;
        }


        System.out.println("width = " + width + " ,height = " + height);

    }

    public static void main(String[] args) {
        getXYCords();
    }
}
