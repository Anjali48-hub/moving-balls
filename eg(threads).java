import java.awt.Color;
import java.util.Random;
import javax.swing.*;
public class Race implements Runnable
    {
      String ThreadName;
      JLable l;
      JPanel l1,l2,l3;
      JFrame fr;
      public race()
       {
        buildGUI();
       }
      public void run()
      {
        if(Thread.currentThread().getName().equals("ObstacleA")
        {
         runObstacleA();
        }
        if(Thread.currentThread().getName().equals("ObstacleB")
        {
         runObstacleB();
        }
        if(Thread.currentThread().getName().equals("ObstacleC")
        {
         runObstacleC();
        }
      }
      public void runObstacleA()
      {
        Random ran =new Random();
        int s=ran.nextInt(1000);
        for(int i=-10;i<400;i++)
         {
           l1.setBounds(i,s,20,20);
           try
           {
             Threads.sleep(5);
           } 
           catch(Exception e)
           {
            System.out.println(e);
           }
         }
       runObstacleC();
      }
      public void runObstacleB()
      {
        Random ran =new Random();
        int r=ran.nextInt(180);
        for(int i=-10;i<400;i++)
         {
           l2.setBounds(i,r,20,20);
           try
           {
             Threads.sleep(11);
           } 
           catch(Exception e)
           {
            System.out.println(e);
           }
         }
       runObstacleA();
      }
      
      public void runObstacleC()
      {
        Random ran =new Random();
        int m=ran.nextInt(10);
        for(int i=-10;i<400;i++)
         {
           l3.setBounds(i,m,20,20);
           try
           {
             Threads.sleep(10);
           } 
           catch(Exception e)
           {
            System.out.println(e);
           }
         }
       runObstacleB();
      }
      
     
