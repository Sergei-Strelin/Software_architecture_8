package Software_architecture8.Views;


import Software_architecture8.Models.Table;
import Software_architecture8.Presenters.View;
import Software_architecture8.Presenters.ViewObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private Collection<ViewObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(ViewObserver observer) {
        observers.add(observer);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table : tables){
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("Столик успешно забронирован. Номер резерва #%d\n-------------\n", reservationNo);
        else
            System.out.println("Невозможно забронировать столик.\nПроверьте номер столика!\n-------------\n");
    }

    @Override
    public void showChangeReservationTableResult(int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("Pезерв #%d успешно изменён!\n-------------\n", reservationNo);
        else

            System.out.println("Невозможно изменить резервирование столика.\n-------------\n");
    }

    public void reservationTable(Date reservtionDate, int tableNo, String name){
        for (ViewObserver observer : observers)
            observer.onReservationTable(reservtionDate, tableNo, name);
    }

    public void changeReservationTable(int oldReservation, Date reservtionDate, int tableNo, String name){
        for (ViewObserver observer : observers)
            observer.onChangeReservationTable(oldReservation, reservtionDate, tableNo, name);
    }

}