import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Snake and Ladder gameplay ");
        int startposition=0;
        int position=0;
        System.out.println("Start position is "+startposition);

        Random random = new Random();
        int dieroll = random.nextInt(6)+1;
String arr[]={"No play","Snake","Ladder"};

while(position<100) {
    int arrindex = random.nextInt(arr.length);
    String condition=arr[arrindex];
    switch (condition) {
        case "No play":
            position = position;
            System.out.println(position);
            break;
        case "Snake":
            position = position - dieroll;
            System.out.println(position);
            break;
        case "Ladder":
            position = position + dieroll;
            System.out.println(position);
            break;


    }
}



    }



}