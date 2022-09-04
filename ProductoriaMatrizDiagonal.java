package domain;

public class ProductoriaMatrizDiagonal {
    public int sumaDiagonalMatriz(int matriz[][], int contador,int resultado){
        
        if(matriz.length == 0){
            System.out.println("Matriz vacia");
            return 0;
        }
        else if(matriz.length != matriz[0].length){
            System.out.println("Matriz no es cuadrada");
            return 1;
            
        }
        else if(matriz.length == contador){
            System.out.println("Resultado: " + resultado);
            return resultado;
        }
        else{
            
            if(contador == 0){
                resultado = matriz[contador][contador];
            }
            else{
                resultado *= matriz[contador][contador];
            }
            contador++;
        }
        return sumaDiagonalMatriz(matriz, contador, resultado);  
    }
}
