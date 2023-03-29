public class Account {
    private String name;      //姓名
    private int id;          //账户
    private String pass;      //密码
    private char sex;        //性别
    private Double balance;     //余额
    private double timeLimit;  //次限额
    private double dayLimit;   //日限额


    public Account() {
    }

    public Account(String name, int id, String pass, char sex, Double balance, double timeLimit, double dayLimit) {
        this.name = name;
        this.id = id;
        this.pass = pass;
        this.sex = sex;
        this.balance = balance;
        this.timeLimit = timeLimit;
        this.dayLimit = dayLimit;
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
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * 设置
     * @param pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * 获取
     * @return sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 设置
     * @param balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * 获取
     * @return timeLimit
     */
    public double getTimeLimit() {
        return timeLimit;
    }

    /**
     * 设置
     * @param timeLimit
     */
    public void setTimeLimit(double timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
     * 获取
     * @return dayLimit
     */
    public double getDayLimit() {
        return dayLimit;
    }

    /**
     * 设置
     * @param dayLimit
     */
    public void setDayLimit(double dayLimit) {
        this.dayLimit = dayLimit;
    }

    public String toString() {
        return "Account{name = " + name + ", id = " + id + ", pass = " + pass + ", sex = " + sex + ", balance = " + balance + ", timeLimit = " + timeLimit + ", dayLimit = " + dayLimit + "}";
    }
}
