package Models;

public class Pizzas {


    private String id;
    private String nombre;
    private String precio;
    private String localizacion;
    private String [] t_pizza= {"Pizza Napolitana","Pizza Predilecta","Pizza Vegana","Pizza Selecta"};
    private int [] p_pizza={12500,13800,15600,18600};


    public Pizzas()
    {


    }

    public Pizzas(String id, String nombre, String precio, String localizacion, String[] t_pizza, int[] p_pizza) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.localizacion = localizacion;
        this.t_pizza = t_pizza;
        this.p_pizza = p_pizza;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String[] getT_pizza() {
        return t_pizza;
    }

    public void setT_pizza(String[] t_pizza) {
        this.t_pizza = t_pizza;
    }

    public int[] getP_pizza() {
        return p_pizza;
    }

    public void setP_pizza(int[] p_pizza) {
        this.p_pizza = p_pizza;
    }

    @Override
    public String toString() {
        return nombre;
    }


}
