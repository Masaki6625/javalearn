//ファイル
import java.io.*;
//インターネット
import java.io.InputStream;
import java.net.URL;
//SQL
import java.sql.*;
//GUI
import java.awt.FlowLayout;
import javax.swing.*;



public class Main {
  public static void main(String[] args)  {
    //ファイルを一文字づつ読み込むプログラム
    // FileReader fr = new FileReader("data.txt");
    // int input = fr.read();
    // while (input != -1) {
    //   System.out.println((char)input);
    //   input = fr.read();
    // }
    // fr.close();
    
    //一文字づつ順番に読み込んでファイルを閉じるプログラム
    // FileWriter fw = new FileWriter("data.txt");
    // fw.write('そ');
    // fw.write('れ');
    // fw.write('で');
    // fw.write('は');
    // fw.close();
    
    //インターネットにアクセスしwebページを取得するプログラム
    // URL u = new URL("https://book.impress.co.jp/");
    // InputStream is = u.openStream(); //インターネットに接続する
    // int i = is.read();
    // while (i != -1) { //ページの終わりまで繰り返す
    //   char c = (char)i;
    //   System.out.print(c);
    //   i = is.read();
    // }
    
    //データベースにアクセスしてSQLを送信する
    // Class.forName("org.h2.Driver");
    // String dburl = "jdbc:h2:~/test";
    // String sql = "INSERT INTO EMPLOYEES(name) VALUES('aoki')";
    // Connection conn = DriverManager.getConnection(dburl);
    // conn.createStatement().executeUpdate(sql);
    // conn.close();
    
    //GUIプログラム(ユーザーインターフェースを作成できる)
    // JFrame frame = new JFrame("初めてのGUI");
    // JLabel label = new JLabel("Hello World!");
    // JButton button = new JButton("押してね！");
    // frame.getContentPane().setLayout(new FlowLayout());
    // frame.getContentPane().add(label);
    // frame.getContentPane().add(button);
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.setSize(300, 100);
    // frame.setVisible(true);
  }
}