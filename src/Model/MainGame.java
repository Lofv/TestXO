package Model;

/**
 * Created by Dred on 17.09.2016.
 */
public class MainGame {
    public static Field field = new Field();
    public static Computer computer = new Computer();
    public static User player = new User();

    public static void start() {
        field.show();
//        for (int i = 0; i < 9; i++) {
            while (!Field.isWin) {
            field.doShoot(computer.getShoot(), Field.Type.X);
            field.show();
            if( field.checkWin(Field.Type.X))
                System.out.println("Comp win");
            field.doShoot(player.getShoot(), Field.Type.O);
            field.show();
            if (field.checkWin(Field.Type.O))
                System.out.println("User win");
        }
    }

}
