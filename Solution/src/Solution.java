public class Solution {
    public static void main(String[] args) {
        Idea idea = new Idea();
        printidea(idea);
    }
    public static void printidea(Idea idea){
        System.out.println(idea.getDescription());
    }
    public static class Idea{
        public String getDescription(){
            return "Something";
        }
    }
}
