
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LDS-08
 */
public class FlysCL {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Clienttedatos ob1[]=new Clienttedatos[12];
        info_de_vuelo ob2[]=new info_de_vuelo[5];
        
        int opc=0,pre1,j=0,aux=0;
       aux=vuelos(ob2);
       
        borrar();
        while(opc!=5){
         empresa();
         
            System.out.println("Estas registrado? si...1 no....2");
            pre1=pregR();
            if(pre1==2){
                j++;
                Registro(ob1,j);
            }else{
                while(login(ob1,j)==0){
                login(ob1,j);
                }
            }
            menu();
            opc=pregR();
            switch(opc){
                case 1:
                    menu2();
                   opc=pregR();
                   switch(opc){
                       case 1:
                           hora(ob2,aux);
                       break;
                       case 2:
                           tarifa(ob2,aux);
                       break;
                       case 3:
                           info(ob2,aux);
                        break;
                   }
                break;
                case 2:
                    reserva(ob2,aux);
                break;
                case 3:
                   billetes(ob2,ob1); 
                break;
                case 4:
                Registro(ob1,j);
                break;
                case 5:
                    System.out.println("Gracias por usar FlyAirlines");
                break;
                   
            }
       
            borrar();
        }
        
        
        
       
    }
    public static void Registro(Clienttedatos ob1[],int j){
        
            Scanner sc = new Scanner(System.in);
            String usu,contra,nom,ape,nac;
            int ed;
            
            for (int i = j-1; i < j; i++) {
               
            System.out.println("Introduce tu usuario");
            usu=sc.nextLine();
           
            System.out.println("Contraseña");
            contra=sc.nextLine();
           
            System.out.println("Nommbre");
            nom=sc.nextLine();
            System.out.println("Apellido");
            ape=sc.nextLine();
         
            System.out.println("Nacimiento");
            nac=sc.nextLine();
            
            System.out.println("edad");
            ed=sc.nextInt();
            ob1[i]=new Clienttedatos(usu,nom,ape,nac,ed,contra);
        }    
      
    }

    /**
    
     */
    public static int vuelos( info_de_vuelo ob2[]) throws IOException{
        
        
            Scanner sc = new Scanner(System.in);
           
            int a=0,aux=0;
            String destino = null,aereo=null,ciudades=null,tipo=null,categoria=null,fecha=null,horar=null,text=null;
            double precios=0;
            int folio = 0,asine=0;
         for (int k = 0; k < 2; k++) {
             System.out.println("Aerolinea");
              aereo=(JOptionPane.showInputDialog("Escribe una aereolinea"));
    
            for (int i = 0; i <2; i++) {
                

            text=((JOptionPane.showInputDialog("Folio")));
            folio=Integer.parseInt(text);
          
            destino=((JOptionPane.showInputDialog("Destino")));
            
             ciudades=((JOptionPane.showInputDialog("Ciudades")));
        
            tipo=((JOptionPane.showInputDialog("tipo")));
         
            categoria=((JOptionPane.showInputDialog("categoria")));
         
    
            fecha=((JOptionPane.showInputDialog("fecha")));
            
           
            horar=((JOptionPane.showInputDialog("hoarrios")));
         
            text=((JOptionPane.showInputDialog("Precio")));
            precios=Integer.parseInt(text);
            text=((JOptionPane.showInputDialog("Asientos dipsonibles")));
            asine=Integer.parseInt(text);
            
            System.out.println("Registro de vuelo hecho....\n");
            
            ob2[i]=new info_de_vuelo(folio,destino,aereo,fecha,tipo,categoria,horar,ciudades,precios,asine);
        }
        
              aux++;
            System.out.println("desea detener regsitro? si...1 no...2");
                a=sc.nextInt();
                if(a==1){
                   k=2;
                }else{
                    borrar();
                }
                
      }
         
      return aux;
    }
    public static int login(Clienttedatos ob1[],int j){
     
         Scanner sc = new Scanner(System.in);
         int a=0;
         String usu,cont;
            System.out.println("--------------------");
            System.out.println("Introduce tu suario");
            usu=sc.nextLine();
            System.out.println("Introduce tu contraseña");
            cont=sc.nextLine();
            System.out.println("----------------------");
        for (int i = 0; i <j; i++) {
            if(usu.equals(ob1[i].getUsuario()) && cont.equals(ob1[i].getContraseña())){
              a=1;
                
            }else{
                a=0;
            }
        }
        if(a==1){
            System.out.println("Acceso permitido");
        }else{
            System.out.println("Acceso denegado intentalo de nuevo");
        }
         
          return a;
          
    }
    public static void empresa(){
        System.out.println("------------------------------------");
        System.out.println("Bienvenido al servicio FlyAirLines");
        System.out.println("------------------------------------");
    }
    public static void menu(){
        System.out.println("Selecciona la opcion deseada........");
        System.out.println("------------------------------------");
        System.out.println("Consulta de vuelos......1");
        System.out.println("Reserva de vuelos.......2");
        System.out.println("Compra de billetes......3");
        System.out.println("Modificar datos.........4");
        System.out.println("Salir...................5");
        System.out.println("------------------------------------");
    }
     public static void menu2(){
        System.out.println("Selecciona la opcion deseada........");
        System.out.println("------------------------------------");
        System.out.println("Hoarios de vuelos......1");
        System.out.println("tarifa de vuelos.......2");
        System.out.println("Info de vuelos......3");
        System.out.println("regresar...................4");
        System.out.println("------------------------------------");
    }
    public static int pregR(){
        Scanner sc = new Scanner(System.in);
       int a=0;
       a=sc.nextInt();
      return a;
    }
     public static void borrar() throws IOException{
          System.out.println("Presiona enter para continuar...");
       System.in.read();
         for (int i = 0; i < 24; i++) {
             System.out.println();
         }
      
       System.out.println();
    }
 
    public static void hora(info_de_vuelo ob2[], int aux){
        
      mostrar(ob2,aux);
         
    }
    public static void mostrar(info_de_vuelo ob2[], int aux){
    for (int i = 0; i <aux; i++) {
             for (int j = 0; j < 2; j++) {
                 System.out.println("----------------------------------------------------------");
                 System.out.println("NUnemro de vuelo "+j);
                 System.out.println("Aerolinea "+ob2[i].getAereolinea());
                 System.out.println("Destino: "+ob2[j].getDestino());
                 System.out.println("Ciudades "+ob2[j].getCiudades()+" hora :"+ob2[j].getHorarios());
                 System.out.println("Precio "+ob2[j].getPrecio()+" $"+"Dsiponibles "+ob2[j].getAsientos());
                 System.out.println("----------------------------------------------------------");
                 System.out.println("\n");
                 
                 
             }
        }
}
    public static void tarifa(info_de_vuelo ob2[] ,int aux){
        double menor=0,precio;
         
       for (int i = 0; i <aux; i++) {
             for (int j = 0; j < 2; j++) {
             ob2[j].comparar();
                 
                 
             }
        }
       mostrar(ob2,aux);
    }
    public static void info(info_de_vuelo[] ob2 ,int aux){
    preguntas ob3=new preguntas();
    Scanner sc = new Scanner(System.in);
    String fecha,cat,hor,aere;
    int a=0,opc;
        System.out.println("Desea un filtro en especial? si..1 no..2");
        a=pregR();
        if(a==1){
            System.out.println("Fecha.....1");
            System.out.println("categoria.2");
            System.out.println("horario...3");
            System.out.println("Aereoline.4");
            System.out.println("seleciona una opcion");
            opc=pregR();
            switch(opc){
                case 1:
                    System.out.println("introdusca la fecha");
                    fecha=sc.nextLine();
                      for (int i = 0; i < aux; i++) {
                            for (int j = 0; j < 2; j++) {
                                      if(fecha.equals(ob2[j].getFecha())){
                                              mostrar(ob2,aux);
                                      }
                                     }
                      }
                break;
                 case 2:
                     System.out.println("introdusca el categoria");
                      cat=sc.nextLine();
                    for (int i = 0; i < aux; i++) {
                            for (int j = 0; j < 2; j++) {
                                      if(cat.equals(ob2[j].getCategoriaA())){
                                          mostrar(ob2,aux);
                                      }
                                     }
                      }
                break;
                 case 3:
                     System.out.println("introdusca la horaio");
                    hor=sc.nextLine();
                    for (int i = 0; i < aux; i++) {
                            for (int j = 0; j < 2; j++) {
                                      if(hor.equals(ob2[j].getHorarios())){
                                       mostrar(ob2,aux);
                                      }
                                     }
                      }
                break;
                 case 4:
                     System.out.println("introdusca la aereolinea");
                    aere=sc.nextLine();
                    for (int i = 0; i < aux; i++) {
                            for (int j = 0; j < 2; j++) {
                                      if(aere.equals(ob2[j].getAereolinea())){
                                          mostrar(ob2,aux);
                                      }
                                     }
                      }
                break;
            }
        }else{
             mostrar(ob2,aux);
        }
        
        
        
    }
    public static void reserva(info_de_vuelo[] ob2,int aux)throws IOException{
        Scanner sc = new Scanner(System.in);
        int preg=0,vue=0;
          reserva ob3=new reserva(0,"","","","","");
          mostrar(ob2,aux);
        System.out.println("Vuelo que dese areservar");
        vue=sc.nextInt();
        System.out.println("cuantos vuelos desea reservar?");
        preg=sc.nextInt();
        

        for (int i = 0; i < preg; i++) {
         
        System.out.println("fecha");
        sc.nextLine();
        ob3.setFecha(sc.nextLine());
        System.out.println("Reservar asientos");
        ob3.setNumeroasientos(sc.nextInt());
        ob2[vue].setAsientos(ob2[vue].getAsientos()-ob3.getNumeroasientos());
        System.out.println("Listo asiento reservado");
            borrar();
        }
    
    }
    public static void billetes(info_de_vuelo[] ob2, Clienttedatos ob1[])throws IOException{
          Scanner sc = new Scanner(System.in);
       compra ob3=new compra(0,"","","","","");
      
        System.out.println("introduce tu tarjeta");
        ob3.setTarjeta(sc.nextLine());
   
        if(ob3.getTarjeta().equals(ob3.getTarjeta())){
            System.out.println("Cuantos billetes deseas comprar");
            ob3.setBilletes(sc.nextInt());
          
        }
    }
    
}
