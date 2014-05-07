
public class Maze2DArray {
	int size;
	Room[][] rooms;
	ArrayStack pastRooms = new ArrayStack();
	
	private enum Room {WALL,PATH,DOOR,START,EXIT}
	
	public Maze2DArray(int size) {
		this.size = size;
		this.rooms = buildArray(size);
	}
	
	private Room[][] buildArray(int size) {
		Room[][] rooms = new Room[size][size];
		for (Room [] row : rooms) {
			for (int i = 0; i < size; i++)
				row[i] = Room.WALL;
		}
		return rooms;
	}
	
	public String toString() {
		return "";	
	}
	
	

}
