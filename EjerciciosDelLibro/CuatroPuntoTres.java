public class CuatroPuntoTres {
public static void main(String[] args) {

int a = 10;
int b = 25;
int c = 15;

int central;

if ((a > b && a < c) || (a > c && a < b)) {
central = a;
} else if ((b > a && b < c) || (b > c && b < a)) {
central = b;
} else {
central = c;
}

System.out.println("El número central es: " + central);
}
}