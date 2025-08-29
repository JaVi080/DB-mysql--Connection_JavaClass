import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Input from user for saving
        Scanner sc=new Scanner(System.in);

        String url="jdbc:mysql://localhost:3306/clg";
        String user=//user name;
        String password=//ur password
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,user,password);
        connection.setAutoCommit(false);
        Statement statement=connection.createStatement();
        ResultSet resultset= statement.executeQuery("select *from student");
        while(resultset.next()){
            System.out.println(resultset.getInt(1)+" "+
                    resultset.getString(2)+" "+
                    resultset.getString(3)+" "+
                    resultset.getInt(4)

            );
        }
        // Saving data into database
            String sql="insert into student values(?,?,?,?)";
            PreparedStatement statement1= connection.prepareStatement(sql);
            String choice;
            int id = 27;
            do {
                System.out.println("Enter Ur Name : ");
                String name = sc.nextLine();
                System.out.println("Course : ");
                String course = sc.nextLine();
                System.out.println("Your Marks : ");
                int marks = sc.nextInt();
                sc.nextLine();

                statement1.setInt(1, id);
                statement1.setString(2, name);
                statement1.setString(3, course);
                statement1.setInt(4, marks);
                statement1.addBatch();
                statement1.executeBatch();

                id++;
                System.out.println("want to continue :? ");
                choice=sc.nextLine();
            }while(choice.equalsIgnoreCase("y"));

            String sql2="delete from student where id=20";
            PreparedStatement statement2= connection.prepareStatement(sql2);
            int rowsAffected = statement2.executeUpdate();
            connection.commit();
            if (rowsAffected > 0) {
                System.out.println("Record with ID 21 deleted successfully.");
            } else {
                System.out.println("No record found with ID 21.");
            }

        connection.close();
            System.out.println("Data added");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Hello world!");
    }
}
