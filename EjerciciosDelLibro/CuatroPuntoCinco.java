public class CuatroPuntoCinco {
public static void main(String[] args) {

int n = 37;

if (n % 2 == 0) {
System.out.println("Método 1: El número es PAR");
} else {
System.out.println("Método 1: El número es IMPAR");
}

if ((n & 1) == 0) {
System.out.println("Método 2: El número es PAR");
} else {
System.out.println("Método 2: El número es IMPAR");
}

if ((n / 2) * 2 == n) {
System.out.println("Método 3: El número es PAR");
} else {
System.out.println("Método 3: El número es IMPAR");
}
}
}