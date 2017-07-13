/**
 * Created by ozc on 2017.07.13.
 */
public class Java5Rekursija {

    public static int faktorialas(int skaicius) {
        if (skaicius == 1) {
            return skaicius;
        }

        return  skaicius * faktorialas(skaicius-1);
    }



}
