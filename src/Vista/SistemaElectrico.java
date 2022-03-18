package Vista;

import Controlador.ConConsumo;
import Modelo.Ciudad;
import Modelo.CiudadPlantaElectrica;
import Modelo.Consumo;
import Modelo.PlantaElectrica;
import Modelo.Region;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaElectrico {

    public static void main(String[] args) {
        Region r1 = new Region(1, "Costa");
        Region r2 = new Region(2, "Sierra");
        Region r3 = new Region(3, "Oriente");

        Ciudad c1 = new Ciudad(1, "Guayaquil", r1);
        Ciudad c2 = new Ciudad(2, "Manta", r1);
        Ciudad c3 = new Ciudad(3, "Quito", r2);
        Ciudad c4 = new Ciudad(4, "Ambato", r2);
        Ciudad c5 = new Ciudad(5, "Tena", r3);
        Ciudad c6 = new Ciudad(6, "Nueva Loja", r3);

        PlantaElectrica p1 = new PlantaElectrica(1, "Coca Codo Sinclair");
        PlantaElectrica p2 = new PlantaElectrica(2, "Sopladora");

        CiudadPlantaElectrica cp1 = new CiudadPlantaElectrica(p1, c3, 65);
        CiudadPlantaElectrica cp2 = new CiudadPlantaElectrica(p1, c1, 84);
        CiudadPlantaElectrica cp3 = new CiudadPlantaElectrica(p2, c1, 55);
        CiudadPlantaElectrica cp4 = new CiudadPlantaElectrica(p2, c3, 79);
        CiudadPlantaElectrica cp5 = new CiudadPlantaElectrica(p2, c6, 32);

        Consumo a1 = new Consumo(400, cp1);
        Consumo a2 = new Consumo(430, cp1);
        Consumo a3 = new Consumo(213, cp1);
        Consumo a4 = new Consumo(100, cp1);
        Consumo a5 = new Consumo(200, cp1);
        Consumo a6 = new Consumo(300, cp1);
        Consumo a7 = new Consumo(340, cp1);
        Consumo a8 = new Consumo(440, cp1);
        Consumo a9 = new Consumo(150, cp1);
        Consumo a10 = new Consumo(120, cp1);
        Consumo a11 = new Consumo(190, cp1);
        Consumo a12 = new Consumo(250, cp1);

        Consumo b1 = new Consumo(120, cp2);
        Consumo b2 = new Consumo(55, cp2);
        Consumo b3 = new Consumo(32, cp2);
        Consumo b4 = new Consumo(70, cp2);
        Consumo b5 = new Consumo(100, cp2);
        Consumo b6 = new Consumo(30, cp2);
        Consumo b7 = new Consumo(40, cp2);
        Consumo b8 = new Consumo(40, cp2);
        Consumo b9 = new Consumo(15, cp2);
        Consumo b10 = new Consumo(12, cp2);
        Consumo b11 = new Consumo(19, cp2);
        Consumo b12 = new Consumo(25, cp2);

        Consumo cc1 = new Consumo(300, cp3);
        Consumo cc2 = new Consumo(230, cp3);
        Consumo cc3 = new Consumo(313, cp3);
        Consumo cc4 = new Consumo(200, cp3);
        Consumo cc5 = new Consumo(300, cp3);
        Consumo cc6 = new Consumo(300, cp3);
        Consumo cc7 = new Consumo(240, cp3);
        Consumo cc8 = new Consumo(140, cp3);
        Consumo cc9 = new Consumo(350, cp3);
        Consumo cc10 = new Consumo(220, cp3);
        Consumo cc11 = new Consumo(290, cp3);
        Consumo cc12 = new Consumo(350, cp3);

        Consumo d1 = new Consumo(400, cp4);
        Consumo d2 = new Consumo(530, cp4);
        Consumo d3 = new Consumo(413, cp4);
        Consumo d4 = new Consumo(500, cp4);
        Consumo d5 = new Consumo(300, cp4);
        Consumo d6 = new Consumo(300, cp4);
        Consumo d7 = new Consumo(440, cp4);
        Consumo d8 = new Consumo(540, cp4);
        Consumo d9 = new Consumo(350, cp4);
        Consumo d10 = new Consumo(420, cp4);
        Consumo d11 = new Consumo(590, cp4);
        Consumo d12 = new Consumo(450, cp4);

        Consumo e1 = new Consumo(40, cp5);
        Consumo e2 = new Consumo(43, cp5);
        Consumo e3 = new Consumo(21, cp5);
        Consumo e4 = new Consumo(10, cp5);
        Consumo e5 = new Consumo(20, cp5);
        Consumo e6 = new Consumo(30, cp5);
        Consumo e7 = new Consumo(34, cp5);
        Consumo e8 = new Consumo(44, cp5);
        Consumo e9 = new Consumo(10, cp5);
        Consumo e10 = new Consumo(10, cp5);
        Consumo e11 = new Consumo(10, cp5);
        Consumo e12 = new Consumo(20, cp5);

        ConConsumo obj = new ConConsumo();
        obj.agregar(a1);
        obj.agregar(a2);
        obj.agregar(a3);
        obj.agregar(a4);
        obj.agregar(a5);
        obj.agregar(a6);
        obj.agregar(a7);
        obj.agregar(a8);
        obj.agregar(a9);
        obj.agregar(a10);
        obj.agregar(a11);
        obj.agregar(a12);

        obj.agregar(b1);
        obj.agregar(b2);
        obj.agregar(b3);
        obj.agregar(b4);
        obj.agregar(b5);
        obj.agregar(b6);
        obj.agregar(b7);
        obj.agregar(b8);
        obj.agregar(b9);
        obj.agregar(b10);
        obj.agregar(b11);
        obj.agregar(b12);

        obj.agregar(cc1);
        obj.agregar(cc2);
        obj.agregar(cc3);
        obj.agregar(cc4);
        obj.agregar(cc5);
        obj.agregar(cc6);
        obj.agregar(cc7);
        obj.agregar(cc8);
        obj.agregar(cc9);
        obj.agregar(cc10);
        obj.agregar(cc11);
        obj.agregar(cc12);

        obj.agregar(d1);
        obj.agregar(d2);
        obj.agregar(d3);
        obj.agregar(d4);
        obj.agregar(d5);
        obj.agregar(d6);
        obj.agregar(d7);
        obj.agregar(d8);
        obj.agregar(d9);
        obj.agregar(d10);
        obj.agregar(d11);
        obj.agregar(d12);

        obj.agregar(e1);
        obj.agregar(e2);
        obj.agregar(e3);
        obj.agregar(e4);
        obj.agregar(e5);
        obj.agregar(e6);
        obj.agregar(e7);
        obj.agregar(e8);
        obj.agregar(e9);
        obj.agregar(e10);
        obj.agregar(e11);
        obj.agregar(e12);

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 

        while (!salir) {
        	System.out.println("****MENÚ****");
        	System.out.println("Plantas: 1)Coca Codo Sinclair 2)Sopladora");
        	System.out.println("Región: 1)Costa 2)Sierra 3)Oriente");
        	System.out.println("Ciudad: 1)Guayaquil 2)Manta 3)Quito 4)Ambato 5)Tena 6)Nueva Loja");
        	System.out.println("");
        	System.out.println("1. Consumo total por planta");
            System.out.println("2. Consumo total por ciudad");
            System.out.println("3. Consumo total por planta y ciudad");
            System.out.println("4. Consumo y region");
            System.out.println("5. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        System.out.println("Ingrese un id de planta:");
                        int nu = sn.nextInt();
                        obj.ConsumoTotalPlanta(nu);

                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println("Ingrese un id de ciudad");
                        int n = sn.nextInt();
                        obj.ConsumoTotalCiudad(n);
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        System.out.println("Ingrese un id de planta:");
                        int n1 = sn.nextInt();
                        System.out.println("Ingrese un id de ciudad:");
                        int n2 = sn.nextInt();
                        obj.ConsumoTotalPlantaCiudad(n1, n2);
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        obj.ConsumoTotalRegion();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

}
