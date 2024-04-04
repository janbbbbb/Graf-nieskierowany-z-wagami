import java.util.*;

class Point {
    int number;
    int x;
    int y;

    public Point(int number, int x, int y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
}

class Connection {
    int startPointNumber;
    int endPointNumber;
    int value;

    public Connection(int startPointNumber, int endPointNumber, int value) {
        this.startPointNumber = startPointNumber;
        this.endPointNumber = endPointNumber;
        this.value = value;
    }
}

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Point> points = new ArrayList<>();
    static List<Connection> connections = new ArrayList<>();
    static final int numPoints = 5;

    public static void main(String[] args) {
        addConnections();
        printConnections();
    }

    static void addConnections() {
        System.out.println("Dodawanie połączeń:");

        while (true) {
            System.out.println("Podaj numer punktu początkowego (Wprowadź '0' aby zakończyć tworzenie połączeń): ");
            int startPointNumber = scanner.nextInt();
            if (startPointNumber == 0) break;

            System.out.println("Podaj numer punktu końcowego: ");
            int endPointNumber = scanner.nextInt();

            System.out.println("Podaj wagę połączenia: ");
            int value = scanner.nextInt();

            connections.add(new Connection(startPointNumber, endPointNumber, value));
        }
    }

    static void printConnections() {
        System.out.println("Wygenerowane połączenia:");
        for (Connection connection : connections) {
            System.out.println("Punkt początkowy: " + connection.startPointNumber + ", " +
                    "Punkt końcowy: " + connection.endPointNumber + ", " +
                    "Waga połączenia: " + connection.value);
        }
    }
}