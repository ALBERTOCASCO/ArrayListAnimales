/*
 * UNIANDES-PUYO
 * SISTEMAS FACTURACION 2016
 * 23/05/2016
 */
package arraylistanimales;


import java.text.ParseException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;


/**
 * ALBERTO CASCO
 * OCTAVO SEMESTRE
 */
public class ArrayListAnimales {

    public static void main(String[] args) throws ParseException {
        ArrayList<Animales> animal = new ArrayList<Animales>();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        
        Animales a0= new Animales(1,"Perro",formateador.parse("26-05-2016"),20,Animales.clase.Vertebrado,Animales.tipo.mamiferos);
        Animales a1= new Animales(2,"Caballo",formateador.parse("16-03-2016"),380,Animales.clase.Vertebrado,Animales.tipo.mamiferos);
        Animales a2= new Animales(3,"Cocodrilo",formateador.parse("14-08-2016"),1700,Animales.clase.Vertebrado,Animales.tipo.oviparos);
        Animales a3= new Animales(4,"Pinguino",formateador.parse("23-11-2016"),35,Animales.clase.Vertebrado,Animales.tipo.oviparos);
        Animales a4= new Animales(5,"Chancho",formateador.parse("19-02-2016"),100,Animales.clase.Vertebrado,Animales.tipo.mamiferos);
        Animales a5= new Animales(6,"Gallina",formateador.parse("21-12-2016"),5,Animales.clase.Vertebrado,Animales.tipo.oviparos);
        Animales a6= new Animales(7,"Avestruz",formateador.parse("16-05-2016"),120,Animales.clase.Vertebrado,Animales.tipo.oviparos);
        Animales a7= new Animales(8,"Pato",formateador.parse("18-06-2016"),4,Animales.clase.Vertebrado,Animales.tipo.oviparos);
        Animales a8= new Animales(9,"Loro",formateador.parse("12-09-2016"),2,Animales.clase.Vertebrado,Animales.tipo.oviparos);
        Animales a9= new Animales(10,"Conejo",formateador.parse("30-07-2016"),3,Animales.clase.Vertebrado,Animales.tipo.mamiferos);
       
        animal.add(a0);
        animal.add(a1);
        animal.add(a2);
        animal.add(a3);
        animal.add(a4);
        animal.add(a5);
        animal.add(a6);
        animal.add(a7);
        animal.add(a8);
        animal.add(a9);
        
        imprimir(animal);
        
        }
    
        public static void imprimir(ArrayList<Animales>p)
        {
            for (Animales animal : p) {
                
        System.out.println("******************"); 
        System.out.println("Id: " + animal.getId());    
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Apareamiento: " + animal.getApareamiento());
        System.out.println("Peso: " + animal.getPeso());
        System.out.println("Clase: " + animal.getClase());
        System.out.println("Tipo: " + animal.getTipo());
        System.out.println("");
        
        
        }
    }
}
