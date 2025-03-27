#include <IRremote.h>
int IRpin = 9 ;
int dt = 300;
int dt2 = 2600;
int comand;
int bPin = 3;
int gPin = 5;
int rPin = 6;
int stateR = 0;
int stateG = 0;
int stateB = 0;
int stateGen = 0;
int i = 0;
int Red[] =   {1,0,0,1,0,1,1};
int Green[] = {0,1,0,1,1,0,1};
int Blue[] =  {0,0,1,0,1,1,1};



void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  IrReceiver.begin(IRpin);
  pinMode(rPin, OUTPUT);
  pinMode(gPin, OUTPUT);
  pinMode(bPin, OUTPUT);

  

}

void loop() {
  // put your main code here, to run repeatedly:
  
  while (IrReceiver.decode() == 0) {

  }
  
  comand = IrReceiver.decodedIRData.command;
  Serial.println(comand);
  delay(dt);
  IrReceiver.resume();
  
  while(comand == 70){
    stateGen = 1;
    dt2 = 2600;
     while (IrReceiver.decode() == 0) {
     
     //
     while(IrReceiver.decode() == 0){
      digitalWrite(rPin, Red[i]);
      digitalWrite(gPin, Green[i]);
      digitalWrite(bPin, Blue[i]);
      i++;
      if(i == 7){
        i = 0;
        }
      delay(dt2);
      }
      comand = IrReceiver.decodedIRData.command;
      Serial.println(comand);
      delay(dt);
      IrReceiver.resume();

      if(comand == 21 && dt2 > 200){
        dt2 = dt2 - 200;
        }
      if(comand == 64 && dt2-600>=200){
        dt2 = dt2 - 600;
        }
      if(comand == 9 && dt2 < 5000){
        dt2 = dt2 + 200;
        }
      if(comand == 67 && dt2+600<=5000){
        dt2 = dt2 + 600;
        }
      if(comand == 70 || comand == 69){
        break;
        }
      }
    break;
    
    }

  if (comand == 69) {
    if (stateGen == 0) {
      stateGen = 1;
      stateR = 1;
      stateG = 1;
      stateB = 1;
    }
    else {
      stateGen = 0;
      stateR = 0;
      stateG = 0;
      stateB = 0;
    }
  }
  if (comand == 12) {
    if (stateR == 0) {
      stateGen = 1;
      stateR = 1;
    }
    else {
      stateR = 0;
    }
  }
  if (comand == 24) {
    if (stateG == 0) {
      stateGen = 1;
      stateG = 1;
    }
    else {
      stateG = 0;
    }
  }
  if (comand == 94) {
    if (stateB == 0) {
      stateGen = 1;
      stateB = 1;
    }
    else {
      stateB = 0;
    }
  }
  

  digitalWrite(rPin, stateR);
  digitalWrite(gPin, stateG);
  digitalWrite(bPin, stateB);



}