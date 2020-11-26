import java.util.*;
public class sumaCombinaciones {
       
    public void combinar(int n){
        ArrayList<Integer> numeros = new ArrayList<>(); 
        combinaciones(n,numeros,0);    
    }
    private void combinaciones(int numero,ArrayList<Integer> numeros,int suma){
        if(suma == numero){
            System.out.println(numeros);
        }else{
            for(int i = 1; i <= numero; i++){
                suma += i;
                if(suma <= numero){
                    numeros.add(i);
                    combinaciones(numero,numeros,suma);
                    numeros.remove(numeros.indexOf(i));
                }
                suma -= i;
            }
        }       
    }       
}
