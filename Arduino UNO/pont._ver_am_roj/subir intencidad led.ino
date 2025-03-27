  int ledPin = 9;
  int buttonPin1 = A1;
  int buttonPin2 = A2;
  int buzzPin = 13;
  int button1 = 1;
  int button2 = 1;
  int ledInt = 0;
  int dt = 100;
  int dt2 = 500;

void setup()
{
  pinMode(buttonPin1,INPUT);
  pinMode(buttonPin2,INPUT);
  pinMode(ledPin,OUTPUT);
  pinMode(buzzPin,OUTPUT);
}

void loop()
{
  button1 = digitalRead(buttonPin1);
  button2 = digitalRead(buttonPin2);
  delay(dt);
  
  if(button2 == 0){
    ledInt = ledInt+30;
    analogWrite(ledPin,ledInt);
    
  }
  if(button1 == 0){
    ledInt = ledInt-30;
    analogWrite(ledPin,ledInt);
    
  }
  if(ledInt < 0 ){
    ledInt = 0;
    analogWrite(ledPin,ledInt);
    digitalWrite(buzzPin,HIGH);
    delay(dt2);
    digitalWrite(buzzPin,LOW);
  }
  if(ledInt > 255 ){
    ledInt = 255;
    analogWrite(ledPin,ledInt);
    digitalWrite(buzzPin,HIGH);
    delay(dt2);
    digitalWrite(buzzPin,LOW);
  }
  
}
  
