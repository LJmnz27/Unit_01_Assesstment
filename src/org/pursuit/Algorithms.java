package org.pursuit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Algorithms implements DataStructures {


  @Override
  public char[] stringToCharArray(String word) {

    char[] ok = new char[word.charAt(word.length() - 1)];

    return ok;
  }
  @Override
  public ArrayList<Integer> multiplicationTableList(int number) {
    int count = 0;
    ArrayList<Integer> ok = null;

    for (int i = 0; i <= 10; i++) {
      count++;
      if (count <= 10) {
        ok.add(count);
      }
    }
    return ok;
  }
  @Override
  public HashMap<String, Integer> wordLength(String[] wordArray) {
    HashMap<String,Integer> ok = new HashMap<>();
    ok.put(wordArray[wordArray.length],wordArray.length);
    return ok;
  }


  @Override
  public HashSet<Character> uniqueCharacters(String word) {
    HashSet<Character> ok = new HashSet<>();
    ok.add(word.charAt(word.length()-1));

    return ok;
  }
}
