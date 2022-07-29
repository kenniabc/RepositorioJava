package poo_practica;

public class Cuenta {
    private String titular;
    private double cantidad;

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;

    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getTitular() {
        return titular;

    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad + this.cantidad;
            System.out.println(this.cantidad);
        }else {
            System.out.println(this.cantidad);

        }

    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
            System.out.println(this.cantidad);

        } else {
            this.cantidad = this.cantidad - cantidad;
            System.out.println(this.cantidad);

        }
    }


}
