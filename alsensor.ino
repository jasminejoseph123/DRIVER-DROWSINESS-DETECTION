int alsensor = 8;
int value=0;
int thresholdValue=600;
void setup() {
  // put your setup code here, to run once:
   digitalWrite(alsensor, INPUT);

}

void loop() {
  // put your main code here, to run repeatedly:
  

  if(thresholdValue > value)
 {

     Serial.print("al");
 
    }
    else
  {
  Serial.print(" not al");
  
  }
   //delay(3000);
  
}
