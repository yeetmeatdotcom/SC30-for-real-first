class Ball{

int x,y,r;//declare position and radius variables
int cr,cg,cb;//RGB values
int dx,dy;//Velcoity or speed values
//constructor method
Ball(int ballx, int bally, int ballr){

    x = ballx; //set the x cord
    y = bally; //set the y cord
    r = ballr; //set the radius

    cr = int(random(0,255));
    cg = int(random(0,255));
    cb = int(random(0,255));

    //set velcoity
    dx = int(random(-10,10));
    dy = int(random(-10,10));
}

void display(){

fill(cr,cg,cb);
circle(x,y,r);


}

void move(){

//apply the rate of change (velocity)
x = x + dx;
y = y + dy;

}

}