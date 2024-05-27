public class App {
    public static void main(String[] args) throws Exception {
        
//declaring the object
Ball[] BallGroup;
int pos = 0;

void setup() {
    size(1700, 600);
    BallGroup = new Ball[1000];
}

void draw() {
    background(70, 30, 50);
    for (int i = 0; i <pos; i++){
        BallGroup[i].display();
        BallGroup[i].move();
    }
}

void mousePressed(){

//creates a new object at this array position
if (pos < BallGroup.length){
BallGroup[pos] = new Ball(mouseX,mouseY,100);
pos++;


}

}




    }
}
