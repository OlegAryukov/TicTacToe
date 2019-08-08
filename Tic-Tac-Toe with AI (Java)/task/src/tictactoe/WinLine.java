package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class WinLine {
    private final static char O = 'O';
    private final static char X = 'X';
    private List<Pair> pairs;
    private boolean isWin = false;

    public WinLine(List<Pair> pairs) {
        this.pairs = pairs;
    }

    public WinLine(Pair pair1, Pair pair2, Pair pair3) {
        List<Pair> pairsIn = new ArrayList<>();
        pairsIn.add(pair1);
        pairsIn.add(pair2);
        pairsIn.add(pair3);
        this.pairs = pairsIn;
    }

    public void updateLine(List<Pair> line, char[][] field) {
        isWin = checkLine(pairs, field);
    }

    private boolean checkLine(List<Pair> line, char[][] field) {
        line.forEach(pair -> pair.setSymbol(field[pair.getI()][pair.getJ()]));
        int countO = (int) line.stream().map(pair -> field[pair.getI()][pair.getJ()]).filter(symbol -> symbol == 'O').count();
        int countX = (int) line.stream().map(pair -> field[pair.getI()][pair.getJ()]).filter(symbol -> symbol == 'X').count();
        return countO == 3 || countX == 3;
    }

    public List<Pair> getPairs() {
        return pairs;
    }

    public boolean isWin() {
        return isWin;
    }
}

