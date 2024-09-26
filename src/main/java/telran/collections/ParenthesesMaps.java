package telran.collections;

import java.util.Map;

public record ParenthesesMaps(Map<Character, Character> openCloseMap,
                              Map<Character, Character> closeOpenMap) {

    public ParenthesesMaps(Map<Character, Character> openCloseMap,
                           Map<Character, Character> closeOpenMap) {
        this.openCloseMap = openCloseMap;
        this.closeOpenMap = closeOpenMap;
    }

    
    public Map<Character, Character> getOpenCloseMap() {
        return openCloseMap;
    }

    public Map<Character, Character> getCloseOpenMap() {
        return closeOpenMap;
    }
}
