void setup(){
  size(800,600);
  background(#7005FF);
}
void draw(){
  makeMagical();
  for(int i=0;i<=300;i++){
  float j = getWormX(i);
  float u = getWormY(i);
  fill(#06CB81);
   ellipse(u,j,10,10);
   
  }
}


 float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
