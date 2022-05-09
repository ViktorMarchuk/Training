package by.epam.lev04.task10.main;

import by.epam.lev04.task10.airlines.Airlines;
import by.epam.lev04.task10.logic.Logic;

public class Main {

	public static void main(String[] args) {
		int numberOfAircraft = 5;
		Airlines[] airline = new Airlines[numberOfAircraft];
		airline[0] = new Airlines(" Tbilisi", " Monday ", 8.34, " Flight number 234, Boing 737");
		airline[1] = new Airlines(" Warshawa ", " Saturday ", 2.35, " Flight number 875, Airbus 1000");
		airline[2] = new Airlines(" Barcelona ", " Friday ", 23.45, " Flight number 543, Boing 770");
		airline[3] = new Airlines(" Milan ", " Monday ", 10.55, " Flight number 432, Boing 737");
		airline[4] = new Airlines(" Barcelona ", " Satyrday ", 12.45, " Flight number 876, Boing 737");

		Logic logic = new Logic();
		logic.getList(airline);
		System.out.println();
		logic.getDest(airline);
		System.out.println();
		logic.getDay(airline);
		System.out.println();
		logic.getFlightByTime(airline);
	}

}