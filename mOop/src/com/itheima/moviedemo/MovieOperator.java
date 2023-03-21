package com.itheima.moviedemo;

public class MovieOperator {
    private Movie[] mv;

    public MovieOperator() {
    }

    public MovieOperator(Movie[] mv) {
        this.mv = mv;
    }

//    展示电影信息
    public void showMovie(){
        for (int i = 0; i < this.mv.length; i++) {
            System.out.println("id："+this.mv[i].getId()+" 名称："+this.mv[i].getName()+" 价格："+this.mv[i].getPrice()+" 评分为："+this.mv[i].getScore());
        }
        System.out.println();
    }
//    根据id查询电影的所有信息
    public void showMovieMsg(int id){
        for (int i = 0; i < this.mv.length; i++) {
            if(this.mv[i].getId()==id){
                System.out.println("id："+this.mv[i].getId()+" 名称："+this.mv[i].getName()+" 价格："+this.mv[i].getPrice()+" 评分为："+this.mv[i].getScore());
                break;
            }

        }
    }
}

