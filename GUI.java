
package ebookstore;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class GUI extends Frame implements ActionListener //Frame for BOOK
        //labbels objects
{
    Frame GUI2= new Frame(); //Frame for publisher
    Frame GUI3= new Frame(); //Frame for Aouther 
    
    //GUI2 for publisher
  
    //   Label 
    Label Publisher_ID = new Label("Publisher_ID");
    Label frist_name = new Label("frist name");
    Label last_name = new Label("last name");
    Label city = new Label("City");
    Label phone = new Label("phone");
    
    //textfilde
    TextField tPublisher_ID = new TextField();
    TextField tcity = new TextField();
    TextField tfrist_name = new TextField();
    TextField tlast_name = new TextField();
    TextField tphone = new TextField();
     
    // Button
    Button insert1 =new Button("insert");
    Button Update1 =new Button("Update");
    Button delete1 =new Button("delete");
    Button search1 =new Button("search");
    Button next1 =new Button("next");

//------------------------------
   //GUI3 for Aouther 
     //   Label 
    Label Author_ID = new Label("Author_ID");
    Label frist_Name = new Label("Frist name");
    Label last_Name = new Label("Last name");
    

    //textfilde
    
    
    TextField tAuthor_ID = new TextField();
    TextField tfrist_Name = new TextField();
    TextField tlast_Name = new TextField();   
    
       // Button

    Button insert2 =new Button("insert");
    Button Update2 =new Button("Update");
    Button delete2 =new Button("delete");
    Button search2 =new Button("search");
    Button Back2 =new Button("Back"); 
    Button exit2 =new Button("exit");

//------------------------------------------

//GUI1 For book
    Label ISBN =new Label("ISBN");
    Label title =new Label("title");
    Label type =new Label("type");
    Label price =new Label("price");
    Label page_count =new Label("page_count");
   

    //textfield
    
    TextField tISBN =new TextField();
    TextField ttitle =new TextField();
    TextField ttype =new TextField();
    TextField tprice =new TextField();
    TextField tpage_count =new TextField();
    
    
     //butttons
    Button insert =new Button("insert");
    Button Update =new Button("Update");
    Button delete =new Button("delete");
    Button search =new Button("search");
    Button next =new Button("next");
    Button Back =new Button("Back");


    

GUI()
{
    //Frame GUI3 Aouther
     GUI3.setLayout(null);
    GUI3.setBounds(200,200,600,420);
    GUI3.setBackground(new Color(169,169,169));
    GUI3.setTitle("Author");

    //Frame
    Author_ID .setBounds(30, 50, 100, 50);
    Author_ID.setForeground(Color.darkGray);
    GUI3.add(Author_ID);

     //label 

    frist_Name .setBounds(30, 100, 100, 50);
    frist_Name.setForeground(Color.darkGray);
    GUI3.add(frist_Name);

    last_Name .setBounds(30, 150, 100, 50);
    last_Name.setForeground(Color.darkGray);
    GUI3.add(last_Name);

    // Text Filed

    tAuthor_ID.setBounds(130, 60, 100, 30);
    GUI3.add(tAuthor_ID);


    tfrist_Name.setBounds(130, 110, 100, 30);
    GUI3.add(tfrist_Name);

    
    tlast_Name.setBounds(130, 160, 100, 30);
    GUI3.add(tlast_Name);
    
    
    //  Button
    
    
    insert2.setBounds(40, 350, 100, 30);
    GUI3.add(insert2);


    Update2.setBounds(180, 350, 100, 30);
    GUI3.add(Update2);


    delete2.setBounds(330, 350, 100, 30);
    GUI3.add(delete2);


    search2.setBounds(480, 350, 100, 30);
    GUI3.add(search2);


    Back2.setBounds(480, 60, 100, 30);
    GUI3.add(Back2);
    
    exit2.setBounds(480, 110, 100, 30);
    GUI3.add(exit2);
    
    
    GUI3.setVisible(false);
                        
    // for action ls
    insert2.addActionListener(this);
    Update2.addActionListener(this);
    delete2.addActionListener(this);
    Back2.addActionListener(this);
    exit2.addActionListener(this);
    search2.addActionListener(this);
    
   //-------------------- 
    //FARME gui2 Publisher
    GUI2.setLayout(null);
    GUI2.setBounds(200, 200, 600, 420);
    GUI2.setBackground(new Color(169,169,169));
    GUI2.setTitle("publisher");
     
    
    // labels
    
   Publisher_ID.setBounds(30, 50, 100, 50);
   Publisher_ID.setForeground(Color.darkGray);
   GUI2.add(Publisher_ID);


   frist_name.setBounds(30, 100, 100, 50);
   frist_name.setForeground(Color.darkGray);
   GUI2.add(frist_name);


   last_name.setBounds(30, 150, 100, 50);
   last_name.setForeground(Color.darkGray);
   GUI2.add(last_name);
   
   city.setBounds(30, 200, 100, 50);
   city.setForeground(Color.darkGray);
   GUI2.add(city);
   
   
   phone.setBounds(30, 250, 100, 50);
   phone.setForeground(Color.darkGray);
   GUI2.add(phone);


    //Text fild
    
  tPublisher_ID.setBounds(130, 60, 100, 30);
  GUI2.add(tPublisher_ID);

 
 tfrist_name.setBounds(130, 110, 100, 30);
    GUI2.add(tfrist_name);


  tlast_name.setBounds(130, 160, 100, 30);
   GUI2.add(tlast_name);
   
   
   tcity.setBounds(130, 210, 100, 30);
  GUI2.add(tcity);
    
  
   tphone.setBounds(130, 260, 100, 30);
  GUI2.add(tphone);
  
      //butttons

  insert1.setBounds(30, 350, 100, 30);
   GUI2.add(insert1);
    
    
    Update1.setBounds(180, 350, 100, 30);
    GUI2.add(Update1);


    delete1.setBounds(330, 350, 100, 30);
    GUI2.add(delete1);


   search1.setBounds(480, 350, 100, 30);
    GUI2.add(search1); 
    
    
    
    next1.setBounds(480, 60, 100, 30);
    GUI2.add(next1);
    
    
 GUI2.setVisible(true);
 
  insert1.addActionListener(this);
  Update1.addActionListener(this);
  delete1.addActionListener(this);
  next1.addActionListener(this);
  search1.addActionListener(this);
 
 //-------------------------
setLayout(null);
setBounds(200,200,600,420);
setBackground(new Color(169,169,169));
setTitle("Book");
ISBN.setBounds(30, 50, 100, 50);
ISBN.setForeground(Color.darkGray);
add(ISBN);


title.setBounds(30, 100, 100, 50);
title.setForeground(Color.darkGray);
add(title);


type.setBounds(30, 150, 100, 50);
type.setForeground(Color.darkGray);
add(type);


price.setBounds(30, 200, 100, 50);
price.setForeground(Color.darkGray);
add(price);


page_count.setBounds(30, 250, 100, 50);
page_count.setForeground(Color.darkGray);
add(page_count);


insert.setBounds(30, 350, 100, 30);
add(insert);


Update.setBounds(180, 350, 100, 30);
add(Update);


delete.setBounds(330, 350, 100, 30);
add(delete);


search.setBounds(480, 350, 100, 30);
add(search);


next.setBounds(480, 60, 100, 30);
add(next);

Back.setBounds(480, 110, 100, 30);
add(Back);


tISBN.setBounds(130, 60, 100, 30);
add(tISBN);


ttitle.setBounds(130, 110, 100, 30);
add(ttitle);


ttype.setBounds(130, 160, 100, 30);
add(ttype);


tprice.setBounds(130, 210, 100, 30);
add(tprice);


tpage_count.setBounds(130, 260, 100, 30);
add(tpage_count);





insert.addActionListener(this);
Update.addActionListener(this);
delete.addActionListener(this);
Back.addActionListener(this);
next.addActionListener(this);
search.addActionListener(this);

setVisible(false);
}

    /**
     *
     * @param e
     */
    @Override
     public void actionPerformed(ActionEvent e) 
             
             
             //GUI2
    {
          
          if(e.getSource()==insert1)
     {
       DBconnection.executeNonquary("insert into publisher values("+tPublisher_ID.getText()+",'"+tfrist_name.getText()+"','"+tlast_name.getText()+"','"+tcity.getText()+"','"+tphone.getText()+"')");

       JOptionPane.showMessageDialog(null, "Publisher inserted successfully!");
               
        }
     if(e.getSource()==Update1)
     {
     // DBconnection.executeNonquary("update set publisher values("+tPublisher_ID.getText()+",'"+tfrist_name.getText()+"','"+tlast_name.getText()+"','"+tcity.getText()+"','"+tphone.getText()+"')");
      DBconnection.executeNonquary("update publisher set frist_name= '"+tfrist_name.getText()+"',laste_name='"+tlast_name.getText()+"',city='"+tcity.getText()+"',phone='"+tphone.getText()+"'Where Publisher_ID="+tPublisher_ID.getText());

      JOptionPane.showMessageDialog(null, "Publisher Updated successfully!");

     }
     if(e.getSource()==delete1)
     {
     DBconnection.executeNonquary("delete from publisher where Publisher_ID= "+tPublisher_ID.getText());

     JOptionPane.showMessageDialog(null, "Publisher Deleted successfully!");

      }
         if(e.getSource()==next1)
         {
         
         GUI2.setVisible(false);
         setVisible(true);
          GUI3.setVisible(false);
         }
         
         if(e.getSource()==search1)
         {
           try {
                String query = "select * from publisher where publisher_id = '" + tPublisher_ID.getText() + "'";
                ResultSet db = DBconnection.GetData(query);
                if (db.next()) {
                    tfrist_name.setText(db.getString("frist_name"));
                    tlast_name.setText(db.getString("laste_name"));
                    tcity.setText(db.getString("city"));
                    tphone.setText(db.getString("phone"));
               JOptionPane.showMessageDialog(null, "publisher  Found!");

                } else {
               JOptionPane.showMessageDialog(null, "publisher not Found!");

                }
                db.close();
            } catch (Exception ex) {
                ex.printStackTrace();
      }
         }
         
             
    //---------------------------------------------------------
          
    //GUI
    
           if(e.getSource()==insert)
     {
                DBconnection.executeNonquary("insert into book values('"+tISBN.getText()+"','"+ttitle.getText()+"','"+ttype.getText()+"',"+tprice.getText()+","+tpage_count.getText()+","+tPublisher_ID.getText()+")");

                      JOptionPane.showMessageDialog(null, "BOOK inserted successfully!");

     }
          if(e.getSource()==Update)
     {
     // DBconnection.executeNonquary("update set publisher values("+tPublisher_ID.getText()+",'"+tfrist_name.getText()+"','"+tlast_name.getText()+"','"+tcity.getText()+"','"+tphone.getText()+"')");
      DBconnection.executeNonquary("update book set title= '"+ttitle.getText()+"',typee='"+ttype.getText()+"',price="+tprice.getText()+",page_count="+tpage_count.getText()+",publisher_id="+tPublisher_ID.getText()+" Where ISBN="+ISBN.getText());
      
      JOptionPane.showMessageDialog(null, "Book Updated successfully!");
         
     }
          
          if(e.getSource()==delete)
     {
     DBconnection.executeNonquary("delete from book where ISBN= "+ISBN.getText());

     JOptionPane.showMessageDialog(null, "Book Deleted successfully!");
     }
          
          if(e.getSource()==next)
         {
         
         GUI2.setVisible(false);
         setVisible(false);
         GUI3.setVisible(true);

         }
              if(e.getSource()==Back)
              {
              setVisible(false);
             GUI2.setVisible(true);
              
              }
              
              if(e.getSource()==search)
         {
           try {
                String query = "select * from Book where ISBN = '" + tISBN.getText() + "'";
                ResultSet rs = DBconnection.GetData(query);
                   if (rs.next()) {
                       ttitle.setText(rs.getString("title"));
                       ttype.setText(rs.getString("typee"));
                       tpage_count.setText(String.valueOf(rs.getInt("page_count")));
                       tprice.setText(String.valueOf(rs.getFloat("price")));
                       tPublisher_ID.setText(rs.getString("publisher_id"));
                       JOptionPane.showMessageDialog(null, "BOOK Found!");
                   } else 
                   {
                       JOptionPane.showMessageDialog(null, "BOOK not Found!");
                   }
            }
           catch (Exception ex) 
            {
                ex.printStackTrace();
      }
         }
             
           
       //------------------------------------------------    
           
           //GUI3
           
           if(e.getSource()==insert2)
     {
                DBconnection.executeNonquary("insert into Author values('"+tAuthor_ID.getText()+"','"+tfrist_Name.getText()+"','"+tlast_Name.getText()+"')");
                
                      JOptionPane.showMessageDialog(null, "Author inserted successfully!");
     }
            if(e.getSource()==Update2)
     {
     // DBconnection.executeNonquary("update set publisher values("+tPublisher_ID.getText()+",'"+tfrist_name.getText()+"','"+tlast_name.getText()+"','"+tcity.getText()+"','"+tphone.getText()+"')");
      DBconnection.executeNonquary("update Author set firste_name= '"+tfrist_Name.getText()+"',laste_name='"+tlast_Name.getText()+"'Where author_ID ="+tAuthor_ID.getText());

      JOptionPane.showMessageDialog(null, "Author Updated successfully!");
     }
             if(e.getSource()==delete2)
     {
     DBconnection.executeNonquary("delete from Author where author_ID= "+tAuthor_ID.getText());

           JOptionPane.showMessageDialog(null, "Author Deleted successfully!");
      }
              if(e.getSource()==search2)
         {
           try {
                String query = "select * from Author where author_ID = '" + tAuthor_ID.getText() + "'";
                ResultSet cs = DBconnection.GetData(query);
                if (cs.next()) {
                    tfrist_Name.setText(cs.getString("firste_name"));
                    tlast_Name.setText(cs.getString("laste_name"));
                    
               JOptionPane.showMessageDialog(null, "Author  Found!");

                } else {
               JOptionPane.showMessageDialog(null, "Author not Found!");

                }
                cs.close();
            } catch (Exception ex) {
                ex.printStackTrace();
      }
         }
             
             
             
              if(e.getSource()==Back2)
              {
              setVisible(true);
             GUI2.setVisible(false);
              GUI3.setVisible(false);
              }
              
              if(e.getSource()==exit2)
              {
              System.exit(0);
              }
     }}

















