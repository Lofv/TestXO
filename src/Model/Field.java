package Model;

/**
 * Created by Dred on 17.09.2016.
 */
public class Field {
    Type[][] cells;
   static boolean isWin = false;
    public Field() {
        cells = new Type[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = Type.NONE;

            }

        }
    }

    public void show() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (cells[i][j]) {
                    case X:
                        System.out.print("X");
                        break;
                    case O:
                        System.out.print("O");
                        break;
                    case NONE:
                        System.out.print(".");
                        break;
                    default:
                        System.out.print("Nothing");
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    public void doShoot(Point point, Type type) {
        if (cells[point.getX()][point.getY()] == Type.NONE)
            cells[point.getX()][point.getY()] = type;
        else {Computer.getShoot();}

    }

    public boolean checkWin(Type t) {


        if (cells[0][0] == t && cells[0][1] == t && cells[0][2] == t) {
            isWin = true;
        } else if (cells[1][0] == t && cells[1][1] == t && cells[1][2] == t) {
            isWin = true;
        } else if (cells[2][0] == t && cells[2][1] == t && cells[2][2] == t) {
            isWin = true;
        }
        return isWin;
    }

    public enum Type {
        X, O, NONE
    }


}
