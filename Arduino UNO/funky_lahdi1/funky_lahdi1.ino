float V2;
int readVal;
int analogPin = A0;
int RedPin = 10;
int YellowPin = 11;
int GreenPin = 12;
int dt = 200;

void setup()
{
 Serial.begin(9600);
 pinMode(analogPin, INPUT); 
 pinMode(RedPin, OUTPUT);
 pinMode(YellowPin, OUTPUT);
 pinMode(GreenPin, OUTPUT);
}

void loop()
{
  readVal = analogRead(analogPin);
 V2 = (5.*readVal)/1023.;
  if (V2>=0.0 && V2<=3.0) {
    digitalWrite(YellowPin,LOW);
    digitalWrite(GreenPin,HIGH);
  }
  if (V2>3.0 && V2<=4.0){
    
    digitalWrite(GreenPin,LOW);
    digitalWrite(RedPin,LOW);
    digitalWrite(YellowPin,HIGH);
  }
 if (V2>4.0 && V2<=5.0){
    digitalWrite(YellowPin,LOW);
    digitalWrite(RedPin,HIGH);
  }
 
 Serial.println(V2);
 delay(dt);
}