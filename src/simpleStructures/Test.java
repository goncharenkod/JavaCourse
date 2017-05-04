package simpleStructures;

import SayMessage.SayMessage;
import java.util.concurrent.atomic.AtomicInteger;
import myLib.*;

public class Test {
    
	private static int classX = 1;
	private static int classY = 2;
	
	public static void main(String[] args) 
    {
		
		SayMessage.sayMessage("Swap using class variables");
		
		SayMessage.sayMessage("classX = "+classX);
        SayMessage.sayMessage("classY = "+classY);
        
		// To use this method, x and y variable must be class variables
        swapXY();
        
        SayMessage.sayMessage("classX = "+classX);
        SayMessage.sayMessage("classY = "+classY);
        
        SayMessage.sayMessage("");
        
		// Method variables
        int x = 1;
		int y = 2;
		
		// Swap using Atonic Integer type
		SayMessage.sayMessage("Swap using Atonic Integer type");
		SayMessage.sayMessage("x = "+x);
        SayMessage.sayMessage("y = "+y);
        
		AtomicInteger ax = new AtomicInteger(x);
		AtomicInteger ay = new AtomicInteger(y);
		
		Swap.swapIntAtomic(ax, ay);
        
		x = ax.get(); y = ay.get();
		
        SayMessage.sayMessage("x = "+x);
        SayMessage.sayMessage("y = "+y);
        
        SayMessage.sayMessage("");
        
        // swap using Array
        
        SayMessage.sayMessage("Swap using array");
        
        x = 1; y = 2;
        int z = 3;
        
        SayMessage.sayMessage("x = "+x);
        SayMessage.sayMessage("y = "+y);
        SayMessage.sayMessage("z = "+z);
        
        Integer[] tmpArr = Swap.shiftLeft(new Integer[] {x,y,z});
        x = tmpArr[0];
        y = tmpArr[1];
        z = tmpArr[2];
        
        SayMessage.sayMessage("x = "+x);
        SayMessage.sayMessage("y = "+y);
        SayMessage.sayMessage("z = "+z);
    }   

	private static void swapXY() {
		int tmp = classX;
		classX = classY;
		classY = tmp;
	}
	
}



