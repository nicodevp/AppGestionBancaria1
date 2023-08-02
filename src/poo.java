// Sobrecarga de operaciones

class Auto {

    // -- ATRIBUTOS --
    int velocidad;

    // -- METODOS --
    void acelerar(){
        velocidad += 10;

    }

    void acelerar(int km){
        velocidad += km;
    }

    void acelerar(int km, boolean tieneNitro){
        if(!tieneNitro){
            acelerar(km);
        } else {
            acelerar(km * 2);
        }
    }
}


// Representación de Ob. con Relaciones Simples

class ClientePyme {
    String razonsocial;
    CuentaCorriente cuenta;

}

class Banco {
    String nombre;
    GerenteGeneral gerente; // Utiliza otra clase dentro de la clase

}


// Representación de Ob. con Relaciones Múltiples

class ClienteCorporacion {

    // -- ATRIBUTOS --
    String razonSocial;
    Collection<CuentaCorriente> cuentas;
    // Utiliza de "cuentas" Collection que saca múltiples cuentas corrientes de la misma

}

class Banco {

    // -- ATRIBUTOS --
    String nombre;
    GerenteGeneral gerente;
    Collection<Sucursal> sucursales;
    Collection<DirectorRegional> directores;
}

// Representación de VISIBILIDAD

class Moto {

    // atributos
    private /* privado solo se modifica desde la clase */ int velocidad;

    // metodos
    public void acelerar() { // publico, se puede modificar desde otras clases y acceder a ella
        velocidad += 10;
    }
}


// EJEMPLO ENCAPSULAMIENTO Y CREACIÓN COMPLETA DE CLASES

class CuentaBancaria {
    private float saldo;
    public void depositar(float monto){
        saldo += monto;
    }
    public void debitar(float monto){
        if(saldo >= monto){
            saldo -= monto;
        }
    }
}

class Principal {
    public static void main() {
        CuentaBancaria cuenta = new CuentaBancaria();
        // cuenta.saldo = 10000; -> esto no funciona debido a que es privado
        cuenta.depositar(10000);
    }
}

// SETTERS Y GETTERS Representación

class Banco {
    private String nombre;
    private int cantidadEmpleados;

    public void setNombre(String n){ // permite cambiar el nombre del Banco METODO SET
        nombre = n;
    }

    public String getNombre(){ // devuelve el la variable "nombre" METODO GET
        return nombre;
    }
}