class Fan{
String brand;
String type;
String color;
int speed;
int blades;
float dimension;
int rounds;

Fan(){

}

Fan(String b ,String t, String c,int s,int bl ){
brand=b;
type=t;
color=c;
speed= s;
blades=bl;
}

Fan(float r, int n){
dimension=r;
rounds=n;
}
}