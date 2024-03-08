// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

let x, y;
let w =0;
let time =0;
let timex = 0;
let timey =0;
let timew =0;

function setup() {
  createCanvas(windowWidth, windowHeight);
  //width and height are defined by canvas
  //puts x,y in the center
  x = width/2;
  y = height/2;
}

function draw() {
  background(220);

x = noise(timex)*width;
y = noise(timey)*height;
w = w + noise(timew)

  fill(noise(timex)*255,noise(timey)*255,noise(timew)*255);
  circle(x,y,w);

  timex+=0.03;
  timey-=0.02;
  timew+= timew + 1;
}
