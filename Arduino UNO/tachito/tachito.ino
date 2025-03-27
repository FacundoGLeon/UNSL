#include <Servo.h>

int pinButton = 8;
int ledPin = 9;
int servoPin = 10;
int valorB;
int stateB = 0;
int dt = 250;
int servoPos;

Servo myServo;

  

void setup() {
  // put your setup code here, to run once:
  pinMode(pinButton,INPUT);
  pinMode(ledPin,OUTPUT);
  digitalWrite(pinButton, HIGH);
  Serial.begin(9600);
  myServo.attach(servoPin);

}

void loop() {
  // put your main code here, to run repeatedly:
valorB = digitalRead(pinButton);
Serial.println(valorB);
delay(dt);
if(valorB == 0){
  if(stateB==0){
    stateB = 1;
  }
  else{
    stateB = 0;
  }
}
if(stateB == 1){
  servoPos = 160;
  digitalWrite(ledPin,HIGH);
  myServo.write(servoPos);
}else{
  servoPos = 0;
  digitalWrite(ledPin,LOW);
  myServo.write(servoPos);
}
}
