import java.io.*;
public class CmdLineArgsV3 extends Object{
    public static void main(String args[]) {
        CmdLineArgsV3 Obj = new CmdLineArgsV3();
        if(args.length!=2) {
            System.out.println("Invalid number of arguements \n you need to pass two positive integers less than 50");
        }
        else{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int z = x+y;
            System.out.println("the class name is :-- "+Obj.getClass());
            System.out.println("sum of "+x+" is "+y+" is "+z);
        }
    }
}
