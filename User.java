public class User {

    private String username;
    private int level;
    private int exp;
    public  User(String username, int level, int exp){
        super();
        this.username = username;
        this.level = level;
        this.exp = exp;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public int getExp(){
        return exp;
    }
    public void setExp(int exp){
        this.exp = exp;
    }
}
