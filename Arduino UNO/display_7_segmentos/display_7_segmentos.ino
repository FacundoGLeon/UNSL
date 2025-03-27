int latchPin = 8;
int clockPin = 13;
int dataPin = 12;
int dt = 250;
int dt2 = 1000;
byte myBite[] = {0b11111100,0b01100000,0b11011010,0b11110010,0b01100110,0b10110110,0b10111110,0b11100000,0b11111110,0b11110110};
int i;
int buzzPin = 6;


void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(latchPin,OUTPUT);
  pinMode(clockPin,OUTPUT);
  pinMode(dataPin,OUTPUT);
  pinMode(buzzPin,OUTPUT);

}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(buzzPin,LOW);
  i = 0;
  for(i;i<=9;i++){
  digitalWrite(latchPin,LOW);
  shiftOut(dataPin,clockPin,LSBFIRST,myBite[i]);
  digitalWrite(latchPin,HIGH);
  delay(dt);
  }
  digitalWrite(buzzPin,HIGH);
  delay(dt2);
}
