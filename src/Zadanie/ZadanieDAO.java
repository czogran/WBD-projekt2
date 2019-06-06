package Zadanie;

import connection.DatabaseConnect;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ZadanieDAO {
    private  ObservableList<Zadanie> zadania;


    /**
     * Function getting zadania for pracownik from database
     *
     * @return returns zadania from database
     */
    public   ObservableList<Zadanie> GetAllZadania() {

        zadania = FXCollections.observableArrayList();
        Zadanie zadanie;
        try {
            String cmd = "SELECT * FROM zadania";
            ResultSet rs = DatabaseConnect.ExecuteStatement(cmd);

            while (rs.next()) {

                zadanie = new Zadanie();
                zadanie = SetFieldsOfClass(rs, zadanie);

                zadania.add(zadanie);
            }

        } catch (SQLException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(ex.toString());
            alert.show();
        }

        return zadania;
    }

    /**
     * Metoda ustawiająca pola danych antykwariatu na podstawie wyników zapytania
     *
     * @param rs          wynik zapytania
     * @param zadanie obiekt antykwariatu
     * @return antykwariat z wypełnionymi informacjami
     * @throws SQLException
     */
    private  Zadanie SetFieldsOfClass(ResultSet rs, Zadanie zadanie) throws SQLException {
        try {
            zadanie.setIdZadania(rs.getInt(1));
            zadanie.setRodzajZadania(rs.getString(2));
            zadanie.setDataNadania(rs.getString(3));
            zadanie.setDataRozpoczecia(rs.getString(4));
            zadanie.setDataZakonczenia(rs.getString(5));
        } catch (SQLException ex) {
            System.out.print(ex.toString());
        }

        return zadanie;
    }


}
