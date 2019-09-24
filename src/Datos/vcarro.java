
package Datos;


public class vcarro {
    private int idcarro;
    private String placa;
    private String marca;
    private String modelo;
    private double motor;
    private int cilindro;
    private String color;
    private int anio;
    private int puertas;
    private String tipo;
    private String estado;
    private double precio;
    private String descripcion;

    public vcarro(int idcarro, String placa, String marca, String modelo, double motor, int cilindro, String color, int anio, int puertas, String tipo, String estado, double precio, String descripcion) {
        this.idcarro = idcarro;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.cilindro = cilindro;
        this.color = color;
        this.anio = anio;
        this.puertas = puertas;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public vcarro(){
    
    }

    public int getIdcarro() {
        return idcarro;
    }

    public void setIdcarro(int idcarro) {
        this.idcarro = idcarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getCilindro() {
        return cilindro;
    }

    public void setCilindro(int cilindro) {
        this.cilindro = cilindro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
