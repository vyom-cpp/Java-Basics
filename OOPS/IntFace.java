package OOPS;

public class IntFace {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

        King k = new King();
        k.moves();
    }
}

interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("Moves up, down, left, right, and diagonally in all 4 directions");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("Moves up, down, left, right in all 4 directions");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("Moves up, down, left, right, and diagonally in all 4 directions (takes one step only)");
    }
}