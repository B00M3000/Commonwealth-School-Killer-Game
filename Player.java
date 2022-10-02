class Player {
    public String name;
    public int grade;
    public boolean isAlive;
    public Player target;
    public Player killer;
    public Player(String name, int grade){
        this.name = name;
        this.grade = grade;
        this.isAlive = true;
    }
    public Player getKiller(){
        Player current = this;
        do {
            current = current.killer; 
        } while (!current.isAlive);
        return current;
    }
    public Player getTarget(){
        Player current = this;
        do {
            current = current.target; 
        } while (!current.isAlive);
        return current;
    }
}