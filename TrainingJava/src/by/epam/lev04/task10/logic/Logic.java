package by.epam.lev04.task10.logic;

import java.util.Scanner;

import by.epam.lev04.task10.airlines.Airlines;



public class Logic {

	public void getList(Airlines[] airline) {
		for (int i = 0; i < airline.length; i++) {
			System.out.println("Destination:" + airline[i].getDestination() + " // Day of Week:"
					+ airline[i].getDaysOfWeek() + " // Depature time:" + airline[i].getDepartureTime() + " // "
					+ airline[i].getAddInfoAircraft());
		}
	}

	public Scanner getScan() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}

	public void getDest(Airlines[] airline) {
		System.out.println("List of flights for a given destination");
		System.out.println("Enter destination");
		String m = getScan().next();
		boolean flag = true;
		for (int i = 0; i < airline.length; i++) {
			if (airline[i].getDestination().toLowerCase().contains(m)) {
				System.out.println("Destination:" + airline[i].getDestination() + " // Day of Week:"
						+ airline[i].getDaysOfWeek() + " // Depature time:" + airline[i].getDepartureTime() + " // "
						+ airline[i].getAddInfoAircraft());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Not found destination");
		}
	}

	public void getDay(Airlines[] airline) {
		System.out.println("List of flights for a given day of the week");
		System.out.println("Enter day");
		String m = getScan().next();
		boolean flag = true;
		for (int i = 0; i < airline.length; i++) {
			if (airline[i].getDaysOfWeek().toLowerCase().contains(m)) {
				System.out.println("Destination:" + airline[i].getDestination() + " // Day of Week:"
						+ airline[i].getDaysOfWeek() + " // Depature time:" + airline[i].getDepartureTime() + " // "
						+ airline[i].getAddInfoAircraft());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Not found day");
		}
	}

	public void getFlightByTime(Airlines[] airline) {
		System.out.println(
				"List of flights for a given day of the week, the departure time for which is longer than the specified one");
		System.out.println("Enter day");
		String m = getScan().next();
		System.out.println("Enter time");
		double n = getScan().nextDouble();
		boolean flag = true;
		for (int i = 0; i < airline.length; i++) {
			if (airline[i].getDaysOfWeek().toLowerCase().contains(m) && airline[i].getDepartureTime()>n) {
				System.out.println("Destination:" + airline[i].getDestination() + " // Day of Week:"
						+ airline[i].getDaysOfWeek() + " // Depature time:" + airline[i].getDepartureTime() + " // "
						+ airline[i].getAddInfoAircraft());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Not found");
		}
	}
}


