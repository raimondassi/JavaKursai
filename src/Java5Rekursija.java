/**
 * Created by ozc on 2017.07.13.
 */
public class Java5Rekursija {

    public static void main(String[] args) {
        //System.out.println(faktorialas(5));
       // System.out.println("Fibonaci" + (suskaiciuosFibonaci(10)));
        System.out.println(atspausdinaSkaiciusAtvirksciai(123456));
    }

    public static int faktorialas(int skaicius) {
     if (skaicius == 1) {
         return skaicius;
     }

        return  skaicius * faktorialas(skaicius-1);
    }

static int suskaiciuosFibonaci(int skaicius){
int didejantisSkaicius=1;
        if (skaicius==1){
            return skaicius;
        }

return skaicius+suskaiciuosFibonaci(skaicius-1)+suskaiciuosFibonaci(skaicius-2);
}

static int atspausdinaSkaiciusAtvirksciai(int skaicius){
    if (skaicius==0){
        return skaicius;
    }

return skaicius*10+atspausdinaSkaiciusAtvirksciai(skaicius%10);


}

}
