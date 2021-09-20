import java.util.Scanner;

/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2021.02.06
 */
public class TicketMachine {
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    Scanner scanner = new Scanner(System.in);

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int ticketCost) {
        if (ticketCost < 1) {
            price = 1;
            System.out.println("Error: ticketCost < 1, set default to 1");
        } else {
            price = ticketCost;
        }
        balance = 0;
        total = 0;
    }

    public TicketMachine() {
        price = 1000;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Total amount of money in the ticket machine
     */
    public int getTotal() {
        return total;
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    public void insertMoney(int amount) {
        if (amount < 1) {
            System.out.println("Error: amount < 1");
            return;
        }
        balance += amount;
        if (balance < price) {
            System.out.println("Rest: " + (price - balance));
        }
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket() {
        if (balance < price) {
            System.out.println("Error: Balance to low");
            return;
        }
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        if (balance > price) {
            total += balance - price;
            return;
        } else {
            total += balance;
        }
        // Clear the balance.
        balance = 0;
    }

    public void showPrice() {
        System.out.println("The price of a ticket is " + this.price + " cents");
    }

    public void empty() {
        total = 0;
        balance = 0;
    }

    public void menu() {
        System.out.println("Postleitzahl (8080, 8081): ");
        String plz = scanner.nextLine();
        switch (plz) {
            case "8080" -> {
                System.out.println("Seefeld");
                setPrice(20);
                extracted();
            }
            case "8081" -> {
                System.out.println("Riesbach");
                setPrice(10);
                extracted();
            }
            default -> System.out.println("PLZ nicht im System vorhanden");
        }
    }

    private void extracted() {
        chooseClass();
        retour();
        halbtax();
        showPrice();
        while (balance < price) {
            System.out.println("Geldeingabe: ");
            int money = scanner.nextInt();
            insertMoney(money);
        }
        System.out.println("Retourgeld: " + (balance - price));
        printTicket();
    }

    public void chooseClass() {
        System.out.println("1. oder 2. Klasse:");
        String value = scanner.nextLine();
        switch (value) {
            case "1" -> price += price / 2;
            case "2" -> {
            }
            default -> System.out.println("Klasse nicht im System vorhanden");
        }
    }

    public void retour() {
        System.out.println("Retour:");
        String value = scanner.nextLine();
        switch (value) {
            case "Ja":
                price = price * 2;
                break;
            case "Nein":
                break;
            default:
                System.out.println("Bitte mit Ja oder Nein antworten. Es wurde Nein genommen.");
                break;
        }
    }

    public void halbtax() {
        System.out.println("Halbtax:");
        String value = scanner.nextLine();
        switch (value) {
            case "Ja":
                price = price / 2;
                break;
            case "Nein":
                break;
            default:
                System.out.println("Bitte mit Ja oder Nein antworten. Es wurde Nein genommen.");
                break;
        }
    }
}
