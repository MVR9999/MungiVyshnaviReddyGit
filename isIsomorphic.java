import java.util.*;

class test
{
  public boolean isIsomorphic(String s, String t) 
  {
    if(s == null || t == null ) return false;
    if(s.length() != t.length()) return false;
    if(s.length() == 0 && t.length() == 0) return true;
        
    Map<Character, Character> sMap = new HashMap<>();
    Map<Character, Character> tMap = new HashMap<>();
    
    for(int i = 0; i < t.length(); i++) {
      Character sCh = s.charAt(i);
      Character tCh = t.charAt(i);
      
      Character sVal = sMap.get(sCh);
      Character tVal = tMap.get(tCh);

      System.out.println(sVal + "  " + tVal);
      
      if(sVal != null && sVal != tCh) return false;
      else if(tVal != null && tVal != sCh) return false;    
      else {
        sMap.put(sCh, tCh);
        tMap.put(tCh, sCh);
      }
    }      
    return true;
  }
 	
  public static void main(String [] args)
  {   
    Scanner sc = new Scanner(System.in);
    test obj = new test();
    String s = sc.next();
    String t = sc.next();
    System.out.println(obj.isIsomorphic(s,t)); 
  }
}