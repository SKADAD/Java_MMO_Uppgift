package MapPack;

import java.util.Random;

public class PlayArea extends Map{



    public PlayArea(){

        String[][] map = new String[xCordinateBase][yCordinateBase];

        int forLoopNum = (((xCordinateBase+yCordinateBase)/2)*0.1);


        for(int i = 0;forLoopNum >= i; i++ ){
            Random num = new Random();
            int randNum = num.nextInt((xCordinateBase+yCordinateBase)/2);
            int randNum1 = num.nextInt((xCordinateBase+yCordinateBase)/2);
            String[randNum][randNum1] = 1;
        }




    }


}
