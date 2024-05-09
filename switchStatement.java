public class switchStatement {
    public static void main(String[] args) {
       String day = "fridayhv";
       switch (day) {
        case "moday": System.out.println("Hello this is monday");
            break;
        case "tuedday" : System.out.println(" this is tuesday");
            break;
        case "friday": System.out.println("This is friday");
        break;
        default: System.out.println(day + " " + "Does not exist");
            break;
       }
    }
}
