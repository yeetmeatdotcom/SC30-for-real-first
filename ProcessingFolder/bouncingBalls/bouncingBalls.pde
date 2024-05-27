
//declaring the object
ArrayList<Ball> BallGroup = new ArrayList<Ball>();
//Original Array code stuff
//Ball[] BallGroup;
//int pos = 0;

void setup() {
    size(1700, 700);
    //Original Array code stuff
    // BallGroup = new Ball[1000];
}
// updating the ball positions
void draw() {
    background(70, 30, 50);


    //old
    //for (int i = 0; i < BallGroup.size(); i++){

        //BallGroup.get(i).display();
        //BallGroup.get(i).move();


        //Original Array code stuff
        // BallGroup.get(i).display();
        // BallGroup.get(i).move();
    

    for (Ball theBall : BallGroup) {
        
        theBall.move();
    //Check collison
        for (Ball otherBall : BallGroup){
        if (theBall != otherBall){

        
            theBall.checkCollision(otherBall);
        }


        }
        theBall.display();
    }
}
//}

void mousePressed(){
//Creates a new object at the end of the ArrayList
BallGroup.add(new Ball(mouseX, mouseY, 100,width,height));

//creates a new object at this array position
// if (pos < BallGroup.length){
// BallGroup[pos] = new Ball(mouseX,mouseY,100);
// pos++;


}

// }











