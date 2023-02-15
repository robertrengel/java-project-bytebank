public class CrearCuenta {
    public static void main(String[] args) {
   
        Cuenta cuentaRobert2 = new Cuenta(78);
        Cuenta cuentaRobert = new Cuenta(28);
        cuentaRobert.getTitular().setNombre("Robert");
        cuentaRobert.getTitular().setDocumento("123456789");
        cuentaRobert.getTitular().setDireccion("Calle 123");
        cuentaRobert.getTitular().setTelefono("123456789");
        cuentaRobert.getTitular().setEmail("robert@gmail.com");
        cuentaRobert.getTitular().setFechaNacimiento("01/01/1990");
        cuentaRobert.getTitular().setFechaRegistro("01/01/1990");
        cuentaRobert.getTitular().setFechaUltimoPago("01/01/1990");
        cuentaRobert.getTitular().setTipoCuenta("Efectivo");
        cuentaRobert.setNumero(123456789);
        cuentaRobert.getTitular().getPrestamo().setNumero(1);
        cuentaRobert.depositar(100);

        System.out.println();
        System.out.println("Nombre de cliente: " + cuentaRobert.getTitular().getNombre());
        System.out.println("Documento de cliente: " + cuentaRobert.getTitular().getDocumento());
        System.out.println("Direccion de cliente: " + cuentaRobert.getTitular().getDireccion());
        System.out.println("Telefono de cliente: " + cuentaRobert.getTitular().getTelefono());
        System.out.println("Email de cliente: " + cuentaRobert.getTitular().getEmail());
        System.out.println("Fecha de nacimiento de cliente: " + cuentaRobert.getTitular().getFechaNacimiento());
        System.out.println("Fecha de registro de cliente: " + cuentaRobert.getTitular().getFechaRegistro());
        System.out.println("Fecha de ultimo pago de cliente: " + cuentaRobert.getTitular().getFechaUltimoPago());
        System.out.println("Tipo de cuenta de cliente: " + cuentaRobert.getTitular().getTipoCuenta());
        System.out.println("Numero de cuenta: " + cuentaRobert.getNumero());
        System.out.println("Agencia de cuenta: " + cuentaRobert.getAgencia());
        System.out.println("Saldo de cuenta: " + cuentaRobert.getSaldo());
        System.out.println("Numero de prestamo: " + cuentaRobert.getTitular().getPrestamo().getNumero());
        System.out.println("NUmero de cuentas: " + Cuenta.getTotal());
        System.out.println("Saldo de cuenta Robert 2: " + cuentaRobert2.getSaldo());
        System.out.println();
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Runtime: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Classpath: " + System.getProperty("java.class.path"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Classpath URL: " + System.getProperty("java.class.path.url"));
        System.out.println();

       
    }


    
}
