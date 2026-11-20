public class CreadorImportadorXML extends CreadorImportador {
    public ImportadorDatos crearImportador() {
        return new ImportadorXML();
    }
}