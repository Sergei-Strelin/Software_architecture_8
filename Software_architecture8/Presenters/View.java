package Software_architecture8.Presenters;


import Software_architecture8.Models.Table;

import java.util.Collection;

public interface View {

    void registerObserver(ViewObserver observer);

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void showChangeReservationTableResult(int reservationNo);
}