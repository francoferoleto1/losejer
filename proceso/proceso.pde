int lado=100;
int distancia=0;
int margen = 50;
int x;
int y=0;
int[] origenesX = new int [9];
int[] origenesY = new int [9];
float[] distancias = new float [9];
int Xcirculo;

void setup(){
  size(600,600);
  imageMode(CENTER);
  //rectMode(CENTER); 
 
 
}
void draw(){
 
  background(0);
 for(int i = 0; i<3 ;i++){
  for(int j = 0; j<3; j++){ 
   x = i*(lado+50)+margen;
   y = j*(lado+50)+margen;
   origenesY[i] = y+100;
   fill(255); 
   rect(x,y,lado,lado); 
 }  
    origenesY[i] = x+100;
}  
  for(int i = 0; i<9;i++){
    distancias[i] = dist(mouseX,mouseY,origenesX[i], origenesY[i]);
}    
  noFill();
  strokeWeight(6);
  for(int i=0;i<3;i++){
    for (int j=0;j<3;j++){
  ellipse(origenesX[i]-1000,origenesY[0],150,150);
    }
  }
}
void mousePressed(){
  if(distancias[0] > 150){
    origenesX[0] = origenesX[0]+1000;
}

}
