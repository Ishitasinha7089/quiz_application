/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongopack;
import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;
/**
 *
 * @author DELL
 */
/* public class JavaMongoConnection {
      public static void main(String args[])
      {
          //connecting with server
          MongoClient client= new MongoClient("localhost",27017);
          System.out.println("server connection successfully done");
          String connectPoint=client.getConnectPoint();
          System.out.println(connectPoint);
          client.close();
      }
}
*/

public class JavaMongoConnection{
    
    public static void main(String[] args)throws Exception{
        try{
            MongoClient mongoClient=new MongoClient("localhost",27017);
            DB db=mongoClient.getDB("test");
            System.out.println("connected to database");
        }catch(Exception e)
        {
            System.out.println(e);
        }
                    
    }
}