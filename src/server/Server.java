package server;

import client.ReadThread;
import util.NetworkUtil;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
    public static boolean serverNeedNotAcceptAnymore;

    static ServerSocket serverSocket;
    public int i = 1;
    static HashMap<String, NetworkUtil> clientMap;

//    Server() {
//        clientMap = new HashMap<>();
//        try {
//            serverSocket = new ServerSocket(33333);
//            new WriteThreadServer(clientMap, "Server");
//            while (true) {
//                Socket clientSocket = serverSocket.accept();
//                serve(clientSocket);
//            }
//        } catch (Exception e) {
//            System.out.println("Server starts:" + e);
//        }
//    }

    static void serve(Socket clientSocket) {
        NetworkUtil nc = new NetworkUtil(clientSocket);
        String clientName = (String) nc.read();
        clientMap.put(clientName, nc);
        new ReadThread(nc);
    }

//    public static void main(String args[]) {
//        Server server = new Server();
//    }

    public static void create() {
        new Thread(() -> {
            try {
                clientMap = new HashMap<>();
                try {
                    serverSocket = new ServerSocket(33333);
                    new WriteThreadServer(clientMap, "Server");
                    while (true) {
                        Socket clientSocket = serverSocket.accept();
                        System.out.println("client added");
                        serve(clientSocket);
                        if(serverNeedNotAcceptAnymore) break;
                    }
                } catch (Exception e) {
                    System.out.println("Server starts:" + e);
                }
            } catch (Exception e) {
                System.out.println("Child interrupted.");
            }
        }).start();
        //Server server = new Server();
    }
}
