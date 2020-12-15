package liquibase.dbdoc;

import liquibase.change.Change;
import liquibase.database.Database;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.List;

public class ColumnWriter extends HTMLWriter {


    public ColumnWriter(Path rootOutputDir, Database database) {
        super(rootOutputDir.resolve("columns"), database);
    }

    @Override
    protected String createTitle(Object object) {
        return "Changes affecting column \""+object.toString() + "\"";
    }

    @Override
    protected void writeCustomHTML(Writer fileWriter, Object object, List<Change> changes, Database database) throws IOException {
    }
}
