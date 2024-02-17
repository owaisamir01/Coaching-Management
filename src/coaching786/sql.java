
package coaching786;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sql {
 
   private Connection con;
   private Statement st;
   private ResultSet rs;
   
   sql(){
   
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/coaching", "root","");
        st=con.createStatement();
   System.out.println("dta bse conected");
       }catch(Exception e){
         System.out.println(e);
       }
   }

   public void registerStudent(String s_name,String s_pasword){
        
       String query="insert into registration(username,userpasword)values('"+s_name+"','"+s_pasword+"')";
      System.out.println(query);
       try{
       st.executeUpdate(query);
       
       }catch(Exception e){
        System.out.println(e);
       }
    }
    public ResultSet MatchUser(String user, String pass){
   
        String query="select * from registration where username='"+user+"' and userpasword='"+pass+"'";
        try{
        
         rs=st.executeQuery(query);
        
        }catch(Exception e){
        System.out.println(e);
        }
        
        return rs;
   }
    public void studendtdata(String name,String class1,String sec,String month,String date,String year,String fees,String other,String total){
        
     String query="insert into studentdata(name,class,sec,month,date,year,fees,other,total)values( '"+name+"','"+class1+"','"+sec+"','"+month+"','"+date+"','"+year+"','"+fees+"','"+other+"','"+total+"')";
      System.out.println(query);
       try{
      st.executeUpdate(query);
       
       }catch(Exception e){
        System.out.println(e);
       }
    }
    public void teacherdata(String tname,String faculity,String month,String date,String year,String sallery,String other,String total){
        
     String query="insert into teacherdata(name,faculity,month,date,year,sallery,other,total)values( '"+tname+"','"+faculity+"','"+month+"','"+date+"','"+year+"','"+sallery+"','"+other+"','"+total+"')";
      System.out.println(query);
       try{
      st.executeUpdate(query);
       
       }catch(Exception e){
        System.out.println(e);
       }
    } 
    public  ResultSet getstudentrecord(){
   
   String query="select * from studentdata";
   //    System.out.println(query);
   try{
      rs=st.executeQuery(query);
   }
   catch(Exception e){
           System.out.println(e);
           }
   return rs;
   }
    
   public  ResultSet getteacherrecord(){
   
   String query="select * from teacherdata";
   //    System.out.println(query);
   try{
      rs=st.executeQuery(query);
   }
   catch(Exception e){
           System.out.println(e);
           }
   return rs;
   }
        public ResultSet Searchstudentrecords(String search){
   
        String query="select * from studentdata where name like '"+search+"%'"; 
            System.out.println(query);
        try{
        
         rs=st.executeQuery(query);
        
        }catch(Exception e){
        System.out.println(e);
        }
        
        return rs;
   }
//      public ResultSet Searchstudentclassrecords(String search){
//   
////        String query="select * from studentdata where class like '"+search+"%'"; 
////            System.out.println(query);
////        try{
////        
////         rs=st.executeQuery(query);
////        
////        }catch(Exception e){
////        System.out.println(e);
////        }
////        
////        return rs;
////   }
   


        public void deletestudentRecord(String search){
   
      String query="DELETE FROM studentdata WHERE id='"+search+"'";
      try{
      st.executeUpdate(query);
      
      }catch(Exception e){
      System.out.println(e);
      }
   }
        public ResultSet Searchteacherrecords(String search){
   
        String query="select * from teacherdata where name like '"+search+"%'"; 
            System.out.println(query);
        try{
        
         rs=st.executeQuery(query);
        
        }catch(Exception e){
        System.out.println(e);
        }
        
        return rs;
   }
        
    
     public void deleteteacherRecord(String search){
   
      String query="DELETE FROM teacherdata WHERE id='"+search+"'";
   //      System.out.println(query);
      try{
      st.executeUpdate(query);
      
      }catch(Exception e){
      System.out.println(e);
      }
   }   
        public ResultSet studentformview(String id ){
   
        String query="select * from studentdata where id='"+id+"' ";
        try{
        
         rs=st.executeQuery(query);
        
        }catch(Exception e){
        System.out.println(e);
        }
        
        return rs;
   }
        public ResultSet teacherformview(String id ){
   
        String query="select * from teacherdata where id='"+id+"' ";
        try{
        
         rs=st.executeQuery(query);
        
        }catch(Exception e){
        System.out.println(e);
        }
        
        return rs;
   }   
             public void editstudentrecord(String name,String class1,String sec,String month,String date,String year,String fees,String other,String total,String id){
   
       String query="UPDATE studentdata SET name='"+name+"',class='"+class1+"', sec='"+sec+"', month='"+month+"' , date='"+date+"', year='"+year+"', fees='"+fees+"', other='"+other+"',total='"+total+"' WHERE id='"+id+"'";      
         System.out.println(query);
      try{
      st.executeUpdate(query);
      
      }catch(Exception e){
      System.out.println(e);
      }
   } 
             public void editteacherrecord(String name,String faculity,String month,String date,String year,String sallery,String other,String total,String id){
   
       String query="UPDATE teacherdata SET name='"+name+"',faculity='"+faculity+"',  month='"+month+"' , date='"+date+"', year='"+year+"', sallery='"+sallery+"', other='"+other+" ',total='"+total+"' WHERE id='"+id+"'";      
         System.out.println(query);
      try{
      st.executeUpdate(query);
      
      }catch(Exception e){
      System.out.println(e);
      }
   }   
 
//dashbord//             
               public int countstudent(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from studentdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
 
              public int countteacher(String month){
       
       int countteacher=0;
       try{
           String query = "select count(*) from teacherdata where month='"+month+"'";
          rs = st.executeQuery(query);
          rs.next();
       countteacher  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countteacher;
   }
                  public int studentfeb(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from studentdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
                  public int teacherfeb(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from teacherdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
 
       public int studentmarch(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from studentdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
                  public int teachermarch(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from teacherdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
            public int studentapril(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from studentdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
                  public int teacherapril(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from teacherdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
      public int studentmay(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from studentdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
                  public int teachermay(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from teacherdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
      public int studentjune(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from studentdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
                  public int teacherjune(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from teacherdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
      public int studentjuly(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from studentdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
                  public int teacherjuly(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from teacherdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
      public int studentaugust(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from studentdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
                  public int teacheraugust(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from teacherdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
      public int studentseptember(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from studentdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
                  public int teacherseptember(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from teacherdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
      public int studentoctober(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from studentdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
                  public int teacheroctober(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from teacherdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
      public int studentnovember(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from studentdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
                  public int teachernovember(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from teacherdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
      public int studentdecember(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from studentdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
                  public int teacherdecember(String month){
       
       int countstudent=0;
       try{
           String query = "select count(*) from teacherdata where month='"+month+"' ";
          rs = st.executeQuery(query);
          rs.next();
       countstudent  = rs.getInt(1);
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return countstudent;
   }
        
     
public static void main(String [] args){
    sql s=new sql();
}
 
}