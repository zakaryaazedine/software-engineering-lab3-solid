package problem5.problem5after;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class CsvStudentRepository implements StudentRepository{
    private final Path file;

    public CsvStudentRepository(String filename){
        file = Path.of(filename);
    }

    @Override
    public boolean exists(String cne){
        if (!Files.exists(file)) return false;
        try{
            List<String> lines = Files.readAllLines(file);
            for (int i = 0; i < lines.size(); i++) if (lines.get(i).startsWith(csvValue(cne) + ",")) return true;
            return false;
        } catch (IOException e){
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void save(String cne, String name, String email){
        String line = csvValue(cne) + "," + csvValue(name) + "," + csvValue(email) + System.lineSeparator();
        try{
            Files.writeString(file, line, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e){
            throw new UncheckedIOException(e);
        }
    }

    private String csvValue(String value){
        return "\"" + value.replace("\"", "\"\"") + "\"";
    }
}
