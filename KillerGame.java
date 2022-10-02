import java.util.*;
import java.time.*;
import java.time.format.*;

class KillerGame {
    public Player[] players;
    public KillerGame(Player[] players){
       this.players = players;
    }
    public static void main(String args[]){
        // Player[] players = KillerGameImporter.import('players.csv')

        Player[] players = new Player[5];
        players[0] = new Player("Joe", 9);
        players[1] = new Player("Bob", 9);
        players[2] = new Player("Addie", 9);
        players[3] = new Player("Yes", 9);
        players[4] = new Player("Q", 9);

        KillerGame game = new KillerGame(players);
        game.log();
        KillerGame.shuffle(game);
        game.log();
        game.assign();
        game.log();
        players[2].isAlive = false;
        game.log();
    }

    public void log(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        String formattedTime = dtf.format(now);
        System.out.println(formattedTime);
        for(Player p: this.players){
            if(p.killer != null && p.target != null){
                System.out.println(p.name + " " + p.grade + " " + p.isAlive + " " + p.getKiller().name + " " + p.getTarget().name);
            } else {
                System.out.println(p.name + " " + p.grade + " " + p.isAlive + " No Assignments");
            }
        }
    }

    public markDead()

    public void shuffle(){
        KillerGame.shuffle(this);
    }

    public static void shuffle(KillerGame game){
        ArrayList<Player> pool = new ArrayList<Player>(Arrays.asList(game.players));
        ArrayList<Player> randomized = new ArrayList<Player>();
        while(pool.size() > 0){
            int index = (int)(Math.floor(Math.random() * pool.size()));
            randomized.add(pool.get(index));
            pool.remove(index);
        }
        game.players = randomized.toArray(new Player[game.players.length]); 
    }

    public void assign(){
        for(int i = 0; i < this.players.length; i++){
            if(i == 0){
                players[i].killer = players[this.players.length - 1];
            } else {
                players[i].killer = players[i-1];
            }
            if(i == this.players.length - 1){
                players[i].target = players[0];
            } else {
                players[i].target = players[i+1];
            }
        }
    }
}