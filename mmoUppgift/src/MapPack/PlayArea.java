package MapPack;

import java.util.Random;

public class PlayArea extends Map{

    public PlayArea(int xCordinateBase,int yCordinateBase){
        super(xCordinateBase, yCordinateBase);

        String[][] map = new String[xCordinateBase][yCordinateBase];

        int forLoopNum = (((xCordinateBase+yCordinateBase)/2)/10;


        for(int i = 0;forLoopNum >= i; i++ ){
            Random num = new Random();
            int randNum = num.nextInt((xCordinateBase+yCordinateBase)/2);
            int randNum1 = num.nextInt((xCordinateBase+yCordinateBase)/2);
            map[randNum][randNum1].set("1");
        }
    }
}
