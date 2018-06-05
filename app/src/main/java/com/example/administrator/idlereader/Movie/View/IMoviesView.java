package com.example.administrator.idlereader.Movie.View;


import com.example.administrator.idlereader.Bean.MoviesBean;

/**
 * Created by Administrator on 2018/5/19.
 */

public interface IMoviesView {
    void showNews(MoviesBean moviesBean);
    void hideDialog();
    void showDialog();
    void showErrorMsg(Throwable throwable);
    //dd
}
