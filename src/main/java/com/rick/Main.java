package com.rick;

public class Main 
{
    public static void main( String[] args )
    {
		JavaFrame jf = new JavaFrame();
		jf.setVisible(true);
    }
	public String sayhelloto(String name){
		return String.format("Hello, %s",name);
	}
}
