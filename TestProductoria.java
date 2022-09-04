package test;

import domain.ProductoriaMatrizDiagonal;

public class TestProductoria {
    public static void main(String[] args) {
        ProductoriaMatrizDiagonal prueba = new ProductoriaMatrizDiagonal();

        int matriz[][] = {{1,2,3},{1,2,3},{4,5,10}};
        prueba.sumaDiagonalMatriz(matriz,0,0);
    }
    
}
