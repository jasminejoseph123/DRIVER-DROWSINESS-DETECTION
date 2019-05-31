
const int gasPin = A0; 

void setup () 

{
  Serial.begin(9600); //Initialize serial port - 9600 bps
}



void loop () {



  if (gasPin > 650){
     analogWrite (speakerPin, 650);
     delay (500);
     Serial.println("HIGH");
     delay (10);
   } else
   
   { 
       Serial.println("LOW");
     delay (500);
  }

  //Serial.println(analogRead(gasPin));
  delay(500); // Print value every 1 sec.
}
