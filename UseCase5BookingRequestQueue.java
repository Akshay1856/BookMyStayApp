import java.util.LinkedList;
import java.util.Queue;

class UseCase5Reservation {
    private String guestName;
    private String roomType;

    public UseCase5Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }
}

class BookingRequestQueue {
    private Queue<UseCase5Reservation> queue;

    public BookingRequestQueue() {
        queue = new LinkedList<>();
    }

    public void addRequest(UseCase5Reservation reservation) {
        queue.offer(reservation);
    }

    public void displayRequests() {
        for (UseCase5Reservation r : queue) {
            System.out.println("Guest: " + r.getGuestName() + ", Room Type: " + r.getRoomType());
        }
    }
}

public class UseCase5BookingRequestQueue {
    public static void main(String[] args) {
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        bookingQueue.addRequest(new UseCase5Reservation("Alice", "Standard"));
        bookingQueue.addRequest(new UseCase5Reservation("Bob", "Deluxe"));
        bookingQueue.addRequest(new UseCase5Reservation("Charlie", "Suite"));

        bookingQueue.displayRequests();
    }
}