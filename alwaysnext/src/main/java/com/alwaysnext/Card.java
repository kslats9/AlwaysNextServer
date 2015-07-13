package com.alwaysnext;

public class Card {

  public String imageURL;
  public String type;

  public Card() {};

  public Card(String imageURL, String type) {
    this.imageURL = imageURL;
    this.type = type;
  }

  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
