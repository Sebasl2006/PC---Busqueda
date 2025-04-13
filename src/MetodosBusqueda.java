public class MetodosBusqueda {

    public int busquedaLineal(int[] arreglo) {
        int valorBuscado = 5; // Puedes cambiar el valor si quieres
        return busquedaRecursiva(arreglo, valorBuscado, 0);
    }

    private int busquedaRecursiva(int[] arreglo, int valorBuscado, int indice) {
        if (indice >= arreglo.length) {
            return -1; // Valor no encontrado
        }
        if (arreglo[indice] == valorBuscado) {
            return indice; // Valor encontrado
        }
        return busquedaRecursiva(arreglo, valorBuscado, indice + 1);
    }
}
