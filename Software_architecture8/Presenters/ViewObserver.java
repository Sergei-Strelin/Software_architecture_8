package Software_architecture8.Presenters;


import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date reservtionDate, int tableNo, String name);

    void onChangeReservationTable(int oldReservation, Date reservtionDate, int tableNo, String name);
}