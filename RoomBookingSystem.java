package Модуль10Prac;

public class RoomBookingSystem {
    public void bookRoom(String roomType) {
        System.out.println("Бронирование номера типа: " + roomType);
    }

    public void checkAvailability(String roomType) {
        System.out.println("Проверка доступности номера типа: " + roomType);
    }

    public void cancelBooking(String roomType) {
        System.out.println("Отмена бронирования номера типа: " + roomType);
    }
}

class RestaurantSystem {
    public void reserveTable(int tableNumber) {
        System.out.println("Бронирование стола номер: " + tableNumber);
    }

    public void orderFood(String foodItem) {
        System.out.println("Заказ блюда: " + foodItem);
    }
}

class EventManagementSystem {
    public void bookConferenceRoom(String roomName) {
        System.out.println("Бронирование конференц-зала: " + roomName);
    }

    public void orderEquipment(String equipment) {
        System.out.println("Заказ оборудования: " + equipment);
    }
}

class CleaningService {
    public void scheduleCleaning(String roomType) {
        System.out.println("Запланирована уборка номера типа: " + roomType);
    }

    public void performCleaning(String roomType) {
        System.out.println("Уборка выполнена для номера типа: " + roomType);
    }
}

class HotelFacade {
    private RoomBookingSystem roomBooking;
    private RestaurantSystem restaurant;
    private EventManagementSystem eventManagement;
    private CleaningService cleaningService;

    public HotelFacade() {
        roomBooking = new RoomBookingSystem();
        restaurant = new RestaurantSystem();
        eventManagement = new EventManagementSystem();
        cleaningService = new CleaningService();
    }

    public void bookRoomWithServices(String roomType, String foodItem, int tableNumber) {
        roomBooking.bookRoom(roomType);
        restaurant.reserveTable(tableNumber);
        restaurant.orderFood(foodItem);
        cleaningService.scheduleCleaning(roomType);
    }

    public void organizeEvent(String roomName, String equipment, String roomType) {
        eventManagement.bookConferenceRoom(roomName);
        eventManagement.orderEquipment(equipment);
        roomBooking.bookRoom(roomType);
    }

    public void reserveTableWithTaxi(int tableNumber, String foodItem) {
        restaurant.reserveTable(tableNumber);
        restaurant.orderFood(foodItem);
        System.out.println("Такси вызвано для доставки к столу номер: " + tableNumber);
    }

    public void cancelRoomBooking(String roomType) {
        roomBooking.cancelBooking(roomType);
    }

    public void requestCleaning(String roomType) {
        cleaningService.performCleaning(roomType);
    }
}

