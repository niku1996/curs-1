public class Solution {
    public static String Solution
    public static void main(String[] args) {
        Idea idea = new Idea();
        printidea(idea);
        KissMyShinyMetalAss kmsma = new KissMyShinyMetalAss();
        System.out.println(kmsma);
    }
    public static void printidea(Idea idea){
        System.out.println(idea.getDescription());
    }
    public static class Idea{
        public String getDescription(){
            return "Something";
        }
    }
    public static class KissMyShinyMetalAss {

    }
}
