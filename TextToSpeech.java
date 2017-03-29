package naofeatures;
import com.aldebaran.qi.Application;
import com.aldebaran.qi.helper.proxies.ALTextToSpeech;

public class TextToSpeech {
	public static void main(String [] args) throws Exception {
		// this is the robots URL so it can connnect
		String robotUrl = "tcp:10.49.251.53:9559";
		// create the new application
		Application application = new Application(args, robotUrl);
		// start your application
		application.start();
		ALTextToSpeech tts = new ALTextToSpeech(application.session());
		tts.say("The shedds group: Rip in peace haram bay, our fallen comrad will never be forgotten. Tear rolls down cheek while saluting. end (just like how they took his life")
	}
}