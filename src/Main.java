public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Libro rio = new Libro("rio", "eyder", 76);

        rio.LeerPagina();

        Estudiante alexander = new Estudiante("Eyder", 19, 11);
        alexander.estudiar();

        AccountBank nubank = new AccountBank(1892304, 10000, "Eyder Alexander");
        nubank.deposit(3000);
        nubank.withdraw(5784);

    }
}