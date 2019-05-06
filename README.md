# Implementation  

To use LivenessDetection on Java:

Add maven script
    
       allprojects {
           repositories {
               jcenter()
               maven {
                    url 'https://dl.bintray.com/novanto/LivenessDetection'
               }
           }
       }
  
Add your `google-services.json` file to the app  

add these 4 lines on `build.gradle` :

     dependencies {
        implementation 'com.google.firebase:firebase-core:16.0.8'
        implementation 'com.google.firebase:firebase-ml-vision:19.0.3'
        implementation 'org.jetbrains.kotlin:kotlin-stdlib:1.3.21'

        implementation 'id.privy.livenessfirebasesdk:livenessDetection:0.0.6'
    }    

