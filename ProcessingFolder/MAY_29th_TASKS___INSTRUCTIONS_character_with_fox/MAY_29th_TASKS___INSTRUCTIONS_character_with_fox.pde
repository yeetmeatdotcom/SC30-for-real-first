walker joe;

void setup(){
size(1500,700);
joe = new walker(0,0);

}
void draw(){
    background(255, 255, 255, 255);
    joe.display();
}
void mousePressed(){
    
}
void keyPressed(){
    if (keyCode == UP || key == 'w') {
        joe.move(0);

    }
    else if (keyCode == RIGHT || key == 'd') {
        joe.move(1);

    }
    else if (keyCode == DOWN || key == 's') {
        joe.move(2);

    }
    else if (keyCode == LEFT || key == 'a') {
        joe.move(3);

    }
}