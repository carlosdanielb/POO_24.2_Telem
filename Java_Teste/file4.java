package TESTE_01;
public class TESTE_01 {
    public static void main(String[] args) {
    int x, y, z;
    x = 42;
    y = x--; 
    System.out.printf("x = %d y = %d %n", x,y);
    
    z = --x; 
    System.out.printf("x = %d y = %d z = %d %n", x,y,z);
    
    x = z-- + z; 
    System.out.printf("x = %d y = %d z = %d %n", x,y,z);
    
    }
}
//Referente á aula do dia 05/11/2024
