package client;

import util.NetworkUtil;

public class Client {
    public static String serverAddress;

    private Client(String serverAddress, int serverPort) {
        try {
//            System.out.print("Enter name of the client: ");
//            Scanner scanner = new Scanner(System.in);
            String clientName = "client1";
            NetworkUtil nc = new NetworkUtil(serverAddress, serverPort);
            nc.write(clientName);
            new ReadThread(nc);
            new WriteThreadClient(nc, clientName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void create() {
        new Thread(() -> {
            try {
                int serverPort = 33333;
                //System.out.println(serverAddress);
                /*Client client = */new Client(serverAddress, serverPort);
            } catch (Exception e) {
                System.out.println("Child interrupted.");
            }
        }).start();

//        int serverPort = 33333;
//        System.out.println(serverAddress);
//        Client client = new Client(serverAddress, serverPort);
    }
}

