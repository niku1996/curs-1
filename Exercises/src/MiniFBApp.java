public class MiniFBApp {
    public static void main(String[] args) {
       User my_user = new User("Maxim");
       User close_user = new User("Florin");
       User common_user = new User("Gicu");
       BackPack backpack = new BackPack("Puma");
       my_user.addCloseFriend(close_user);
       my_user.addCommonFriend(common_user);
       System.out.println("FB users : " + User.total);
       my_user.putAccessorie(backpack);
       System.out.println(my_user);
       my_user.removeAccesorie(backpack);
       System.out.println(my_user);
    }
}

class User{
    static int total = 0;
    String name;
    int friends_count;

    Accessories new_accessorie = null;

    //Relations
    User close_friend;
    User common_friend;
    //Relations

    // + remove() option
    User(String name){
        this.name = name;
        this.friends_count = 0;
        total++;
    }
    void addCloseFriend( User cf){
        this.close_friend = cf;
        this.friends_count++;
    }
    void addCommonFriend( User cf){
        this.common_friend = cf;
        this.friends_count++;
    }
    void putAccessorie(Accessories a){
        this.new_accessorie = a;
    }
    void removeAccesorie(Accessories a){
        this.new_accessorie = null;
    }
    //if/esle  ?: -> null
    //fix that
    public String toString(){
        return "\n\n User : (" + this.name + ")" + "\n friends : (" + this.friends_count +
                "\n Friends " + close_friend + common_friend + " Accessories " + new_accessorie + ")";
    }
}
class Accessories{
}