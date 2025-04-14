package cuentas;

/**
 * Simulación de una cuenta real.
 * @author Evelyn Sherlyn
 * @version V1.0 14-04-2025
 */

public class CCuenta {
    /**
     * Esta clase simulará una cuenta con un usuario activo en él.
     * @example: Una cuenta -> Nombre: Evelyn Cuenta: 8320ND, Saldo: 0.29$ tipoInteres: 10%
     */

    /**
     * @param nombre Nombre titular de la cuenta.
     * @param cuenta Número de la cuenta.
     * @param saldo Saldo de la cuenta.
     * @param tipoInterés Interes aplicado en la cuenta.
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /*
    * Constructor vacio
    */
    public CCuenta()
    {
    }

    /**
     * Constructor
     * @param nom Ingresar nombre
     * @param cue Ingresas numero de la cuenta
     * @param sal Ingresar saldo
     * @param tipo Ingresar interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el saldo actual.
     * @return Saldo actual. (Su estado)
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método para ingresar salgo en la cuenta.
     * 
     * @param cantidad a ingresar
     * @throws Exception cuando se trata de ingresas una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar salgo en la cuenta.
     * 
     * @param cantidad a retirar
     * @throws Exception cuando es negativa la cantidad o menor a lo que hay
     * en estado.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Devuelve el nombre del titular
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Establece el nombre del titular-
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve  el numero de la cuenta
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta Establece el numero de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el tipo de interés de la cuenta.
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés Establece el tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
