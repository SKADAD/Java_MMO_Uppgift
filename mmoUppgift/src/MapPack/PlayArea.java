package MapPack;

import java.util.ArrayList;
import java.util.Random;

public class PlayArea extends Map{

    public PlayArea(int xCordinateBase,int yCordinateBase){
        super(xCordinateBase, yCordinateBase);

        String[][] map = new String[xCordinateBase][yCordinateBase];
        ArrayList<ArrayList<Integer>> myDubbelArray = new ArrayList<>();


        int forLoopNum = (((xCordinateBase+yCordinateBase)/2)/10);
        for(int i = 0;forLoopNum >= i; i++ ) {
            Random num = new Random();
            int randNum = num.nextInt((xCordinateBase + yCordinateBase);
            int randNum1 = num.nextInt((xCordinateBase + yCordinateBase);
            map[randNum][randNum1].set("1");

        }

    }
}

//comment