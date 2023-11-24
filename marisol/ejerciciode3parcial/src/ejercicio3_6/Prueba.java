package ejercicio3_6;

public class Prueba {
        public static void main(String[] args) {
            Tienda tienda = new Tienda("Tienda Cuántica", "juan lopez", 123456, 5);
            Computador computador1 = new Computador("Acer", 50, "Intel iCore 7", "Windows", 18500000);
            Computador computador2 = new Computador("Dell", 64, "AMD Ryzen 5", "Linux", 20000000);

            tienda.agregar(computador1);
            tienda.agregar(computador2);

            tienda.imprimir();
        }
    }


