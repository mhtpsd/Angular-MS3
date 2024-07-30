class BattleshipGame {
    private boolean[][] seaGrid;

    public BattleshipGame(int size) {
        seaGrid = new boolean[size][size];
    }

    public void placeShip(int x, int y) {
        if (x < 0 || x >= seaGrid.length || y < 0 || y >= seaGrid[0].length) {
            System.out.println("Error: Coordinates are out of bounds.");
            return;
        }
        seaGrid[x][y] = true;
    }

    public boolean attack(int x, int y) {
        if (x < 0 || x >= seaGrid.length || y < 0 || y >= seaGrid[0].length) {
            System.out.println("Error: Coordinates are out of bounds.");
            return false;
        }
        return seaGrid[x][y];
    }
}

public class Main {
    public static void main(String[] args) {
        BattleshipGame game = new BattleshipGame(10);
        game.placeShip(1, 1);
        game.placeShip(2, 2);
        game.placeShip(3, 3);

        System.out.println(game.attack(1, 1));
        System.out.println(game.attack(0, 0)); 
    }
}
