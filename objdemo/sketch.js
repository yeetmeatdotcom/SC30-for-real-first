// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"
let ballsarray = [];

function setup() {
  createCanvas(windowWidth,windowHeight);
  createball();
}

function draw() {
  background(30);
  fill(255,0,0)

  for(let i=0; i<ballsarray.length;i++){
    circle(ballsarray[i].x,ballsarray[i].y,ballsarray[i].diameter);
    ballsarray[i].x += ballsarray[i].dx;//x rate of change
    ballsarray[i].y += ballsarray[i].dx;//x rate of change
  }
}

function createball() {
  //create a temp ball object
  let newball = {
    x: random(width),
    y: random(height),
    diameter: random(25,100),
    dx: random(-5,5),
    dy: random(-5,5),
  };
  //copying the ball obj to the array
  ballsarray.push(newball);
}

function mousePressed (){
  createball();
  ballsarray[ballsarray.length-1].x = mouseX;
  ballsarray[ballsarray.length-1].x = mousey;

}