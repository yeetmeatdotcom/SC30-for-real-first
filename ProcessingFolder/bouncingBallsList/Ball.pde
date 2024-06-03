class Ball {
    int x, y, d; //Declare position and radius variables
    int cr, cg, cb; //RGB values
    int dx, dy; //Velocity or Speed Values
    int width, height; //variables for the screen dimensions
    int grav;
    boolean infected;
    // Constructor Method
    Ball(int ballx, int bally, int balld, int windoww, int windowh, boolean inf) {
        x = ballx; //set the x cord
        y = bally; //set the y cord
        d = balld; //set the radius
        
        //Randomize colour values
        cr = int( random(0,255) );
        cg = int( random(0,255) );
        cb = int( random(0,255) );

        //Set Velocity
        dx = int( random(-10,10));
        dy = int( random(-10,10));
        grav = grav -1;
        // Passing over the width and height data of the screen
        width = windoww; 
        height = windowh;
        infected = inf;
    }

    void display() {

        fill(cr, cg, cb);
        circle(x,y,d);
        if (infected == true){
            cr = 255;
            cg = 0;
            cb = 0;
        }
    }

    void move() {
        //apply the rate of change (velocity)
        x = x + dx;
        y = y + dy;

        if (infected == true){
        dy = dy - grav;
        }

        
        if (x <= 0 + d/2 || x >= width - d/2) {
            // Reverses direction
            dx = dx * -1;
        }

        if (y <= 0 + d/2 || y >= height - d/2) {
            //Reverse direction
            dy = dy * -1;
        }

    }

    void checkCollision(Ball otherBall) {
        double distanceApart = dist(x, y, otherBall.x, otherBall.y);

        //Bounce the ball
        if (distanceApart < d) {
            //Store first velocity
            int tempdx = dx;
            int tempdy = dy;

            // ball 1 gets velocity 2
            dx = otherBall.dx;
            dy = otherBall.dy;

            //Ball 2 gets velocity 1
            otherBall.dx = tempdx;
            otherBall.dy = tempdy;
        

        //pass the infection
        if (otherBall.infected == true && infected == false)
            infected = true;
        
        

        else if (otherBall.infected == false && infected == true)
            infected = true;
        }

}
}