package com.rick;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JavaFrame extends JFrame{
	private Conn c;
	JavaFrame(){
		settings();
		c = new Conn();
		List<Map> msg = c.doDbRequest();
		String str = "";
		for(Map<Object,Object> obj : msg){
			for(Map.Entry<Object,Object> row : obj.entrySet()){
				System.out.println(row.getKey());
				System.out.println(row.getValue());
				str += row.getKey()+" : "+row.getValue()+"<br>";
			}
		}
		
		JPanel jp = new JPanel();
		JLabel jb = new JLabel("<html><body>"+str+"</body></html>");
		jp.add(jb);
		add(jp);
	}
	
	void settings(){
		setTitle("Hola Rick");
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/*addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});*/
	}
	
}
