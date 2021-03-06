package com.matie.redgram.data.managers.presenters;

import java.util.Map;

/**
 * Created by matie on 2016-03-15.
 */
public interface LinksPresenter {
    void registerForEvents();
    void unregisterForEvents();
    void getListing(String subreddit, String front, Map<String,String> params);
    void getMoreListing(String subreddit, String front, Map<String,String> params);
    void searchListing(String subreddit, Map<String,String> params);
    void voteFor(int position, String name, Integer dir);
    void hide(int position, String name, boolean showUndo);
    void unHide();
    void save(int position, String name, boolean save);
    void delete(int position);
    void report(int position);
}
