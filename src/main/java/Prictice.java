public class Prictice {

    public static void main(String[] args) {
        String[] words = {"funk", "chunk", "furry", "baconator"};
        //startsWith Method
        for(String w : words){
            if(w.startsWith("fu"))
                System.out.println(w + " starts with fu");
        }

        for(String w : words){
            if(w.endsWith("unk"))
                System.out.println(w + " ends with unk");
        }
    }
}
