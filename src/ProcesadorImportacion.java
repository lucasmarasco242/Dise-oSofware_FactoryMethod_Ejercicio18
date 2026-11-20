public class ProcesadorImportacion {
    private CreadorImportador creador;

    public ProcesadorImportacion(CreadorImportador creador) {
        this.creador = creador;
    }

    public void ejecutarImportacion(String origen) {
        ImportadorDatos importador = creador.crearImportador();
        importador.importar(origen);
    }
}