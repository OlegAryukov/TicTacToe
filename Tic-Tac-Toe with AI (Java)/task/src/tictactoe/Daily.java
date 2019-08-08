package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Daily {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
//        String[] strArray = new String[nameList.size()];
//        for (int i = 0; i < nameList.size(); i++) {
//            strArray[i] = nameList.get(i);
//        }
        String[] strArray = new String[nameList.size()];
        nameList.toArray(strArray);

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
