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
    cards.add(new FilmCard("http://ia.media-imdb.com/images/M/MV5BMTkxNzI3ODI4Nl5BMl5BanBnXkFtZTgwMjkwMjY4MjE@._V1_SX640_SY720_.jpg",
                            1436762722,"Drama","American Sniper","The Most Lethal Sniper in U.S. History", "2:14", "R",
                            "Rotten Tomatoes", 71, "Bradley Cooper, Sienna Miller, Clint Eastwood",
            "Powered by Clint Eastwood's sure-handed direction and a gripping central performance from Bradley Cooper, American Sniper delivers a tense, vivid tribute to its real-life subject."));

      cards.add(new FilmCard("http://ia.media-imdb.com/images/M/MV5BMTkxNzI3ODI4Nl5BMl5BanBnXkFtZTgwMjkwMjY4MjE@._V1_SX640_SY720_.jpg",
              1436762722,"Drama","American Sniper","The Most Lethal Sniper in U.S. History", "2:14", "R",
              "Rotten Tomatoes", 71, "Bradley Cooper, Sienna Miller, Clint Eastwood",
              "Powered by Clint Eastwood's sure-handed direction and a gripping central performance from Bradley Cooper, American Sniper delivers a tense, vivid tribute to its real-life subject."));

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

}
