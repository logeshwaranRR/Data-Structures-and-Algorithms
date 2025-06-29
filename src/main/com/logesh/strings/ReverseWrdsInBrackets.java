package src.main.com.logesh.strings;

public class ReverseWrdsInBrackets {
    public static void main(String[] args) {
        String str = "abc(def)gh";
        System.out.println(rev(str));
    }

    private static String rev(String str) {
        StringBuilder ans = new StringBuilder();
        int opn=0;
        int cls=0;
        StringBuilder sb =new StringBuilder();
//        char[] ch ={'(',')'};
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != '(' && str.charAt(i) != ')' &&opn ==0){
              ans.append(str.charAt(i));
              if(!sb.isEmpty()){
                  ans.append(sb.reverse());
                  sb=new StringBuilder();
              }
            }
            if(str.charAt(i) != '(' && str.charAt(i) != ')' &&opn>0){

                sb.append(str.charAt(i));
            }
//            if(str.charAt(i) != '(' && str.charAt(i) != ')' &&opn0){
//                sb.append(str.charAt(i));
//            }

             if(str.charAt(i) == '('){
                opn++;
            } else if (str.charAt(i) == ')') {
                opn--;
            }

            }
        return ans.toString();
        }
    }

