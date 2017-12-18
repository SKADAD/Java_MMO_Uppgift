package MapPack;

import java.util.ArrayList;
import java.util.Random;

public class PlayArea extends Map{

    public PlayArea(int xCordinateBase,int yCordinateBase){
        super(xCordinateBase, yCordinateBase);

        //String[][] map = new String[xCordinateBase][yCordinateBase];
        //ArrayList<ArrayList<Integer>> myDubbelArray = new ArrayList<>();
        ArrayList<Integer> firstlist = new ArrayList<>();

        int forLoopNum = (xCordinateBase/10);
        for(int i = 0;forLoopNum >= i; i++ ) {
            Random num = new Random();
            int randNumX = num.nextInt(xCordinateBase);
            int randNumY = num.nextInt(yCordinateBase);
            firstlist.add(randNumX);
            firstlist.add(randNumY);


        }

    }
}

//asdsad