package com.smagin.codingforinterview.backtracking;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneralizedAbbrevation {
    public List<String> generilize(String word){
        List<String> strings = new ArrayList<>();
        Character[] characters = new Character[]{'a', 'b', 'c'};

        String newWord = generate(word, characters[new Random().nextInt(characters.length)]);
        strings.add(newWord);
        return strings;
    }

    public String generate(String word, Character randomCharacter){
        char[] characters = word.toCharArray();
        int randomCharacterInCharacters = new Random().nextInt(characters.length);

        characters[randomCharacterInCharacters]  = randomCharacter;
        String newWord = new StringBuilder().append(characters).toString();

        return newWord;
    }
}
