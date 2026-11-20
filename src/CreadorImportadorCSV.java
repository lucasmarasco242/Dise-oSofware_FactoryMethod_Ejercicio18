public class CreadorImportadorCSV extends CreadorImportador {
    public ImportadorDatos crearImportador() {
        return new ImportadorCSV();
    }
}