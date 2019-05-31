
int ALC = A5;
// Your threshold value
int smsensorThres = 130;

void setup() {
  pinMode(ALC, INPUT);
  Serial.begin(9600);
}

void loop() {
  int analogSensor = analogRead(ALC);

  //Serial.print("Pin A5: ");
  Serial.println(analogSensor);
  // Checks if it has reached the threshold value
  if (analogSensor > smsensorThres)
  {
     Serial.println("ALCOHOL DETECTED");
  }
  else
  {
    Serial.println("NOT DETECTED");
  }
  delay(100);
}
