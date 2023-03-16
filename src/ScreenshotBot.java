import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ScreenshotBot {

    // Before use, you have to find the Width, height, x and y.
    // Find the width and height of the wanted pic
    // For x and y just use CursorCoordinates class

    public static void main(String[] args) throws Exception {

        // Set the path to the folder where the screenshots will be saved
        String folderPath = ""; // your path where to save screenshots

        // Set the dimensions of the field to capture (x, y, width, height)
        Rectangle captureRect = new Rectangle(7, 248, 1500, 851);
        // 1189,1146 7, 479
        // Create a new Robot object
        Robot robot = new Robot();

        // Capture the screen within the specified field
        BufferedImage screenshot = robot.createScreenCapture(captureRect);

        // Generate a filename for the screenshot
        String fileName = "screenshot_" + System.currentTimeMillis() + ".png";

        // Create a File object with the specified folder and filename
        File file = new File(folderPath + fileName);

        // Save the screenshot to the file
        ImageIO.write(screenshot, "png", file);

        // Print a message indicating the screenshot was saved
        System.out.println("Screenshot saved to " + file.getAbsolutePath());
    //
    }
}
