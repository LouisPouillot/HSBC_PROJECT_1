package answerNearestPlace;

import googleApi.Place;

public class NumOfNearestAgency implements AnswerNearestPlace {
	
	@Override
	public String getTextResponse(Place place) {
        place.findPhoneNumber();
		return "The phone number of the closest agency is " + place.getPhoneNumber();
	}
}