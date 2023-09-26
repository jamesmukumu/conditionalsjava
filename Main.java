import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The First Unit Code");
        String databaseCode= scanner.nextLine();
        System.out.println("Enter The second Unit Code");
        String systemsCode=scanner.nextLine();
        System.out.println("Enter The third Unit Code");
        String AlgorithimCode= scanner.nextLine();


        System.out.println("Enter The Fourth Unit Code");
        String statisticCode=scanner.nextLine();

        System.out.println("Enter The Database Score");
int databaseScore=scanner.nextInt();

        System.out.println("Enter the Systems Score");
int Systemsscore=scanner.nextInt();
        System.out.println("Enter the Algorithim score");
       
        int AlgorithimsScore=scanner.nextInt();



        System.out.println("Enter the Statistics score");
int Statisticsscore= scanner.nextInt();


int Total=Systemsscore+databaseScore+AlgorithimsScore+Statisticsscore;
float Average= (float) Total /4;


char Grade = 0;

if (Average>0  && Average<=39){

     Grade='E';


} else if (Average>=40  && Average<=49) {

     Grade='D';


} else if (Average>=50 &&  Average<=59 ) {
     Grade='C';


} else if (Average>=60 && Average<=69) {
     Grade='B';


} else if (Average>=70 && Average<=100) {
     Grade='A';

}


        System.out.println("                      Department Of Computer Scince");
        System.out.println("                            End Of Semester Results");
        System.out.println("                                                              ");
        System.out.println("|Name:James Mukumu         |Roll_No:C026-01-2344/2022            Semester:2.2                ");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("|Unit_Code                    |Unit_Name                               |Score");
        System.out.println(" --------------------------------------------------------------------------------------------------------------");
        System.out.println("|" +databaseCode+"                      " +                                                               "|Database                                |"+databaseScore     );
        System.out.println("|" +systemsCode +"                      " +                                                                "|System                                  |"+Systemsscore     );
        System.out.println("|" +AlgorithimCode+"                     " +                                                                   " |Algorithims                             |"+AlgorithimsScore     );
        System.out.println("|" +statisticCode +"                      "+                                                                         "|Statistic                               |"+Statisticsscore     );
        System.out.println("----------------------------------------------------------------------------------------------------------------");

        System.out.println("|Total                                                                 |"+Total      );
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("|Average                                                               |"+Average      );
        System.out.println("---------------------------------------------------------------------------------------------------------------");

        System.out.println("|Grade                                                                 |" +Grade     );
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                       Recommendation |");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------------------------");




    }
}