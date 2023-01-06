package dev.LOL.postion;

import dev.LOL.LoLType;
import dev.LOL.data.TOP;
import dev.LOL.data.JUNGLE;
import dev.LOL.data.Line;
import dev.LOL.data.MARKSMAN;
import dev.LOL.data.SUPPORTER;
import dev.LOL.data.MID;

public class LineFactory {
	 public Line createNotification(LoLType lol)
	    {
	        switch (lol) {
	        case TOP:
	            return new TOP();
	        case MID:
	            return new TOP();
	        case SUPPORTER:
	            return new SUPPORTER();
	        case MARKSMAN:
	            return new MARKSMAN();
	        case JUNGLE:
	            return new JUNGLE();      
	        default:
	            throw new RuntimeException(lol.toString() + "is not existed");
	        }
	    }
}
