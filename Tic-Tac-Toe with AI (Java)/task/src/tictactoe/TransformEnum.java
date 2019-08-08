package tictactoe;

import java.util.ArrayList;
import java.util.List;

public enum TransformEnum {
    ONE_ONE("11",2,0),
    TWO_ONE("21",2,1),
    THREE_ONE("31",2,2),

    ONE_TWO("12",1,0),
    TWO_TWO("22",1,1),
    THREE_TWO("32",1,2),

    ONE_THREE("13",0,0),
    TWO_THREE("23",0,1),
    THREE_THREE("33",0,2);

    String userIJ;
    int pairI;
    int pairJ;

    TransformEnum(String userIJ, int pairI, int pairJ) {
        this.userIJ = userIJ;
        this.pairI = pairI;
        this.pairJ = pairJ;
    }
    public List<TransformEnum> getAll(){
        List<TransformEnum> allEnums = new ArrayList<>();
        allEnums.add(ONE_ONE);
        allEnums.add(TWO_ONE);
        allEnums.add(THREE_ONE);
        allEnums.add(ONE_TWO);
        allEnums.add(TWO_TWO);
        allEnums.add(THREE_TWO);
        allEnums.add(ONE_THREE);
        allEnums.add(TWO_THREE);
        allEnums.add(THREE_THREE);
        return allEnums;
    }

    public String getUserIJ() {
        return userIJ;
    }

    public void setUserIJ(String userIJ) {
        this.userIJ = userIJ;
    }

    public int getPairI() {
        return pairI;
    }

    public void setPairI(int pairI) {
        this.pairI = pairI;
    }

    public int getPairJ() {
        return pairJ;
    }

    public void setPairJ(int pairJ) {
        this.pairJ = pairJ;
    }
}
