/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ED.Menu.Principal;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAM111
 */
public class EDMenuPrincipal {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Introduce una opcion");
        System.out.println("1.- CALCULADORA 2.- JUEGO BOTELLA 3.- PAR IMPAR 4.- 5.- SALIR");
        int opcionmenuprincipal=teclado.nextInt();
        
        do{
            switch(opcionmenuprincipal){
                case 1: //CALCULADORA (JORGE)
                    break;
                    
                case 2: //JUEGO RELLENAR BOTELLA (ROMAN)
                        int intronumero, contador = 0, apuesta;
                        char seguir = 0;
                        
                        Random r1 = new Random();

                        int mlrandom = r1.nextInt(1000);
                        System.out.println("Cuanto dinero quiere depositar");
                        int dinero = teclado.nextInt();
                        System.out.println("¿Cuanto desea apostar?");
                        apuesta = teclado.nextInt();
                        System.out.println(mlrandom);

                        // REPETIR HASTA QUE DIGAS NO.
                        do {
                            if (contador < mlrandom) {
                                System.out.println("Introduce un numero entre 1 y 1000 hasta llenar la botella");
                                intronumero = teclado.nextInt();
                                contador += intronumero;

                                System.out.println("¿Desea continuar? (S/N)");
                                seguir = teclado.next().charAt(0);
                            }

                        } while (seguir == 's' || seguir == 'S');

                        System.out.println("La botella tiene " + mlrandom + "ml y usted ha llenado " + contador + "ml");

                        if (contador == mlrandom) {
                            System.out.println("Has ganado " + (apuesta * 2) + "€");
                        } else if (contador > mlrandom) {
                            System.out.println("SE HA DERRAMADO EL AGUA DE LA BOTELLA");
                            System.out.println("Perdiste " + apuesta + "€");
                            dinero = dinero - apuesta;
                        } else if (contador < mlrandom) {
                            System.out.println("NO HAS LLEGADO A RELLENAR");
                            System.out.println("Perdiste " + apuesta + "€");
                        }

                    
                    break;
                    
                case 3: //JUEGO PAR O IMPAR (EDU)     
                        Random r=new Random();

                        int random=r.nextInt(1000);

                        System.out.println("Elije una opcion 1.- PAR 2.- IMPAR");
                        int opcion=teclado.nextInt();

                        switch(opcion){
                            case 1:
                                if(random%2==0){
                                    System.out.println("Es PAR, ha ganado");
                                }else{
                                    System.out.println("Es IMPAR, ha perdido");
                                }
                                break;
                            case 2:
                                if(random%2!=0){
                                    System.out.println("Es IMPAR, ha ganado");
                                }
                                else{
                                    System.out.println("Es PAR, ha perdido");
                                }
                                break;
                        }
                    break;
                
                case 4: // (ALEX)
                    break;
                    
                    
                case 5: //SALIR
                    break;
        
    }
             System.out.println("Introduce una opcion");
             System.out.println("1.- CALCULADORA 2.- JUEGO BOTELLA 3.- PAR IMPAR 4.- 5.- SALIR");
             opcionmenuprincipal=teclado.nextInt();
        }while(opcionmenuprincipal!=5);
        
    }//main
    
}//final