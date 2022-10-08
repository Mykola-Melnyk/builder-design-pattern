public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500 GB", "16 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
        Computer computer2 = new Computer.ComputerBuilder("1000 GB", "16 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(false)
                .build();
        Computer computer3 = new Computer.ComputerBuilder("1000 GB", "16 GB")
                .setBluetoothEnabled(true)
                .build();
        System.out.println(computer);
        System.out.println(computer2);
        System.out.println(computer3);
    }
}