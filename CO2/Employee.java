
import java.util.Scanner;

class Employee{
    int eNo;
    String eName;
    int eSalary;

    void Getdata()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee id : ");
        eNo=Integer.parseInt(s.nextLine());
        System.out.println("Enter employee name : ");
        eName=s.nextLine();
        System.out.println("Enter employee salary : ");
        eSalary=Integer.parseInt(s.nextLine());
        System.out.println();
    }
    void Display()
    {
        System.out.print(eNo+"\t"+eName+" \t "+eSalary+"\n");
    }
    public static void main(String[] args) {
        System.out.println("How many employees to want store : ");
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        Employee emp[] = new Employee[n];
        int i;
        for(i=0;i<n;i++)
        {
            // initializing array
            emp[i]=new Employee();
        }
        for(i=0;i<n;i++){
            System.out.println("Enter the details of "+(i+1)+" employee");
            emp[i].Getdata();
        }
        System.out.println("Enter Employee id: ");
        
        int search =Integer.parseInt(s.nextLine());
        for(i=0;i<n;i++){
            if(emp[i].eNo == search){
                emp[i].Display();
                break;
            }
        }
    }
}
