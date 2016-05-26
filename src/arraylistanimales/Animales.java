/*
 * UNIANDES-PUYO
 * SISTEMAS FACTURACION 2016
 * 23/05/2016
 */
package arraylistanimales;
import java.util.Date;
/**
 * ALBERTO CASCO
 * OCTAVO SEMESTRE
 */
public class Animales {
    public enum clase {Vertebrado,Invertebrado};
    public enum tipo {oviparos,mamiferos};
    
   private int _id;
   private String _nombre;
   private Date _apareamiento ;
   private float _peso;
   private clase _clase;
   private tipo _tipo;

    public Animales() {
    }

    public Animales(int _id, String _nombre, Date _apareamiento, float _peso, clase _clase, tipo _tipo) {
        this._id = _id;
        this._nombre = _nombre;
        this._apareamiento = _apareamiento;
        this._peso = _peso;
        this._clase = _clase;
        this._tipo = _tipo;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public Date getApareamiento() {
        return _apareamiento;
    }

    public void setApareamiento(Date _apareamiento) {
        this._apareamiento = _apareamiento;
    }

    public float getPeso() {
        return _peso;
    }

    public void setPeso(float _peso) {
        this._peso = _peso;
    }

    public clase getClase() {
        return _clase;
    }

    public void setClase(clase _clase) {
        this._clase = _clase;
    }

    public tipo getTipo() {
        return _tipo;
    }

    public void setTipo(tipo _tipo) {
        this._tipo = _tipo;
    }
   
    
   
}
