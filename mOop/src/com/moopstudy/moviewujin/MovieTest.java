package com.moopstudy.moviewujin;

public class MovieTest {
    public static void main(String[] args) {
        Movie mv1 = new Movie("战狼","吴京","动作");
        Movie mv2 = new Movie("阿凡达","詹姆斯卡梅隆","科幻");
        Movie mv3 = new Movie("流浪地球","吴京","科幻");
        Movie[] arr={mv1,mv2,mv3};
        Movie mv=new Movie();
        mv.printWuJin(arr);
    }
}
class Movie{
    private String title;
    private String author;
    private String type;

    public Movie(){
    }
    public Movie(String title, String author, String type) {
        this.title = title;
        this.author = author;
        this.type = type;
    }
    public void printWuJin(Movie[] arr){
        for (int i = 0; i <arr.length; i++) {

            if(arr[i].getAuthor()=="吴京"){
                System.out.println(arr[i].getTitle()+"-"+arr[i].getAuthor()+"-"+arr[i].getType());

            }
        }
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

}
