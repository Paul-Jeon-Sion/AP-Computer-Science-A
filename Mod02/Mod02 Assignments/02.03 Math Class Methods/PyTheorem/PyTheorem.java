
/**
 * The purpose of this program is to understand and practice using Math method, by making a two tringle and finding its sides
 *
 * @author Paul Jeon
 * @version 2023/10/23
 */
public class PyTheorem
{
    public static void main(String [] args)
    {
        int numTriangle = 0;
        int sideAofTriangle1 = (int) (Math.random() * 18) + 5;
        int sideBofTriangle1 = (int) (Math.random() * 18) + 5;
        double hypotenuseOfTriangle1 = Math.sqrt(Math.pow(sideAofTriangle1, 2) + Math.pow(sideBofTriangle1, 2));
        
        int sideAofTriangle2 = (int) (Math.random() * 18) + 5;
        int sideBofTriangle2 = (int) (Math.random() * 18) + 5;
        double hypotenuseOfTriangle2 = Math.sqrt(Math.pow(sideAofTriangle2, 2) + Math.pow(sideBofTriangle2, 2));
        
        numTriangle++; 
        System.out.print("Triangle " + numTriangle + "\t");
        System.out.print("Side 1: " + sideAofTriangle1 + "\t");
        System.out.print("Side 2: " + sideBofTriangle1 + "\t");
        System.out.print("Hypotenuse: " +  hypotenuseOfTriangle1);
        
        System.out.println();
        
        numTriangle++; 
        System.out.print("Triangle " + numTriangle + "\t");
        System.out.print("Side 1: " + sideAofTriangle2 + "\t");
        System.out.print("Side 2: " + sideBofTriangle2 + "\t");
        System.out.print("Hypotenuse: " +  hypotenuseOfTriangle2);
    } 
}
