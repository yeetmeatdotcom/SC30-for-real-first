class walker{
int x, y; //position
int size;
int speed;


//constructor
walker(int tempx, int tempy){
    x = tempx;
    y = tempy;
    size = 10;
    speed = 100;


}
void display(){
    fill(0);
rect(x,y,size,size);


}
void move(int dir) {
    if (dir == 0) {
      y = y - speed; // Move up
    
    
    } else if (dir == 1) {
      x = x + speed; // Move right
    
    
    } else if (dir == 2) {
      y = y + speed; // Move down
    
    
    } else if (dir == 3) {
      x = x - speed; // Move left
    
    
    }
  }
}