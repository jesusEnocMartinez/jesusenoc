
public class Materia {
    
     int id;
     String nombre;
     String creditos;
     String area ;
     boolean  disponible ;

    public Materia(int id, String nombre, String creditos, String area, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
        this.area = area;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
     
}
