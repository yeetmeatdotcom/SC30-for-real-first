class Ball{

int x,y,d;//declare position and radius variables
int cr,cg,cb;//RGB values
int dx,dy;//Velcoity or speed values
int width, height; // variables for the screen dimensions
//constructor method
Ball(int ballx, int bally, int balld, int windoww, int windowh){

    x = ballx; //set the x cord
    y = bally; //set the y cord
    d = balld; //set the radius

    //randomize cikiyr values
    cr = int(random(0,255));
    cg = int(random(0,255));
    cb = int(random(0,255));

    //set velcoity
    dx = int(random(-10,10));
    dy = int(random(-10,10));

    // passing over the width and height data of the screen
    width = windoww;
    height = windowh;
}

void display(){

fill(cr,cg,cb);
circle(x,y,d);


}

void move(){

//apply the rate of change (velocity)
x = x + dx;
y = y + dy;

// B
if (x <= 0 + d/2 || x >= width - d/2){

    //reverses direction
    dx = dx * -1;
}

if (y <= 0 + d/2 || y >= height - d/2){

    //reverses direction
    dy = dy * -1;
}

}

void checkCollision(Ball otherBall){
double distancePart = dist(x, y, otherBall.x, otherBall.y);

//Bounce the ball
if (distancePart < d){
    int temdx = dx;
    int temdy = dy;

    // ball 1 gets velcoity 2
    dx = otherBall.dx;
    dy = otherBall.dy;

    //Ball 2 gets velocity 1
    otherBall.dx = temdx;
    otherBall.dy = temdy;



// dy = dy * -1;
// dx = dx * -1;
// otherBall.dy = otherBall.dy * -1;
// otherBall.dx = otherBall.dx * -1;


}

}

}