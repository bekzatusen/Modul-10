package Модуль10Prac;

public class HotelManagementSystem {
    public static void main(String[] args) {
        HotelFacade hotelFacade = new HotelFacade();

        hotelFacade.bookRoomWithServices("Стандарт", "Паста", 5);

        hotelFacade.organizeEvent("Конференц-зал A", "Проектор", "Люкс");

        hotelFacade.reserveTableWithTaxi(3, "Салат Цезарь");

        hotelFacade.cancelRoomBooking("Стандарт");

        hotelFacade.requestCleaning("Люкс");
    }
}

