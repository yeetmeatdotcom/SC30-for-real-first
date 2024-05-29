walker joe;

void setup(){
size(1500,700);
joe = new walker(0,0);

}
void draw(){
    
}
void mousePressed(){
    
}
void keyPressed(){
    if (keyCode == up) {
        joe.move(0);

    }
    else if (keyCode == right) {
        joe.move(1);

    }
    else if (keyCode == down) {
        joe.move(2);

    }
    else if (keyCode == left) {
        joe.move(3);

    }
}