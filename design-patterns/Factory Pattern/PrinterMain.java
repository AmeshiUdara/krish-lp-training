package main;

import printer.Printer;
import printerenum.PrinterType;
import printerfactory.PrinterFactory;

public class PrinterMain{
	
	public static void main(String[] args){
		
		Printer laserPrinter = PrinterFactory.getPrinter(PrinterType.LASER);
		laserPrinter.operatePrinter("Ameshi");
		
		Printer inkjetPrinter = PrinterFactory.getPrinter(PrinterType.INKJET);
		inkjetPrinter.operatePrinter("Udara");
		
		Printer ledPrinter = PrinterFactory.getPrinter(PrinterType.LED);
		ledPrinter.operatePrinter("Wickramasinghe");
		
		Printer threeDPrinter = PrinterFactory.getPrinter(PrinterType.THREE_D);
		threeDPrinter.operatePrinter("Apple");
			
	}
	
}