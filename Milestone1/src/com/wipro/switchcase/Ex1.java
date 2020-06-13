package com.wipro.switchcase;

public class Ex1 {
          public static void main(String[] args) {
        	  String color;
			switch(args[0])
			{
			case "R":
				color="Red";
				break;
			case "B":
				color="Blue";
				break;
			case "G":
				color="Green";
				break;
			case "Y":
				color="Yellow";
				break;
			case "O":
				color="Orange";
				break;
			case "W":
				color="White";
				break;
			default:
				color="Invalid Code";
				break;
			}
			System.out.println(color);
		}
}
