package com.cbfacademy;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FileExtension {
    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("Filename cannot be null or empty.");
        }
        return filename.endsWith(".java");
    }
    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> result = new HashMap<>();
        for (String filename : filenames) {
            try {
                if (filename == null) {
                    result.put(filename, -1);
                } else {
                    result.put(filename, check(filename) ? 1 : 0);
                }
            } catch (FilenameException e) {
                result.put(filename, -1);
            }
        }
        return result;
    }
}




//