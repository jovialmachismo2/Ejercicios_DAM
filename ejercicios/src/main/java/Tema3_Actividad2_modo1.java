import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;

public class Tema3_Actividad2_modo1 {
    static void main() {
        int vector[] = {1,2,2,3,4,4,5};
        int aux[] = new int[vector.length];
        int num = 0;

        for (int i = 0; i < vector.length -1  ; i++){

            if (i == vector.length -1){
                aux[i] = vector[i];
                num++;
            }else if (vector[i]!=vector[i+1]){
                aux[i] = vector[i];
            }
        }

        int limpio[] = new int[num];
        int j = 0;

        for (int i = 0; i < aux.length; i++){
            if (aux[i]!=0){
                limpio[j]=aux[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(aux));
    }
}
