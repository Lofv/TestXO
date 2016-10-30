package Model;

/**
 * Created by Dred on 16.09.2016.
 */
public class User implements Shootable {


    public static Point point; //better Getter and setter
    public volatile static  boolean isShoot;


    @Override
    public Point getShoot() {
        isShoot=false;
        while(!isShoot);// не идеальный вариант. так как вечно жрутся ресурся, пока не нажмут. Лучше усыпить процесс и потом разбудить
        return point;
    }
}
