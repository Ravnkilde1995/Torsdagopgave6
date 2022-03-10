public class Room {
    //fields
    private int walls;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int numberOfDoors, int numberOfLamps, int walls, int numberOfWindows){
      this.numberOfDoors=numberOfDoors;
      this.numberOfLamps=numberOfLamps;
      this.numberOfWindows=numberOfWindows;
      this.walls=walls;
    }
    //methods
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors=numberOfDoors;
    }
    public int getNumberOfLamps(){
        return numberOfLamps;
    }
    public void setNumberOfLamps(int numberOfLamps){
        this.numberOfLamps=numberOfLamps;
    }
    public int getWalls() {
        return walls;
    }
    public void setWalls(int walls) {
        this.walls = walls;
    }
    public int getNumberOfWindows() {
        return numberOfWindows;
    }
    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    @Override
    public String toString() {
        return "Room{" +
                "walls=" + walls +
                ", numberOfDoors=" + numberOfDoors +
                ", numberOfLamps=" + numberOfLamps +
                ", numberOfWindows=" + numberOfWindows +
                '}';
    }
}
