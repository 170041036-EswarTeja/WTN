package com.wipro.abstraction;

abstract class Instrument
{
	abstract void play();
}

class Piano extends Instrument{
	void play()
	{
		System.out.println("�Piano is playing tan tan tan tan");
	}
}
class Flute extends Instrument{
	void play()
	{
		System.out.println("�Flute is playing tan tan tan tan");
	}
}
class Guitar extends Instrument{
	void play()
	{
		System.out.println("�Guitar is playing tin tin tin tin");
	}
}

public class Instrumentest {
   public static void main(String[] args) {
	
} 
   
}
