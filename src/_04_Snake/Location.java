package _04_Snake;

public class Location {
int x;
int y;

public Location(int x, int y) {
	this.x = x;
	this.y = y;
}
public void getX(int x) {
	this.x = x;
}
public void getY(int y) {
	this.y = y;
}
public boolean equals(int x, int y) {
	boolean match = false;
	if(this.x == x & this.y == y) {
		match = true;
	}
	return match;
}

}
