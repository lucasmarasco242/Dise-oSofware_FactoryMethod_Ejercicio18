public class ImportadorCSV implements ImportadorDatos {
    public void importar(String origen) {
        System.out.println("[CSV] Leyendo registros separados por coma desde: " + origen);
    }
}