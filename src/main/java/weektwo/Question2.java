package weektwo;

public class Question2 {
    public static void main(String[] args) {
        int month = (int) (Math.random() * (12-1+1) + 1);


        switch (month){
            case 1:
                System.out.println("January");
                //code block
                break;
            case 2:
                System.out.println("Febuary");
                //code block
                break;
            case 3:
                System.out.println("March");
                //code block
                break;
            case 4:
                System.out.println("April");
                //code block
                break;
            case 5:
                System.out.println("May");
                //code block
                break;
            case 6:
                System.out.println("June");
                //code block
                break;
            case 7:
                System.out.println("July");
                //code block
                break;
            case 8:
                System.out.println("August");
                //code block
                break;
            case 9:
                System.out.println("September");
                //code block
                break;
            case 10:
                System.out.println("October");
                //code block
                break;
            case 11:
                System.out.println("November");
                //code block
                break;
            case 12:
                System.out.println("December");
                //code block
                break;
            default:
                System.out.println(month);
        }
    }
}
