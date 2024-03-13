
import java.util.Date;
import java.util.Scanner;
class Room{
    Scanner sc=new Scanner(System.in);
    int []room_no=new int[100];
    String []available_rooms=new String[100];
    String []feature=new String[100];
    int []price=new int[100];
    private Date checkInDate;
    private Date checkOutDate;
    public void Hotel(int index,int no,String type,String type2,int price){
        this.room_no[index]=no;
        this.available_rooms[index]=type;
        this.feature[index]=type2;
        this.price[index]=price;
    }
    public void Show_available_room(){
        System.out.println("Available rooms are: ");
        for(int i=0;i<available_rooms.length;i++){
            String bname=available_rooms[i];
            if(bname==null){
                continue;
            }else{
                System.out.println("Room No:"+room_no[i]+" ,Room Type: "+bname+" ,("+feature[i]+") ,Room price: "+price[i]);
            }
        }
    }
    public void Reserve_Room(int index){
        int s=index;
        System.out.print("Enter the first name: ");
        String First=sc.next();
        System.out.print("Enter the Last name: ");
        String Last=sc.next();
        System.out.print("How long do you want to stay for:(in Day): ");
        int day=sc.nextInt();
        this.checkInDate=new Date();
        this.checkOutDate=new Date(checkInDate.getTime() + (86400000*day));
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        for(int i=0;i<available_rooms.length;i++){
            if(i==s){
                if(available_rooms[i]==null){
                    System.out.printf("Room No: %d --> is not available.",s);
                    continue;
                }
                else{
                    System.out.println("Booking Details-->");
                    System.out.println("------------------");
                    System.out.println("Person Name: "+First+" "+Last);
                    System.out.println("Room No: "+room_no[s]);
                    System.out.println("Room Type: "+available_rooms[s]+"("+feature[s]+")");
                    System.out.println("CheckIn Date: "+checkInDate);
                    System.out.println("CheckOut Date: "+checkOutDate);
                    System.out.println("Total Rent Price: "+(price[s]*day));
                    available_rooms[i]=null;
                    System.out.printf("Room is successfully Reserved...");
                    System.out.println();
                }

            }

        }
    }
    public int take_roomno(){
        System.out.print("Enter the Room No: ");
        int id=sc.nextInt();
        return id;
    }
    public int get_index(int a){
        int i=0;
        while(true){
            if(a==room_no[i]){
                break;
            }
            i++;
        }
        return i;
    }
    public int whatyouwant(){
        System.out.println("\n*********************************************************");
        System.out.println("1-->Available Room");
        System.out.println("2-->Room Booking");
        System.out.println("3-->Exit");
        System.out.print("What you want to do?:(1/2/3): ");
        int a=sc.nextInt();
        System.out.println("\n************************************************************");

        if (a==2){
            int a1=take_roomno();
            int index=get_index(a1);
            Reserve_Room(index);
        }
        else if (a==1) {
            Show_available_room();
        } else if (a==3) {
            System.out.println("Thank You!");
            return 5;
        } else {
            System.out.println("You enter the wrong keyword,Please enter (1/2/3): ");
            whatyouwant();
        }
        return 1;

    }
}
public class Hotel_Reservation_System {
    public static void main(String[] args){
        Room rm=new Room();
        rm.Hotel(0,1,"Double","For 1 person",1350);
        rm.Hotel(1,2,"Double","For 2 person",1500);
        rm.Hotel(2,3,"Single","For 1 person",1050);
        rm.Hotel(3,4,"Single","For 1 person",900);
        rm.Hotel(4,5,"Double","For 1 person",1350);

        int g=0;
        while(g!=5) {
            g=rm.whatyouwant();
        }
    }

}