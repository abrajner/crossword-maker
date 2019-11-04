package abrajner;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordsDefinitionParser {
    private Map<String, String> definitionsWords;
    private File definitionsFile;
    private String word;
    private String definition;

    public WordsDefinitionParser(String fileName) throws IOException {
        openFile(fileName);
        converteLineToDefinitionWordMap(readFromFile(getDefinitionsFile()));
    }

    public void setDefinitionsWords(Map<String, String> definitionsWords) {
        this.definitionsWords = definitionsWords;
    }

    public Map<String, String> getDefinitionsWords() {
        return definitionsWords;
    }

    public File getDefinitionsFile() {
        return definitionsFile;
    }

    public void setDefinitionsFile(File definitionsFile) {
        this.definitionsFile = definitionsFile;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    private void openFile(String file) {
        File openFile = new File(file);
        setDefinitionsFile(openFile);
    }

    private List<String> readFromFile(File file) throws IOException {
        Reader reader = new FileReader(file);
        BufferedReader buff = new BufferedReader(reader);
        List<String> collectedLines = buff.lines().collect(Collectors.toList());
        buff.close();

        return collectedLines;
    }

    private String[] separateWordsAndDefinitions (String lineFromFile){
        Pattern compiledPattern = Pattern.compile("([^\\s]+)\\s?\\|(.+).*");
        Matcher matcher = compiledPattern.matcher(lineFromFile);

        matcher.matches();
        setWord(matcher.group(1));
        setDefinition(matcher.group(2));

        return new String[] {getWord(), getDefinition()};
    }

    private void converteLineToDefinitionWordMap (List<String> linesFromFile){
        Map<String, String> tempMapperWordsDefinitions = new HashMap<String, String>();

        linesFromFile.forEach(line -> {
            separateWordsAndDefinitions(line);
            tempMapperWordsDefinitions.put(getWord(),getDefinition());
        });

        setDefinitionsWords(tempMapperWordsDefinitions);
    }
}