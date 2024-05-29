class walker{
int x, y; //position
int size;
int speed;


//constructor
walker(int tempx, int tempy){
    x = tempx;
    y = tempy;
    size = 10;
    speed = 5;


}
void display(){
rect(x,y,size,size);


}
void move(int dir) {
    if (dir==1){
      y = y + speed;

    }

}


}