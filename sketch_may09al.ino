int Input = A5;
int SensorVal = 0;
int Check = 0;
void setup() {
  Serial.begin(9600);
  pinMode(Input, INPUT);
 
 // Serial. println("Design by www.TheEngineeringProjects.com");
  //Serial.println();
}

void loop() {

  SensorVal = analogRead(Input);
// Serial.println(SensorVal);
  if((SensorVal > 170) && (Check == 1))
  {
    Serial.println("a");
    Check = 0;
  }

  if((SensorVal < 170) && (Check == 0))
  {
    //Serial.println("All Clear . . .");
    Check = 1;
  }
  //Serial.println(SensorVal);
  delay(500);
}
