import com.sun.javafx.scene.paint.GradientUtils;

import java.awt.*;
import java.awt.Point;
import java.awt.geom.Point2D;

/**
 * Created by Raimondas on 2017.07.13.
 */
public class Java6Taskas {

    public static void main(String[] args) {
        //System.out.println("Atstumas iki kito tasko : "+apskiaciuojaAtstumaIkiKitoTasko());
        pasakoKokiameKetvirtyjeYraTaskas(5,10);
    }

    private static double x1=10, x2=20;
    private static double y1=30, y2=40;
    static String spalva;

    private Java6Taskas(){
    }
    private   Java6Taskas(double x1,double y1){
        this.x1=x1;
        this.y1=y1;
    }

    private Java6Taskas(double x1,double y1, String spalva){
        this.x1=x1;
        this.y1=y1;
        this.spalva=spalva;
    }

    private   Java6Taskas(String spalva){
        this.spalva=spalva;
    }

    private static double apskiaciuojaAtstumaIkiKitoTasko(){
        return java.awt.Point.distance(x1,y1,x2,y2);
    }

    private static void pasakoKokiameKetvirtyjeYraTaskas(int x, int y){
        if (x>0 && y>1){
            System.out.println("Priklauso pirmas ketvirciui");}
            else if(x>0 && y<0){
            System.out.println("Priklauso antram ketvirciui");}
            else if(x<0 && y<0){
            System.out.println("Priklauso treciam ketvirciui");}



            else if (x<0 && y>0){
            System.out.println("Priklauso ketvirtam ketvirciui");}
            else {
            System.out.println("Yra centre");}
            }

    private static void pasakoArTaskasPriklausoTamPaciamKetvirciui(int x1, int y1, int x2, int y2){
        //String pirmasKetvirtis=


    }




}
