import java.io.IOException;

public interface Importable {
    /** * Every day will import data from file.
     *@return Object[] - extracted objects from file.  *@exception IOException  - if file doesn't exists or *some IO error occurs.
     */
    public Object[] importDataFromFile() throws IOException;
}
