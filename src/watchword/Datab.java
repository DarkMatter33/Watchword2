/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package watchword;

import java.sql.*;

/**
 *
 * @author Evprog
 */
public class Datab {
   static int a=0;
         
    static Connection conn=null;
    public Datab()
    {
         try{
               Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://Localhost:3307/WW", "root","    ");
               System.out.println("ok");
               
               Statement st = conn.createStatement();
               //st.executeUpdate("Create table WWTable (Sentence text)");
              // st.executeUpdate("Create table PMgrTable (SENTENCE text,PASSWORD text)");
              // st.executeUpdate("Create table PinTable (Pin text)");
               //System.out.println("Table created");
               
           }catch(Exception e)
           {
           
           System.out.print("gscshghgsdgashdhasdj"+e);
           }
         
         //////****login CODE*********///////////////
         try {
        
            
            Statement st = conn.createStatement();
             
             if(a!=100)
             {
            ResultSet rs = st.executeQuery("select * from pintable");
                 System.err.println("1");
             while(rs.next()){
               a=1;
                   System.err.println("2");
             }
            // model.addRow(new Object[]{rs.getString("PASSWORD"),rs.getString("SENTENCE")});
            if(a==1){
		new login();
                    System.err.println("3");
                
		}
           
             }
            a=100;
               System.err.println("99");
           
		
           
         
        }catch(Exception e){
           
             System.err.println("hghgj"+e);
             if(a==0)
             new Regis();
        }
		
            
		
         
    }
    

    public static void main(String[] args) {
        
        
              
       new Datab();
          
        
        
    }
    
}

 