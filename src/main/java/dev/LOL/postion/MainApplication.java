package dev.LOL.postion;

import java.io.IOException;

import dev.LOL.LoLType;
import dev.LOL.data.Line;

public class MainApplication {

	public static void main(String[] args) throws IOException{
		LineFactory lineFactory = new LineFactory();
		
		Line Line1 = lineFactory.createNotification(LoLType.TOP);
		Line Line2  = lineFactory.createNotification(LoLType.MID);
        
        System.out.println(Line1.info());
        System.out.println(Line2.info());  
	}

}
