
package lab.pkg3_malilong;
import javax.swing.JOptionPane;

public class LAB3_MALILONG {

   
    public static void main(String[] args) {
        
        // at this code the system will ask what type of function they want to use//
        boolean loop = true;
        while (loop) {
            String Fx = JOptionPane.showInputDialog("""
                                                    CALCULATOR
                                                      Pls input its corresponding number:
                                                     1.Area of Circle
                                                     2.Area of Rectangle
                                                     3.Area of Triangle
                                                     4.Volume of Sphere
                                                     5.Volume of Cylinder
                                                     6.Area of a Circle Segment
                                                     7.Missing side c of triangle
                                                     8.Sphere Surface Area""");
            //Declare the objective properties//
            double result = 0;
            double r = 0;
            double length = 0;
            double width = 0;
            double base = 0;
            double height = 0;
            double angle = 0;
            double a = 0;
            double b = 0;
            double anglec = 0;
            String numb1 = "";
            String numb2 = "";
            String numb3 = "";
            int swit = Integer.parseInt(Fx);

            //the functions of objectives//
            switch (swit) {
                case 1 -> {
                    numb1 = JOptionPane.showInputDialog("Input radius:");
                    r = Double.parseDouble(numb1);
                    result = Math.PI * Math.pow(r, 2);
                    JOptionPane.showMessageDialog(null, "Area of Circle = " + result + " squared units");
                }
                case 2 -> {
                    numb1 = JOptionPane.showInputDialog("Input Length:");
                    numb2 = JOptionPane.showInputDialog("Input Width:");
                    length = Double.parseDouble(numb1);
                    width = Double.parseDouble(numb2);
                    JOptionPane.showMessageDialog(null, "Area of Rectangle = " + length * width + " squared units");
                }
                case 3 -> {
                    numb1 = JOptionPane.showInputDialog("Input base:");
                    numb2 = JOptionPane.showInputDialog("Input height:");
                    base = Double.parseDouble(numb1);
                    height = Double.parseDouble(numb2);
                    JOptionPane.showMessageDialog(null, "Area of triangle = " + 0.5 * base * height+ " squared units");
                }
                case 4 -> {
                    numb1 = JOptionPane.showInputDialog("Input radius:");
                    r = Double.parseDouble(numb1);
                    JOptionPane.showMessageDialog(null, "Volume of Sphere = " + calculateSphereVolume(r) + " squared units");
                }
                case 5 -> {
                    numb1 = JOptionPane.showInputDialog("Input radius:");
                    numb2 = JOptionPane.showInputDialog("Input height:");
                    r = Double.parseDouble(numb1);
                    height = Double.parseDouble(numb2);
                    result = Math.PI * r * r * height;
                    JOptionPane.showMessageDialog(null, "Volume of Cylinder = " + result + " cubic units");
                }
                case 6 -> {
                    numb1 = JOptionPane.showInputDialog("Input radius:");
                    numb2 = JOptionPane.showInputDialog("Input angle:");
                    r = Double.parseDouble(numb1);
                    angle = Double.parseDouble(numb2);
                    JOptionPane.showMessageDialog(null, "Area of Circle Segment Area = " + calculateCircleSegmentArea(r, angle)+ " squared units");
                }
                case 7 -> {
                    numb1 = JOptionPane.showInputDialog("Input Side a:");
                    numb2 = JOptionPane.showInputDialog("Input Side b:");
                    numb3 = JOptionPane.showInputDialog("Input angle C:");
                    a = Double.parseDouble(numb1);
                    b = Double.parseDouble(numb2);
                    anglec = Double.parseDouble(numb3);
                    JOptionPane.showMessageDialog(null, "Lenght of side c = " + calculateTriangleSide(a, b, anglec)+ " units");
                }
                case 8 -> {
                    numb1 = JOptionPane.showInputDialog("Input radius");
                    r = Double.parseDouble(numb1);

                    JOptionPane.showMessageDialog(null, "Area of Sphere Surface = " + calculateSphereSurfaceArea(r)+ " 7squared units");
                }
                default -> JOptionPane.showMessageDialog (null, "Invalid option, please select numbers 1-8 only");

            }
        }
    }

    public static double calculateCircleSegmentArea(double radius, double angle) {
        if (radius <= 0 || angle <= 0) {
            JOptionPane.showMessageDialog(null, "Radius and angle must be non-negative Intergers");
            return -1;
        }
        double Radangle = Math.toRadians(angle);
        return (Math.pow(radius, 2) / 2) * (Radangle - Math.sin(Radangle));
    }

    public static double calculateTriangleSide(double a, double b, double AngleC) {
        if (a <= 0 && b <= 0 && AngleC <= 0 && AngleC >= 180) {
            JOptionPane.showMessageDialog(null, "a, b, and Angle C must be non-negative numbers and the angle must be less than 180 degrees.");
            return -1;
        }
        Double AngleCRadians = Math.toRadians(AngleC);
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(AngleCRadians));

        return c;
    }

    public static double calculateSphereVolume(double radius) {
        if (radius <= 0) {
            JOptionPane.showMessageDialog(null, "Radius must be greater than 0.");
            return -1;
        }
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

    }

    public static double calculateSphereSurfaceArea(double radius) {
        if (radius <= 0) {
            JOptionPane.showMessageDialog(null, "Radius must bes greater than 0.");
            return -1;
        }
        return 4 * Math.PI * Math.pow(radius, 2);
    }
} 
    
    

