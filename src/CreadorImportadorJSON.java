public class CreadorImportadorJSON extends CreadorImportador {
    public ImportadorDatos crearImportador() {
        return new ImportadorJSON();
    }
}