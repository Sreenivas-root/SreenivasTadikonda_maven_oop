package com.code;

import java.util.LinkedList;
import java.util.Scanner;

public class App 
{
    private static Scanner in;

	public static void main( String[] args )
    {
        LinkedList  <Sweets> sweets = new LinkedList<Sweets>();
        in = new Scanner(System.in);
        sweets.add(new Sweets("c1",10,500) {
			@Override
			String getType() {
				return "candy";
				}
		});
        sweets.add(new Sweets("choc1",5,70) {
			@Override
			String getType() {
				return "chocolate";
				}
		});
        sweets.add(new Sweets("c2",8,90) {
			@Override
			String getType() {
				return "candy";
				}
		});
        sweets.add(new Sweets("choc2",4,120) {
			@Override
			String getType() {
				return "chocolate";
				}
		});
        sweets.add(new Sweets("c3",6,250) {
			@Override
			String getType() {
				return "candy";
				}
		});
        sweets.add(new Sweets("choc3",3,125) {
			@Override
			String getType() {
				return "chocolate";
				}
		});
        
        Gift newyeargift = new Gift(sweets);
        Integer tw = newyeargift.sumofWeights();
        System.out.println("Total Weigths" + tw);
        newyeargift.sortChocolates("weight");
        
        for(Sweets s: newyeargift.sweets) {
        	if(s.getType().equals("candy")) 
        		System.out.println(s.name);
        }
        
        int l,h;
        System.out.println("Enter lower and higher limit for cost of chocolates: ");
        l= in.nextInt();
        h=in.nextInt();
        
        for(Sweets s: newyeargift.sweets) {
        	if(s.getType().equals("chocolate") && s.cost>l && s.cost<h) 
        		System.out.println(s.name);
        }
        
        
    }
}