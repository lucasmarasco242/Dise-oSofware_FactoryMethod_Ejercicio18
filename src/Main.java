public class Main {
    public static void main(String[] args) {
        ProcesadorImportacion procesadorCSV = new ProcesadorImportacion(new CreadorImportadorCSV());
        procesadorCSV.ejecutarImportacion("clientes.csv");

        ProcesadorImportacion procesadorXML = new ProcesadorImportacion(new CreadorImportadorXML());
        procesadorXML.ejecutarImportacion("catalogo.xml");

        ProcesadorImportacion procesadorJSON = new ProcesadorImportacion(new CreadorImportadorJSON());
        procesadorJSON.ejecutarImportacion("ordenes.json");
    }
}