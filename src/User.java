public class User {
    private String name = "Gigi";
    private int age = 30;
    private static User user;
    public static User getUser(){
        if(user == null){
            user = new User();
        }
        return user;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void userInfo() {
        System.out.println("Nome: " + this.name + ", Età: " + this.age);
    }

}
