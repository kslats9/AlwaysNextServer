package com.alwaysnext;

public class Card {

  public String imageUrl;
  public String type;
  public long date;
  public String genre;

  public Card() {};

  public Card(String imageURL, String type, long date, String genre) {
    this.imageUrl = imageURL;
    this.type = type;
    this.date = date;
    this.genre = genre;
  }
}
