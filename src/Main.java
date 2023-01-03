import animalspractice.*;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

import java.util.*;

public class Main {

    private static final int MAX_SIZE = 5;
    private static final Random RANDOM = new Random();
    private static final List<String> NAMES = List.of(
            "Вася",
            "Петя",
            "Маша",
            "Даша",
            "Саша",
            "Коля",
            "Света",
            "Аня"
    );

    public static void main(String[] args) throws CantTalkException {

        // Тренировка
        System.out.println("Тренировка");
        Cat.Breed brShBreed = new Cat.Breed(
                "Британская короткошерстная",
                "ВБ",
                Cat.Breed.HairType.SHORT
        );
        Cat murzik = new Cat("Мурзик");
        //*Cat.FavToy murzikFavToy = murzik.new FavToy("Рыбка", "заводная");
        //murzik.setToy(murzikFavToy);
        //System.out.println(murzikFavToy.getCatName());
        //murzik.age = 3;
        //murzik.meow();
        //System.out.println(murzik.getName());
        Cat begemot = new Cat("Бегемот", 5);
        //begemot.age = -5;
        //begemot.setName(null);
        //begemot.meow();
        //System.out.println("У кота " + murzik.name + " " + murzik.getFriends().length + " друзей");
        //System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
        //murzik.friends[0].meow();
        //System.out.println(Cat.getCount());
        //System.out.println();

        //murzik.talk();
        //murzik.eat();

        Dog sharik = new Dog("Шарик", 2005);
        //sharik.setAddress("random address");
        //Dog sharik2 = new Dog("Шарик",2005);
        //sharik2.setAddress("random address");
//
        //if (sharik.equals(sharik2)) {
        //    sharik2 = sharik;
        //}

        //sharik.talk();
        //sharik.eat();

        Parrot kesha = new Parrot("Кеша");
        //kesha.talk();

        murzik.getFriends().add(begemot);
        murzik.getFriends().add(sharik);
        murzik.getFriends().add(kesha);

        /*for (Pet friend : murzik.getFriends()) {
            if (friend instanceof Cat) {
                Cat cat = (Cat) friend;
                cat.meow();
            } else if (friend.getClass() == Parrot.class) {
                try {
                    ((Parrot) friend).talk();
                } catch (CantTalkException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println(friend);
            }
        }

        for (int i = 0; i < murzik.getFriends().size(); i++) {
            murzik.getFriends().get(i);
        }*/

        //murzik.getFriends().remove(sharik);

        //System.out.println(murzik.getFriends().size());

        //Trained trained = new Trained();

        Tiger tiger = new Tiger();

        /*sharik.train("Апорт");
        sharik.train("Голос");
        sharik.train(TrainedCommand.CMD_SIT.name());
        sharik.train(TrainedCommand.CMD_LIE_DOWN.name());

        checkTrained(sharik);

        System.out.println();

        sharik.doCommand("Апорт");
        sharik.doCommand("Голос");
        sharik.doCommand("Сидеть");
        sharik.doCommand("Лежать");*/

        //sharik.train("апорт");
        //sharik.doCommand("апорт");

        /*Trainer<Dog> alex = new Trainer<>("Alex");
        alex.train(sharik);

        Trainer<Cat> mike = new Trainer<>("Mike");
        mike.train(murzik);

        Trainer bob = new Trainer<>("Bob");
        bob.train(tiger);
        bob.train(sharik);
        bob.train(murzik);*/

        Fish nemo = new Fish("Nemo");
        //nemo.talk();

        //talk(murzik, nemo, begemot, sharik);

        Veterinarian<Cat> ivanIvanovich = new Veterinarian<>("Иван Иванович", "Старший ветеринар");
        ivanIvanovich.addPatient(murzik);
        ivanIvanovich.addPatient(begemot);

        ivanIvanovich.treat();

        System.out.println();

        // Задание 1
        System.out.println("Задание 1");
        Car car1 = new Car(
                "Hyundai",
                "Solaris",
                2
        );
        car1.setBodyTypeName(BodyType.WAGON.name());
//        System.out.println(car1);
        Car car2 = new Car(
                "Kia",
                "",
                2.4
        );
        car2.setBodyTypeName("Кроссовер");
//        System.out.println(car2);
        Car car3 = new Car(
                "BMW",
                "Z8",
                3
        );
//        System.out.println(car3);

        Truck truck1 = new Truck(
                "Камаз",
                "54654",
                5.5
        );
        truck1.setLoadCapacity(LoadCapacity.N1);
//        System.out.println(truck1);
        Truck truck2 = new Truck(
                "Hyundai",
                "A353",
                4.5
        );
        truck2.setLoadCapacity(LoadCapacity.N2);
//        System.out.println(truck2);
        Truck truck3 = new Truck(
                "ВАЗ",
                "2152",
                3.5
        );
//        System.out.println(truck3);

        Bus bus1 = new Bus(
                "Scania",
                "A80 4x2",
                6
        );
        bus1.setCapacity(Capacity.ESPECIALLY_SMALL);
//        System.out.println(bus1);
        Bus bus2 = new Bus(
                "Газ",
                "5292",
                5.0
        );
        bus2.setCapacity(Capacity.LARGE);
//        System.out.println(bus2);
        Bus bus3 = new Bus(
                "МАЗ",
                "3432",
                4.5
        );
//        System.out.println(bus3);

        DriverB dmitriev = new DriverB(
                "Дмитриев Дмитрий Дмитриевич",
                true,
                5,
                "B"
        );
        DriverC alexeev = new DriverC(
                "Алексеев Алексей Алексеевич",
                true,
                4,
                "C"
        );
        DriverD alexandrov = new DriverD(
                "Александров Александр Александрович",
                true,
                3,
                "D"
        );
//        System.out.println();

        Sponsor redBull = new Sponsor(
                "Red Bull",
                200000
        );
        Sponsor shell = new Sponsor(
                "Shell",
                300000
        );
        Sponsor pirelli = new Sponsor(
                "Pirelli",
                -5
        );

        Mechanic<Car> ivanov = new Mechanic<>(
                "Иванов",
                "Компания 1",
                Mechanic.Skills.CAR
        );
        Mechanic<Bus> petrov = new Mechanic<>(
                "Петров",
                "Компания 2",
                Mechanic.Skills.BUS
        );
        Mechanic<Transport> sidorov = new Mechanic<>(
                "Сидоров",
                "Компания 3",
                Mechanic.Skills.ANY
        );

        List<Transport> transports = List.of(
                car1,
                bus2,
                truck3
        );

        car1.setDriverB(dmitriev);
        bus2.setDriverD(alexandrov);
        truck3.setDriverC(alexeev);

        car1.addSponsor(redBull);
        bus2.addSponsor(shell, redBull);
        truck3.addSponsor(pirelli);

        car1.addMechanic(ivanov, sidorov);
        bus2.addMechanic(petrov);
        truck3.addMechanic(sidorov);

        for (Transport transport : transports) {
            printInfo(transport);
        }
        System.out.println();

        // Задание 2-1
        System.out.println("Задание 2-1");
        ServiceStation<Transport> service = new ServiceStation<>();
        service.addTransport(car1);
        service.addTransport(bus2);
        service.addTransport(truck3);

        service.carryOutVehicleMaintenance();
        service.carryOutVehicleMaintenance();
        service.carryOutVehicleMaintenance();
        System.out.println();

        // Задание 2-2
        System.out.println("Задание 2-2");
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();

        createQueue(queue1);
        createQueue(queue2);

        System.out.println(queue1);
        System.out.println(queue2);
        System.out.println();

        addManMinQueue("Дима",queue1,queue2);

        System.out.println(queue1);
        System.out.println(queue2);
        System.out.println();

        addManMinQueue("Никита",queue1,queue2);

        System.out.println(queue1);
        System.out.println(queue2);
        System.out.println();

        goHome(queue1, queue2);

        System.out.println(queue1);
        System.out.println(queue2);
        System.out.println();

        //Задание 2-3
        System.out.println("Задание 2-3");
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j,(i + j) % 2 == 0 ? "O" : ".");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
//                if ((i + j) % 2 == 0) {
                    System.out.print(biDemArrList.get(i).get(j) + " ");
//                } else {
//                    System.out.print(". ");
//                }
            }
            System.out.println();
        }
    }

    public static void goHome(Queue<String> queue1,
                              Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            System.out.println(queue1.poll() + " пошел домой");
        } else {
            System.out.println(queue2.poll() + " пошел домой");
        }
    }

    public static void createQueue(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }

    public static void addManMinQueue(String name,
                                      Queue<String> queue1,
                                      Queue<String> queue2) {
        if (queue1.size() <= queue2.size() && queue1.size() != MAX_SIZE) {
            queue1.offer(name);
            System.out.println("В первую очередь добавлен " + name);
        } else if (queue2.size() < queue1.size() && queue2.size() != MAX_SIZE) {
            queue2.offer(name);
            System.out.println("Во вторую очередь добавлен " + name);
        } else {
            System.out.println("Позовите Галю!");
            Queue<String> queue3 = new ArrayDeque<>();
            queue3.offer(name);
            System.out.println(queue3);
        }
    }

    public static void printInfo(Transport transport) {
        System.out.println("У транспортного средства " + transport.getBrand() +
                "\n Водитель - " + transport.getDriver() +
                "\n Спонсоры - " + transport.getSponsors() +
                "\n Механики - " + transport.getMechanics());
    }

    public static void talk(Pet... pets)  {
        int count = 0;
        try {
            for (Pet pet : pets) {
                pet.talk();
                count++;
            }
        } catch (CantTalkException e) {
            System.out.println("Произошла ошибка с животным " + e.getPet().getName());
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(count);
        }
    }

    public static void checkTrained(Trained... animals) {
        for (Trained animal : animals) {
            for (String command : animal.getTrainedCommands()) {
                animal.doCommand(command);
            }
        }
    }

}