import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Snake and Ladder gameplay ");
        int startposition=0;
        int position=0;
        System.out.println("Start position is "+startposition);

        Random random = new Random();

String arr[]={"No play","Snake","Ladder"};
int count =0;
while(position<100) {
    int dieroll = random.nextInt(6)+1;
    int arrindex = random.nextInt(arr.length);
    String condition=arr[arrindex];
    switch (condition) {
        case "No play":
            position = position;
            if(position<0){
                position=startposition;
            }
            System.out.println("At die roll "+dieroll+" At no play the position of player is  "+position);

            break;
        case "Snake":
            position = position - dieroll;
            if(position<0){
                position=startposition;
            }
            System.out.println("At die roll "+dieroll+" At Snake the position of player is  "+position);
            break;
        case "Ladder":

            position = position + dieroll;
            if(position<0){
                position=startposition;
            }
            System.out.println("At die roll "+dieroll+" At Ladder the position of player is  "+position);
            break;


    }

    count++;

}
        System.out.println("count is "+count);



    }



}