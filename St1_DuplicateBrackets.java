import java.util.*;


public class DupBrackets {
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    String exp = scn.nextLine();
    String ans = dupBrac(exp);
    System.out.println(ans);
  }

  public static String dupBrac(String exp){

    int pc = 0;
    for(int i=0;i<exp.length();i++){
      char ch = exp.charAt(i);

      Stack<Character> st = new Stack<>();
      
      if(ch == '('){
        st.push(ch);
        
      }
      else if(ch == ')'){
        while(st.size()>0 && st.peek()!= '('){
          pc++;
          st.pop();
        }
        if(pc == 0){
          return "YES";
        }
      }
      else{
        st.push(ch);
      }
    }
    
      return "NO";
    
  }
}