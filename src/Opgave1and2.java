import java.util.ArrayList;

public class Opgave1and2 {

    public static void main(String[] args) {
        Driver driver = new Driver(60, "Ole");
        Driver driver1 = new Driver(32, "Brian-Ole");
        Car car = new Car("Audi",2012,"SUV","R8" );
        Car car1 = new Car("BMW",2021,"Sports-car","iX M60" );

        car.setDriver(driver);
        car1.setDriver(driver1);

       /* System.out.println(car);
        System.out.println(car.getDriver());
        System.out.println();
        System.out.println(car1);
        System.out.println(car1.getDriver());*/

        //opgave6 del 2
        Room room = new Room(4,6,8,16);
        Room room1 = new Room(2,1,2,9);
        Room room2 = new Room(7,5,9,18);
        ArrayList<Room> arrayList = new ArrayList<>();
        arrayList.add(room);
        arrayList.add(room1);
        arrayList.add(room2);
        Building building = new Building(room,20,4,true);
        System.out.println(room.getNumberOfLamps());
        System.out.println(building.getRooms());

        int rooms = 1;
        if(building.getNumberOfFloors()>rooms){
            System.out.println("This is an odd building");
        }else{
            System.out.println("Nope it's fine");
        }


    }
}
