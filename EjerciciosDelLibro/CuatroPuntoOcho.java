public class CuatroPuntoOcho {
public static void main(String[] args) {

int num1 = 20; 
int num2 = 5; 

if (num2 != 0 && num1 % num2 == 0) {
System.out.println(num2 + " es divisor de " + num1);
} else if (num1 != 0 && num2 % num1 == 0) {
System.out.println(num1 + " es divisor de " + num2);
} else {
System.out.println("Ninguno es divisor del otro");
}
}
}