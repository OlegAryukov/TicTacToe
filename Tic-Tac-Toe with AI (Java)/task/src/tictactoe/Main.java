package tictactoe;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final String BORDER = "---------";
        char[][] field = new char[3][3];
        List<WinLine> winLineList = new ArrayList<>();
        Pair pair00 = new Pair(0, 0);
        Pair pair01 = new Pair(0, 1);
        Pair pair02 = new Pair(0, 2);
        Pair pair10 = new Pair(1, 0);
        Pair pair11 = new Pair(1, 1);
        Pair pair12 = new Pair(1, 2);
        Pair pair20 = new Pair(2, 0);
        Pair pair21 = new Pair(2, 1);
        Pair pair22 = new Pair(2, 2);

        winLineList.add(new WinLine(pair00, pair01, pair02));
        winLineList.add(new WinLine(pair10, pair11, pair12));
        winLineList.add(new WinLine(pair20, pair21, pair22));
        winLineList.add(new WinLine(pair00, pair10, pair20));
        winLineList.add(new WinLine(pair01, pair11, pair21));
        winLineList.add(new WinLine(pair02, pair12, pair22));
        winLineList.add(new WinLine(pair00, pair11, pair22));
        winLineList.add(new WinLine(pair02, pair11, pair20));

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Main main = new Main();
        main.fillFeild(field, str.replace("\"", ""));
        main.printField(field);
        System.out.println("Enter the coordinates:");
        String userTern = input.nextLine();
        main.handleUserTern(userTern, field);
        main.printField(field);
//        boolean wins = false;
//        char symbolWin = 'X';
//        for (WinLine winLine : winLineList) {
//            winLine.updateLine(winLine.getPairs(), field);
//            if (winLine.isWin()) {
//                if (wins) {
//                    System.out.println("Impossible");
//                    end = true;
//                    break;
//                }
//                wins = true;
//                symbolWin = winLine.getPairs().get(0).getSymbol();
//            }
//        }
//        if (differ > 1) {
//            System.out.println("Impossible");
//            end = true;
//        }
//        if (!end && wins) {
//            System.out.println(symbolWin + " wins");
//        }
//        if(summ == 9 && !wins){
//            System.out.println("Draw");
//        }
//        if(summ!=9 && !wins && !end){
//            System.out.println("Game not finished");
//        }
    }

    private void fillFeild(char[][] field, String input) {
        char[] src = input.toCharArray();

        field[0] = Arrays.copyOfRange(src, 0, 3);
        field[1] = Arrays.copyOfRange(src, 3, 6);
        field[2] = Arrays.copyOfRange(src, 6, 9);
    }

    private void handleUserTern(String input, char[][] field){
        String search = input.replace(" ", "");
        TransformEnum fieldCell = TransformEnum.ONE_ONE.getAll()
                .stream()
                .filter(transformEnum -> transformEnum.getUserIJ().equals(search)).collect(Collectors.toList()).get(0);
        field[fieldCell.getPairI()][fieldCell.pairJ] = 'X';
    }

    private void printField(char[][] field){
        int countX = 0;
        int countO = 0;
        int differ = 0;
        int summ = 0;
        boolean end = false;
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
                if (field[i][j] == 'O') {
                    countO++;
                } else if (field[i][j] == 'X') {
                    countX++;
                }
            }
            System.out.print("|" + "\n");
        }
        System.out.println("---------");
        differ = Math.abs(countO - countX);
        summ = countO + countX;
    }
}
