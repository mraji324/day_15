import java.util.*;
class Careerguidance{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your good Name:");
        String name = sc.nextLine();
        System.out.println("enter your age:");
        int age =sc.nextInt();
        if(age>=16)
        {
            System.out.println("you are eligible for Higher education");
        }
        else{
            System.out.println("you are not eligible,but you can refer as elder age");
        }
    careerguide m=new careerguide(name,age);
     m.menu();
    }
}
    class careerguide
    {
    String name;
    int age;
    careerguide(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
     void menu(){
        System.out.println("Enter your Option :-");
        char option ='\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("After 10th there so many courses,here they are");
        System.out.println(" A. Inter");
        System.out.println(" B. IIIT");
        System.out.println(" C. Diploma");
        System.out.println(" D. Exit");
        do{
            option=Character.toUpperCase(sc.next().charAt(0));
            switch(option)
            {
                case 'A':
                    System.out.println("you are choosing inter");
                    System.out.println("***********************");
                    System.out.println("Duration is 2 years");
                    System.out.println("available courses are MPC,BIPC,CEC,MEC,HEC");
                    System.out.println("************************");
                    break;
                case 'B':
                    System.out.println("you are choosing IIIT");
                    System.out.println("**************************");
                    System.out.println("duration is 6 years");
                    System.out.println("available courses are graduation and under graduation");
                    System.out.println("***************************");
                    System.out.println("NOTE:IIIT has entrance exam");
                    break;
                case 'C':
                    System.out.println("you are choosing diploma");
                    System.out.println("***************************");
                    System.out.println("duration is 3 years");
                    System.out.println("available courses are CSE,ECE,AI and DS,EEE,Mechanical,Civil");
                    System.out.println("***************************");
                     System.out.println("NOTE:IIIT has entrance exam");
                    break;
                case 'D':
                    System.out.println("***********************");
                    System.out.println("Exiting your application");
                    System.out.println("***********************");
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }while(option!='D');
    }
}

