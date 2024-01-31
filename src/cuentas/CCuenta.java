package cuentas;
    /**
    * Esta es la clase CCuenta que contiene métodos y atributos relacionados con una cuenta.
    */

public class CCuenta {
     /**
     * El nombre del titular de la cuenta.
     */
    private String nombre;
    
     /**
     * El número de la cuenta.
     */
    private String cuenta;
    
     /**
     * El saldo actual de la cuenta.
     */
    private double saldo;
    
     /**
     * El tipo de interés de la cuenta.
     */
    private double tipoInteres;

    
    /**
     * Constructor por defecto de la clase CCuenta.
     */
    
    public CCuenta() {
    }

    
    /**
     * Constructor de la clase CCuenta.
     * @param nom El nombre del titular de la cuenta.
     * @param cue El número de la cuenta.
     * @param sal El saldo inicial de la cuenta.
     * @param tipo El tipo de interés de la cuenta.
     */
    
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres = tipo;
    }

    
    
    /**
     * Devuelve el saldo actual de la cuenta.
     * @return El saldo de la cuenta.
     */
    
    public double estado()
    {
        return getSaldo();
    }
    
    
     /**
     * Ingresa una cantidad en la cuenta.
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    
    
    
    /**
     * Retira una cantidad de la cuenta.
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    
    
       /**
     * Obtiene el nombre del titular de la cuenta.
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    
    
      /**
     * Establece el nombre del titular de la cuenta.
     * @param nombre El nuevo nombre del titular de la cuenta.
     */
  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
     /**
     * Obtiene el número de la cuenta.
     * @return El número de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    
    
    
    /**
     * Establece el número de la cuenta.
     * @param cuenta El nuevo número de la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

     /**
     * Obtiene el saldo de la cuenta.
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    
      /**
     * Establece el saldo de la cuenta.
     * @param saldo El nuevo saldo de la cuenta.
     */
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   /**
     * Obtiene el tipo de interés de la cuenta.
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

     /**
     * Establece el tipo de interés de la cuenta.
     * @param tipoInteres El nuevo tipo de interés de la cuenta.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}