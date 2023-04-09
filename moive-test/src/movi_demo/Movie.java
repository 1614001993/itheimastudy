package movi_demo;

public class Movie {
    String id;
    String name;
    String type;
    String star;
    String time;
    String author;
    int click;
    int  recommend;


    public Movie() {
    }

    public Movie(String id, String name, String type, String star, String time, String author, int click, int recommend) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.star = star;
        this.time = time;
        this.author = author;
        this.click = click;
        this.recommend = recommend;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     * @return star
     */
    public String getStar() {
        return star;
    }

    /**
     * 设置
     * @param star
     */
    public void setStar(String star) {
        this.star = star;
    }

    /**
     * 获取
     * @return time
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 获取
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取
     * @return click
     */
    public int getClick() {
        return click;
    }

    /**
     * 设置
     * @param click
     */
    public void setClick(int click) {
        this.click = click;
    }

    /**
     * 获取
     * @return recommend
     */
    public int getRecommend() {
        return recommend;
    }

    /**
     * 设置
     * @param recommend
     */
    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public String toString() {
        return "Movie{id = " + id + ", name = " + name + ", type = " + type + ", star = " + star + ", time = " + time + ", author = " + author + ", click = " + click + ", recommend = " + recommend + "}";
    }
}
