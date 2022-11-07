package Tasks;

public class OperatorsDaysOfWeek {

        public static void main(String[] args) {
            String day;
            switch (args[0]) {
                case "1":
                    day = "Monday";
                    break;
                case "2":
                    day = "Tuesday";
                    break;
                case "3":
                    day = "Wednesday";
                    break;
                case "4":
                    day = "Thursday";
                    break;
                case "5":
                    day = "Friday";
                    break;
                case "6":
                    day = "Weekend";
                    break;
                case "7":
                    day = "Weekend";
                    break;
                default:
                    day = "Error";
                    break;
            }
            System.out.println(day);
        }

}
