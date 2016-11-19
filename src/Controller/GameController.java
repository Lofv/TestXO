package Controller;

import Model.Field;
import Model.User;
import Model.Point;

/**
 * Created by Dred on 17.09.2016.
 */
public class GameController {

    public static void doShoot(Point point, Field.Type type){
        User.point=point;
        User.isShoot=true;

    }
}
