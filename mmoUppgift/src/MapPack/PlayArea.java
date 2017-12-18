package MapPack;

import java.util.ArrayList;
import java.util.Random;

public class PlayArea extends Map{

    public PlayArea(int xCordinateBase,int yCordinateBase) {
        super(xCordinateBase, yCordinateBase);

        //ArrayList<ArrayList<Integer>> myDubbelArray = new ArrayList<>();

    }
        public ArrayList<ArrayList> generateMap(int xcord, int ycord) {

            ArrayList<ArrayList> myDubbelArray = new ArrayList<>();
            int forLoopNum = (xCordinateBase/10);
            for(int i = 0;forLoopNum >= i; i++ ) {
                ArrayList<Integer> firstlist = new ArrayList<>();
                Random num = new Random();
                int randNumX = num.nextInt(xCordinateBase);
                int randNumY = num.nextInt(yCordinateBase);
                firstlist.add(randNumX);
                firstlist.add(randNumY);
                myDubbelArray.add(firstlist)
            }
            return myDubbelArray;

        }

}

//asdsad