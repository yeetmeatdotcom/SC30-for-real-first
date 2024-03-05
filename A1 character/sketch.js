// A1 character
// matthew
// 2/29/feb 2024
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"


function setup() {
  createCanvas(windowWidth, windowHeight);
}

function draw() {
  background(220);
  fill('yellow')
  circle(width/2, height/2,100)//head
  rect(340,500,100,200)//main body
  rect(287,500,50,150)//left arm
  rect(443,500,50,150)//right arm
  rect(400,705,40,150)//right leg
  rect(340,705,40,150)//left leg
  
}
