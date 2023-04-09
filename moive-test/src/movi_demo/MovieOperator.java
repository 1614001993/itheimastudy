package movi_demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class MovieOperator {
    private ArrayList<Movie> movie = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Random rd = new Random();

    /*初始化影片列表*/
    public void initMovie() {
        Movie mv1 = new Movie("220301001", "忠犬八公1", "动作", "演员1", "1999-09-09", "导演1", 3, 2);
        Movie mv2 = new Movie("220301002", "忠犬八公2", "喜剧", "演员2", "1999-09-10", "导演2", 5, 1);
        Movie mv3 = new Movie("220301003", "杀死比尔1", "科幻", "演员1", "1999-09-11", "导演3", 1, 3);
        Movie mv4 = new Movie("220301004", "杀死比尔2", "科幻", "演员3", "1999-09-09", "导演1", 7, 7);
        Movie mv5 = new Movie("220301005", "杀不死的比尔", "玄幻", "演员4", "1999-09-12", "导演1", 2, 7);
        movie.add(mv1);
        movie.add(mv2);
        movie.add(mv3);
        movie.add(mv4);
        movie.add(mv5);
    }


    public void HelloUser() {

        while (true) {
            System.out.println("========欢迎使用电影管理系统========");
            System.out.print("1.影评管理    2.查看所有影片    3.退出系统\n请选择序号：");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    manageMovie();
                    break;
                case 2:
                    show(movie);
                    manageMovie1();
                    break;
                case 3:
                    System.out.println("欢迎使用");
                    System.exit(0);
                default:
                    System.out.println("请重新选择：");
            }
        }
    }

    private void manageMovie1() {
        while (true) {
            System.out.println("1.按条件搜索影片   2.删除影片   3.返回上一层\n请输入您的选择：");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("按条件搜索影片");
                    searchMovie();
                    break;
                case 2:
                    removeMovie();
                    break;
                case 3:
                    System.out.println("返回上一层");
                    return;
                default:
                    System.out.print("您输入的序号有误，请重新输入：");

            }
        }
    }

    /*首页*/
    //影评管理模块
    private void manageMovie() {
        while (true) {
            System.out.print("1.上传影片  2.删除影片  3.修改影片   4.返回上一层\n请选择序号：");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    removeMovie();
                    break;
                case 3:
                    modifyMovie();
                    break;
                case 4:
                    return;
                default:
                    System.out.print("您输入的序号有误，请查正确后输入：");
            }
        }
    }


    /*显示所有电影*/
    private void show(ArrayList<Movie> movies) {
        System.out.println("序号/电影id\t\t电影名称\t\t电影类型\t\t主演\t\t上映时间\t\t导演\t\t点击率\t\t推荐率");
        for (int i = 0; i < movies.size(); i++) {
            Movie mv = movies.get(i);
            System.out.println((i + 1) + " " + mv.getId() + '\t' + '\t' + mv.getName() + '\t' + '\t' + mv.getType() + '\t' + '\t' + mv.getStar() + '\t' + '\t' + mv.getTime() + '\t' + '\t' + mv.getAuthor() + '\t' + '\t' + mv.getClick() + '\t' + '\t' + mv.getRecommend());
        }
    }


    //根据id返回电影信息
    private Movie showMoive(String id) {
        for (int i = 0; i < movie.size(); i++) {
            if (movie.get(i).getId().equals(id)) {
                return movie.get(i);
            }
        }
        System.out.println("没有找到ID为" + id + "的影片，请重新输入id");
        return null;
    }


    /*上传影片 */
    private void addMovie() {
        Movie mv = new Movie();
        System.out.println("请输入电影id");
        String id = sc.next();
        mv.setId(id);

        System.out.println("请输入电影名字");
        String name = sc.next();
        mv.setName(name);

        System.out.println("请输入电影类型");
        String type = sc.next();
        mv.setType(type);

        System.out.println("请输入电影主演");
        String star = sc.next();
        mv.setStar(star);

        System.out.println("请输入电影上映时间");
        String time = sc.next();
        mv.setTime(time);
        System.out.println("请输入导演名");
        String author = sc.next();
        mv.setAuthor(author);

        mv.setClick(0);
        mv.setRecommend(0);
        movie.add(mv);
        System.out.println("影片添加成功");
        return;
    }

    /*删除影片*/
    private void removeMovie() {
        show(movie);
        while (true) {
            System.out.println("请输入要删除的影片序号");
            int index = sc.nextInt();
            //序号小于3
            if (index > 1000) {
                System.out.println("输入的序号长度有误，请重新输入：");
            } else if (index > movie.size()) {
                System.out.println("该影片不存在，请重新输入");
            } else {
                movie.remove(index);
                System.out.println("删除成功");
                return;
            }
        }
    }

    /*修改影片*/
    private void modifyMovie() {
        show(movie);

        while (true) {
            System.out.println("请输入要修改的影片序号：");
            int index = sc.nextInt();

            //序号小于3
            if (index > 1000) {
                System.out.println("输入的序号长度有误，请重新输入：");
            } else if (index > movie.size()) {
                System.out.println("该影片不存在，请重新输入");
            } else {
                modifyMovieOper(index);
                System.out.println("修改成功");
                return;
            }
        }
    }

    /*修改影片操作*/
    private void modifyMovieOper(int id) {
        Movie mv = movie.get(id);
        System.out.println("请修改电影名称");
        sc.nextLine();
        String name = sc.nextLine();
        if (name != "") {
            mv.setName(name);
        }
        System.out.println("请修改电影类型");
        String type = sc.nextLine();
        if (type != "") {
            mv.setType(type);
        }
        System.out.println("请修改电影主演");
        String star = sc.nextLine();
        if (star != "") {
            mv.setStar(star);
        }
        System.out.println("请修改电影上映时间");
        String time = sc.nextLine();
        if (time != "") {
            mv.setTime(time);
        }
        System.out.println("请修改电影导演");
        String author = sc.nextLine();
        if (author != "") {
            mv.setAuthor(author);
        }
    }

    /*搜索影片*/
    private void searchMovie() {
        sc.nextLine();
        System.out.println("按条件搜索影片请输入查询内容\n请输入电影名称");
        String name = sc.nextLine();
        System.out.println("请输入影片类型");
        String type = sc.nextLine();
        System.out.println("请输入影片主演");
        String star = sc.nextLine();
        System.out.println("您输入的条件为");
        if (name != "") {
            System.out.println("影片名称：" + name);
        }
        if (type != "") {
            System.out.println("影片类型：" + type);
        }
        if (star != "") {
            System.out.println("影片主演：" + star);
        }
        if (name == "" && type == "" && star == "") {
            System.out.println("条件为空");
        }
        System.out.println("1.搜索  2.返回上一级");
        while (true) {
            int chooce = sc.nextInt();
            switch (chooce) {
                case 1:

                    System.out.println("查询成功");
                    searchSuccess(souSuo(name, type, star));
                    break;
                case 2:
                    return;
                default:
                    System.out.println("输入的序号有误，请重新输入");
            }
        }

    }
    // 模糊搜索
    private ArrayList<Movie> souSuo(String name, String type, String star) {
        Boolean flag = false;
        ArrayList<Movie> mv=new ArrayList<>();
        for (int i = 0; i < movie.size(); i++) {
            if (movie.get(i).getName().contains(name) && movie.get(i).getType().contains(type) && movie.get(i).getStar().contains(star)) {
                mv.add(movie.get(i));
                flag = true;
            }
        }
        show(mv);
        if (!flag) {
            System.out.println("暂无影片");
            HelloUser();
        }
        return mv;
    }

    //查询成功
    private void searchSuccess(ArrayList<Movie> mv) {
        while (true) {
            System.out.println("1.影片排序  2.观看电影   3.推荐   4.返回影院系统  5.退出系统\n请选择您要进行的操作");
            int chooce = sc.nextInt();
            switch (chooce) {
                case 1:
                    System.out.println("影片排序");
                    sort(mv);
                    break;
                case 2:
                    lookMovie(mv);
                    break;
                case 3:
                    shareMovie(mv);
                    break;
                case 4:
                    System.out.println("返回影院系统");
                    HelloUser();
                    break;
                case 5:
                    System.out.println("退出系统");
                    break;
                default:
                    System.out.println("代号错误，请重新输入：");
            }
        }
    }

    /*观看电影*/
    private void lookMovie(ArrayList<Movie> mv) {
       while(true){
           System.out.println("请输入您要观看的影片ID：");
           String id = sc.next();
           if(getMovie(id,mv)==null){
               System.out.println("没有查找到该电影，请重新输入");
           }else{
               getMovie(id,mv).setClick(getMovie(id,mv).getClick()+1);
               System.out.println("观看结束");
               break;
           }

       }
        HelloUser();
    }
    /*推荐电影*/
    private void shareMovie(ArrayList<Movie> mv) {
        while(true){
            System.out.println("请输入您要推荐的影片ID：");
            String id = sc.next();
            if(getMovie(id,mv)==null){
                System.out.println("没有查找到该电影，请重新输入");
            }else{
                getMovie(id,mv).setRecommend(getMovie(id,mv).getRecommend()+1);
                System.out.println("推荐成功");
                break;
            }

        }
        HelloUser();
    }
    //根据id查看电影
    private Movie getMovie(String id,ArrayList<Movie> mv){
        Movie movieShow=null;
        for (int i = 0; i < mv.size(); i++) {
            if(mv.get(i).getId().equals(id)){
                movieShow=mv.get(i);
            }
        }
        return movieShow;
    }

    //电影排序
    public void sort(ArrayList<Movie> ms) {
        while (true) {
            System.out.println("1.按点击率排序    2.按推荐率排序   3.返回上一级");
            System.out.println("请选择序号：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sortTruth(ms, 1);
                    //展示
                    show(ms);
                    break;
                case 2:
                    sortTruth(ms, 2);
                    //展示
                    show(ms);
                    break;
                case 3:
                    return;//结束方法
                default:
                    System.out.println("暂不支持该排序，请重新选择！");
                    break;
            }
        }
    }
    //排序操作  category:排序的类别 1-点击率  2- 推荐率
    public void sortTruth(ArrayList<Movie> ms, int category) {
        //冒泡排序
        //外层for循环决定冒几次泡
        for (int i = 0; i < ms.size() - 1; i++) {
            //内存循环：比较相邻的两个元素
            for (int j = 0; j < ms.size() - 1 - i; j++) {
                // j  j+1
                Movie mj = ms.get(j);
                Movie mg1 = ms.get(j + 1);
                if (category == 1) {
                    //按照点击率排序
                    if (mj.getClick() > mg1.getClick()) {
                        //交换
                        ms.set(j, mg1);
                        ms.set(j + 1, mj);
                    }
                } else {
                    //按照推荐率排序
                    if (mj.getRecommend() > mg1.getRecommend()) {
                        //交换
                        ms.set(j, mg1);
                        ms.set(j + 1, mj);
                    }
                }
            }
        }
    }

// /*

//     private void jingDuTiao(){
//         char incomplete = '░'; // U+2591 Unicode Character 表示还没有完成的部分
//         char complete = '█'; // U+2588 Unicode Character 表示已经完成的部分

//         int total = 100;

//         StringBuilder stringBuilder = new StringBuilder();
//         Stream.generate(() -> incomplete).limit(total).forEach(stringBuilder::append);

//         for (int i = 0; i < total; i++) {
//             stringBuilder.replace(i, i + 1, String.valueOf(complete));
//             String progressBar = "\r" + stringBuilder;
//             String percent = " " + (i + 1) + "%";
//             System.out.print(progressBar + percent);
//             //模拟进度越接近结束越慢
//             try {
//                 Thread.sleep(i * 5L);
//             } catch (InterruptedException ignored) {

//             }
//         }

//     }
// */


}
