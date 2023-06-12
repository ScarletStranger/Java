package homework2;

public class sql {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("select * from students where ");
        String names = "names=Ivanov";
        String country = "country=Russia";
        String city = "city=Moscow";
        String age = "age=null";
        System.out.println(builder.append(names + ", " + country + ", " + city + ", " + age));
    }
}