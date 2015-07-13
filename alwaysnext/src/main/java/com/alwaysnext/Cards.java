package com.alwaysnext;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.response.NotFoundException;

import java.util.ArrayList;

import javax.inject.Named;

/**
 * Defines v1 of the alwaysnext API, which provides simple methods on cards.
 */
@Api(
    name = "alwaysnext",
    version = "v1",
    scopes = {Constants.EMAIL_SCOPE},
    clientIds = {Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID, Constants.IOS_CLIENT_ID, Constants.API_EXPLORER_CLIENT_ID},
    audiences = {Constants.ANDROID_AUDIENCE}
)
public class Cards {

  public static ArrayList<Card> cards = new ArrayList<Card>();

  static {
    cards.add(new Card("hello world!", "film"));
    cards.add(new Card("goodbye world!", "film"));
  }

  public Card getGreeting(@Named("id") Integer id) throws NotFoundException {
    try {
      return cards.get(id);
    } catch (IndexOutOfBoundsException e) {
      throw new NotFoundException("Greeting not found with an index: " + id);
    }
  }

  public ArrayList<Card> listGreeting() {
    return cards;
  }

  @ApiMethod(name = "cards.multiply", httpMethod = "post")
  public Card insertGreeting(@Named("times") Integer times, Card greeting) {
    Card response = new Card();
    StringBuilder responseBuilder = new StringBuilder();
    for (int i = 0; i < times; i++) {
      responseBuilder.append(greeting.getImageURL());
    }
    response.setImageURL(responseBuilder.toString());
    return response;
  }
}
