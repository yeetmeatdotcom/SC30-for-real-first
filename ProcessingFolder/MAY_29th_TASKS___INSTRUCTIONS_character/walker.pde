class walker {
  int x, y; // Position
  int size;
  int speed;

  // Constructor
  walker(int tempx, int tempy){
    x = tempx;
    y = tempy;
    size = 20; // Increase the size for better visibility
    speed = 5; // Initial speed
  }

  void display(){
    fill(0); // Fill color for the rectangle
    rect(x, y, size, size);
  }

  void move(int dir) {
    if (dir == 0) {
      y -= speed; // Move up
    } else if (dir == 1) {
      x += speed; // Move right
    } else if (dir == 2) {
      y += speed; // Move down
    } else if (dir == 3) {
      x -= speed; // Move left
    }
  }
}