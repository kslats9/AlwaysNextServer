package com.alwaysnext;

/**
 * Created by personal on 7/12/15.
 */
public class FilmCard extends Card {

    public String title;
    public String tagline;
    public String time;
    public String rating;
    public String source;
    public int scorepercentage;
    public String creators;
    public String consensus;

    public FilmCard(String imageUrl, long date, String genre, String title, String tagline, String time, String rating,
                    String source, int scorepercentage, String creators, String consensus) {
        super(imageUrl, "film", date, genre);
        this.title = title;
        this.tagline = tagline;
        this.time = time;
        this.rating = rating;
        this.source = source;
        this.scorepercentage = scorepercentage;
        this.creators = creators;
        this.consensus = consensus;
    }

}