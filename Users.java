

public class Users {
private int id;
private String username;
private int points;
private int wins;
private int losses;
public Users(int id, String username, int points, int wins, int losses){

    this.id = id;
    this.username = username;
    this.points = points;
    this.wins = wins;
    this.losses = losses;
}

public String getUsername(){
return username;
}
public void setUsername(String username){
    this.username = username;
}

public int getId(){
    return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getPoints(){
        return points;
        }
        public void setPoints(int points){
            this.points = points;
        }

        public int getWins(){
            return wins;
            }
            public void setWins(int wins){
                this.wins = wins;
            }
            public int getLosses(){
                return losses;
                }
                public void setLosses(int losses){
                    this.losses = losses;
                }
}