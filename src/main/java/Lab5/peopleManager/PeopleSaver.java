package Lab5.peopleManager;

import javax.swing.text.html.parser.Parser;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleSaver {
    public static List<People> load(Path path) throws IOException {
        List<People> ret=new ArrayList<>();
        Scanner in = new Scanner(path);
        while(in.hasNextLine()) {
            String linea = in.nextLine();
            String[] a = linea.split(";");
            ret.add(new People(a[0], a[1], Integer.parseInt(a[2]), a[3]));

        }
        in.close();
        return ret;
    }

    public static List<People> save(Path path, List<People> peoples) throws IOException {
        List<String> list=new ArrayList<>();
        for(People p: peoples){
            list.add(p.toCSV());
        }
        Files.write(path,list);
        return peoples;
    }
}
