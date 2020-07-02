
import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class THREADSDEMO1 extends Thread
{
    String Thname;
    JLabel l;
    JPanel l1,l2,l3;
    JFrame fr;
    public THREADSDEMO1()
    {
        buildGUI();
    }
    
    public void run()
    {
        if(Thread.currentThread().getName().equals("aa"));
        {
            aa();
        }
         if(Thread.currentThread().getName().equals("bb"));
        {
            bb();
        }
         if(Thread.currentThread().getName().equals("cc"));
        {
            cc();
        }
    }
    
    public void aa()
    {
        Random ran=new Random();
        int s=ran.nextInt(1000);
        for(int i=-10;i<400;i++)
        {
            l1.setBounds(i,s,20,20);
            try 
            {
                Thread.sleep(5);
            }
            catch (InterruptedException ex)
            {
                
            }
            
        }
        cc();
    }
    public void bb()
    {
        Random ran=new Random();
        int r=ran.nextInt(180);
        for(int i=-10;i<400;i++)
        {
            l1.setBounds(i,r,20,20);
            try 
            {
                Thread.sleep(5);
            } 
            catch (InterruptedException ex)
            {
                
            }
            
        }
        aa();
    }
        
    public void cc()
    {
        Random ran=new Random();
        int m=ran.nextInt(10);
        for(int i=-10;i<400;i++)
        {
            l1.setBounds(i,m,20,20);
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex)
            {
                
            }
            
        }
        bb();
    }
    public void buildGUI()
    {
        fr=new JFrame("moving objects");
        fr.setVisible(true);
        fr.setSize(400,400);
        fr.setLayout(null);
        
        l= new JLabel("");
        l.setBounds(10,40,20,20);
        fr.add(l);
        
        l1=new JPanel();
        l1.setSize(20,20);
        l1.setBackground(Color.red);
        l1.setBounds(10,40,20,20);
                fr.add(l1);
                
                  
        l2=new JPanel();
        l2.setSize(20,20);
        l2.setBackground(Color.blue);
        l.setBounds(10,80,20,20);
                fr.add(l2);
                
                  
        l3=new JPanel();
        l3.setSize(20,20);
        l3.setBackground(Color.black);
        l3.setBounds(10,140,20,20);
                fr.add(l3);
                
    }
    public static void main(String []a)
    {
        THREADSDEMO1 th=new  THREADSDEMO1();
        Thread aa1=new Thread(th);
        Thread bb1=new Thread(th);
        Thread cc1=new Thread(th);
        aa1.setName("aa");
          bb1.setName("bb");
            cc1.setName("cc");
            aa1.start();
            bb1.start();
            cc1.start();
                
    }
    
}
