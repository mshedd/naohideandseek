from naoqi import ALProxy
tts = new ALProxy("ALTextToSpeech", "10.45.72.143", 9559)
tts.say("Hello World")
