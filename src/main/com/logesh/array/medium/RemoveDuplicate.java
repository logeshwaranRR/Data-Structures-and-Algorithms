package src.main.com.logesh.array.medium;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "Good Morning";
        removeDuplicates(s);

    }
    static void removeDuplicates(String s){
        StringBuilder sb = new StringBuilder();
        boolean[] seen=new boolean[256];
        for(char c:s.toCharArray()){
            if(c==' '){
                sb.append(c);
            }
            char lower = Character.toLowerCase(c);
            if(!seen[lower]){
                sb.append(c);
                seen[lower]=true;
            }

        }
        System.out.println(sb);
    }
}
