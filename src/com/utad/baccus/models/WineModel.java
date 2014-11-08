package com.utad.baccus.models;

import java.util.LinkedList;
import java.util.List;

public class WineModel {
	
	private int mImage;
	private int mRating;
	private List<String> mGrapes;
	private String mDescription;
	private String mName;
	private String mType;
	private String mURL;
	private String mWinehouse;
	
	public WineModel(int image, int rating, String description, String name,
			String type, String uRL, String winehouse) {
		super();
		mImage = image;
		mRating = rating;
		mGrapes = new LinkedList<String>();
		mDescription = description;
		mName = name;
		mType = type;
		mURL = uRL;
		mWinehouse = winehouse;
	}
	
	public void addGrape(String grape){
		mGrapes.add(grape);
	}

	public int getImage() {
		return mImage;
	}

	public void setImage(int image) {
		mImage = image;
	}

	public int getRating() {
		return mRating;
	}

	public void setRating(int rating) {
		mRating = rating;
	}

	public List<String> getGrapes() {
		return mGrapes;
	}

	public String getDescription() {
		return mDescription;
	}

	public void setDescription(String description) {
		mDescription = description;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

	public String getType() {
		return mType;
	}

	public void setType(String type) {
		mType = type;
	}

	public String getURL() {
		return mURL;
	}

	public void setURL(String uRL) {
		mURL = uRL;
	}

	public String getWinehouse() {
		return mWinehouse;
	}

	public void setWinehouse(String winehouse) {
		mWinehouse = winehouse;
	}
	
	
	

}
