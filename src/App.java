public class App {

    MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

    public static void main(String[] args) {
        App app = new App();
        int[] arreglo = {3, 7, 5, 9, 1};
        int resultado = app.metodosBusqueda.busquedaLineal(arreglo);

        if (resultado != -1) {
            System.out.println("Valor encontrado en el índice: " + resultado);
        } else {
            System.out.println("Valor no encontrado.");
        }
    }
}
