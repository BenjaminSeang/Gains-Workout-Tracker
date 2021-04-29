package application.Resources;

import java.util.Random;

public class WorkoutTips {
	
	private final static String tip1 = "Remember to warm-up\r\n\n"
			+ "A good warm-up prepares your body for the challenges of working out, and can help to reduce the risk of injury. It also mentally prepares you for your workout session. ";
	
	private final static String tip2 = "Include strength training\r\n\n"
			+ "No matter what your key training goals are, including strength training will help you to reach them sooner. One benefit of resistance training is that it can help to make your body more resilient, reducing the likelihood of experiencing a fitness setback such as injury. ";
	
	private final static String tip3 ="Include carbs in a pre-workout snack\r\n\n"
			+ "Carbohydrates are the primary fuel source for most workouts. A 2016 study by the Queensland University of Technology, published in the Journal of Applied Physiology, found that consuming some carbohydrate before you exercise can help to minimise any exercise-related immune disturbances and help you to recover from your workout faster. ";
	
	private final static String tip4 ="Focus on hydration\r\n\n"
			+ "It's important to be hydrated to make the most of your workout because your muscles are actually around 70 percent water! Good hydration also helps you to recover faster from a workout. \r\n"
			+ "\r\n"
			+ "Carrying a water bottle with you can remind you to take regular sips. If you find it hard to drink plain water, try infusing your water with fresh fruit. You could even make your own kombucha or drink sparkling water as both provide a healthy source of hydration.  ";
	
	private final static String tip5 ="Make sleep a priority\r\n\n"
			+ "Good sleep can help to maximise the benefits of your training. During sleep, your nervous system, muscles and your whole body rests and resets. Sleep is important to ensure that you are able to perform at your best in everything you do from your work to your workouts. ";
	
	private final static String tip6 ="Train with a friend\r\n\n"
			+ "Exercising with friends is a great way to have fun while training and will also keep you accountable to your training schedule and fitness goals. When you know there's someone else counting on you to show up for your workout, you are much more likely to go!\r\n"
			+ "\r\n"
			+ "If none of your friends are into fitness, then get them to meet you for coffee afterwards. Your workout buddy doesn't have to do the workout with you every time, there are other ways they can provide you with motivation and support.";
	
	private final static String tip7 = " Allow time to rest\r\n\n"
			+ "Rest is so important to your training schedule! A proper rest day can actually help to boost your performance for both cardio and strength training. Taking rest at the right time can help your body's immune system stay strong and also helps to prevent injury from overtraining. \r\n"
			+ "\r\n"
			+ "You might use your rest day to check out the sauna at your local gym or pool, or to practice mindfulness techniques to enhance your overall well-being. ";
	
	private final static String tip8 = "Cardio can be low-impact\r\n\n"
			+ "Cardio doesn't have to mean running or doing burpees ?low-impact cardio is very beneficial too. Plus, a low-impact workout can still be high-intensity, giving you all the benefits of interval training. ";
	
	private final static String tip9 = " Include interval training\r\n\n"
			+ "Interval training can help to make cardio workouts more challenging. If you haven't done interval training before, it's basically where you alternate periods of high intensity and low intensity exercise. This allows you to work at a higher intensity for much longer than if you tried to do a steady state workout, burning more calories in less time, meaning more ang for your buck.'' \r\n"
			+ "\r\n"
			+ "You can apply interval training to any form of exercise, including running, elliptical, rowing, stair climbing, cycling, swimming and even walking. If you are outdoors, a great way to incorporate interval training is to choose a route with stairs or a hill climb. This adds intensity to your workout without you having to think about it! ";
	
	private final static String tip10 ="Choose the heaviest weight you can\r\n\n"
			+ "Choosing the right weight for your workout for maximum results means that you want a weight that challenges you during the final reps, but also allows you to complete all the sets of a given exercise (and the rest of your workout!).  \r\n"
			+ "\r\n"
			+ "It's a myth that lifting weights will make you bulk up! For those who haven't tried strength training before, you are about to discover one route to becoming stronger and more confident.";
	
	private static String[] tipsPool= {tip1, tip2, tip3, tip4, tip5, tip6, tip7, tip8, tip9, tip10};
	
	public static String getTip()
	{
		int i = new Random().nextInt(tipsPool.length);
		String tip = (tipsPool[i]);
		return tip;
	}
}

